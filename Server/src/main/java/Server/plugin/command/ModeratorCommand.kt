package plugin.command

import core.game.component.Component
import core.game.node.entity.player.Player
import core.game.node.entity.player.info.PlayerDetails
import core.game.node.entity.player.info.Rights
import core.game.system.command.CommandPlugin
import core.game.system.command.CommandSet
import core.game.system.communication.ClanRepository
import core.game.world.GameWorld
import core.game.world.repository.Repository
import core.net.amsc.MSPacketRepository
import core.net.amsc.WorldCommunicator
import core.net.packet.PacketRepository
import core.net.packet.context.ContainerContext
import core.net.packet.out.ContainerPacket
import core.plugin.InitializablePlugin
import core.plugin.Plugin

/**
 * Handles the moderators commands.
 * @author Vexia
 */
@InitializablePlugin
class ModeratorCommand : CommandPlugin() {
    @Throws(Throwable::class)
    override fun newInstance(arg: Any?): Plugin<Any?>? {
        link(CommandSet.MODERATOR)
        return this
    }

    override fun parse(player: Player?, name: String?, args: Array<String?>?): Boolean {
        when (name) {
            "announce" -> Repository.sendNews(getArgumentLine(args!!))
            //"linktest" -> player?.packetDispatch?.sendLink("fuckingtestingthisbitch.")
            "clear", "kick" -> {
                val target = Repository.getPlayer(args!![1])
                if (WorldCommunicator.isEnabled()) {
                    MSPacketRepository.sendPunishment(player, args[1], 6, 0L)
                } else if (target != null) {
                    target.packetDispatch.sendLogout()
                    target.session.disconnect()
                    target.clear(true)
                    player!!.packetDispatch.sendMessage("Kicked player " + args[1] + " from this world.")
                } else {
                    player!!.packetDispatch.sendMessage("Player " + args[1] + " was already inactive.")
                }
                return true
            }
            "getinfo", "getmac", "getip", "getcompname" -> {
                printInfo(player, args!![1])
                return true
            }
            "unban" -> {
                unpunish(player, args!![1], 1)
                return true
            }
            "unmute" -> {
                unpunish(player, args!![1], 0)
                return true
            }
            "mute", "permmute" -> {
                punish(player, args!![1], args, 0)
                return true
            }
            "ban", "permban" -> {
                punish(player, args!![1], args, 1)
                return true
            }
            "ipban" -> {
                punish(player, args!![1], args, 2)
                return true
            }
            "macban" -> {
                punish(player, args!![1], args, 3)
                return true
            }
            "uidban", "mskban" -> {
                punish(player, args!![1], args, 4)
                return true
            }
            "givecredits" -> {
                args ?: return true
                player ?: return true
                if(args.size < 3){
                    player.sendMessage("Usage: ::givecredits player amount").also { return true }
                }
                var other = Repository.PLAYER_NAMES.get(args[1])
                other = other ?: Player(PlayerDetails.getDetails(args[1]))
                if(!other.isPlaying)
                    player.sendMessage("Player needs to be online when you use this command.").also { return true }
                var amount = args[2]?.toIntOrNull()
                amount = amount ?: 0.also { player.sendMessage("You need to supply a valid number for the number of credits.") }

                other.details.credits += amount
                if(amount > 0){
                    player.sendMessage("Added $amount credits to ${other.username}'s account.")
                    other.sendMessage("You have received $amount credits.")
                }
                return true
            }
            "donator" -> {
                args ?: return true
                player ?: return true
                if(args.size < 2)
                    player.sendMessage("You need to specify who to make a donator.").also { return true }
                var other = Repository.PLAYER_NAMES.get(args[1])
                other = other ?: Player(PlayerDetails.getDetails(args[1]))
                if(!other.isPlaying)
                    player.sendMessage("The player has to be online in order for you to rank them!").also { return true }
                if(other.details.isDonator)
                    player.sendMessage("That player is already a donator!").also { return true }
                other.details.isDonator = true
                player.sendMessage("${other.username} is now a donator!")
                other.sendMessage("You are now a donator!")
                return true
            }
            "sysban" -> {
                punish(player, args!![1], args, 5)
                return true
            }
            "unccban" -> {
                val clan = ClanRepository.get(GameWorld.getSettings().name) ?: return true
                if (!clan.isBanned(args!![1])) {
                    player!!.sendMessage("The player is not banned.")
                    return true
                }
                clan.banned.remove(args[1])
                player!!.sendMessage("Unbanned the player " + args[1] + " from the cc.")
                return true
            }
            "ckbank" -> {
                checkBank(player, args)
                return true
            }
            "checkinvy" -> {
                checkInvy(player, args)
                return true
            }
            "players" -> {
                if (player!!.interfaceManager.isOpened && player.interfaceManager.opened.id != 275 || player.locks.isMovementLocked || player.locks.isTeleportLocked) {
                    player.sendMessage("Please finish what you're doing first.")
                    return true
                }
                player.interfaceManager.open(Component(275))
                var i = 0
                while (i < 257) {
                    player.packetDispatch.sendString("", 275, i)
                    i++
                }
                val red = "<col=8A0808>"
                player.packetDispatch.sendString("<col=8A0808>" + "Players" + "</col>", 275, 2)
                val builder = StringBuilder("<br>")
                var count = 0
                for (p in Repository.getPlayers()) {
                    if (count > 45) {
                        builder.append("<br>Max amount we can show on this interface.")
                        break
                    }
                    if (p == null || p.isAdmin && !GameWorld.getSettings().isDevMode && !player.isAdmin || p.isArtificial) {
                        continue
                    }
                    builder.append(red + "<img=" + (Rights.getChatIcon(p) - 1) + ">" + p.username + " [ip=" + p.details.ipAddress + ", name=" + p.details.compName + "]<br><br>")
                    count++
                }
                player.packetDispatch.sendString(builder.toString(), 275, 11)
                return true
            }
        }
        return false
    }

    /**
     * Punishes a player.
     * @param player the player.
     * @param target The target.
     * @param args the args.
     * @param target the target.
     * @param ban if banned.
     */
    private fun punish(player: Player?, target: String?, args: Array<String?>?, type: Int): Player? {
        val perm = args!![0]!!.contains("perm")
        val duration = if (perm) -1L else ((if (args.size > 2) args[2]!!.toInt() else 2) * 24 * 60 * 60000).toLong()
        if (WorldCommunicator.isEnabled()) {
            MSPacketRepository.sendPunishment(player, target, type, duration)
            return null
        }
        player!!.sendMessage("Management server is offline, punishment could not be processed.")
        return null
    }

    /**
     * Removes the punishment of a player.
     * @param player the player.
     * @param target the target.
     * @param ban if we are unbanning.
     */
    private fun unpunish(player: Player?, target: String?, type: Int) {
        if (WorldCommunicator.isEnabled()) {
            MSPacketRepository.sendPunishment(player, target, type, 0L)
            return
        }
        player!!.sendMessage("Management server is offline, removing punishment could not be processed.")
    }

    /**
     * Prints the info of a player.
     * @param player the player.
     * @param target the target.
     */
    private fun printInfo(player: Player?, target: String?) {
        if (WorldCommunicator.isEnabled()) {
            MSPacketRepository.sendPunishment(player, target, 7, 0L)
            return
        }
    }

    /**
     * Checks another players bank.
     * @param player the player.
     * @param args the args.
     */
    private fun checkBank(player: Player?, args: Array<String?>?) {
        player!!.getDropLog().clear()
        if (player.details.rights === Rights.PLAYER_MODERATOR && !player.zoneMonitor.isInZone("Moderator Zone")) {
            player.sendMessage("You can only use this command in the moderator room.")
            return
        }
        val o = Repository.getPlayer(args!![1], true)
        if (o == null) {
            player.sendMessage("Unable to load player " + args[1])
            return
        }
        val items = o.bank.toArray()
        var size = 0
        val slots = IntArray(items.size)
        for (i in items.indices) {
            if (items[i] != null) {
                slots[size++] = i
            }
        }
        val slot = IntArray(size)
        for (i in 0 until size) {
            slot[i] = slots[i]
        }
        player.getDropLog().addAll(o.bank)
        player.getDropLog().open()
        player.packetDispatch.sendMessage("Checking " + o.name + "'s bank.")
    }

    /**
     * Checks a players inventory.
     * @param player the player.
     * @param args the arguments.
     */
    private fun checkInvy(player: Player?, args: Array<String?>?) {
        if (player!!.details.rights === Rights.PLAYER_MODERATOR && !player!!.zoneMonitor.isInZone("Moderator Zone")) {
            player.sendMessage("You can only use this command in the moderator room.")
            return
        }
        val o = Repository.getPlayer(args!![1], true)
        if (o == null) {
            player!!.sendMessage("Unable to load player " + args[1])
            return
        }
        val items = o.inventory.toArray()
        var size = 0
        val slots = IntArray(items.size)
        for (i in items.indices) {
            if (items[i] != null) {
                slots[size++] = i
            }
        }
        val slot = IntArray(size)
        for (i in 0 until size) {
            slot[i] = slots[i]
        }
        PacketRepository.send(ContainerPacket::class.java, ContainerContext(player, 149, 0, 93, arrayOf(), false))
        PacketRepository.send(ContainerPacket::class.java, ContainerContext(player, 149, 0, 93, items, false, *slots))
        player!!.packetDispatch.sendMessage("Checking " + o.name + "'s inventory.")
    }
}
package plugin.command

import core.ServerConstants
import core.game.node.entity.player.Player
import core.game.node.entity.player.link.TeleportManager
import core.game.system.command.CommandPlugin
import core.game.system.command.CommandSet
import core.game.world.map.Location
import core.plugin.InitializablePlugin
import core.plugin.Plugin
import plugin.CreditShop

@InitializablePlugin
class DonatorCommands : CommandPlugin(){
    override fun parse(player: Player?, name: String?, args: Array<String?>?): Boolean {
        player ?: return false
        when(name){
            "shop" -> CreditShop().open(player).also { return true }
            "bank" -> player.bank.open().also { return true }
            "home" -> {if(!player.inCombat()) player.teleporter.send(ServerConstants.HOME_LOCATION,TeleportManager.TeleportType.NORMAL) else player.sendMessage("You can not do this while in combat."); return true}
            "dzone" -> {if(!player.inCombat()) player.teleporter.send(Location.create(2705, 5348, 0),TeleportManager.TeleportType.NORMAL) else player.sendMessage("You can't do that while in combat.")}
        }
        return false
    }

    override fun newInstance(arg: Any?): Plugin<Any?> {
        link(CommandSet.DONATOR)
        return this
    }
}
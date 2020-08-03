package plugin.skill.magic

import core.ServerConstants
import core.game.node.Node
import core.game.node.entity.Entity
import core.game.node.entity.combat.equipment.SpellType
import core.game.node.entity.player.Player
import core.game.node.entity.player.link.SpellBookManager.SpellBook
import core.game.node.entity.player.link.TeleportManager
import core.game.world.map.Location
import core.plugin.InitializablePlugin
import core.plugin.Plugin
import core.plugin.PluginManager
import plugin.dialogue.DialoguePlugin
import plugin.skill.magic.lunar.LunarTeleportPlugin
import plugin.skill.runecrafting.MysteriousRuin

@InitializablePlugin
class HomeTeleportPlugin : MagicSpell(){
    override fun cast(entity: Entity?, target: Node?): Boolean {
        entity ?: return false
        entity.asPlayer().dialogueInterpreter.open(922819919)
        return true
    }

    override fun newInstance(arg: SpellType?): Plugin<SpellType> {
        PluginManager.definePlugin(TeleportMenu())
        // home
        SpellBook.MODERN.register(0, HomeTeleportPlugin())
        // home
        SpellBook.ANCIENT.register(28, HomeTeleportPlugin())
        SpellBook.LUNAR.register(16, HomeTeleportPlugin())

        return this
    }

    class TeleportMenu(player: Player? = null) : DialoguePlugin(player){
        override fun open(vararg args: Any?): Boolean {
            options("Home","Skilling","Bossing","PVM")
            stage = 0
            return true
        }

        override fun newInstance(player: Player?): DialoguePlugin {
            return TeleportMenu(player)
        }

        override fun handle(interfaceId: Int, buttonId: Int): Boolean {
            when(stage){
                0 -> when(buttonId){
                    1 -> player.teleporter.send(ServerConstants.HOME_LOCATION,TeleportManager.TeleportType.NORMAL).also { end() }
                    2 -> options("Seer's Village","Fishing","Mining","Hunter","More...").also { stage = 10 }
                    3 -> options("KBD","Chaos Ele","Tormented Demons","GWD","More...").also { stage = 200 }
                    4 -> options("Rock Crabs","Hill Giants","Taverley Dungeon","Chaos Tunnels","Slayer Dungeon").also { stage = 100 }
                }

                10 -> when(buttonId){
                    1 -> player.teleporter.send(Location.create(2726, 3484, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    2 -> options("Draynor","Barb Village","Catherby","Fishing Guild").also { stage = 11 }
                    3 -> options("Varrock East","Al-Kharid","Mining Guild").also { stage = 12 }
                    4 -> options("Feldip Hills","Cancel").also { stage = 13 }
                    5 -> options("Runecrafting","Agility").also { stage = 14}
                }

                11 -> when(buttonId){
                    1 -> player.teleporter.send(Location.create(3080, 3250, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    2 -> player.teleporter.send(Location.create(3104, 3433, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    3 -> player.teleporter.send(Location.create(2809, 3435, 0), TeleportManager.TeleportType.NORMAL).also { end() }
                    4 -> player.teleporter.send(Location.create(2611, 3390, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                }

                12 -> when(buttonId) {
                    1 -> player.teleporter.send(Location.create(3286, 3371, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    2 -> player.teleporter.send(Location.create(3299, 3298, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    3 -> player.teleporter.send(Location.create(3025, 9738, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                }
                13 -> when(buttonId) {
                    1 -> player.teleporter.send(Location.create(2525, 2914, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    2 -> end()
            }
                14 -> when(buttonId){
                    1-> options("Air","Water","Fire","Earth","More...").also { stage++ }
                    2-> options("Gnome Stronghold","Barbarian Outpost","Wilderness Course").also { stage = 20 }
                }
                15 -> when(buttonId){
                    1 -> player.teleporter.send(MysteriousRuin.AIR.end,TeleportManager.TeleportType.NORMAL).also { end() }
                    2 -> player.teleporter.send(MysteriousRuin.WATER.end,TeleportManager.TeleportType.NORMAL).also { end()}
                    3 -> player.teleporter.send(MysteriousRuin.FIRE.end,TeleportManager.TeleportType.NORMAL).also { end() }
                    4 -> player.teleporter.send(MysteriousRuin.EARTH.end,TeleportManager.TeleportType.NORMAL).also{end()}
                    5 -> options("Nature","Blood","Cosmic","Death").also { stage++ }
                }
                16 -> when(buttonId){
                    1 -> player.teleporter.send(MysteriousRuin.NATURE.end,TeleportManager.TeleportType.NORMAL).also { end() }
                    2 -> player.teleporter.send(MysteriousRuin.BLOOD.end,TeleportManager.TeleportType.NORMAL).also { end() }
                    3 -> player.teleporter.send(MysteriousRuin.COSMIC.end,TeleportManager.TeleportType.NORMAL).also { end() }
                    4 -> player.teleporter.send(MysteriousRuin.DEATH.end,TeleportManager.TeleportType.NORMAL).also { end() }
                }
                20 -> when(buttonId){
                    1 -> player.teleporter.send(Location.create(2476, 3437, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    2 -> player.teleporter.send(Location.create(2552, 3561, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    3 -> player.teleporter.send(Location.create(3004, 3937, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                }

                200 -> when(buttonId){
                    1 -> player.teleporter.send(Location.create(3067, 10256, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    2 -> player.teleporter.send(Location.create(3268, 3928, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    3 -> player.teleporter.send(Location.create(2580, 5731, 0), TeleportManager.TeleportType.NORMAL).also { end() }
                    4 -> player.teleporter.send(Location.create(2918, 3749, 0), TeleportManager.TeleportType.NORMAL).also { end() }
                    5 -> options("Barrows","Cancel").also { stage++ }
                }
                201 -> when(buttonId){
                    1 -> player.teleporter.send(Location.create(3565, 3312, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    2 -> end()
                }

                100 -> when(buttonId){
                    1 -> player.teleporter.send(Location.create(2670, 3715, 0),TeleportManager.TeleportType.NORMAL).also { end()}
                    2 -> player.teleporter.send(Location.create(3115, 9852, 0), TeleportManager.TeleportType.NORMAL).also { end() }
                    3 -> player.teleporter.send(Location.create(2884, 9796, 0), TeleportManager.TeleportType.NORMAL).also { end() }
                    4 -> player.teleporter.send(Location.create(3246, 5489, 0),TeleportManager.TeleportType.NORMAL).also { end() }
                    5 -> player.teleporter.send(Location.create(2795, 3615, 0), TeleportManager.TeleportType.NORMAL).also { end() }
                }
            }
            return true
        }

        override fun getIds(): IntArray {
            return intArrayOf(922819919)
        }

    }

}
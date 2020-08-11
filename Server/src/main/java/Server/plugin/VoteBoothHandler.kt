package plugin

import core.game.interaction.Option
import core.game.node.entity.npc.NPC
import core.game.node.entity.player.Player
import core.game.system.SystemLogger
import core.plugin.InitializablePlugin
import core.plugin.Plugin
import core.plugin.PluginManager
import plugin.dialogue.DialoguePlugin
import plugin.quest.PluginInteraction
import plugin.quest.PluginInteractionManager

@InitializablePlugin
class VoteBoothHandler : PluginInteraction(8591){

    override fun handle(player: Player?, npc: NPC?, option: Option?): Boolean {
        option ?: return false
        npc ?: return false
        SystemLogger.log("Trying to handle")
        when(option.name.toLowerCase()){
            "vote" -> player?.dialogueInterpreter?.open(8591)
            "shop" -> VoteShop().open(player)
        }
        return true
    }

    override fun fireEvent(identifier: String?, vararg args: Any?): Any {
        return Unit
    }

    override fun newInstance(arg: Any?): Plugin<Any> {
        PluginManager.definePlugin(VoteBoothDialogue())
        PluginInteractionManager.register(this,PluginInteractionManager.InteractionType.NPC)
        return this
    }

    class VoteBoothDialogue(player: Player? = null) : DialoguePlugin(player){
        override fun open(vararg args: Any?): Boolean {
            options("RSPS Toplist","Arena-Top100","TopG","RSPS-List")
            stage = 0
            return true
        }

        override fun newInstance(player: Player?): DialoguePlugin {
            return VoteBoothDialogue(player)
        }

        override fun handle(interfaceId: Int, buttonId: Int): Boolean {
            player.packetDispatch.sendLink(buttonId - 1).also { end() }
            return true
        }

        override fun getIds(): IntArray {
           return intArrayOf(8591)
        }
    }

}
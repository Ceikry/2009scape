package plugin.quest.members.thelosttribe

import core.game.component.Component
import core.game.component.ComponentDefinition
import core.game.component.ComponentPlugin
import core.game.node.entity.player.Player
import core.plugin.InitializablePlugin
import core.plugin.Plugin
import plugin.dialogue.FacialExpression

@InitializablePlugin
class HistoryOfTheGoblinRace : ComponentPlugin() {
    override fun newInstance(arg: Any?): Plugin<Any> {
        ComponentDefinition.put(183,this)
        return this
    }

    override fun open(player: Player?, component: Component?) {
        player ?: return
        super.open(player, component)
        player.packetDispatch.sendInterfaceConfig(183,17,true)
        component?.setCloseEvent { player, c ->
            if(player.questRepository.getQuest("Lost Tribe").getStage(player) == 42) {
                player.dialogueInterpreter.sendDialogues(player, FacialExpression.THINKING, "Hey... The symbol of the 'Dorgeshuun' tribe looks just", "like the symbol on the brooch I found.")
                player.questRepository.getQuest("Lost Tribe").setStage(player, 43)
            }
            true
        }
    }

    override fun handle(player: Player?, component: Component?, opcode: Int, button: Int, slot: Int, itemId: Int): Boolean {
        player ?: return false
        when(button){
            16 -> {
                player.packetDispatch.sendInterfaceConfig(183,32,true)
                player.packetDispatch.sendInterfaceConfig(183,14,false)
                player.packetDispatch.sendInterfaceConfig(183,16,true)
                player.packetDispatch.sendInterfaceConfig(183,17,false)
            }
            17 -> {
                player.packetDispatch.sendInterfaceConfig(183,32,false)
                player.packetDispatch.sendInterfaceConfig(183,14,true)
                player.packetDispatch.sendInterfaceConfig(183,16,false)
                player.packetDispatch.sendInterfaceConfig(183,17,true)
            }
        }
        return true
    }

}
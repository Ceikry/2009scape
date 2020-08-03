package plugin

import core.game.node.entity.player.Player
import core.game.node.item.Item
import core.plugin.InitializablePlugin
import plugin.dialogue.DialoguePlugin
import kotlin.math.floor

@InitializablePlugin
class ArianwynDialogue(player: Player? = null) : DialoguePlugin(player){
    override fun open(vararg args: Any?): Boolean {
        npc("Would you like to exchange gold for tokens or","tokens for gold?")
        stage = 0
        return true
    }

    override fun handle(interfaceId: Int, buttonId: Int): Boolean {
        when(stage++){
            0 -> options("Tokens -> Gold","Gold -> Tokens")
            1 -> when(buttonId){
                1 -> exchange(true).also { end() }
                2 -> exchange(false).also { end() }
            }
            1000 -> end()
        }
        return true
    }

    fun exchange(tokens: Boolean){
        val amt = if(tokens){
            player.inventory.getAmount(Item(14638))
        } else {
            player.inventory.getAmount(Item(995))
        }
        if(amt > 0){
            var newAmount = 0
            if(tokens){
                newAmount = amt * 1000
            } else {
                newAmount = (floor(amt / 1000.0)).toInt()
            }
            if(newAmount > 0){
                val item = if(tokens) Item(995,newAmount) else Item(14638,newAmount)
                if(player.inventory.hasSpaceFor(item)){
                    player.inventory.add(item)
                    if(tokens) player.inventory.remove(Item(14638,amt)) else player.inventory.remove(Item(995,(floor(amt / 1000.0) * 1000).toInt()))
                } else {
                    player.sendMessage("You dont have enough inventory space to do that.")
                }
            } else {
                player.sendMessage("You don't have enough for that.")
            }
        } else {
            player.sendMessage("You need the item in your inventory which you wish to convert.")
        }
    }

    override fun newInstance(player: Player?): DialoguePlugin {
        return ArianwynDialogue(player)
    }

    override fun getIds(): IntArray {
        return intArrayOf(1202)
    }

}
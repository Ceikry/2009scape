package core.game.node.entity.skill.farming

import core.cache.def.impl.ItemDefinition
import core.game.interaction.OptionHandler
import core.game.node.Node
import core.game.node.entity.player.Player
import core.game.node.item.Item
import core.plugin.Initializable
import core.plugin.Plugin
import core.game.node.entity.skill.farming.wrapper.PatchWrapper
import core.tools.stringtools.colorize

/**
 * Handles the farming amulet
 * @author Ceikry
 */
object FarmingAmuletPlugin {
    @JvmStatic
    val amuletIDs = intArrayOf(12622,12620,12618,12616,12614,12612,12610,12608)
    @JvmStatic
    fun handle(wrapper: PatchWrapper, player: Player){
        player.farmingManager.amuletBoundWrapper = wrapper
        player.sendMessage(colorize("%RYou bind your farming amulet to this patch."))
    }
    @JvmStatic
    fun getNext(itemID: Int): Int{
        for((index, id) in amuletIDs.withIndex()){
            if(id == itemID) return when (index) {
                amuletIDs.size - 1 -> amuletIDs[index]
                else -> amuletIDs[index+1]
            }
        }
        return -1
    }
}

@Initializable
class FarmingAmuletOptionHandler : OptionHandler(){
    override fun handle(player: Player?, node: Node?, option: String?): Boolean {
        player ?: return false
        option ?: return false
        node ?: return false
        val wrapper = player.farmingManager.amuletBoundWrapper
        val inventory: Boolean = player.inventory.containsItem(node.asItem())

        if(wrapper == null){
            player.sendMessage("This amulet is not currently bound to any patch.")
            return true
        }

        val nextId = FarmingAmuletPlugin.getNext(node.id)
        val lastUse = nextId == 12608 && node.id == 12608
        if(lastUse){
            player.sendMessage(colorize("%RYour amulet of farming crumbles to dust."))
            if(inventory) player.inventory.remove(node.asItem())
            else player.equipment.remove(node.asItem()).also { player.equipment.refresh() }
        } else {
            if (inventory) {
                player.inventory.remove(node.asItem())
                player.inventory.add(Item(nextId))
            } else {
                player.equipment.remove(node.asItem())
                player.equipment.add(Item(nextId), node.asItem().slot, false, false)
                player.equipment.refresh()
            }
        }

        if(wrapper.cycle.diseaseHandler.isDiseased){
            if(wrapper.cycle.deathHandler.isDead){
                player.dialogueInterpreter.sendDialogue("I am sorry to say,","Your patch has become diseased and died.")
            } else {
                player.dialogueInterpreter.sendDialogue("Your patch has become diseased!")
            }
            return true
        }

        if(wrapper.cycle.growthHandler.isWeedy){
            player.dialogueInterpreter.sendDialogue("Your patch has become overgrown with","weeds!")
            return true
        }

        if(wrapper.cycle.growthHandler.isFullGrown){
            player.dialogueInterpreter.sendDialogue("Your patch is ready to harvest!")
        } else {
            player.dialogueInterpreter.sendDialogue("Your patch is healthy and growing!")
        }
        return true
    }

    override fun newInstance(arg: Any?): Plugin<Any> {
        for(id in FarmingAmuletPlugin.amuletIDs){
            val def = ItemDefinition.forId(id)
            def.handlers["option:operate"] = this
            def.handlers["option:rub"] = this
        }
        return this
    }

}
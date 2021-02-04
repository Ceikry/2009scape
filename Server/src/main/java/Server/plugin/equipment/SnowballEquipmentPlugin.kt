package plugin.equipment

import core.cache.def.impl.ItemDefinition
import core.game.interaction.Interaction
import core.game.interaction.Option
import core.game.node.entity.player.Player
import core.game.node.item.Item
import core.plugin.InitializablePlugin
import core.plugin.Plugin
import plugin.interaction.player.PeltOptionPlugin

@InitializablePlugin
class SnowballEquipmentPlugin : Plugin<Item> {
    override fun newInstance(arg: Item?): Plugin<Item> {
        ItemDefinition.forId(11951).handlers["equipment"] = this
        return this
    }

    override fun fireEvent(identifier: String?, vararg args: Any?): Any {
        val player = args[0] as Player
        when(identifier){
            "equip" -> {
                player.getInteraction().set(Option("Pelt", 0).setHandler(PeltOptionPlugin()))
            }
            "unequip" -> {
                Interaction.sendOption(player, 0, "null")
            }
        }
        return true
    }
}
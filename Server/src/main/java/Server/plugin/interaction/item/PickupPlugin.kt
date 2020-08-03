package plugin.interaction.item

import core.cache.def.impl.ItemDefinition
import core.game.content.global.action.PickupHandler.take
import core.game.interaction.OptionHandler
import core.game.node.Node
import core.game.node.entity.player.Player
import core.game.node.item.GroundItem
import core.game.world.map.Location
import core.plugin.InitializablePlugin
import core.plugin.Plugin

/**
 * Represents the option handler used for ground items.
 * @author Vexia
 * @author Emperor
 */
@InitializablePlugin
class PickupPlugin : OptionHandler() {
    @Throws(Throwable::class)
    override fun newInstance(arg: Any?): Plugin<Any> {
        ItemDefinition.setOptionHandler("take", this)
        return this
    }

    override fun handle(player: Player, node: Node, option: String): Boolean {
        if (player.attributes.containsKey("pickup")) return false
        player.setAttribute("pickup", "true")
        val handleResult = take(player, (node as GroundItem))
        player.removeAttribute("pickup")
        return handleResult
    }

    override fun getDestination(node: Node, item: Node): Location? {
        return null
    }
}
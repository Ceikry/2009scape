package plugin

import core.game.node.entity.npc.NPC
import core.game.node.entity.player.Player
import core.game.node.entity.player.info.PlayerDetails
import core.game.world.map.Direction
import core.game.world.map.Location
import core.plugin.InitializablePlugin
import core.plugin.Plugin

class DonatorZone : Plugin<Any> {
    class Spawn(val id: Int,val location: Location,val direction: String)
    val fishingLocations = listOf(
            Location.create(2718, 5353, 0),
            Location.create(2719, 5353, 0),
            Location.create(2720, 5353, 0),
            Location.create(2721, 5353, 0),
            Location.create(2722, 5353, 0),
            Location.create(2718, 5354, 0),
            Location.create(2719, 5354, 0),
            Location.create(2720, 5354, 0),
            Location.create(2721, 5354, 0),
            Location.create(2722, 5354, 0),
            Location.create(2718, 5356, 0),
            Location.create(2719, 5356, 0),
            Location.create(2720, 5356, 0),
            Location.create(2721, 5356, 0),
            Location.create(2722, 5356, 0),
            Location.create(2718, 5357, 0),
            Location.create(2719, 5357, 0),
            Location.create(2720, 5357, 0),
            Location.create(2721, 5357, 0),
            Location.create(2722, 5357, 0)
    )

    val fishingSpots = listOf(
            952,
            309,
            312,
            313,
            3848
    )

    override fun newInstance(arg: Any?): Plugin<Any> {
        val tempSpots = ArrayList(fishingLocations)
        fishingSpots.map {val loc = tempSpots.random(); val n = NPC.create(it,loc,parseDirection("sw")); n.setAttribute("spawn:npc",true); n.init(); tempSpots.remove(loc) }
        return this
    }

    fun parseDirection(d: String): Int{
        return when(d){
            "n" -> 1
            "ne" -> 2
            "nw" -> 0
            "w" -> 3
            "e" -> 4
            "sw" -> 5
            "se" -> 7
            "s" -> 6
            else -> 1
        }
    }

    override fun fireEvent(identifier: String?, vararg args: Any?): Any {
        return Unit
    }

}

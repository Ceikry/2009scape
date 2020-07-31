package plugin.ai

import core.game.node.entity.player.Player
import core.game.node.item.GroundItem

class AIRepository {
    companion object {
        val groundItems = HashMap<Player,ArrayList<GroundItem>>()

        @JvmStatic
        fun addItem(item: GroundItem){
            if(groundItems[item.dropper] == null){
                val list = ArrayList<GroundItem>()
                list.add(item)
                groundItems[item.dropper] = list
                return
            }
            groundItems[item.dropper]!!.add(item)
        }

        @JvmStatic
        fun getItems(player: Player): ArrayList<GroundItem>?{
            return groundItems[player]
        }
    }
}
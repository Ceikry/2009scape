package core.game.node.entity.skill.farming.pot

import core.game.container.Container
import core.game.node.item.Item
import core.game.system.task.Pulse
import core.game.world.repository.Repository
import java.util.ArrayList

/**
 * Pulse that handles the growth of seedlings for players
 * @author Ceikry
 */
class SeedlingPulse : Pulse(10){

    override fun pulse(): Boolean {
        /**
         * Loop the list of active players and update their
         * seedlings if they have any. Clear their seedling list
         * if they have no seedlings to update.
         */
        Repository.players.forEach { player ->
            if(player.farmingManager.seedlingManager.seedlings.isNotEmpty()){
               if(  !updateSeedlings(player.bank) &&
                    !updateSeedlings(player.inventory) ) player.farmingManager.seedlingManager.seedlings.clear()
            }
        }
        return false
    }

    /**
     * Extension function for getting the seedlings in a container
     */
    private fun Container.getSeedlings(): List<Item>{
        val seedList = ArrayList<Item>()
        this.toArray()
                .filter  {it != null && Saplings.seedlingMap.keys.contains(it.id) && it.charge > 1000 }
                .forEach { seedList.add(it) }
        return seedList
    }

    /**
     * Method for updating the seedlings in a container
     * @return true if any seedlings were updated, false otherwise
     */
    private fun updateSeedlings(container: Container): Boolean{
        val seedlingsInContainer = container.getSeedlings()
        if(seedlingsInContainer.isEmpty()) return false

        seedlingsInContainer.forEach{
            if(1005 - it.charge == 0) {
                container.remove(it)
                container.add(Saplings.forSeedling(it).sapling)
            } else it.charge += 1
        }
        return true
    }
}
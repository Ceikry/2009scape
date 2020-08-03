package plugin

import core.cache.def.impl.ItemDefinition
import core.game.interaction.OptionHandler
import core.game.node.Node
import core.game.node.entity.player.Player
import core.game.system.task.Pulse
import core.game.world.update.flag.context.Animation
import core.plugin.InitializablePlugin
import core.plugin.Plugin
import core.tools.RandomFunction

@InitializablePlugin
class DiceBagHandler : OptionHandler() {
    override fun handle(player: Player?, node: Node?, option: String?): Boolean {
        player ?: return false
        node ?: return false
        option ?: return false
        val roll = RandomFunction.random(100)
        val hostWin = roll <= 55
        player.locks.lockMovement(10)
        player.locks.lockInteractions(10)
        player.animator.animate(Animation(2140))
        player.pulseManager.run(object: Pulse() {
            var counter = 0
            override fun pulse(): Boolean {
                when(counter++){
                    0 -> player.sendChat("[${player.username}] Dicing: Rolling in 3...")
                    3 -> player.sendChat("2...")
                    5 -> player.sendChat("1...")
                    7 -> player.sendChat("[${player.username}] Dicing: I rolled a $roll!")
                    10 -> player.sendChat(if(hostWin) "I win! Bad luck, try again next time." else "You win! Congratulations.").also { return true }
                }
                return false
            }
        })
        return true
    }

    override fun newInstance(arg: Any?): Plugin<Any> {
        ItemDefinition.forId(14643).configurations.put("option:roll",this)
        return this
    }

}
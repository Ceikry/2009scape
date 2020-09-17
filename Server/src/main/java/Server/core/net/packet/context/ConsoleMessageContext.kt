package core.net.packet.context

import core.game.node.entity.player.Player
import core.net.packet.Context

data class ConsoleMessageContext(private val player: Player, val message: String): Context {
    override fun getPlayer(): Player = player
}
package core.net.packet.context

import core.game.node.entity.player.Player
import core.net.packet.Context

data class ConsoleAutocompleteContext(
        private val player: Player,
        val line: String,
        val completions: Collection<String>,
        val totalResults: Int
): Context {
    override fun getPlayer(): Player = player
}
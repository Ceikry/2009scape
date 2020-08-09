package core.net.packet.context

import core.game.node.entity.player.Player
import core.net.packet.Context

class SendLinkContext(val myPlayer: Player,val link: String) : Context{
    override fun getPlayer(): Player {
        return this.myPlayer;
    }
}
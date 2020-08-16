package core.net.packet.out

import core.game.node.entity.player.VoteManager
import core.game.node.item.Item
import core.game.system.task.Pulse
import core.net.packet.IoBuffer
import core.net.packet.OutgoingPacket
import core.net.packet.context.SendLinkContext
import core.tools.RandomFunction

class SendLink : OutgoingPacket<SendLinkContext>{
    val VALID_CHARS = charArrayOf('-',':','/','.','_','&','?','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    override fun send(context: SendLinkContext?) {
        context ?: return
        var buf: IoBuffer? = null
        buf = IoBuffer(239 + context.linkIndex)
        context.player.session?.write(buf)
        context.player.sendMessage("Do NOT log out for the next minute! You will not receive your token if you do.")
        context.player.pulseManager.run(object : Pulse(100){
            override fun pulse(): Boolean {
                context.player.voteManager.votes.add(VoteManager.Vote(RandomFunction.random(Integer.MAX_VALUE)))
                return true
            }
        })
    }
}
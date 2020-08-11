package core.net.packet.out

import core.net.packet.IoBuffer
import core.net.packet.OutgoingPacket
import core.net.packet.context.SendLinkContext

class SendLink : OutgoingPacket<SendLinkContext>{
    val VALID_CHARS = charArrayOf('-',':','/','.','_','&','?','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    override fun send(context: SendLinkContext?) {
        context ?: return
        var buf: IoBuffer? = null
        buf = IoBuffer(239 + context.linkIndex)
        context.player.session?.write(buf)
    }
}
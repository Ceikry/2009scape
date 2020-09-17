package core.net.packet.out

import core.net.packet.IoBuffer
import core.net.packet.OutgoingPacket
import core.net.packet.PacketHeader
import core.net.packet.context.ConsoleMessageContext

class ConsoleMessage: OutgoingPacket<ConsoleMessageContext> {
    override fun send(context: ConsoleMessageContext) {
        val buffer = IoBuffer(241, PacketHeader.SHORT)
        buffer.putString(context.message)
        context.player.session.write(buffer)
    }
}
package core.net.packet.out

import core.net.packet.IoBuffer
import core.net.packet.OutgoingPacket
import core.net.packet.PacketHeader
import core.net.packet.context.ConsoleAutocompleteContext

class ConsoleAutocomplete: OutgoingPacket<ConsoleAutocompleteContext> {
    override fun send(context: ConsoleAutocompleteContext) {
        val buffer = IoBuffer(242, PacketHeader.SHORT)
        buffer.putString(context.line)
        buffer.putShort(context.completions.size)
        context.completions.forEach(buffer::putString)
        buffer.putInt(context.totalResults)
        context.player.session.write(buffer)
    }
}
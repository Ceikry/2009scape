package org.rs09.client.net.game

import org.runite.jagex.*
import java.io.IOException

object PacketDecoder {
    @Throws(IOException::class)
    fun decodePacket(): Boolean {
        val connection = Class3_Sub15.activeConnection ?: return false
        var availableBytes = connection.availableBytes()
        if (availableBytes <= 0) return false

        if (Unsorted.incomingOpcode == -1) {
            availableBytes--
            Class3_Sub15.activeConnection.readBytes(GraphicDefinition.incomingBuffer.buffer, 0, 1)
            GraphicDefinition.incomingBuffer.index = 0
            Unsorted.incomingOpcode = GraphicDefinition.incomingBuffer.opcode
            Unsorted.incomingPacketLength = Class75_Sub4.anIntArray2668[Unsorted.incomingOpcode]
        }

        if (Unsorted.incomingPacketLength == -1) {
            if (availableBytes < 1) return false

            availableBytes--
            Class3_Sub15.activeConnection.readBytes(GraphicDefinition.incomingBuffer.buffer, 0, 1)
            Unsorted.incomingPacketLength = GraphicDefinition.incomingBuffer.buffer[0].toInt() and 0xff
        }

        if (Unsorted.incomingPacketLength == -2) {
            if (availableBytes < 2) return  false

            availableBytes -= 2
            Class3_Sub15.activeConnection.readBytes(GraphicDefinition.incomingBuffer.buffer, 0, 2)
            GraphicDefinition.incomingBuffer.index = 0
            Unsorted.incomingPacketLength = GraphicDefinition.incomingBuffer.readUnsignedShort()
        }

        if (availableBytes < Unsorted.incomingPacketLength) return false

        GraphicDefinition.incomingBuffer.index = 0
        Class3_Sub15.activeConnection.readBytes(GraphicDefinition.incomingBuffer.buffer, 0, Unsorted.incomingPacketLength)
        Class24.anInt469 = Class7.anInt2166
        Class7.anInt2166 = Class3_Sub29.anInt2582
        Class3_Sub29.anInt2582 = Unsorted.incomingOpcode
        Class3_Sub28_Sub16.anInt3699 = 0

        PacketParser.parseIncomingPackets();

        // TODO This should only happen after everything else.
        Unsorted.incomingOpcode = -1
        return true
    }
}
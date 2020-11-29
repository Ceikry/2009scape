package org.rs09.client.net.game

import org.rs09.client.net.game.inbound.ClearGameObjectDecoder
import org.rs09.client.net.game.inbound.ConsoleAutocompletionPacketDecoder
import org.rs09.client.net.game.inbound.ConsoleMessageDecoder
import org.rs09.client.net.game.inbound.GamePacketDecoder
import org.runite.client.*
import java.io.IOException

object PacketDecoder {
    val decoders = HashMap<Int, GamePacketDecoder>()
    var OPCODE_OFFSET = 241

    private fun registerCustomDecoder(size: Int, decoder: GamePacketDecoder): Int {
        val opcode = OPCODE_OFFSET++

        Network.incomingPacketSizes[opcode] = size
        decoders[opcode] = decoder
        return opcode
    }

    init {
        // VERY IMPORTANT - WHEN ADDING NEW PACKETS, ADD THEM AFTER THE OLD PACKETS
        // OTHERWISE YOU >>WILL<< MESS UP OPCODES

        registerCustomDecoder(-2, ConsoleMessageDecoder)
        registerCustomDecoder(-2, ConsoleAutocompletionPacketDecoder)
        decoders[195] = ClearGameObjectDecoder
//        println("NOTE > Registered ConsoleAutocompletionPacket as opcode $completion")
    }

    @Throws(IOException::class)
    fun decodePacket(): Boolean {
        val connection = Network.activeConnection ?: return false
        var availableBytes = connection.availableBytes()
        if (availableBytes <= 0) return false

        if (Network.incomingOpcode == -1) {
            availableBytes--
            Network.activeConnection.readBytes(Network.incomingBuffer.buffer, 0, 1)
            Network.incomingBuffer.index = 0
            Network.incomingOpcode = Network.incomingBuffer.opcode
            Network.incomingPacketLength = Network.incomingPacketSizes[Network.incomingOpcode]
        }

        if (Network.incomingPacketLength == -1) {
            if (availableBytes < 1) return false

            availableBytes--
            Network.activeConnection.readBytes(Network.incomingBuffer.buffer, 0, 1)
            Network.incomingPacketLength = Network.incomingBuffer.buffer[0].toInt() and 0xff
        }

        if (Network.incomingPacketLength == -2) {
            if (availableBytes < 2) return false

            availableBytes -= 2
            Network.activeConnection.readBytes(Network.incomingBuffer.buffer, 0, 2)
            Network.incomingBuffer.index = 0
            Network.incomingPacketLength = Network.incomingBuffer.readUnsignedShort()
        }

        if (availableBytes < Network.incomingPacketLength) return false

        Network.incomingBuffer.index = 0
        Network.activeConnection.readBytes(Network.incomingBuffer.buffer, 0, Network.incomingPacketLength)
        Class24.anInt469 = Class7.anInt2166
        Class7.anInt2166 = LinkableRSString.anInt2582
        LinkableRSString.anInt2582 = Network.incomingOpcode
        AbstractSprite.anInt3699 = 0

        val decoder = decoders[Network.incomingOpcode]
        if (decoder == null) return PacketParser.parseIncomingPackets()
        else decoder.decode(Network.incomingBuffer)

        // TODO This should only happen after everything else.
        Network.incomingOpcode = -1
        return true
    }
}
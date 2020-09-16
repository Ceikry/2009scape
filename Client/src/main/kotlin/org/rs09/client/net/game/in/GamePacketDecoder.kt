package org.rs09.client.net.game.`in`

import org.runite.jagex.DataBuffer

interface GamePacketDecoder {
    fun decode(buffer: DataBuffer)
}
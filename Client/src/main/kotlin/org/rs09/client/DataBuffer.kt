package org.rs09.client

class DataBuffer(val buffer: ByteArray, var index: Int) {
    constructor(buffer: ByteArray) : this(buffer, 0)
    constructor(length: Int) : this(ByteArray(length), 0)

    fun readUnsignedByte(): Int {
        return buffer[index++].toInt() and 0xff
    }


    // TODO The shl 16 value was being AND-ed with 16711680. Why?
    fun readInt(): Int {
        index += 4
        return (buffer[index - 4].toInt() and 0xff shl 24) +
                (buffer[index - 3].toInt() and 0xff shl 16) +
                (buffer[index - 2].toInt() and 0xff shl 8) +
                (buffer[index - 1].toInt() and 0xff)
    }

    fun readBytes(length: Int): ByteArray {
        val out = ByteArray(length)
        System.arraycopy(buffer, index, out, 0, length)
        index += length
        return out
    }
}
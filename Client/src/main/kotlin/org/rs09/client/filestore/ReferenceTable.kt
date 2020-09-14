package org.rs09.client.filestore

import org.rs09.client.DataBuffer
import org.rs09.client.filestore.compression.Container
import org.rs09.client.util.CRC

class ReferenceTable(data: ByteArray, crc: Int) {
    val crc: Int

    private fun decode(data: ByteArray) {
        val buffer = DataBuffer(Container.decode(data))

    }

    init {
        this.crc = CRC.crc32(data, data.size)
        if (this.crc != crc)
            throw IllegalArgumentException("CRC mismatch - expected $crc, calculated ${this.crc}")

    }
}
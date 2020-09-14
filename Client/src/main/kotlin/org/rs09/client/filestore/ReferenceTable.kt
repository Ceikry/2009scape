package org.rs09.client.filestore

import org.rs09.client.DataBuffer
import org.rs09.client.filestore.compression.Container
import org.rs09.client.util.CRC
import org.runite.jagex.Class69

class ReferenceTable(data: ByteArray, crc: Int) {
    val crc: Int = CRC.crc32(data, data.size)
    var revision = 0
    var validArchiveAmount = 0
    var archiveAmount = 0
    lateinit var validArchiveIds: IntArray
    lateinit var archiveRevisions: IntArray
    lateinit var validFileIds: Array<IntArray?>
    lateinit var archiveCRCs: IntArray
    lateinit var archiveLengths: IntArray
    lateinit var archiveFileLengths: IntArray
    lateinit var archiveNameHash: IntArray
    var aClass69_949: Class69? = null
    var aClass69Array962: Array<Class69?>? = null
    var fileNameHashes: Array<IntArray?>? = null

    private fun decode(data: ByteArray) {
        val buffer = DataBuffer(Container.decode(data))
        val format = buffer.readUnsignedByte()
        check(format == 5 || format == 6) { "Unexpected ReferenceTable format $format. Expected 5 or 6." }
        revision = if (format >= 6) buffer.readInt() else 0

        val fields = buffer.readUnsignedByte()

        validArchiveAmount = buffer.readUnsignedShort()
        validArchiveIds = IntArray(validArchiveAmount)

        var var6 = 0
        var var7 = -1

        var var8 = 0
        while (validArchiveAmount > var8) {
            var6 += buffer.readUnsignedShort()
            validArchiveIds[var8] = var6
            if (validArchiveIds[var8] > var7) {
                var7 = validArchiveIds[var8]
            }
            var8++
        }

        archiveAmount = var7 - -1
        archiveRevisions = IntArray(archiveAmount)
        validFileIds = arrayOfNulls(archiveAmount)
        archiveCRCs = IntArray(archiveAmount)
        archiveLengths = IntArray(archiveAmount)
        archiveFileLengths = IntArray(archiveAmount)

        if (fields != 0) {
            archiveNameHash = IntArray(archiveAmount)

            var8 = 0
            while (archiveAmount > var8) {
                archiveNameHash[var8] = -1
                var8++
            }

            var8 = 0
            while (validArchiveAmount > var8) {
                archiveNameHash[validArchiveIds[var8]] = buffer.readInt()
                var8++
            }

            aClass69_949 = Class69(archiveNameHash)
        }

        var8 = 0
        while (var8 < validArchiveAmount) {
            archiveCRCs[validArchiveIds[var8]] = buffer.readInt()
            ++var8
        }

        var8 = 0
        while (validArchiveAmount > var8) {
            archiveRevisions[validArchiveIds[var8]] = buffer.readInt()
            ++var8
        }

        var8 = 0
        while (validArchiveAmount > var8) {
            archiveFileLengths[validArchiveIds[var8]] = buffer.readUnsignedShort()
            ++var8
        }

        var var9: Int
        var var10: Int
        var var11: Int
        var var12: Int
        var8 = 0
        while (validArchiveAmount > var8) {
            var6 = 0
            var9 = validArchiveIds[var8]
            var10 = archiveFileLengths[var9]
            var11 = -1
            this.validFileIds[var9] = IntArray(var10)
            var12 = 0
            while (var10 > var12) {
                var6 += buffer.readUnsignedShort()
                this.validFileIds[var9]!![var12] = var6
                val var13 = this.validFileIds[var9]!![var12]
                if (var13 > var11) {
                    var11 = var13
                }
                ++var12
            }
            archiveLengths[var9] = var11 + 1
            if (var10 == 1 + var11) {
                validFileIds[var9] = null
            }
            ++var8
        }

        if (fields != 0) {
            val aClass69Array962 = arrayOfNulls<Class69>(var7 + 1)
            val fileNameHashes = arrayOfNulls<IntArray>(var7 + 1)
            var8 = 0
            while (var8 < validArchiveAmount) {
                var9 = validArchiveIds[var8]
                var10 = archiveFileLengths[var9]
                fileNameHashes[var9] = IntArray(archiveLengths[var9])
                var11 = 0
                while (var11 < archiveLengths[var9]) {
                    fileNameHashes[var9]!![var11] = -1
                    ++var11
                }
                var11 = 0
                while (var10 > var11) {
                    var12 = if (null == validFileIds[var9]) {
                        var11
                    } else {
                        validFileIds[var9]!![var11]
                    }
                    fileNameHashes[var9]!![var12] = buffer.readInt()
                    ++var11
                }
                aClass69Array962[var9] = Class69(fileNameHashes[var9])
                ++var8
            }
            this.fileNameHashes = fileNameHashes
            this.aClass69Array962 = aClass69Array962
        }
    }

    init {
        if (this.crc != crc)
            throw IllegalArgumentException("CRC mismatch - expected $crc, calculated ${this.crc}")
        decode(data)
    }
}
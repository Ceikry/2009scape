package org.runite.jagex;

import org.rs09.client.filestore.compression.Container;
import org.rs09.client.util.CRC;

final class ReferenceTable {

	int[][] fileNameHashes;
	int[] archiveCRCs;
	int validArchiveAmount;
	Class69 aClass69_949;
	int[] validArchiveIds;
	int[] archiveLengths;
	int[] archiveNameHash;
	int[] archiveFileLengths;
	int[] archiveRevisions;
	int[][] validFileIds;
	int archiveAmount;
	int revision;
	Class69[] aClass69Array962;
	int crc;

	private void decode(byte[] data) {
		try {
			RSByteBuffer buffer = new RSByteBuffer(Container.INSTANCE.decode(data));//new RSByteBuffer(Class3_Sub28_Sub13.decodeContainer(data));
			int format = buffer.readUnsignedByte();
			if (format == 5 || format == 6) {
				if (format >= 6) {
					this.revision = buffer.readInt();
				} else {
					this.revision = 0;
				}

				int info = buffer.readUnsignedByte();
				int var6 = 0;
				this.validArchiveAmount = buffer.getShort();
				int var7 = -1;
				this.validArchiveIds = new int[this.validArchiveAmount];

				int var8;
				for (var8 = 0; this.validArchiveAmount > var8; ++var8) {
					this.validArchiveIds[var8] = var6 += buffer.getShort();

					if (this.validArchiveIds[var8] > var7) {
						var7 = this.validArchiveIds[var8];
					}
				}

				this.archiveAmount = var7 - -1;
				this.archiveRevisions = new int[this.archiveAmount];
				this.validFileIds = new int[this.archiveAmount][];
				this.archiveCRCs = new int[this.archiveAmount];
				this.archiveLengths = new int[this.archiveAmount];
				this.archiveFileLengths = new int[this.archiveAmount];
				if (info != 0) {
					this.archiveNameHash = new int[this.archiveAmount];

					for (var8 = 0; this.archiveAmount > var8; ++var8) {
						this.archiveNameHash[var8] = -1;
					}

					for (var8 = 0; this.validArchiveAmount > var8; ++var8) {
						this.archiveNameHash[this.validArchiveIds[var8]] = buffer.readInt();
					}

					this.aClass69_949 = new Class69(this.archiveNameHash);
				}

				for (var8 = 0; var8 < this.validArchiveAmount; ++var8) {
					this.archiveCRCs[this.validArchiveIds[var8]] = buffer.readInt();
				}

				for (var8 = 0; this.validArchiveAmount > var8; ++var8) {
					this.archiveRevisions[this.validArchiveIds[var8]] = buffer.readInt();
				}

				var8 = 0;
				while (this.validArchiveAmount > var8) {
					this.archiveFileLengths[this.validArchiveIds[var8]] = buffer.getShort();
					++var8;
				}

				int var9;
				int var10;
				int var11;
				int var12;
				for (var8 = 0; this.validArchiveAmount > var8; ++var8) {
					var6 = 0;
					var9 = this.validArchiveIds[var8];
					var10 = this.archiveFileLengths[var9];
					var11 = -1;
					this.validFileIds[var9] = new int[var10];

					for (var12 = 0; var10 > var12; ++var12) {
						int var13 = this.validFileIds[var9][var12] = var6 += buffer.getShort();
						if (var13 > var11) {
							var11 = var13;
						}
					}

					this.archiveLengths[var9] = var11 + 1;
					if (var10 == 1 + var11) {
						this.validFileIds[var9] = null;
					}
				}

				if (info != 0) {
					this.aClass69Array962 = new Class69[var7 - -1];
					this.fileNameHashes = new int[1 + var7][];

					for (var8 = 0; var8 < this.validArchiveAmount; ++var8) {
						var9 = this.validArchiveIds[var8];
						var10 = this.archiveFileLengths[var9];
						this.fileNameHashes[var9] = new int[this.archiveLengths[var9]];

						for (var11 = 0; var11 < this.archiveLengths[var9]; ++var11) {
							this.fileNameHashes[var9][var11] = -1;
						}

						for (var11 = 0; var10 > var11; ++var11) {
							if (null == this.validFileIds[var9]) {
								var12 = var11;
							} else {
								var12 = this.validFileIds[var9][var11];
							}

							this.fileNameHashes[var9][var12] = buffer.readInt();
						}

						this.aClass69Array962[var9] = new Class69(this.fileNameHashes[var9]);
					}
				}

			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var14) {
			throw Class44.clientError(var14, "ii.C(" + 2 + ',' + (data != null ? "{...}" : "null") + ')');
		}
	}

	public ReferenceTable(byte[] data, int crc) {
		this.crc = CRC.INSTANCE.crc32(data, data.length);
		if (this.crc != crc)
			throw new RuntimeException("Reference table CRC mismatch. Expected: " + crc + ", got" + this.crc);
		decode(data);
	}

}

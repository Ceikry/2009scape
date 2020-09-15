package org.runite.jagex;

import org.rs09.client.Linkable;
import org.rs09.client.util.ByteArrayPool;
import org.rs09.client.util.CRC;
import org.runite.Configurations;

import java.math.BigInteger;
import java.util.Objects;

public class DataBuffer extends Linkable {

    byte[] buffer;
    int index;

    final int getShort() {
        try {
            // TODO: PROBABLY SAFE TO YEET. IT LOOKS LIKE BULLSHIT obfus code

            this.index += 2;
            return (this.buffer[-2 + this.index] << 8 & '\uff00') + (this.buffer[-1 + this.index] & 255);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.EB(" + ')');
        }
    }

    final void putInt(int var1, int value) {
        try {
            if (var1 > -119) {
                TextCore.LoadedInterfaces = (RSString) null;
            }

            this.buffer[this.index++] = (byte) (value >> 24);
            this.buffer[this.index++] = (byte) (value >> 16);
            this.buffer[this.index++] = (byte) (value >> 8);
            this.buffer[this.index++] = (byte) value;
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.UC(" + var1 + ',' + value + ')');
        }
    }

    final void method739(int var2, long var3) {
        try {
            --var2;
            if (var2 >= 0 && var2 <= 7) {
                for (int var5 = var2 * 8; 0 <= var5; var5 -= 8) {
                    this.buffer[this.index++] = (byte) ((int) (var3 >> var5));
                }

            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var6) {
            throw Class44.clientError(var6, "wa.OB(" + 0 + ',' + var2 + ',' + var3 + ')');
        }
    }

    final void putLong(long var1, int var3) {
        try {
            this.buffer[this.index++] = (byte) ((int) (var1 >> 56));
            this.buffer[this.index++] = (byte) ((int) (var1 >> 48));
            if (var3 == -2037491440) {
                this.buffer[this.index++] = (byte) ((int) (var1 >> 40));
                this.buffer[this.index++] = (byte) ((int) (var1 >> 32));
                this.buffer[this.index++] = (byte) ((int) (var1 >> 24));
                this.buffer[this.index++] = (byte) ((int) (var1 >> 16));
                this.buffer[this.index++] = (byte) ((int) (var1 >> 8));
                this.buffer[this.index++] = (byte) ((int) var1);
            }
        } catch (RuntimeException var5) {
            throw Class44.clientError(var5, "wa.AC(" + var1 + ',' + var3 + ')');
        }
    }

    final int method741(byte var1) {
        try {
            byte var2 = this.buffer[this.index++];

            int var3;
            for (var3 = 0; 0 > var2; var2 = this.buffer[this.index++]) {
                var3 = (127 & var2 | var3) << 7;
            }

            return var2 | var3;
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.WA(" + var1 + ')');
        }
    }

    final void method742(int var2) {
        try {
            this.buffer[-4 + this.index + -var2] = (byte) (var2 >> 24);
            this.buffer[-var2 + this.index - 3] = (byte) (var2 >> 16);
            this.buffer[-2 + this.index + -var2] = (byte) (var2 >> 8);

            this.buffer[-var2 + this.index + -1] = (byte) var2;
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.VB(" + 83 + ',' + var2 + ')');
        }
    }

    final void putByteS(int var2) {
        try {
            this.buffer[this.index++] = (byte) (-var2 + 128);

        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.PC(" + 10213 + ',' + var2 + ')');
        }
    }

    final void putString(RSString var2) {
        try {
            this.index += var2.method1580(this.buffer, this.index, var2.length(-65));
            this.buffer[this.index++] = 0;
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.LA(" + 0 + ',' + (var2 != null ? "{...}" : "null") + ')');
        }
    }

    final int getShortAs() {
        try {
            this.index += 2;
            int var2 = (this.buffer[-2 + this.index] << 8 & '\uff00') - -(-128 + this.buffer[this.index + -1] & 255);

            if (var2 > 32767) {
                var2 -= 65536;
            }

            return var2;
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.NA(" + -58 + ')');
        }
    }

    public final int readInt() {
        this.index += 4;
        return ((255 & this.buffer[this.index - 4]) << 24) + (16711680 & this.buffer[this.index + -3] << 16) + (((255 & this.buffer[this.index - 2]) << 8) - -(this.buffer[this.index - 1] & 255));
    }

    final byte method749() {
        try {
            return (byte) (-this.buffer[this.index++] + 128);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.JB(" + false + ')');
        }
    }

    final RSString method750() {
        try {
            if (this.buffer[this.index] == 0) {
                ++this.index;
                return null;
            } else {
                return this.getString();
            }
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.IB(" + (byte) 78 + ')');
        }
    }

    final int getByteA(byte var1) {
        try {
            return 255 & this.buffer[this.index++] - 128;
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.DC(" + var1 + ')');
        }
    }


    final void putByte(byte var1, int var2) {
        try {
            this.buffer[this.index++] = (byte) var2;
            if (var1 >= -5) {
                this.method757(-77, -126);
            }

        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.RA(" + var1 + ',' + var2 + ')');
        }
    }

    final void putBytes(byte[] var1, int var3, int var4) {
        try {
            int var5 = 0;
            if (var4 >= 37) {
                while (var3 > var5) {
                    this.buffer[this.index++] = var1[var5];
                    ++var5;
                }

            }
        } catch (RuntimeException var6) {
            throw Class44.clientError(var6, "wa.QC(" + (var1 != null ? "{...}" : "null") + ',' + 0 + ',' + var3 + ',' + var4 + ')');
        }
    }

    final int getByteS() {
        try {

            return -this.buffer[this.index++] + 128 & 255;
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.PB(" + true + ')');
        }
    }

    final int getTriByte2() {
        try {
            this.index += 3;
            return ((this.buffer[this.index + -2] & 255) << 8) + ((this.buffer[-1 + this.index] & 255) << 16) + (this.buffer[-3 + this.index] & 255);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.BA(" + (byte) -118 + ')');
        }
    }

    final long getLong(int var1) {
        try {
            if (var1 > -75) {
                return -1L;
            } else {
                long var2 = (long) this.readInt() & 4294967295L;
                long var4 = 4294967295L & (long) this.readInt();
                return var4 + (var2 << 32);
            }
        } catch (RuntimeException var6) {
            throw Class44.clientError(var6, "wa.GA(" + var1 + ')');
        }
    }

    final void method757(int var1, int var2) {
        try {
            this.buffer[this.index++] = (byte) var1;
            if (var2 < 54) {
                this.method749();
            }

            this.buffer[this.index++] = (byte) (var1 >> 8);
            this.buffer[this.index++] = (byte) (var1 >> 16);
            this.buffer[this.index++] = (byte) (var1 >> 24);
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.AB(" + var1 + ',' + var2 + ')');
        }
    }

    final int getShortA(int var1) {
        try {
            this.index += 2;
            return (this.buffer[-1 + this.index] - 128 & 255) + ('\uff00' & this.buffer[-2 + this.index] << 8);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.LC(" + var1 + ')');
        }
    }


    final void putIntB(int var1, int var2) {
        try {
            this.buffer[this.index++] = (byte) (var2 >> 16);
            this.buffer[this.index++] = (byte) (var2 >> 24);
            if (var1 >= -56) {
                this.method768(82, 22);
            }

            this.buffer[this.index++] = (byte) var2;
            this.buffer[this.index++] = (byte) (var2 >> 8);
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.MC(" + var1 + ',' + var2 + ')');
        }
    }

    public DataBuffer(int var1) {
        try {
            this.buffer = ByteArrayPool.INSTANCE.getByteArray(var1);
            this.index = 0;
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.<init>(" + var1 + ')');
        }
    }

    final byte getByte() {
        try {
            return this.buffer[this.index++];
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.TA(" + -1 + ")");
        }
    }

    final RSString getGJString2(int var1) {
        try {
            byte var2 = this.buffer[this.index++];
            if (var1 < 50) {
                this.buffer = (byte[]) null;
            }

            if (0 == var2) {
                int var3 = this.index;

                while (Objects.requireNonNull(this.buffer)[this.index++] != 0) {
                }

                return Class3_Sub13_Sub3.method178(this.buffer, this.index - (var3 - -1), var3);
            } else {
                throw new IllegalStateException("Bad version number in gjstr2");
            }
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.DA(" + var1 + ')');
        }
    }

    final void method762(float var1, byte var2) {
        try {
            int var3 = Float.floatToRawIntBits(var1);
            this.buffer[this.index++] = (byte) var3;
            if (var2 > 63) {
                this.buffer[this.index++] = (byte) (var3 >> 8);
                this.buffer[this.index++] = (byte) (var3 >> 16);
                this.buffer[this.index++] = (byte) (var3 >> 24);
            }
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.CC(" + var1 + ',' + var2 + ')');
        }
    }

    final byte method763(byte var1) {
        try {
            return var1 < 98 ? 95 : (byte) (-this.buffer[this.index++]);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.BC(" + var1 + ')');
        }
    }

    final void method764(int var2, byte[] var3) {
        try {

            for (int var5 = 0; var2 > var5; ++var5) {
                var3[var5] = this.buffer[this.index++];
            }

        } catch (RuntimeException var6) {
            throw Class44.clientError(var6, "wa.SB(" + 0 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (byte) 93 + ')');
        }
    }

    final void putLEShortA(int var1) {
        try {
            this.buffer[this.index++] = (byte) (var1 + 128);
            this.buffer[this.index++] = (byte) (var1 >> 8);
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.MA(" + var1 + ')');
        }
    }

    final int getLEShort(int var1) {
        try {
            this.index += 2;
            return var1 >= -54 ? -17 : (255 & this.buffer[this.index - 2]) + ('\uff00' & this.buffer[this.index - 1] << 8);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.BB(" + var1 + ')');
        }
    }

    final void method768(int var1, int var2) {
        try {
            if (var1 != -32769) {
                this.putInt(97, -9);
            }

            if (0 <= var2 && var2 < 128) {
                this.putByte((byte) -10, var2);
            } else if (0 <= var2 && var2 < 32768) {
                this.putShort('\u8000' + var2);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.UA(" + var1 + ',' + var2 + ')');
        }
    }

    final void method769(byte var1, int var2) {
        try {
            this.buffer[-1 + -var2 + this.index] = (byte) var2;
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.MB(" + var1 + ',' + var2 + ')');
        }
    }

    final void method770(int[] var1, int var4) {
        try {
            int var5 = this.index;
            this.index = 5;
            int var6 = (-5 + var4) / 8;

            for (int var7 = 0; var6 > var7; ++var7) {
                int var10 = -957401312;
                int var8 = this.readInt();
                int var9 = this.readInt();
                int var12 = 32;

                for (int var11 = -1640531527; var12-- > 0; var8 -= (var9 >>> 5 ^ var9 << 4) + var9 ^ var1[var10 & 3] + var10) {
                    var9 -= var1[(6754 & var10) >>> 11] + var10 ^ var8 + (var8 >>> 5 ^ var8 << 4);
                    var10 -= var11;
                }

                this.index -= 8;
                this.putInt(-122, var8);
                this.putInt(-121, var9);
            }

            this.index = var5;
        } catch (RuntimeException var13) {
            throw Class44.clientError(var13, "wa.SC(" + (var1 != null ? "{...}" : "null") + ',' + 120 + ',' + 5 + ',' + var4 + ')');
        }
    }

    final void method771(int var2) {
        try {
            if ((-128 & var2) != 0) {
                if ((-16384 & var2) != 0) {
                    if ((var2 & -2097152) != 0) {
                        if (0 != (-268435456 & var2)) {
                            this.putByte((byte) -64, var2 >>> 28 | 128);
                        }

                        this.putByte((byte) -80, 128 | var2 >>> 21);
                    }

                    this.putByte((byte) -100, 128 | var2 >>> 14);
                }

                this.putByte((byte) -21, var2 >>> 7 | 128);
            }

            this.putByte((byte) -46, var2 & 127);
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.DB(" + 17038 + ',' + var2 + ')');
        }
    }

    final long method772(int var1) {
        try {
            --var1;
            if (0 <= var1 && var1 <= 7) {
                long var4 = 0L;

                for (int var3 = var1 * 8; var3 >= 0; var3 -= 8) {
                    var4 |= ((long) this.buffer[this.index++] & 255L) << var3;
                }

                return var4;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var6) {
            throw Class44.clientError(var6, "wa.VA(" + var1 + ',' + 0 + ')');
        }
    }

    final int method773(byte var1) {
        try {
            if (var1 >= -120) {
                return 3;
            } else {
                int var3 = this.getSmart();

                int var2;
                for (var2 = 0; 32767 == var3; var2 += 32767) {
                    var3 = this.getSmart();
                }

                var2 += var3;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.UB(" + var1 + ')');
        }
    }

    final void method774(int var2, byte[] var3) {
        try {
            for (int var5 = -(-var2 - -1); var5 >= 0; --var5) {
                var3[var5] = this.buffer[this.index++];
            }

        } catch (RuntimeException var6) {
            throw Class44.clientError(var6, "wa.HC(" + 2 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + 0 + ')');
        }
    }

    final void putIntA(int var1) {
        try {
            this.buffer[this.index++] = (byte) (var1 >> 8);
            this.buffer[this.index++] = (byte) var1;
            this.buffer[this.index++] = (byte) (var1 >> 24);
            this.buffer[this.index++] = (byte) (var1 >> 16);
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.GC(" + var1 + ')');
        }
    }

    final RSString getString() {
        try {
            int var2 = this.index;

            while (0 != this.buffer[this.index++]) {
            }

            return Class3_Sub13_Sub3.method178(this.buffer, -var2 + (this.index - 1), var2);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.FC()");
        }
    }

    final int getSmart() {
        try {

            int var2 = this.buffer[this.index] & 255;
            return 128 <= var2 ? -32768 + this.getShort() : this.readUnsignedByte();
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.JA(" + true + ')');
        }
    }

    final void putTriByte(int var1) {
        try {
            this.buffer[this.index++] = (byte) (var1 >> 16);
            this.buffer[this.index++] = (byte) (var1 >> 8);

            this.buffer[this.index++] = (byte) var1;
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.FB(" + var1 + ',' + 6517 + ')');
        }
    }

    final int getIntA(int var1) {
        try {
            this.index += 4;
            if (var1 != -1) {
                this.method769((byte) 7, -47);
            }

            return ((this.buffer[this.index - 2] & 255) << 24) + ((255 & this.buffer[this.index - 1]) << 16) + ('\uff00' & this.buffer[-4 + this.index] << 8) - -(this.buffer[this.index + -3] & 255);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.NB(" + var1 + ')');
        }
    }

    final int getLEShortA(byte var1) {
        try {
            this.index += 2;
            if (var1 > -84) {
                this.method749();
            }

            return (this.buffer[-1 + this.index] << 8 & '\uff00') - -(255 & -128 + this.buffer[this.index + -2]);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.TB(" + var1 + ')');
        }
    }


    final int getLEInt(int var1) {
        try {
            this.index += 4;
            if (var1 >= -42) {
                this.method763((byte) -14);
            }

            return (255 & this.buffer[-4 + this.index]) + (16711680 & this.buffer[this.index - 2] << 16) + ((255 & this.buffer[this.index + -1]) << 24) + ((this.buffer[-3 + this.index] & 255) << 8);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.EA(" + var1 + ')');
        }
    }

    final void putShortA(int var1) {
        try {
            this.buffer[this.index++] = (byte) (var1 >> 8);
            this.buffer[this.index++] = (byte) (128 + var1);
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.LB(" + var1 + ',' + -268435456 + ')');
        }
    }

    public DataBuffer(byte[] var1) {
        try {
            this.index = 0;
            this.buffer = var1;
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.<init>(" + (var1 != null ? "{...}" : "null") + ')');
        }
    }

    final void putLEInt(int var1, byte var2) {
        try {
            this.buffer[this.index++] = (byte) var1;
            this.buffer[this.index++] = (byte) (var1 >> 8);
            if (var2 <= -118) {
                this.buffer[this.index++] = (byte) (var1 >> 16);
                this.buffer[this.index++] = (byte) (var1 >> 24);
            }
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.IA(" + var1 + ',' + var2 + ')');
        }
    }

    final int getByteC() {
        try {

            return 255 & -this.buffer[this.index++];
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.CB(" + true + ')');
        }
    }

    final int getShort(byte var1) {
        this.index += 2;
        int var2 = (this.buffer[-1 + this.index] & 255) + ((255 & this.buffer[this.index + -2]) << 8);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }


    final int method788() {
        try {
            this.index += 2;
            int var2 = ((this.buffer[this.index - 1] & 255) << 8) - -(this.buffer[-2 + this.index] - 128 & 255);

            if (32767 < var2) {
                var2 -= 65536;
            }

            return var2;
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.EC(" + -1741292848 + ')');
        }
    }

    final byte method789() {
        try {
            return (byte) (-128 + this.buffer[this.index++]);
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.CA(" + 0 + ')');
        }
    }

    final void putByteA(int var1) {
        try {
            this.buffer[this.index++] = (byte) (128 + var1);
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.KC(" + var1 + ')');
        }
    }

    final int getLEShort() {
        try {
            this.index += 2;

            int var2 = (this.buffer[-2 + this.index] & 255) + ('\uff00' & this.buffer[this.index + -1] << 8);
            if (var2 > 32767) {
                var2 -= 65536;
            }

            return var2;
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.SA(" + (byte) 10 + ')');
        }
    }


    final void method793(int var2) {
        try {
            int var3 = CRC.INSTANCE.crc32(this.buffer, var2, this.index);
            this.putInt(-120, var3);
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.QB(" + (byte) 86 + ',' + var2 + ')');
        }
    }

    final int getTriByte(byte var1) {
        try {
            if (var1 < 76) {
                this.getLEShort(53);
            }

            this.index += 3;
            return (16711680 & this.buffer[this.index + -3] << 16) + (('\uff00' & this.buffer[-2 + this.index] << 8) - -(this.buffer[this.index + -1] & 255));
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.GB(" + var1 + ')');
        }
    }

    final void putLEShort(int var2) {
        try {

            this.buffer[this.index++] = (byte) var2;
            this.buffer[this.index++] = (byte) (var2 >> 8);
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.PA(" + -1 + ',' + var2 + ')');
        }
    }

    final int getSmart(int var1) {
        try {
            int var2 = this.buffer[this.index] & 255;
            if (var1 != -21208) {
                TextCore.LoadedInterfaces = (RSString) null;
            }

            return var2 < 128 ? -64 + this.readUnsignedByte() : this.getShort() - '\uc000';
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.WB(" + var1 + ')');
        }
    }

    final int getIntB(byte var1) {
        try {
            this.index += 4;
            return ((this.buffer[-3 + this.index] & 255) << 24) - -(16711680 & this.buffer[this.index + -4] << 16) + (((this.buffer[this.index + -1] & 255) << 8) - -(255 & this.buffer[this.index + -2]));
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.NC(" + var1 + ')');
        }
    }

    final void encryptRSA(BigInteger var1, BigInteger var2) {
        try {
            int var4 = this.index;
            this.index = 0;
            byte[] var5 = new byte[var4];
            this.method764(var4, var5);
            BigInteger var6 = new BigInteger(var5);
            BigInteger var7;
            if (Configurations.USE_RSA)
                var7 = var6.modPow(var1, var2);
            else
                var7 = var6;
            byte[] var8 = var7.toByteArray();
            this.index = 0;
            this.putByte((byte) -23, var8.length);
            this.putBytes(var8, var8.length, -296 + 348);
        } catch (RuntimeException var9) {
            throw Class44.clientError(var9, "wa.KB(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + -296 + ')');
        }
    }

    final void method801(float var2) {
        try {
            int var3 = Float.floatToRawIntBits(var2);
            this.buffer[this.index++] = (byte) (var3 >> 24);
            this.buffer[this.index++] = (byte) (var3 >> 16);
            this.buffer[this.index++] = (byte) (var3 >> 8);
            this.buffer[this.index++] = (byte) var3;
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.QA(" + 881 + ',' + var2 + ')');
        }
    }

    public final int readUnsignedByte() {
        return this.buffer[this.index++] & 255;
    }

    final void putShort(int var2) {
        try {
            this.buffer[this.index++] = (byte) (var2 >> 8);
            this.buffer[this.index++] = (byte) var2;
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "wa.JC('" + var2 + ')');
        }
    }

}

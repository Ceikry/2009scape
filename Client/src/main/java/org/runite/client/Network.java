package org.runite.client;

import org.rs09.client.net.Connection;

import java.util.Arrays;
import java.util.Objects;

public final class Network extends DataBuffer {

    public static int incomingOpcode = 0;
    public static Network incomingBuffer = new Network();
    public static Network outgoingBuffer = new Network();
    public static int incomingPacketLength = 0;
    public static Connection activeConnection;
    public static int[] incomingPacketSizes = new int[]{-1, 0, 8, 0, 2, 0, 0, 0, 0, 12, 0, 1, 0, 3, 7, 0, 15, 6, 0, 0, 4, 7, -2, -1, 2, 0, 2, 8, 0, 0, 0, 0, -2, 5, 0, 0, 8, 3, 6, 0, 0, 0, -1, 0, -1, 0, 0, 6, -2, 0, 12, 0, 0, 0, -1, -2, 10, 0, 0, 0, 3, 0, -1, 0, 0, 5, 6, 0, 0, 8, -1, -1, 0, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 6, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 12, 2, 0, -2, -2, 20, 0, 0, 10, 0, 15, 0, -1, 0, 8, -2, 0, 0, 0, 8, 0, 12, 0, 0, 7, 0, 0, 0, 0, 0, -1, -1, 0, 4, 5, 0, 0, 0, 6, 0, 0, 0, 0, 8, 9, 0, 0, 0, 2, -1, 0, -2, 0, 4, 14, 0, 0, 0, 24, 0, -2, 5, 0, 0, 0, 10, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 2, 1, 0, 0, 2, -1, 1, 0, 0, 0, 0, 14, 0, 0, 0, 0, 10, 5, 0, 0, 0, 0, 0, -2, 0, 0, 9, 0, 0, 8, 0, 0, 0, 0, -2, 6, 0, 0, 0, -2, 0, 3, 0, 1, 7, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0};
    public static Network loginBuffer = new Network();
    static RSString[] aClass94Array3802;
    static int anInt872;
    static int anInt2330 = 0;
    static float aFloat3044;
    static int anInt4037;
    static int anInt1345;
    static int anInt1407;
    static int anInt1473;
    static float aFloat1475;
    static int anInt1736;
    static int[] anIntArray2709 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    static int anInt1971;
    static int[] anIntArray3804 = new int[256];
    static int[] anIntArray3805;
    private ISAACCipher isaacCipher;
    private int headiconsPrayerSpriteArchive6;


    public Network() {
        super(5000);
    }

    static void addChatMessage(RSString var0, int type, RSString message, int var3) {
        try {
            Class3_Sub28_Sub12.sendGameMessage(var3, type, message, null, var0);
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "i.W(" + (var0 != null ? "{...}" : "null") + ',' + type + ',' + (message != null ? "{...}" : "null") + ',' + var3 + ')');
        }
    }

    static boolean method715(RSInterface var1) {
        try {
            if (205 == var1.anInt189) {
                Class159.anInt2023 = 250;
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ud.B(" + 205 + ',' + "null" + ')');
        }
    }

    static void method819() {
        try {
            Class3_Sub31 var1 = Class3_Sub13_Sub17.aHashTable_3208.first();
            for (; var1 != null; var1 = Class3_Sub13_Sub17.aHashTable_3208.next()) {
                int var2 = var1.anInt2602;
                if (Unsorted.loadInterface(var2)) {
                    boolean var3 = true;
                    RSInterface[] var4 = GameObject.aClass11ArrayArray1834[var2];

                    int var5;
                    for (var5 = 0; var5 < var4.length; ++var5) {
                        if (var4[var5] != null) {
                            var3 = var4[var5].usingScripts;
                            break;
                        }
                    }

                    if (!var3) {
                        var5 = (int) var1.linkableKey;
                        RSInterface var6 = Class7.getRSInterface(var5);
                        if (null != var6) {
                            Class20.method909(var6);
                        }
                    }
                }
            }

        } catch (RuntimeException var7) {
            throw ClientErrorException.clientError(var7, "i.A(" + false + ')');
        }
    }

    static void breakClientConnection() {
        try {

            if (Class159.anInt2023 > 0) {
                Class167.method2269((byte) 46);
            } else {
                Class163_Sub2_Sub1.aClass89_4012 = activeConnection;
                activeConnection = null;
                Class117.method1719(40);
            }
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "nm.B(" + false + ')');
        }
    }

    final void setBitAccess(byte var1) {
        try {
            this.headiconsPrayerSpriteArchive6 = this.index * 8;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "i.R(" + var1 + ')');
        }
    }

    final void method811(byte var1, int var2, byte[] var3, int var4) {
        try {
            if (var1 < 16) {
                addChatMessage(null, 126, null, -28);
            }

            for (int var5 = 0; var5 < var4; ++var5) {
                var3[var2 + var5] = (byte) (this.buffer[this.index++] + -this.isaacCipher.nextOpcode());
            }

        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "i.S(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
        }
    }

    final int getBits(int var2) {
        try {
            int var3 = this.headiconsPrayerSpriteArchive6 >> 3;
            int var4 = 8 + -(7 & this.headiconsPrayerSpriteArchive6);
            int var5 = 0;
            this.headiconsPrayerSpriteArchive6 += var2;
            while (var2 > var4) {
                var5 += (anIntArray2709[var4] & this.buffer[var3++]) << -var4 + var2;
                var2 -= var4;
                var4 = 8;
            }

            if (var2 == var4) {
                var5 += this.buffer[var3] & anIntArray2709[var4];
            } else {
                var5 += this.buffer[var3] >> var4 - var2 & anIntArray2709[var2];
            }

            return var5;
        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "i.C(" + (byte) -11 + ',' + var2 + ')');
        }
    }

    final void ISAACEncryption(int[] var1) {
        try {
            this.isaacCipher = new ISAACCipher(var1);
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "i.T(" + (var1 != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    final int method815(int var1) {
        try {
            return var1 * 8 - this.headiconsPrayerSpriteArchive6;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "i.U(" + var1 + ',' + 32666 + ')');
        }
    }

    public final void putOpcode(int opcode) {
        if (buffer == null || isaacCipher == null) {
            System.err.println("Buffer or cipher was null in CLass2_Sub30_Sub1 " + Arrays.toString(buffer) + ", " + isaacCipher);
            return;
        }
        this.buffer[this.index++] = (byte) (opcode + this.isaacCipher.nextOpcode());
    }

    public final int getOpcode() {
        try {
            return 255 & this.buffer[this.index++] - this.isaacCipher.nextOpcode();
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "i.P(" + 0 + ')');
        }
    }

    final void method818() {
        try {
            this.index = (this.headiconsPrayerSpriteArchive6 + 7) / 8;

        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "i.Q(" + false + ')');
        }
    }

}

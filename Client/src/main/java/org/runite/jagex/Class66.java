package org.runite.jagex;

import java.io.IOException;

final class Class66 {

    private final NodeList highPriorityRequests = new NodeList();
    private final NodeList aClass13_1000 = new NodeList();
    private final NodeList lowPriorityRequests = new NodeList();
    private final NodeList aClass13_1003 = new NodeList();

    private long aLong1004;
    private IOHandler aClass89_1005;
    private int anInt1006;
    private byte aByte1009 = 0;
    volatile int anInt1010 = 0;
    volatile int anInt1011 = 0;
    private Class3_Sub28_Sub10_Sub2 aClass3_Sub28_Sub10_Sub2_1012;

    private final RSByteBuffer aClass3_Sub30_1007 = new RSByteBuffer(4);
    private final RSByteBuffer aClass3_Sub30_1008 = new RSByteBuffer(8);

    final boolean method1241() {
        return 20 <= this.method1246();
    }

    final boolean method1243() {
        try {
            int var4;
            if (null != this.aClass89_1005) {
                long var2 = Class5.method830((byte) -55);
                var4 = (int) (-this.aLong1004 + var2);
                this.aLong1004 = var2;
                if (var4 > 200) {
                    var4 = 200;
                }

                this.anInt1006 += var4;
                if (30000 < this.anInt1006) {
                    try {
                        this.aClass89_1005.close(14821);
                    } catch (Exception var18) {
                    }

                    this.aClass89_1005 = null;
                }
            }

            if (this.aClass89_1005 == null) {
                return 0 == this.method1253() && this.method1246() == 0;
            } else {
                try {
                    this.aClass89_1005.method1466();

                    Class3_Sub28_Sub10_Sub2 var21;
                    for (var21 = (Class3_Sub28_Sub10_Sub2) this.highPriorityRequests.method876((byte) 125); null != var21; var21 = (Class3_Sub28_Sub10_Sub2) this.highPriorityRequests.method878(119)) {
                        this.aClass3_Sub30_1007.index = 0;
                        this.aClass3_Sub30_1007.putByte((byte) -26, 1); //High priority JS5 request
                        this.aClass3_Sub30_1007.putTriByte((int) var21.aLong2569);

                        this.aClass89_1005.sendBytes(this.aClass3_Sub30_1007.buffer, 4);
                        this.aClass13_1000.method879(var21);
                    }

                    for (var21 = (Class3_Sub28_Sub10_Sub2) this.lowPriorityRequests.method876((byte) 51); var21 != null; var21 = (Class3_Sub28_Sub10_Sub2) this.lowPriorityRequests.method878(-53)) {
                        this.aClass3_Sub30_1007.index = 0;
                        this.aClass3_Sub30_1007.putByte((byte) -22, 0); //Low priority JS5 request
                        this.aClass3_Sub30_1007.putTriByte((int) var21.aLong2569);
                        this.aClass89_1005.sendBytes(this.aClass3_Sub30_1007.buffer, 4);
                        this.aClass13_1003.method879(var21);
                    }

                    for (int var3 = 0; 100 > var3; ++var3) {
                        var4 = this.aClass89_1005.availableBytes(-18358);
                        if (var4 < 0) {
                            throw new IOException();
                        }

                        if (var4 == 0) {
                            break;
                        }

                        this.anInt1006 = 0;
                        byte var5 = 0;
                        if (null == this.aClass3_Sub28_Sub10_Sub2_1012) {
                            var5 = 8;
                        } else if (this.aClass3_Sub28_Sub10_Sub2_1012.anInt4067 == 0) {
                            var5 = 1;
                        }

                        int var6;
                        int var7;
                        int var8;
                        if (0 >= var5) {
                            var6 = -this.aClass3_Sub28_Sub10_Sub2_1012.aByte4064 + this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.buffer.length;
                            var7 = -this.aClass3_Sub28_Sub10_Sub2_1012.anInt4067 + 512;
                            if (var7 > -this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.index + var6) {
                                var7 = -this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.index + var6;
                            }

                            if (var4 < var7) {
                                var7 = var4;
                            }

                            this.aClass89_1005.readBytes(this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.index, var7, this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.buffer);
                            if (this.aByte1009 != 0) {
                                for (var8 = 0; var8 < var7; ++var8) {
                                    this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.buffer[this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.index - -var8] = (byte) Class93.bitwiseXOR(this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.buffer[this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.index + var8], this.aByte1009);
                                }
                            }

                            this.aClass3_Sub28_Sub10_Sub2_1012.anInt4067 += var7;
                            this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.index += var7;
                            if (var6 == this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.index) {
                                this.aClass3_Sub28_Sub10_Sub2_1012.method524();
                                this.aClass3_Sub28_Sub10_Sub2_1012.aBoolean3632 = false;
                                this.aClass3_Sub28_Sub10_Sub2_1012 = null;
                            } else if (this.aClass3_Sub28_Sub10_Sub2_1012.anInt4067 == 512) {
                                this.aClass3_Sub28_Sub10_Sub2_1012.anInt4067 = 0;
                            }
                        } else {
                            var6 = -this.aClass3_Sub30_1008.index + var5;
                            if (var4 < var6) {
                                var6 = var4;
                            }

                            this.aClass89_1005.readBytes(this.aClass3_Sub30_1008.index, var6, this.aClass3_Sub30_1008.buffer);
                            if (0 != this.aByte1009) {
                                for (var7 = 0; var7 < var6; ++var7) {
                                    this.aClass3_Sub30_1008.buffer[var7 + this.aClass3_Sub30_1008.index] = (byte) Class93.bitwiseXOR(this.aClass3_Sub30_1008.buffer[var7 + this.aClass3_Sub30_1008.index], this.aByte1009);
                                }
                            }

                            this.aClass3_Sub30_1008.index += var6;
                            if (var5 <= this.aClass3_Sub30_1008.index) {
                                if (this.aClass3_Sub28_Sub10_Sub2_1012 == null) {
                                    this.aClass3_Sub30_1008.index = 0;
                                    var7 = this.aClass3_Sub30_1008.readUnsignedByte();
                                    var8 = this.aClass3_Sub30_1008.getShort();
                                    int var9 = this.aClass3_Sub30_1008.readUnsignedByte();
                                    int var10 = this.aClass3_Sub30_1008.readInt();
                                    int var11 = 127 & var9;
                                    boolean var12 = (var9 & 128) != 0;
                                    Class3_Sub28_Sub10_Sub2 var15;
                                    long var13 = (long) ((var7 << 16) - -var8);
                                    if (var12) {
                                        for (var15 = (Class3_Sub28_Sub10_Sub2) this.aClass13_1003.method876((byte) 76); null != var15 && var13 != var15.aLong2569; var15 = (Class3_Sub28_Sub10_Sub2) this.aClass13_1003.method878(122)) {
                                        }
                                    } else {
                                        for (var15 = (Class3_Sub28_Sub10_Sub2) this.aClass13_1000.method876((byte) 65); var15 != null && var15.aLong2569 != var13; var15 = (Class3_Sub28_Sub10_Sub2) this.aClass13_1000.method878(-15)) {
                                        }
                                    }

                                    if (null == var15) {
                                        throw new IOException("Could not find cache file " + var7 + ", " + var8 + "!");
                                    }

                                    int var16 = var11 != 0 ? 9 : 5;
                                    this.aClass3_Sub28_Sub10_Sub2_1012 = var15;
                                    this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069 = new RSByteBuffer(var10 - (-var16 - this.aClass3_Sub28_Sub10_Sub2_1012.aByte4064));
                                    this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.putByte((byte) -127, var11);
                                    this.aClass3_Sub28_Sub10_Sub2_1012.aClass3_Sub30_4069.putInt(-125, var10);
                                    this.aClass3_Sub28_Sub10_Sub2_1012.anInt4067 = 8;
                                    this.aClass3_Sub30_1008.index = 0;
                                } else {
                                    if (this.aClass3_Sub28_Sub10_Sub2_1012.anInt4067 != 0) {
                                        throw new IOException();
                                    }

                                    if (this.aClass3_Sub30_1008.buffer[0] == -1) {
                                        this.aClass3_Sub28_Sub10_Sub2_1012.anInt4067 = 1;
                                        this.aClass3_Sub30_1008.index = 0;
                                    } else {
                                        this.aClass3_Sub28_Sub10_Sub2_1012 = null;
                                    }
                                }
                            }
                        }
                    }

                    return true;
                } catch (IOException var19) {
                    var19.printStackTrace();
                    try {
                        this.aClass89_1005.close(14821);
                    } catch (Exception var17) {
                    }

                    this.anInt1010 = -2;
                    ++this.anInt1011;
                    this.aClass89_1005 = null;
                    return 0 == this.method1253() && this.method1246() == 0;
                }
            }
        } catch (RuntimeException var20) {
            throw Class44.clientError(var20, "jb.H(" + (byte) -61 + ')');
        }
    }

    final void method1244() {
        try {
            if (this.aClass89_1005 != null) {
                try {
                    this.aClass3_Sub30_1007.index = 0;

                    this.aClass3_Sub30_1007.putByte((byte) -48, 7);
                    this.aClass3_Sub30_1007.putTriByte(0);
                    this.aClass89_1005.sendBytes(this.aClass3_Sub30_1007.buffer, 4);
                } catch (IOException var5) {
                    var5.printStackTrace();
                    try {
                        this.aClass89_1005.close(14821);
                    } catch (Exception var4) {
                        var4.printStackTrace();
                    }

                    ++this.anInt1011;
                    this.anInt1010 = -2;
                    this.aClass89_1005 = null;
                }

            }
        } catch (RuntimeException var6) {
            throw Class44.clientError(var6, "jb.O(" + true + ')');
        }
    }

    private int method1246() {
        return this.lowPriorityRequests.method874() - -this.aClass13_1003.method874();
    }

    final void method1247(boolean var1) {
        try {
            if (null != this.aClass89_1005) {
                try {
                    this.aClass3_Sub30_1007.index = 0;
                    this.aClass3_Sub30_1007.putByte((byte) -27, var1 ? 2 : 3);
                    this.aClass3_Sub30_1007.putTriByte(0);
                    this.aClass89_1005.sendBytes(this.aClass3_Sub30_1007.buffer, 4);
                } catch (IOException var6) {
                    var6.printStackTrace();
                    try {
                        this.aClass89_1005.close(14821);
                    } catch (Exception var5) {
                    }

                    ++this.anInt1011;
                    this.anInt1010 = -2;
                    this.aClass89_1005 = null;
                }

            }
        } catch (RuntimeException var7) {
            throw Class44.clientError(var7, "jb.B(" + var1 + ',' + ')');
        }
    }

    final void method1248() {
        if (this.aClass89_1005 != null) {
            this.aClass89_1005.method1467();
        }
    }

    final void method1249(boolean var1, IOHandler stream) {
        if (null != this.aClass89_1005) {
            try {
                this.aClass89_1005.close(14821);
            } catch (Exception var8) {
            }

            this.aClass89_1005 = null;
        }

        this.aClass89_1005 = stream;
        this.method1256();
        this.method1247(var1);
        this.aClass3_Sub30_1008.index = 0;
        this.aClass3_Sub28_Sub10_Sub2_1012 = null;

        while (true) {
            Class3_Sub28_Sub10_Sub2 var4 = (Class3_Sub28_Sub10_Sub2) this.aClass13_1000.method877();
            if (null == var4) {
                while (true) {
                    var4 = (Class3_Sub28_Sub10_Sub2) this.aClass13_1003.method877();
                    if (var4 == null) {
                        if (this.aByte1009 != 0) {
                            try {
                                this.aClass3_Sub30_1007.index = 0;
                                this.aClass3_Sub30_1007.putByte((byte) -52, 4);
                                this.aClass3_Sub30_1007.putByte((byte) -24, this.aByte1009);
                                this.aClass3_Sub30_1007.putShort(0);
                                this.aClass89_1005.sendBytes(this.aClass3_Sub30_1007.buffer, 4);
                            } catch (IOException var7) {
                                var7.printStackTrace();
                                try {
                                    this.aClass89_1005.close(14821);
                                } catch (Exception var6) {
                                }

                                this.anInt1010 = -2;
                                ++this.anInt1011;
                                this.aClass89_1005 = null;
                            }
                        }

                        this.anInt1006 = 0;
                        this.aLong1004 = Class5.method830((byte) -55);
                        return;
                    }

                    this.lowPriorityRequests.method879(var4);
                }
            }

            this.highPriorityRequests.method879(var4);
        }
    }

    final boolean method1251() {
        return 20 <= this.method1253();
    }

    final void method1252() {
        try {
            this.aClass89_1005.close(14821);
        } catch (Exception var4) {
        }

        this.anInt1010 = -1;
        this.aByte1009 = (byte) ((int) (255.0D * Math.random() + 1.0D));
        this.aClass89_1005 = null;
        ++this.anInt1011;
    }

    final int method1253() {
        return this.highPriorityRequests.method874() - -this.aClass13_1000.method874();
    }

    final void method1254() {
        if (this.aClass89_1005 != null) {
            this.aClass89_1005.close(14821);
        }
    }

    final Class3_Sub28_Sub10_Sub2 addJS5Request(int index, byte var3, int archive, boolean highPriority) {
        Class3_Sub28_Sub10_Sub2 var8 = new Class3_Sub28_Sub10_Sub2();
        long var6 = archive + (index << 16);
        var8.aBoolean3628 = highPriority;
        var8.aLong2569 = var6;
        var8.aByte4064 = var3;
        if (highPriority) {
            if (this.method1253() >= 20) {
                throw new RuntimeException();
            }

            this.highPriorityRequests.method879(var8);
        } else {
            if (this.method1246() >= 20) {
                throw new RuntimeException();
            }

            this.lowPriorityRequests.method879(var8);
        }

        return var8;
    }

    private void method1256() {
        if (this.aClass89_1005 != null) {
            try {
                this.aClass3_Sub30_1007.index = 0;
                this.aClass3_Sub30_1007.putByte((byte) -125, 6);
                this.aClass3_Sub30_1007.putTriByte(3);
                this.aClass89_1005.sendBytes(this.aClass3_Sub30_1007.buffer, 4);
            } catch (IOException var5) {
                var5.printStackTrace();
                try {
                    this.aClass89_1005.close(14821);
                } catch (Exception var4) {
                }

                ++this.anInt1011;
                this.aClass89_1005 = null;
                this.anInt1010 = -2;
            }

        }
    }

}

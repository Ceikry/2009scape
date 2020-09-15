package org.runite.jagex;

import org.rs09.client.Linkable;
import org.rs09.client.Node;
import org.rs09.client.collections.HashTable;

import java.util.Objects;

final class Class3_Sub28_Sub11 extends Node {

    private HashTable aHashTable_3636;
    static RSString aClass94_3637 = RSString.of(")4p=");
    static boolean aBoolean3641 = false;
    static int anInt3642 = 0;
    static int anInt3644 = 0;


    static int method599(CacheIndex var1) {
        try {
            int var2 = 0;
            if (var1.method2144(Class154.anInt1966)) {
                ++var2;
            }

            if (var1.method2144(Class79.anInt1124)) {
                ++var2;
            }

            return var2;
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "lk.F(" + -20916 + ',' + (var1 != null ? "{...}" : "null") + ')');
        }
    }

    final int method600(int var1, int var2) {
        try {
            if (this.aHashTable_3636 == null) {
                return var2;
            } else {

                Class3_Sub18 var4 = (Class3_Sub18) this.aHashTable_3636.get((long) var1);
                return null == var4 ? var2 : var4.anInt2467;
            }
        } catch (RuntimeException var5) {
            throw Class44.clientError(var5, "lk.Q(" + var1 + ',' + var2 + ',' + (byte) -29 + ')');
        }
    }

    private void method601(DataBuffer var1, int var2) {
        try {
            if (249 == var2) {
                int var4 = var1.readUnsignedByte();
                int var5;
                if (this.aHashTable_3636 == null) {
                    var5 = Class95.method1585((byte) 105, var4);
                    this.aHashTable_3636 = new HashTable(var5);
                }

                for (var5 = 0; var4 > var5; ++var5) {
                    boolean var6 = 1 == var1.readUnsignedByte();
                    int var7 = var1.getTriByte((byte) 95);
                    Object var8;
                    if (var6) {
                        var8 = new Class3_Sub29(var1.getString());
                    } else {
                        var8 = new Class3_Sub18(var1.readInt());
                    }

                    this.aHashTable_3636.put((long) var7, (Linkable) var8);
                }
            }

        } catch (RuntimeException var9) {
            throw Class44.clientError(var9, "lk.P(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (byte) -5 + ')');
        }
    }

    static Class3_Sub28_Sub16 method602(int var0, int var1, byte var2, CacheIndex var3) {
        try {
            //  System.out.println("Class3_sub28_Sub16 " + var1);
            if (Class75_Sub4.method1351(var3, var0, var1, var2 ^ 30885)) {
                if (var2 != -18) {
                    Translation.englishToGerman(true);
                }

                return Class43.method1062(var2 + 103);
            } else {
                return null;
            }
        } catch (RuntimeException var5) {
            throw Class44.clientError(var5, "lk.R(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
        }
    }

    /**
     * @param notifyScripts Whether if a listening CS2 script should be invoked if this interface is resized
     */
    static void calculateInterfaceSize(RSInterface iface, int parentWidth, int parentHeight, boolean notifyScripts) {
        int oldWidth = iface.width;
        int oldHeight = iface.height;

        if (iface.horizontalResize == 0) {
            iface.width = iface.defWidth;
        } else if (iface.horizontalResize == 1) {
            iface.width = parentWidth + -iface.defWidth;
        } else if (iface.horizontalResize == 2) {
            iface.width = iface.defWidth * parentWidth >> 14;
        } else if (iface.horizontalResize == 3) {
            if (iface.type == 2) {
                iface.width = iface.defWidth * 32 - -((iface.defWidth - 1) * iface.anInt285);
            } else if (iface.type == 7) {
                iface.width = 115 * iface.defWidth + iface.anInt285 * (-1 + iface.defWidth);
            }
        }

        if (iface.verticalResize == 0) {
            iface.height = iface.defHeight;
        } else if (iface.verticalResize == 1) {
            iface.height = -iface.defHeight + parentHeight;
        } else if (iface.verticalResize == 2) {
            iface.height = parentHeight * iface.defHeight >> 14;
        } else if (iface.verticalResize == 3) {
            if (iface.type == 2) {
                iface.height = (iface.defHeight + -1) * iface.anInt290 + iface.defHeight * 32;
            } else if (iface.type == 7) {
                iface.height = iface.defHeight * 12 + (-1 + iface.defHeight) * iface.anInt290;
            }
        }

        if (iface.horizontalResize == 4) {
            iface.width = iface.anInt216 * iface.height / iface.anInt160;
        }

        if (iface.verticalResize == 4) {
            iface.height = iface.anInt160 * iface.width / iface.anInt216;
        }

        if (Unsorted.aBoolean1040 && (Client.method44(iface).anInt2205 != 0 || iface.type == 0)) {
            if (iface.height < 5 && 5 > iface.width) {
                iface.height = 5;
                iface.width = 5;
            } else {
                if (iface.width <= 0) {
                    iface.width = 5;
                }

                if (0 >= iface.height) {
                    iface.height = 5;
                }
            }
        }

        if (iface.anInt189 == 1337) {
            Class168.aClass11_2091 = iface;
        }

        if (notifyScripts && null != iface.anObjectArray235 && (iface.width != oldWidth || iface.height != oldHeight)) {
            CS2Script script = new CS2Script();
            script.arguments = iface.anObjectArray235;
            script.aClass11_2449 = iface;
            Class110.aClass61_1471.method1215(script);
        }
    }

    final RSString method604(RSString var1, int var3) {
        try {
            if (this.aHashTable_3636 == null) {
                return var1;
            } else {
                Class3_Sub29 var4 = (Class3_Sub29) this.aHashTable_3636.get((long) var3);

                return null != var4 ? var4.aClass94_2586 : var1;
            }
        } catch (RuntimeException var5) {
            throw Class44.clientError(var5, "lk.B(" + (var1 != null ? "{...}" : "null") + ',' + (byte) -44 + ',' + var3 + ')');
        }
    }

    static void method606(int var0, Class3_Sub9 var1, int var2, int var3, int var4, int var5) {
        try {
            if (var5 > 44) {
                if (var1.anInt2332 != -1 || var1.anIntArray2333 != null) {
                    int var6 = 0;
                    if (var1.anInt2321 < var0) {
                        var6 += -var1.anInt2321 + var0;
                    } else if (var1.anInt2326 > var0) {
                        var6 += var1.anInt2326 - var0;
                    }

                    if (var1.anInt2307 >= var4) {
                        if (var4 < var1.anInt2308) {
                            var6 += -var4 + var1.anInt2308;
                        }
                    } else {
                        var6 += -var1.anInt2307 + var4;
                    }

                    if (0 != var1.anInt2328 && var6 - 64 <= var1.anInt2328 && 0 != Class14.anInt340 && var2 == var1.anInt2314) {
                        var6 -= 64;
                        if (var6 < 0) {
                            var6 = 0;
                        }

                        int var7 = (-var6 + var1.anInt2328) * Class14.anInt340 / var1.anInt2328;
                        if (var1.aClass3_Sub24_Sub1_2312 == null) {
                            if (var1.anInt2332 >= 0) {
                                Class135 var8 = Class135.method1811(Class146.aClass153_1902, var1.anInt2332, 0);
                                if (null != var8) {
                                    Class3_Sub12_Sub1 var9 = var8.method1812().method151(Class27.aClass157_524);
                                    Class3_Sub24_Sub1 var10 = Class3_Sub24_Sub1.method437(var9, var7);
                                    Objects.requireNonNull(var10).method429(-1);
                                    Class3_Sub26.aClass3_Sub24_Sub2_2563.method457(var10);
                                    var1.aClass3_Sub24_Sub1_2312 = var10;
                                }
                            }
                        } else {
                            var1.aClass3_Sub24_Sub1_2312.method419(var7);
                        }

                        if (null != var1.aClass3_Sub24_Sub1_2315) {
                            var1.aClass3_Sub24_Sub1_2315.method419(var7);
                            if (!var1.aClass3_Sub24_Sub1_2315.isLinked()) {
                                var1.aClass3_Sub24_Sub1_2315 = null;
                            }
                        } else if (var1.anIntArray2333 != null && ((var1.anInt2316 -= var3) <= 0)) {
                            int var13 = (int) ((double) var1.anIntArray2333.length * Math.random());
                            Class135 var14 = Class135.method1811(Class146.aClass153_1902, var1.anIntArray2333[var13], 0);
                            if (null != var14) {
                                Class3_Sub12_Sub1 var15 = var14.method1812().method151(Class27.aClass157_524);
                                Class3_Sub24_Sub1 var11 = Class3_Sub24_Sub1.method437(var15, var7);
                                Objects.requireNonNull(var11).method429(0);
                                Class3_Sub26.aClass3_Sub24_Sub2_2563.method457(var11);
                                var1.anInt2316 = (int) ((double) (-var1.anInt2310 + var1.anInt2325) * Math.random()) + var1.anInt2310;
                                var1.aClass3_Sub24_Sub1_2315 = var11;
                            }
                        }

                    } else {
                        if (null != var1.aClass3_Sub24_Sub1_2312) {
                            Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var1.aClass3_Sub24_Sub1_2312);
                            var1.aClass3_Sub24_Sub1_2312 = null;
                        }

                        if (var1.aClass3_Sub24_Sub1_2315 != null) {
                            Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var1.aClass3_Sub24_Sub1_2315);
                            var1.aClass3_Sub24_Sub1_2315 = null;
                        }

                    }
                }
            }
        } catch (RuntimeException var12) {
            throw Class44.clientError(var12, "lk.O(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
        }
    }


    final void method608(DataBuffer var2) {
        try {
            while (true) {
                int var3 = var2.readUnsignedByte();
                if (0 == var3) {

                    return;
                }

                this.method601(var2, var3);
            }
        } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "lk.C(" + 5 + ',' + (var2 != null ? "{...}" : "null") + ')');
        }
    }

}

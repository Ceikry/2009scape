package org.runite.client;

import org.rs09.client.Node;
import org.rs09.client.config.GameConfig;
import org.rs09.client.rendering.Toolkit;

final class WorldMap extends Node {

    static int anInt2737 = 0;
    static CacheIndex aClass153_3210;
    static Class3_Sub28_Sub16_Sub2 aClass3_Sub28_Sub16_Sub2_3221;
    static int anInt4034 = -8 + (int) (17.0D * Math.random());
    Class140_Sub7 aClass140_Sub7_3676;


    WorldMap(Class140_Sub7 var1) {
        try {
            this.aClass140_Sub7_3676 = var1;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "pa.<init>(" + (var1 != null ? "{...}" : "null") + ')');
        }
    }

    static void worldMapZoomFontSize() {
        try {
            if (null != Unsorted.aClass3_Sub28_Sub3_2600) {
                if (anInt2737 < 10) {
                    if (!aClass153_3210.method2127(Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561)) {
                        anInt2737 = CacheIndex.worldmapIndex.method2116(Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561) / 10;
                        return;
                    }

                    Class3_Sub13_Sub1.method169();
                    anInt2737 = 10;
                }

                /**
                 * This block is dealing with world map zoom
                 */
                if (anInt2737 == 10) {
                    Class3_Sub13_Sub21.anInt3256 = Unsorted.aClass3_Sub28_Sub3_2600.anInt3555 >> 6 << 6;
                    Unsorted.anInt65 = Unsorted.aClass3_Sub28_Sub3_2600.anInt3562 >> 6 << 6;
                    Class108.anInt1460 = (Unsorted.aClass3_Sub28_Sub3_2600.anInt3549 >> 6 << 6) - Unsorted.anInt65 + 64;
                    Class23.anInt455 = 64 + (Unsorted.aClass3_Sub28_Sub3_2600.anInt3559 >> 6 << 6) + -Class3_Sub13_Sub21.anInt3256;
                    if (GameConfig.WORLD_MAP_DEBUG)
                        System.out.println("World Map Debug: Setting initial zoom level to: " + Unsorted.aClass3_Sub28_Sub3_2600.anInt3563);
                    if (Unsorted.aClass3_Sub28_Sub3_2600.anInt3563 == 37) { //Furthest zoom 37% on interface
                        Class44.aFloat727 = 3.0F;
                        NPC.aFloat3979 = 3.0F;
                    } else if (Unsorted.aClass3_Sub28_Sub3_2600.anInt3563 == 50) { //Far zoom 50% on interface
                        Class44.aFloat727 = 4.0F;
                        NPC.aFloat3979 = 4.0F;
                    } else if (Unsorted.aClass3_Sub28_Sub3_2600.anInt3563 == 75) { //Default zoom 75% on interface
                        Class44.aFloat727 = 6.0F;
                        NPC.aFloat3979 = 6.0F;
                    } else if (Unsorted.aClass3_Sub28_Sub3_2600.anInt3563 == 100) { //Close zoom 100% on interface
                        Class44.aFloat727 = 8.0F;
                        NPC.aFloat3979 = 8.0F;
                    } else if (Unsorted.aClass3_Sub28_Sub3_2600.anInt3563 == 200) { //Closest zoom 200% on interface
                        Class44.aFloat727 = 16.0F;
                        NPC.aFloat3979 = 16.0F;
                    } else {
                        Class44.aFloat727 = 8.0F; //Default value if one is not set = to 100% on interface
                        NPC.aFloat3979 = 8.0F;
                    }
                    /* End Minimap Zoom */


                    int var1 = -Class3_Sub13_Sub21.anInt3256 + (Player.player.anInt2819 >> 7) + Class131.anInt1716;
                    var1 += -5 + (int) (Math.random() * 10.0D);
                    int var2 = -Class82.anInt1152 + -(Player.player.anInt2829 >> 7) + Unsorted.anInt65 + -1 + Class108.anInt1460;
                    var2 += -5 + (int) (Math.random() * 10.0D);
                    if (var1 >= 0 && var1 < Class23.anInt455 && 0 <= var2 && Class108.anInt1460 > var2) {
                        Class3_Sub28_Sub1.anInt3536 = var1;
                        Class3_Sub4.anInt2251 = var2;
                    } else {
                        Class3_Sub4.anInt2251 = Unsorted.anInt65 - Unsorted.aClass3_Sub28_Sub3_2600.anInt3556 * 64 + Class108.anInt1460 + -1;
                        Class3_Sub28_Sub1.anInt3536 = Unsorted.aClass3_Sub28_Sub3_2600.anInt3558 * 64 + -Class3_Sub13_Sub21.anInt3256;
                    }

                    Class3_Sub5.method117();
                    Class83.anIntArray1161 = new int[1 + Client.anInt869];
                    int var4 = Class108.anInt1460 >> 6;
                    int var3 = Class23.anInt455 >> 6;
                    Class3_Sub10.aByteArrayArrayArray2339 = new byte[var3][var4][];
                    int var5 = Class158_Sub1.anInt3158 >> 2 << 10;
                    Class36.aByteArrayArrayArray640 = new byte[var3][var4][];
                    Class44.anIntArrayArrayArray720 = new int[var3][var4][];
                    RenderAnimationDefinition.aByteArrayArrayArray383 = new byte[var3][var4][];
                    Class146.anIntArrayArrayArray1903 = new int[var3][var4][];
                    Class3_Sub13_Sub33.aByteArrayArrayArray3390 = new byte[var3][var4][];
                    int var6 = Class158_Sub1.anInt1463 >> 1;
                    CS2Script.aByteArrayArrayArray2452 = new byte[var3][var4][];
                    Class29.anIntArrayArrayArray558 = new int[var3][var4][];
                    Class36.method1014(var6, var5);
                    anInt2737 = 20;


                } else if (anInt2737 == 20) {
                    if (GameConfig.WORLD_MAP_DEBUG)
                        System.out.println("World Map Debug: World Map Stage 20: String given: " + Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561.properlyCapitalize().toString());
                    method889(new DataBuffer(aClass153_3210.method2123(TextCore.worldmapUnderlay, Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561)));//This controls the world map underlay
                    anInt2737 = 30;
                    Class163_Sub1.method2210(true);
                    Class75_Sub4.method1355();
                } else {
                    if (anInt2737 == 30) {
                        if (GameConfig.WORLD_MAP_DEBUG)
                            System.out.println("World Map Debug: World Map Stage 30: String given: " + Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561.properlyCapitalize().toString());
                        Class163_Sub2.method2219(new DataBuffer(aClass153_3210.method2123(TextCore.worldmapOverlay, Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561)));//This controls the world map overlay (water)
                        anInt2737 = 40;
                        Class75_Sub4.method1355();
                    } else if (anInt2737 == 40) {
                        if (GameConfig.WORLD_MAP_DEBUG)
                            System.out.println("World Map Debug: World Map Stage 40: String given: " + Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561.properlyCapitalize().toString());
                        Class3_Sub13_Sub34.method328(new DataBuffer(aClass153_3210.method2123(TextCore.worldmapOverlay2, Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561)));//unsure
                        anInt2737 = 50;
                        Class75_Sub4.method1355();
                    } else if (anInt2737 == 50) {
                        if (GameConfig.WORLD_MAP_DEBUG)
                            System.out.println("World Map Debug: World Map Stage 50: String given: " + Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561.properlyCapitalize().toString());
                        Class96.method1587(new DataBuffer(aClass153_3210.method2123(TextCore.aClass94_422, Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561)));//This controls the world map object drawing (buildings etc)
                        anInt2737 = 60;
                        Class163_Sub1.method2210(true);
                        Class75_Sub4.method1355();
                    } else if (anInt2737 == 60) {
                        if (GameConfig.WORLD_MAP_DEBUG)
                            System.out.println("World Map Debug: World Map Stage 60: String given: " + Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561.properlyCapitalize().toString());
                        if (aClass153_3210.method2135(RSString.stringCombiner(new RSString[]{Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561, TextCore.HasLabels}))) {
                            if (!aClass153_3210.method2127(RSString.stringCombiner(new RSString[]{Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561, TextCore.HasLabels}))) {
                                return;
                            }

                            if (GameConfig.WORLD_MAP_DEBUG)
                                System.out.println("World Map Debug: World Map Class119.aClass131_1624: " + Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561.properlyCapitalize().toString() + ", " + TextCore.HasLabels.properlyCapitalize().toString());
                            Class119.aClass131_1624 = Class81.getWorldMapArchive(RSString.stringCombiner(new RSString[]{Unsorted.aClass3_Sub28_Sub3_2600.aClass94_3561, TextCore.HasLabels}), aClass153_3210);
                        } else {
                            Class119.aClass131_1624 = new Class131(0);
                        }

                        anInt2737 = 70;
                        Class75_Sub4.method1355();
                    } else if (anInt2737 == 70) {
                        Class164_Sub2.aClass33_3019 = new Class33(11, GameShell.canvas);//Sets the font size of *some* locations on the world map interface
                        anInt2737 = 73;
                        Class163_Sub1.method2210(true);
                        Class75_Sub4.method1355();
                    } else if (anInt2737 == 73) {
                        Unsorted.aClass33_1238 = new Class33(12, GameShell.canvas);//Unsure
                        anInt2737 = 76;
                        Class163_Sub1.method2210(true);
                        Class75_Sub4.method1355();
                    } else if (anInt2737 == 76) {
                        Class99.aClass33_1399 = new Class33(14, GameShell.canvas);//Sets the font size of *some* cities on the world map interface
                        anInt2737 = 79;
                        Class163_Sub1.method2210(true);
                        Class75_Sub4.method1355();
                    } else if (anInt2737 == 79) {
                        Class75_Sub2.aClass33_2637 = new Class33(17, GameShell.canvas);//unsure
                        anInt2737 = 82;
                        Class163_Sub1.method2210(true);
                        Class75_Sub4.method1355();
                    } else if (anInt2737 == 82) {
                        Class119.aClass33_1626 = new Class33(19, GameShell.canvas);//Sets the font size of the orange region names on the world map interface
                        anInt2737 = 85;
                        Class163_Sub1.method2210(true);
                        Class75_Sub4.method1355();
                    } else if (85 == anInt2737) {
                        Class75_Sub2.aClass33_2648 = new Class33(22, GameShell.canvas);//unsure
                        anInt2737 = 88;
                        Class163_Sub1.method2210(true);
                        Class75_Sub4.method1355();
                    } else if (88 == anInt2737) {
                        Class161.aClass33_2034 = new Class33(26, GameShell.canvas);//unsure
                        anInt2737 = 91;
                        Class163_Sub1.method2210(true);
                        Class75_Sub4.method1355();
                    } else {
                        Class91.aClass33_1305 = new Class33(30, GameShell.canvas);//unsure
                        anInt2737 = 100;
                        Class163_Sub1.method2210(true);
                        Class75_Sub4.method1355();
                        System.gc();
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw ClientErrorException.clientError(var7, "pa.B(" + 64 + ')');
        }
    }

    static void method628(int var1, int var2, Player var3) {
        try {

            if (var3.anInt2771 == var2 && var2 != -1) {
                SequenceDefinition var4 = SequenceDefinition.getAnimationDefinition(var2);
                int var5 = var4.delayType;
                if (1 == var5) {
                    var3.anInt2828 = var1;
                    var3.anInt2760 = 0;
                    var3.anInt2776 = 1;
                    var3.anInt2832 = 0;
                    var3.anInt2773 = 0;
                    Unsorted.method1470(var3.anInt2829, var4, 183921384, var3.anInt2819, Player.player == var3, var3.anInt2832);
                }

                if (var5 == 2) {
                    var3.anInt2773 = 0;
                }
            } else if (-1 == var2 || var3.anInt2771 == -1 || SequenceDefinition.getAnimationDefinition(var2).forcedPriority >= SequenceDefinition.getAnimationDefinition(var3.anInt2771).forcedPriority) {
                var3.anInt2776 = 1;
                var3.anInt2832 = 0;
                var3.anInt2828 = var1;
                var3.anInt2811 = var3.anInt2816;
                var3.anInt2773 = 0;
                var3.anInt2760 = 0;
                var3.anInt2771 = var2;
                if (var3.anInt2771 != -1) {
                    Unsorted.method1470(var3.anInt2829, SequenceDefinition.getAnimationDefinition(var3.anInt2771), 183921384, var3.anInt2819, var3 == Player.player, var3.anInt2832);
                }
            }

        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "pa.C(" + 0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void drawWorldMap(int var0, int var2, int var3, int var4) {
        try {
            if (anInt2737 < 100) {
                worldMapZoomFontSize();
            }

            if (HDToolKit.highDetail) {
                Class22.setClipping(var0, var2, var0 + var4, var3 + var2);
            } else {
                Class74.setClipping(var0, var2, var0 + var4, var3 + var2);
            }

            int var6;
            int var7;
            if (anInt2737 >= 100) {
                Class17.anInt410 = (int) ((float) (var3 * 2) / Class44.aFloat727);
                Class60.anInt930 = Class3_Sub28_Sub1.anInt3536 + -((int) ((float) var4 / Class44.aFloat727));
                int var15 = -((int) ((float) var4 / Class44.aFloat727)) + Class3_Sub28_Sub1.anInt3536;
                var6 = Class3_Sub4.anInt2251 - (int) ((float) var3 / Class44.aFloat727);
                Class60.anInt934 = Class3_Sub4.anInt2251 + -((int) ((float) var3 / Class44.aFloat727));
                int var8 = Class3_Sub4.anInt2251 + (int) ((float) var3 / Class44.aFloat727);
                var7 = (int) ((float) var4 / Class44.aFloat727) + Class3_Sub28_Sub1.anInt3536;
                Class49.anInt817 = (int) ((float) (var4 * 2) / Class44.aFloat727);

                if (HDToolKit.highDetail) {
                    if (aClass3_Sub28_Sub16_Sub2_3221 == null || var4 != aClass3_Sub28_Sub16_Sub2_3221.anInt3707 || var3 != aClass3_Sub28_Sub16_Sub2_3221.anInt3696) {
                        aClass3_Sub28_Sub16_Sub2_3221 = null;
                        aClass3_Sub28_Sub16_Sub2_3221 = new Class3_Sub28_Sub16_Sub2(var4, var3);
                    }

                    Class74.setBuffer(aClass3_Sub28_Sub16_Sub2_3221.anIntArray4081, var4, var3);
                    Unsorted.method523(var4, 0, var7, var6, 0, var8, var3, var15);
                    Class23.method938(var4, 0, var7, var8, var3, 0, var15, var6);
                    Class3_Sub5.method111((byte) -54, 0, 0, var15, var4, var8, var6, var7, var3);
                    Class22.method926(aClass3_Sub28_Sub16_Sub2_3221.anIntArray4081, var0, var2, var4, var3);
                    Toolkit.JAVA_TOOLKIT.resetBuffer();
                } else {
                    Unsorted.method523(var4 + var0, var2, var7, var6, var0, var8, var2 - -var3, var15);
                    Class23.method938(var0 + var4, var0, var7, var8, var3 + var2, var2, var15, var6);
                    Class3_Sub5.method111((byte) -100, var0, var2, var15, var0 - -var4, var8, var6, var7, var3 + var2);
                }

                if (0 < AbstractSprite.anInt3704) {
                    --Class3_Sub28_Sub8.anInt3611;
                    if (Class3_Sub28_Sub8.anInt3611 == 0) {
                        Class3_Sub28_Sub8.anInt3611 = 20;
                        --AbstractSprite.anInt3704;
                    }
                }

                /*
                 * This handles the ::fpson command to overlay when a user opens up the world map
                 */
                if (ClientCommands.fpsOverlayEnabled) {
                    int var10 = -8 + var2 - -var3;
                    int var9 = -5 + (var0 - -var4);
                    Class126.aClass3_Sub28_Sub17_1669.method688(RSString.stringCombiner(new RSString[]{TextCore.aClass94_985, RSString.stringAnimator(GameShell.fpsCounter)}), var9, var10, 16776960, -1);
                    Runtime var11 = Runtime.getRuntime();
                    int var12 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
                    int var13 = 16776960;
                    var10 -= 15;
                    if (var12 > 65536) {
                        var13 = 16711680;
                    }

                    Class126.aClass3_Sub28_Sub17_1669.method688(RSString.stringCombiner(new RSString[]{TextCore.aClass94_1630, RSString.stringAnimator(var12), TextCore.aClass94_3055}), var9, var10, var13, -1);
                }
                /* * * * * * * */

            } else {
                byte var5 = 20;
                var6 = var0 - -(var4 / 2);
                var7 = var3 / 2 + (var2 - 18) + -var5;
                //World map pre loading brown screen
                Toolkit.getActiveToolkit().method934(var0, var2, var4, var3, 0);
                Toolkit.getActiveToolkit().drawRect(var6 - 152, var7, 304, 34, 9179409, 255);
                Toolkit.getActiveToolkit().drawRect(var6 + -151, var7 + 1, 302, 32, 0, 255);
                Toolkit.getActiveToolkit().method934(-150 + var6, var7 + 2, 3 * anInt2737, 30, 9179409);
                Toolkit.getActiveToolkit().method934(-150 + var6 + anInt2737 * 3, var7 - -2, 300 + -(3 * anInt2737), 30, 0);

                Class168.aClass3_Sub28_Sub17_2096.method699(TextCore.LoadingGeneral, var6, var5 + var7, 16777215, -1);
            }
        } catch (RuntimeException var14) {
            throw ClientErrorException.clientError(var14, "wa.FA(" + var0 + ',' + 64 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
        }
    }

    static void method889(DataBuffer var1) {
        try {
            int var3 = Class158.anInt2010 >> 1;
            int var2 = anInt4034 >> 2 << 10;
            byte[][] var4 = new byte[Class23.anInt455][Class108.anInt1460];

            int var6;
            int var12;
            int var14;
            while (var1.index < var1.buffer.length) {
                int var7 = 0;
                var6 = 0;
                boolean var5 = false;
                if (var1.readUnsignedByte() == 1) {
                    var6 = var1.readUnsignedByte();
                    var7 = var1.readUnsignedByte();
                    var5 = true;
                }

                int var8 = var1.readUnsignedByte();
                int var9 = var1.readUnsignedByte();
                int var10 = -Class3_Sub13_Sub21.anInt3256 + var8 * 64;
                int var11 = -1 + Class108.anInt1460 - var9 * 64 + Unsorted.anInt65;
                if (var10 >= 0 && 0 <= -63 + var11 && Class23.anInt455 > var10 - -63 && var11 < Class108.anInt1460) {
                    for (var12 = 0; var12 < 64; ++var12) {
                        byte[] var13 = var4[var10 - -var12];

                        for (var14 = 0; 64 > var14; ++var14) {
                            if (!var5 || var12 >= 8 * var6 && 8 + 8 * var6 > var12 && var14 >= var7 * 8 && var14 < 8 + 8 * var7) {
                                var13[var11 - var14] = var1.readSignedByte();
                            }
                        }
                    }
                } else if (var5) {
                    var1.index += 64;
                } else {
                    var1.index += 4096;
                }
            }

            int var27 = Class23.anInt455;
            var6 = Class108.anInt1460;
            int[] var29 = new int[var6];
            int[] var28 = new int[var6];
            int[] var30 = new int[var6];
            int[] var32 = new int[var6];
            int[] var31 = new int[var6];

            for (var12 = -5; var27 > var12; ++var12) {
                int var15;
                int var35;
                for (int var34 = 0; var6 > var34; ++var34) {
                    var14 = var12 + 5;
                    if (var27 > var14) {
                        var15 = 255 & var4[var14][var34];
                        if (var15 > 0) {
                            MapUnderlayColorDefinition var16 = Class158_Sub1.method629(var15 - 1);
                            var28[var34] += var16.anInt1408;
                            var29[var34] += var16.anInt1406;
                            var30[var34] += var16.anInt1417;
                            var32[var34] += var16.anInt1418;
                            ++var31[var34];
                        }
                    }

                    var15 = var12 + -5;
                    if (var15 >= 0) {
                        var35 = var4[var15][var34] & 255;
                        if (0 < var35) {
                            MapUnderlayColorDefinition var17 = Class158_Sub1.method629(-1 + var35);
                            var28[var34] -= var17.anInt1408;
                            var29[var34] -= var17.anInt1406;
                            var30[var34] -= var17.anInt1417;
                            var32[var34] -= var17.anInt1418;
                            --var31[var34];
                        }
                    }
                }

                if (var12 >= 0) {
                    int[][] var33 = Class146.anIntArrayArrayArray1903[var12 >> 6];
                    var14 = 0;
                    var15 = 0;
                    int var36 = 0;
                    int var18 = 0;
                    var35 = 0;

                    for (int var19 = -5; var6 > var19; ++var19) {
                        int var20 = var19 - -5;
                        if (var6 > var20) {
                            var18 += var31[var20];
                            var15 += var29[var20];
                            var35 += var30[var20];
                            var14 += var28[var20];
                            var36 += var32[var20];
                        }

                        int var21 = -5 + var19;
                        if (var21 >= 0) {
                            var35 -= var30[var21];
                            var36 -= var32[var21];
                            var14 -= var28[var21];
                            var18 -= var31[var21];
                            var15 -= var29[var21];
                        }

                        if (var19 >= 0 && 0 < var18) {
                            int[] var22 = var33[var19 >> 6];
                            int var23 = var36 != 0 ? Class3_Sub8.method129(var35 / var18, var15 / var18, var14 * 256 / var36) : 0;
                            if (var4[var12][var19] == 0) {
                                if (var22 != null) {
                                    var22[Unsorted.bitwiseAnd(4032, var19 << 6) - -Unsorted.bitwiseAnd(var12, 63)] = 0;
                                }
                            } else {
                                if (var22 == null) {
                                    var22 = var33[var19 >> 6] = new int[4096];
                                }

                                int var24 = var3 + (var23 & 127);
                                if (var24 < 0) {
                                    var24 = 0;
                                } else if (var24 > 127) {
                                    var24 = 127;
                                }

                                int var25 = var24 + (896 & var23) + (var23 + var2 & '\ufc00');
                                var22[Unsorted.bitwiseAnd(4032, var19 << 6) + Unsorted.bitwiseAnd(63, var12)] = Class51.anIntArray834[Unsorted.method1100(96, var25)];
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var26) {
            throw ClientErrorException.clientError(var26, "cj.H(" + (var1 != null ? "{...}" : "null") + ')');
        }
    }
}

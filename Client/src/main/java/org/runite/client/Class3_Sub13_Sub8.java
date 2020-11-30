package org.runite.client;

import org.rs09.client.util.ArrayUtils;

import java.util.Objects;

final class Class3_Sub13_Sub8 extends Class3_Sub13 {

    static CacheIndex aClass153_1967;
    static int anInt3102 = 0;
    static int anInt3103;
    static float aFloat3105;
    private boolean aBoolean3100 = true;
    private boolean aBoolean3104 = true;


    public Class3_Sub13_Sub8() {
        super(1, false);
    }

    static void method203(int var0) {
        try {
            //int var1 = 15 / ((-11 - var0) / 63);
            if (Unsorted.anInt3660 == 2) {
                if (Class3_Sub13_Sub39.anInt3460 == NPCDefinition.anInt1297 && Class38_Sub1.anInt2612 == Class168.anInt2099) {
                    Unsorted.anInt3660 = 0;
                    if (ClientCommands.shiftClickEnabled && ObjectDefinition.aBooleanArray1490[81] && ContextMenu.menuOptionCount > 2) {
                        method806(ContextMenu.menuOptionCount + -2);
                    } else {
                        method806(ContextMenu.menuOptionCount + -1);
                    }
                }
            } else if (NPCDefinition.anInt1297 == Class163_Sub1.anInt2993 && Class38_Sub1.anInt2614 == Class38_Sub1.anInt2612) {
                Unsorted.anInt3660 = 0;
                if (ClientCommands.shiftClickEnabled && ObjectDefinition.aBooleanArray1490[81] && ContextMenu.menuOptionCount > 2) {
                    method806(ContextMenu.menuOptionCount - 2);
                } else {
                    method806(ContextMenu.menuOptionCount - 1);
                }
            } else {
                Class168.anInt2099 = Class38_Sub1.anInt2614;
                Unsorted.anInt3660 = 2;
                Class3_Sub13_Sub39.anInt3460 = Class163_Sub1.anInt2993;
            }

        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "ej.B(" + var0 + ')');
        }
    }

    static void method205(CacheIndex var0, CacheIndex var2, Interface4 var3) {
        try {
            aClass153_1967 = var0;
            Class58.anInterface4_915 = var3;
            Class3_Sub24_Sub3.aClass153_3490 = var2;
            if (Class3_Sub24_Sub3.aClass153_3490 != null) {
                Class83.anInt1156 = Class3_Sub24_Sub3.aClass153_3490.getFileAmount(1);
            }

            if (aClass153_1967 != null) {
                RenderAnimationDefinition.anInt377 = aClass153_1967.getFileAmount(1);
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "ej.E(" + (var0 != null ? "{...}" : "null") + ',' + 115 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
        }
    }

    static RSString method207(int var0, boolean var1, int var2, long var3) {
        try {
            if (var0 >= 2 && var0 <= 36) {
                if (var2 <= 71) {
                    aFloat3105 = 1.3008908F;
                }

                long var6 = var3 / (long) var0;

                int var5;
                for (var5 = 1; var6 != 0L; var6 /= var0) {
                    ++var5;
                }

                int var8 = var5;
                if (0L > var3 || var1) {
                    var8 = var5 + 1;
                }

                byte[] var9 = new byte[var8];
                if (var3 >= 0L) {
                    if (var1) {
                        var9[0] = 43;
                    }
                } else {
                    var9[0] = 45;
                }

                for (int var10 = 0; var10 < var5; ++var10) {
                    int var11 = (int) (var3 % (long) var0);
                    var3 /= var0;
                    if (var11 < 0) {
                        var11 = -var11;
                    }

                    if (var11 > 9) {
                        var11 += 39;
                    }

                    var9[-1 + -var10 + var8] = (byte) (var11 + 48);
                }

                RSString var13 = new RSString();
                var13.buffer = var9;
                var13.length = var8;
                return var13;
            } else {
                throw new IllegalArgumentException("Invalid radix:" + var0);
            }
        } catch (RuntimeException var12) {
            throw ClientErrorException.clientError(var12, "ej.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
        }
    }

    static void method806(int var1) {
        try {
            if (var1 >= 0) {
                int var2 = ContextMenu.anIntArray1613[var1];
                int var3 = ContextMenu.anIntArray512[var1];
                int var4 = ContextMenu.aShortArray3095[var1];
                if (var4 >= 2000) {
                    var4 -= 2000;
                }

                long var6 = ContextMenu.aLongArray3271[var1];
                int var5 = (int) ContextMenu.aLongArray3271[var1];
                Player var8;
                if (31 == var4) {
                    var8 = Class3_Sub13_Sub22.players[var5];
                    if (null != var8) {
                        Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], Player.player.anIntArray2767[0]);
                        Class36.anInt638 = 2;
                        Unsorted.anInt2958 = 0;
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Network.outgoingBuffer.putOpcode(71);
                        Network.outgoingBuffer.writeShort128LE(var5);
                    }
                }

                if (var4 == 46) {
                    Class163_Sub2_Sub1.method2224(var6, var3, var2);
                    Network.outgoingBuffer.putOpcode(247);
                    Network.outgoingBuffer.writeShortLE(Class82.anInt1152 + var3);
                    Network.outgoingBuffer.writeShort128LE(var2 + Class131.anInt1716);
                    Network.outgoingBuffer.writeShort(Integer.MAX_VALUE & (int) (var6 >>> 32));
                }

                if (var4 == 40) {
                    Network.outgoingBuffer.putOpcode(27);
                    Network.outgoingBuffer.writeShort(Network.anInt1473);
                    Network.outgoingBuffer.writeIntLE2(var3);
                    Network.outgoingBuffer.writeShortLE(var2);
                    Network.outgoingBuffer.writeIntLE2(Class3_Sub28_Sub18.anInt3764);
                    Network.outgoingBuffer.writeShort128LE(Class164.anInt2050);
                    Network.outgoingBuffer.writeShort128LE(var5);
                    Network.anInt2330 = 0;
                    Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                    KeyboardListener.anInt1918 = var2;
                    System.out.println(Network.anInt1473 + ", " + var3 + ", " + var2 + ", " + Class3_Sub28_Sub18.anInt3764 + ", " + Class164.anInt2050 + ", " + var5);
                }

                NPC var11;
                if (var4 == 19) {
                    var11 = NPC.npcs[var5];
                    if (null != var11) {
                        Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], Player.player.anIntArray2767[0]);
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Class36.anInt638 = 2;
                        Unsorted.anInt2958 = 0;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Network.outgoingBuffer.putOpcode(30);
                        Network.outgoingBuffer.writeShort(var5);
                    }
                }

                if (17 == var4) {
                    var11 = NPC.npcs[var5];
                    if (var11 != null) {
                        Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], Player.player.anIntArray2767[0]);
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Unsorted.anInt2958 = 0;
                        Class36.anInt638 = 2;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Network.outgoingBuffer.putOpcode(78);
                        Network.outgoingBuffer.writeShortLE(var5);
                    }
                }

                if (var4 == 44) {
                    var8 = Class3_Sub13_Sub22.players[var5];
                    if (null != var8) {
                        Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], Player.player.anIntArray2767[0]);
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Class36.anInt638 = 2;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Unsorted.anInt2958 = 0;
                        Network.outgoingBuffer.putOpcode(133);
                        Network.outgoingBuffer.writeShortLE(var5);
                    }
                }

                if (var4 == 58) {
                    Network.outgoingBuffer.putOpcode(135);
                    Network.outgoingBuffer.putShortA(var5);
                    Network.outgoingBuffer.putShortA(var2);
                    Network.outgoingBuffer.writeIntV2(var3);
                    Network.anInt2330 = 0;
                    Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                    KeyboardListener.anInt1918 = var2;
                }

                if (var4 == 42) {
                    Class163_Sub2_Sub1.method2224(var6, var3, var2);
                    Network.outgoingBuffer.putOpcode(254);
                    Network.outgoingBuffer.writeShortLE(var2 + Class131.anInt1716);
                    Network.outgoingBuffer.putShortA((int) (var6 >>> 32) & Integer.MAX_VALUE);
                    Network.outgoingBuffer.writeShort(var3 - -Class82.anInt1152);
                }

                if (28 == var4) {
                    Class3_Sub13_Sub19.method264((byte) 122);
                }

                if (var4 == 45) {
                    var11 = NPC.npcs[var5];
                    if (var11 != null) {
                        Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], Player.player.anIntArray2767[0]);
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Class36.anInt638 = 2;
                        Unsorted.anInt2958 = 0;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Network.outgoingBuffer.putOpcode(239);
                        Network.outgoingBuffer.writeIntLE2(Network.anInt872);
                        Network.outgoingBuffer.putShortA(RSInterface.anInt278);
                        Network.outgoingBuffer.writeShort128LE(var5);
                    }
                }

                boolean var14;
                if (18 == var4) {
                    if (Class158.anInt2014 == 1) {
                        Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                    } else {
                        var14 = Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 0, false, 0, 2597 ^ 2599, var2, 0, 0, 2, var3, Player.player.anIntArray2767[0]);
                        if (!var14) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                        }
                    }

                    Class70.anInt1053 = Class163_Sub1.anInt2993;
                    Unsorted.anInt2958 = 0;
                    Class36.anInt638 = 2;
                    Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                    Network.outgoingBuffer.putOpcode(66);
                    Network.outgoingBuffer.writeShortLE(Class131.anInt1716 + var2);
                    Network.outgoingBuffer.writeShort(var5);
                    Network.outgoingBuffer.writeShort128LE(var3 - -Class82.anInt1152);
                }

                if (var4 == 1001) {
                    Class163_Sub2_Sub1.method2224(var6, var3, var2);
                    Network.outgoingBuffer.putOpcode(170);
                    Network.outgoingBuffer.writeShort128LE(Integer.MAX_VALUE & (int) (var6 >>> 32));
                    Network.outgoingBuffer.writeShort128LE(var2 - -Class131.anInt1716);
                    Network.outgoingBuffer.writeShort128LE(var3 - -Class82.anInt1152);
                }

                if (var4 == 1002) {
                    Class36.anInt638 = 2;
                    Class70.anInt1053 = Class163_Sub1.anInt2993;
                    Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                    Unsorted.anInt2958 = 0;
                    Network.outgoingBuffer.putOpcode(92);
                    Network.outgoingBuffer.writeShort128LE(var5);
                }

                RSInterface var13;
                if (var4 == 1006) {
                    var13 = Class7.getRSInterface(var3);
                    if (null != var13 && var13.itemIds[var2] >= 100000) {
                        Network.addChatMessage(TextCore.aClass94_3672, 0, RSString.stringCombiner(new RSString[]{RSString.stringAnimator(var13.itemIds[var2]), TextCore.aClass94_3777, ItemDefinition.getItemDefinition(var5).name}), -1);
                    } else {
                        Network.outgoingBuffer.putOpcode(92);
                        Network.outgoingBuffer.writeShort128LE(var5);
                    }

                    Network.anInt2330 = 0;
                    Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                    KeyboardListener.anInt1918 = var2;
                }

                if (var4 == 60) {
                    if (var5 == 0) {
                        Unsorted.method589(WorldListCountry.localPlane, var2, var3);
                    } else if (var5 == 1) {
                        if (0 < Class3_Sub13_Sub26.rights && ObjectDefinition.aBooleanArray1490[82] && ObjectDefinition.aBooleanArray1490[81]) {
                            Class30.method979(Class131.anInt1716 + var2, Class82.anInt1152 + var3, WorldListCountry.localPlane);
                        } else if (Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 0, true, 0, 2, var2, 0, 0, 1, var3, Player.player.anIntArray2767[0])) {
                            Network.outgoingBuffer.writeByte(Class1.anInt56);
                            Network.outgoingBuffer.writeByte(Class58.anInt916);
                            Network.outgoingBuffer.writeShort(GraphicDefinition.CAMERA_DIRECTION);
                            Network.outgoingBuffer.writeByte(57);
                            Network.outgoingBuffer.writeByte(anInt3102);
                            Network.outgoingBuffer.writeByte(Class164_Sub2.anInt3020);
                            Network.outgoingBuffer.writeByte(89);
                            Network.outgoingBuffer.writeShort(Player.player.anInt2819);
                            Network.outgoingBuffer.writeShort(Player.player.anInt2829);
                            Network.outgoingBuffer.writeByte(Class129.anInt1692);
                            Network.outgoingBuffer.writeByte(63);
                        }
                    }
                }

                if (1007 == var4) {
                    Unsorted.anInt2958 = 0;
                    Class36.anInt638 = 2;
                    Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                    Class70.anInt1053 = Class163_Sub1.anInt2993;
                    var11 = NPC.npcs[var5];
                    if (var11 != null) {
                        NPCDefinition var9 = var11.definition;
                        if (var9.childNPCs != null) {
                            var9 = var9.method1471((byte) 80);
                        }

                        if (null != var9) {
                            Network.outgoingBuffer.putOpcode(72);
                            Network.outgoingBuffer.writeShort(var9.npcId);
                        }
                    }
                }

                if (var4 == 47) {
                    if (MouseWheel.shiftDown) {

                        Network.outgoingBuffer.putOpcode(135);
                        Network.outgoingBuffer.putShortA(var5);
                        Network.outgoingBuffer.putShortA(var2);
                        Network.outgoingBuffer.writeIntV2(var3);
                        Network.anInt2330 = 0;
                        Unsorted.aClass11_1933 = Class7.getRSInterface(var3);


                    } else {
                        Network.outgoingBuffer.putOpcode(156);
                        Network.outgoingBuffer.writeShort128LE(var2);
                        Network.outgoingBuffer.putShortA(var5);
                        Network.outgoingBuffer.writeIntLE2(var3);
                        Network.anInt2330 = 0;
                        Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                    }
                    KeyboardListener.anInt1918 = var2;
                }

                if (var4 == 3) {
                    Network.outgoingBuffer.putOpcode(253);
                    Network.outgoingBuffer.writeIntLE2(Network.anInt872);
                    Network.outgoingBuffer.writeShort128LE(var2);
                    Network.outgoingBuffer.writeIntLE2(var3);
                    Network.outgoingBuffer.putShortA(var5);
                    Network.outgoingBuffer.writeShortLE(RSInterface.anInt278);
                    Network.anInt2330 = 0;
                    Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                    KeyboardListener.anInt1918 = var2;
                }

                if (var4 == 10) {
                    var8 = Class3_Sub13_Sub22.players[var5];
                    if (var8 != null) {
                        Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], Player.player.anIntArray2767[0]);
                        Class36.anInt638 = 2;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Unsorted.anInt2958 = 0;
                        Network.outgoingBuffer.putOpcode(4);
                        Network.outgoingBuffer.writeShortLE(var5);
                    }
                }

                if (41 == var4 && Class3_Sub13_Sub7.aClass11_3087 == null) {
                    Unsorted.method78(var2, var3);
                    Class3_Sub13_Sub7.aClass11_3087 = AbstractSprite.method638(var3, var2);
                    Class20.method909(Class3_Sub13_Sub7.aClass11_3087);
                }

                if (49 == var4) {
                    Class163_Sub2_Sub1.method2224(var6, var3, var2);
                    Network.outgoingBuffer.putOpcode(84);
                    Network.outgoingBuffer.writeShort128LE(Integer.MAX_VALUE & (int) (var6 >>> 32));
                    Network.outgoingBuffer.writeShort128LE(Class82.anInt1152 + var3);
                    Network.outgoingBuffer.writeShortLE(var2 - -Class131.anInt1716);
                }

                if (var4 == 23) {
                    Network.outgoingBuffer.putOpcode(206);
                    Network.outgoingBuffer.putShortA(var5);//itemId
                    Network.outgoingBuffer.writeShortLE(var2);//data
                    Network.outgoingBuffer.writeIntLE2(var3);//slot
                    Network.anInt2330 = 0;
                    Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                    KeyboardListener.anInt1918 = var2;
                }

                if (var4 == 14) {
                    Class163_Sub2_Sub1.method2224(var6, var3, var2);
                    Network.outgoingBuffer.putOpcode(134);
                    Network.outgoingBuffer.putShortA(Class131.anInt1716 + var2);
                    Network.outgoingBuffer.writeShort(Class164.anInt2050);
                    Network.outgoingBuffer.writeShortLE(var3 - -Class82.anInt1152);
                    Network.outgoingBuffer.writeShort(Network.anInt1473);
                    Network.outgoingBuffer.writeIntV2(Class3_Sub28_Sub18.anInt3764);
                    Network.outgoingBuffer.putShortA((int) (var6 >>> 32) & Integer.MAX_VALUE);
                }

                if (var4 == 37) {
                    var8 = Class3_Sub13_Sub22.players[var5];
                    if (var8 != null) {
                        Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], Player.player.anIntArray2767[0]);
                        Unsorted.anInt2958 = 0;
                        Class36.anInt638 = 2;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Network.outgoingBuffer.putOpcode(114);
                        Network.outgoingBuffer.writeShort128LE(var5);
                    }
                }

                if (var4 == 9 || 1003 == var4) {
                    Unsorted.method66(ContextMenu.aClass94Array4016[var1], var2, var5, (byte) -19, var3);
                }

                if (var4 == 5) {
                    if (MouseWheel.shiftDown) {
                        Network.outgoingBuffer.putOpcode(135);
                        Network.outgoingBuffer.putShortA(var5);
                        Network.outgoingBuffer.putShortA(var2);
                        Network.outgoingBuffer.writeIntV2(var3);
                        Network.anInt2330 = 0;
                        Unsorted.aClass11_1933 = Class7.getRSInterface(var3);

                    } else {
                        Network.outgoingBuffer.putOpcode(55);
                        Network.outgoingBuffer.writeShortLE(var5);
                        Network.outgoingBuffer.putShortA(var2);
                        Network.outgoingBuffer.writeIntV1(var3);
                        Network.anInt2330 = 0;
                        Unsorted.aClass11_1933 = Class7.getRSInterface(var3);

                    }
                    KeyboardListener.anInt1918 = var2;
                }

                if (var4 == 21) {
                    if (Class158.anInt2014 == 1) {
                        Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2597 + -2595, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                    } else {
                        var14 = Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 0, false, 0, 2597 + -2595, var2, 0, 0, 2, var3, Player.player.anIntArray2767[0]);
                        if (!var14) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2597 + -2595, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                        }
                    }

                    Class36.anInt638 = 2;
                    Class70.anInt1053 = Class163_Sub1.anInt2993;
                    Unsorted.anInt2958 = 0;
                    Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                    Network.outgoingBuffer.putOpcode(228);
                    Network.outgoingBuffer.writeShort(var5);
                    Network.outgoingBuffer.writeShortLE(Class131.anInt1716 + var2);
                    Network.outgoingBuffer.writeShort128LE(Class82.anInt1152 + var3);
                }

                if (var4 == 4) {
                    var11 = NPC.npcs[var5];
                    if (var11 != null) {
                        Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], Player.player.anIntArray2767[0]);
                        Class36.anInt638 = 2;
                        Unsorted.anInt2958 = 0;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Network.outgoingBuffer.putOpcode(148);
                        Network.outgoingBuffer.putShortA(var5);
                    }
                }

                if (32 == var4) {
                    var13 = AbstractSprite.method638(var3, var2);
                    if (null != var13) {
                        Class25.method958((byte) -126);
                        Class3_Sub1 var16 = Client.method44(var13);
                        Class145.method2074(var3, var2, var16.method101(), var16.anInt2202, var13.anInt266, var13.anInt238);
                        Class164_Sub1.anInt3012 = 0;
                        Class3_Sub28_Sub9.aClass94_3621 = Class53.method1174(var13, (byte) -94);
                        if (Class3_Sub28_Sub9.aClass94_3621 == null) {
                            Class3_Sub28_Sub9.aClass94_3621 = TextCore.aClass94_1915;
                        }

                        if (var13.usingScripts) {
                            TextCore.aClass94_676 = RSString.stringCombiner(new RSString[]{var13.aClass94_277, ColorCore.ContextColor});
                        } else {
                            TextCore.aClass94_676 = RSString.stringCombiner(new RSString[]{RSString.parse("<col=00ff00>"), var13.aClass94_243, ColorCore.ContextColor});
                        }
                    }

                } else {
                    if (29 == var4) {
                        var8 = Class3_Sub13_Sub22.players[var5];
                        if (null != var8) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], Player.player.anIntArray2767[0]);
                            Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                            Unsorted.anInt2958 = 0;
                            Class36.anInt638 = 2;
                            Class70.anInt1053 = Class163_Sub1.anInt2993;
                            Network.outgoingBuffer.putOpcode(180);
                            Network.outgoingBuffer.writeShort128LE(var5);
                        }
                    }

                    if (var4 == 35) {
                        Network.outgoingBuffer.putOpcode(161);
                        Network.outgoingBuffer.writeIntLE2(var3);
                        Network.outgoingBuffer.writeShort128LE(var5);
                        Network.outgoingBuffer.writeShort128LE(var2);
                        Network.anInt2330 = 0;
                        Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                        KeyboardListener.anInt1918 = var2;
                    }

                    if (15 == var4) {
                        var8 = Class3_Sub13_Sub22.players[var5];
                        if (var8 != null) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], Player.player.anIntArray2767[0]);
                            Unsorted.anInt2958 = 0;
                            Class36.anInt638 = 2;
                            Class70.anInt1053 = Class163_Sub1.anInt2993;
                            Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                            Network.outgoingBuffer.putOpcode(195);
                            Network.outgoingBuffer.putShortA(RSInterface.anInt278);
                            Network.outgoingBuffer.writeIntLE2(Network.anInt872);
                            Network.outgoingBuffer.writeShort128LE(var5);
                        }
                    }

                    if (34 == var4) {
                        if (Class158.anInt2014 == 1) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                        } else {
                            var14 = Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 0, false, 0, 2597 ^ 2599, var2, 0, 0, 2, var3, Player.player.anIntArray2767[0]);
                            if (!var14) {
                                Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                            }
                        }

                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Class36.anInt638 = 2;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Unsorted.anInt2958 = 0;
                        Network.outgoingBuffer.putOpcode(109);
                        Network.outgoingBuffer.writeShortLE(var3 - -Class82.anInt1152);
                        Network.outgoingBuffer.writeShort(var2 + Class131.anInt1716);
                        Network.outgoingBuffer.writeShort128LE(var5);
                    }

                    if (var4 == 25) {
                        Network.outgoingBuffer.putOpcode(81);
                        Network.outgoingBuffer.putShortA(var2);
                        Network.outgoingBuffer.writeShort(var5);
                        Network.outgoingBuffer.writeIntV1(var3);
                        Network.anInt2330 = 0;
                        Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                        KeyboardListener.anInt1918 = var2;
                    }

                    if (var4 == 2) {
                        var11 = NPC.npcs[var5];
                        if (var11 != null) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2597 + -2595, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], Player.player.anIntArray2767[0]);
                            Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                            Class36.anInt638 = 2;
                            Class70.anInt1053 = Class163_Sub1.anInt2993;
                            Unsorted.anInt2958 = 0;
                            Network.outgoingBuffer.putOpcode(218);
                            Network.outgoingBuffer.writeShortLE(var5);
                        }
                    }

                    int var12;
                    if (var4 == 51) {
                        Network.outgoingBuffer.putOpcode(10);
                        Network.outgoingBuffer.writeInt(var3);
                        var13 = Class7.getRSInterface(var3);
                        if (Objects.requireNonNull(var13).childDataBuffers != null && var13.childDataBuffers[0][0] == 5) {
                            var12 = var13.childDataBuffers[0][1];
                            if (ItemDefinition.ram[var12] != var13.anIntArray307[0]) {
                                ItemDefinition.ram[var12] = var13.anIntArray307[0];
                                Class46.method1087(98, var12);
                            }
                        }
                    }

                    if (var4 == 26) {
                        var11 = NPC.npcs[var5];
                        if (var11 != null) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], Player.player.anIntArray2767[0]);
                            Class36.anInt638 = 2;
                            Unsorted.anInt2958 = 0;
                            Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                            Class70.anInt1053 = Class163_Sub1.anInt2993;
                            Network.outgoingBuffer.putOpcode(115);//Item on NPC
                            Network.outgoingBuffer.writeIntV2(Class3_Sub28_Sub18.anInt3764);
                            Network.outgoingBuffer.writeShortLE(Network.anInt1473);
                            Network.outgoingBuffer.writeShortLE(var5);
                            Network.outgoingBuffer.writeShort128LE(Class164.anInt2050);
//							System.out.println(Class3_Sub28_Sub18.anInt3764 + ", " + Class110.anInt1473 + ", " + var5 + ", " + Class164.anInt2050);
                        }
                    }

                    if (59 == var4) {
                        Network.outgoingBuffer.putOpcode(10);
                        Network.outgoingBuffer.writeInt(var3);
                        var13 = Class7.getRSInterface(var3);
                        if (Objects.requireNonNull(var13).childDataBuffers != null && var13.childDataBuffers[0][0] == 5) {
                            var12 = var13.childDataBuffers[0][1];
                            ItemDefinition.ram[var12] = -ItemDefinition.ram[var12] + 1;
                            Class46.method1087(68, var12);
                        }
                    }

                    if (var4 == 33) {
                        var14 = Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 0, false, 0, 2, var2, 0, 0, 2, var3, Player.player.anIntArray2767[0]);
                        if (!var14) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2597 + -2595, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                        }

                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Unsorted.anInt2958 = 0;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Class36.anInt638 = 2;
                        Network.outgoingBuffer.putOpcode(101);
                        Network.outgoingBuffer.writeShort128LE(var2 - -Class131.anInt1716);
                        Network.outgoingBuffer.writeShortLE(Network.anInt1473);
                        Network.outgoingBuffer.writeShortLE(Class164.anInt2050);
                        Network.outgoingBuffer.writeShortLE(var5);
                        Network.outgoingBuffer.writeShort128LE(Class82.anInt1152 + var3);
                        Network.outgoingBuffer.writeIntV2(Class3_Sub28_Sub18.anInt3764);
                    }

                    if (var4 == 1004) {
                        Unsorted.anInt2958 = 0;
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Class36.anInt638 = 2;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Network.outgoingBuffer.putOpcode(94);
                        Network.outgoingBuffer.writeShort128LE(var5);
                    }

                    if (11 == var4) {
                        if (var5 == 0) {
                            CS2Script.anInt2440 = 1;
                            Unsorted.method589(WorldListCountry.localPlane, var2, var3);
                        } else if (1 == var5) {
                            Network.outgoingBuffer.putOpcode(131);
                            Network.outgoingBuffer.writeIntV2(Network.anInt872);
                            Network.outgoingBuffer.putShortA(Class131.anInt1716 + var2);
                            Network.outgoingBuffer.writeShort128LE(RSInterface.anInt278);
                            Network.outgoingBuffer.putShortA(var3 + Class82.anInt1152);
                        }
                    }

                    if (8 == var4) {
                        var13 = Class7.getRSInterface(var3);
                        boolean var15 = true;
                        if (0 < Objects.requireNonNull(var13).anInt189) {
                            var15 = Network.method715(var13);
                        }

                        if (var15) {
                            Network.outgoingBuffer.putOpcode(10);
                            Network.outgoingBuffer.writeInt(var3);
                        }
                    }

                    if (var4 == 1) {
                        var8 = Class3_Sub13_Sub22.players[var5];
                        if (var8 != null) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], Player.player.anIntArray2767[0]);
                            Unsorted.anInt2958 = 0;
                            Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                            Class36.anInt638 = 2;
                            Class70.anInt1053 = Class163_Sub1.anInt2993;
                            Network.outgoingBuffer.putOpcode(248);
                            Network.outgoingBuffer.writeShort128LE(var5);
                            Network.outgoingBuffer.writeShort(Class164.anInt2050);
                            Network.outgoingBuffer.writeShort(Network.anInt1473);
                            Network.outgoingBuffer.writeIntV2(Class3_Sub28_Sub18.anInt3764);
                        }
                    }

                    if (var4 == 7) {
                        Network.outgoingBuffer.putOpcode(85);
                        Network.outgoingBuffer.writeIntV1(var3);
                        Network.outgoingBuffer.writeShort(var2);
                        Network.outgoingBuffer.putShortA(var5);
                        Network.anInt2330 = 0;
                        Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                        KeyboardListener.anInt1918 = var2;
                    }

                    if (var4 == 24) {
                        if (Class158.anInt2014 == 1) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2597 + -2595, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                        } else {
                            var14 = Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 0, false, 0, 2, var2, 0, 0, 2, var3, Player.player.anIntArray2767[0]);
                            if (!var14) {
                                Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                            }
                        }

                        Class36.anInt638 = 2;
                        Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Unsorted.anInt2958 = 0;
                        Network.outgoingBuffer.putOpcode(48);
                        Network.outgoingBuffer.putShortA(var2 - -Class131.anInt1716);
                        Network.outgoingBuffer.writeShort128LE(var5);
                        Network.outgoingBuffer.writeShortLE(Class82.anInt1152 + var3);
                    }

                    if (var4 == 38) {
                        Class163_Sub2_Sub1.method2224(var6, var3, var2);
                        Network.outgoingBuffer.putOpcode(233);
                        Network.outgoingBuffer.writeShort128LE(var3 + Class82.anInt1152);
                        Network.outgoingBuffer.putShortA(Class131.anInt1716 + var2);
                        Network.outgoingBuffer.writeShort128LE(RSInterface.anInt278);
                        Network.outgoingBuffer.writeIntV1(Network.anInt872);
                        Network.outgoingBuffer.putShortA((int) (var6 >>> 32) & Integer.MAX_VALUE);
                    }

                    if (var4 == 13) {
                        Network.outgoingBuffer.putOpcode(6);
                        Network.outgoingBuffer.writeInt(var3);
                        Network.outgoingBuffer.putShortA(var2);
                        Network.outgoingBuffer.writeShortLE(var5);
                        Network.anInt2330 = 0;
                        Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                        KeyboardListener.anInt1918 = var2;
                    }

                    if (57 == var4) {
                        var8 = Class3_Sub13_Sub22.players[var5];
                        if (null != var8) {
                            Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], Player.player.anIntArray2767[0]);
                            Class36.anInt638 = 2;
                            Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                            Class70.anInt1053 = Class163_Sub1.anInt2993;
                            Unsorted.anInt2958 = 0;
                            Network.outgoingBuffer.putOpcode(175);
                            Network.outgoingBuffer.putShortA(var5);
                        }
                    }

                    if (var4 == 22) {

                        if (MouseWheel.shiftDown) {
                            Network.outgoingBuffer.putOpcode(135);
                            Network.outgoingBuffer.putShortA(var5);
                            Network.outgoingBuffer.putShortA(var2);
                            Network.outgoingBuffer.writeIntV2(var3);
                            Network.anInt2330 = 0;
                            Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                            KeyboardListener.anInt1918 = var2;

                        } else {

                            Class25.method958((byte) -86);
                            var13 = Class7.getRSInterface(var3);
                            Class3_Sub28_Sub18.anInt3764 = var3;
                            Network.anInt1473 = var2;
                            Class164_Sub1.anInt3012 = 1;
                            Class164.anInt2050 = var5;
                            Class20.method909(var13);
                            RenderAnimationDefinition.aClass94_378 = RSString.stringCombiner(new RSString[]{
                                    ColorCore.ContextColor2, ItemDefinition.getItemDefinition(var5).name, ColorCore.ContextColor
                            });

                        }
                    } else {
                        if (var4 == 50) {
                            Class163_Sub2_Sub1.method2224(var6, var3, var2);
                            Network.outgoingBuffer.putOpcode(194);
                            Network.outgoingBuffer.writeShort128LE(var3 + Class82.anInt1152);
                            Network.outgoingBuffer.writeShortLE(Class131.anInt1716 + var2);
                            Network.outgoingBuffer.writeShort((int) (var6 >>> 32) & Integer.MAX_VALUE);
                        }

                        if (var4 == 48) {
                            Network.outgoingBuffer.putOpcode(154);
                            Network.outgoingBuffer.writeShortLE(var2);
                            Network.outgoingBuffer.writeIntV1(var3);
                            Network.outgoingBuffer.writeShort128LE(var5);
                            Network.anInt2330 = 0;
                            Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                            KeyboardListener.anInt1918 = var2;
                        }

                        if (var4 == 30) {
                            var8 = Class3_Sub13_Sub22.players[var5];
                            if (null != var8) {
                                Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], Player.player.anIntArray2767[0]);
                                Unsorted.anInt2958 = 0;
                                Class70.anInt1053 = Class163_Sub1.anInt2993;
                                Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                                Class36.anInt638 = 2;
                                Network.outgoingBuffer.putOpcode(68);
                                Network.outgoingBuffer.writeShort128LE(var5);
                            }
                        }

                        if (var4 == 43) {
                            Network.outgoingBuffer.putOpcode(153);
                            Network.outgoingBuffer.writeIntLE2(var3);
                            Network.outgoingBuffer.writeShortLE(var2);
                            Network.outgoingBuffer.writeShortLE(var5);
                            Network.anInt2330 = 0;
                            Unsorted.aClass11_1933 = Class7.getRSInterface(var3);
                            KeyboardListener.anInt1918 = var2;
                        }

                        if (var4 == 39) {
                            var14 = Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 0, false, 0, 2, var2, 0, 0, 2, var3, Player.player.anIntArray2767[0]);
                            if (!var14) {
                                Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                            }

                            Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                            Class70.anInt1053 = Class163_Sub1.anInt2993;
                            Class36.anInt638 = 2;
                            Unsorted.anInt2958 = 0;
                            Network.outgoingBuffer.putOpcode(73);
                            Network.outgoingBuffer.writeIntV1(Network.anInt872);
                            Network.outgoingBuffer.writeShort(Class82.anInt1152 + var3);
                            Network.outgoingBuffer.writeShort128LE(var5);
                            Network.outgoingBuffer.writeShort128LE(var2 + Class131.anInt1716);
                            Network.outgoingBuffer.writeShortLE(RSInterface.anInt278);
                        }

                        if (var4 == 12) {
                            Network.outgoingBuffer.putOpcode(82);
                            Network.outgoingBuffer.writeShort(RSInterface.anInt278);
                            Network.outgoingBuffer.writeIntV1(var3);
                            Network.outgoingBuffer.writeInt(Network.anInt872);
                            Network.outgoingBuffer.writeShort128LE(var2);
                        }

                        if (var4 == 36) {
                            if (var5 == 0) {
                                ObjectDefinition.anInt1521 = 1;
                                Unsorted.method589(WorldListCountry.localPlane, var2, var3);
                            } else if (Class3_Sub13_Sub26.rights > 0 && ObjectDefinition.aBooleanArray1490[82] && ObjectDefinition.aBooleanArray1490[81]) {
                                Class30.method979(var2 + Class131.anInt1716, Class82.anInt1152 - -var3, WorldListCountry.localPlane);
                            } else {
                                Network.outgoingBuffer.putOpcode(179);
                                Network.outgoingBuffer.writeShort(var3 + Class82.anInt1152);
                                Network.outgoingBuffer.writeShort(var2 + Class131.anInt1716);
                            }
                        }

                        if (6 == var4) {
                            var8 = Class3_Sub13_Sub22.players[var5];
                            if (var8 != null) {
                                Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], Player.player.anIntArray2767[0]);
                                Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                                Unsorted.anInt2958 = 0;
                                Class36.anInt638 = 2;
                                Class70.anInt1053 = Class163_Sub1.anInt2993;
                                Network.outgoingBuffer.putOpcode(106);
                                Network.outgoingBuffer.writeShort(var5);
                            }
                        }

                        if (var4 == 20) {
                            if (1 == Class158.anInt2014) {
                                Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                            } else {
                                var14 = Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 0, false, 0, 2, var2, 0, 0, 2, var3, Player.player.anIntArray2767[0]);
                                if (!var14) {
                                    Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, Player.player.anIntArray2767[0]);
                                }
                            }

                            Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                            Unsorted.anInt2958 = 0;
                            Class70.anInt1053 = Class163_Sub1.anInt2993;
                            Class36.anInt638 = 2;
                            Network.outgoingBuffer.putOpcode(33);
                            Network.outgoingBuffer.writeShort(var5);
                            Network.outgoingBuffer.writeShort(Class131.anInt1716 + var2);
                            Network.outgoingBuffer.writeShortLE(Class82.anInt1152 + var3);
                        }

                        if (var4 == 16) {
                            var11 = NPC.npcs[var5];
                            if (null != var11) {
                                Class3_Sub28_Sub9.method582(Player.player.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], Player.player.anIntArray2767[0]);
                                Class70.anInt1053 = Class163_Sub1.anInt2993;
                                Unsorted.anInt2958 = 0;
                                Unsorted.anInt4062 = Class38_Sub1.anInt2614;
                                Class36.anInt638 = 2;
                                Network.outgoingBuffer.putOpcode(3);
                                Network.outgoingBuffer.writeShort128LE(var5);
                            }
                        }

                        if (Class164_Sub1.anInt3012 != 0) {
                            Class164_Sub1.anInt3012 = 0;
                            Class20.method909(Class7.getRSInterface(Class3_Sub28_Sub18.anInt3764));
                        }

                        if (GameObject.aBoolean1837) {
                            Class25.method958((byte) -36);
                        }

                        if (Unsorted.aClass11_1933 != null && Network.anInt2330 == 0) {
                            Class20.method909(Unsorted.aClass11_1933);
                        }

                    }
                }
            }
        } catch (RuntimeException var10) {
            throw ClientErrorException.clientError(var10, "i.E(" + 2597 + ',' + var1 + ')');
        }
    }

    final void method157(int var1, DataBuffer var2, boolean var3) {
        try {
            if (!var3) {
                method207(18, false, -19, 102L);
            }

            if (var1 == 0) {
                this.aBoolean3100 = var2.readUnsignedByte() == 1;
            } else if (var1 == 1) {
                this.aBoolean3104 = var2.readUnsignedByte() == 1;
            } else if (var1 == 2) {
                this.aBoolean2375 = var2.readUnsignedByte() == 1;
            }

        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "ej.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
        }
    }

    final int[][] method166(int var1, int var2) {
        try {
            if (var1 != -1) {
                method207(-98, true, 95, 79L);
            }

            int[][] var3 = this.aClass97_2376.method1594((byte) 54, var2);
            if (this.aClass97_2376.aBoolean1379) {
                int[][] var4 = this.method162(!this.aBoolean3104 ? var2 : -var2 + Class3_Sub20.anInt2487, 0, (byte) -105);
                int[] var5 = Objects.requireNonNull(var4)[0];
                int[] var7 = var4[2];
                int[] var6 = var4[1];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                int[] var8 = var3[0];
                int var11;
                if (this.aBoolean3100) {
                    for (var11 = 0; Class113.anInt1559 > var11; ++var11) {
                        var8[var11] = var5[RenderAnimationDefinition.anInt396 + -var11];
                        var9[var11] = var6[-var11 + RenderAnimationDefinition.anInt396];
                        var10[var11] = var7[RenderAnimationDefinition.anInt396 - var11];
                    }
                } else {
                    for (var11 = 0; var11 < Class113.anInt1559; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                }
            }

            return var3;
        } catch (RuntimeException var12) {
            throw ClientErrorException.clientError(var12, "ej.T(" + var1 + ',' + var2 + ')');
        }
    }

    final int[] method154(int var1, byte var2) {
        try {
            int[] var4 = this.aClass114_2382.method1709(var1);
            if (this.aClass114_2382.aBoolean1580) {
                int[] var5 = this.method152(0, !this.aBoolean3104 ? var1 : Class3_Sub20.anInt2487 + -var1, 32755);
                if (this.aBoolean3100) {
                    for (int var6 = 0; var6 < Class113.anInt1559; ++var6) {
                        var4[var6] = var5[-var6 + RenderAnimationDefinition.anInt396];
                    }
                } else {
                    ArrayUtils.arraycopy(var5, 0, var4, 0, Class113.anInt1559);
                }
            }

            return var4;
        } catch (RuntimeException var7) {
            throw ClientErrorException.clientError(var7, "ej.D(" + var1 + ',' + var2 + ')');
        }
    }

}

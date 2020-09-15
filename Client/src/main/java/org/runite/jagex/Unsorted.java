package org.runite.jagex;

import org.rs09.client.util.ArrayUtils;

import java.util.Objects;

public class Unsorted {
   public static boolean aBoolean2146 = false;
   public static int incomingOpcode = 0;
   public static int anInt2148 = 0;
   public static boolean aBoolean2150;
   public static boolean aBoolean2154;
   public static int[] anIntArray2157 = new int[50];
    static RSString  aClass94_946 = RSString.of(")2");
   static int anInt942;
   static int anInt944 = 0;
   static int anInt952;
   static int anInt963;
   public static int anInt144;
   public static int anInt136 = 0;
   public static RSString aClass94_132 = RSString.of("::");
   public static byte[][] aByteArrayArray125 = new byte[250][];
   public static RSString aClass94_119 = RSString.of("runes");
   public static int anInt120 = 255;
   public static byte[][][] aByteArrayArrayArray113 = new byte[4][104][104];
    static int anInt1037;
    static int anInt1038;
    static Class30 aClass30_1039;
    static boolean aBoolean1040 = false;
    static int anInt3695;
    static int anInt1042;
    static CacheIndex aClass153_1043;
   static RSString aClass94_995 = RSString.of("(Y<)4col>");
   static Class3_Sub28_Sub16[] aClass3_Sub28_Sub16Array996;
   static int maskUpdateCount = 0;
   static int anInt998 = 0;
   static int anInt999 = -1;
   static int wlPacketSize = 0;
   public static RSString aClass94_37 = RSString.of("0(U");
   public static RSString aClass94_38 = RSString.of("tbrefresh");
   public static int[] anIntArray39;
   public static int anInt40 = 0;
   public static IOHandler js5Connection;
   public static int anInt42 = 0;
   public static RSString[] aClass94Array45;
   public static short aShort46 = 256;
   public static boolean aBoolean47 = false;
   public static int anInt48 = 2;
   public static int[] anIntArray49;
   public static int anInt1234;
   public static Class33 aClass33_1238;
   public static Class61 aClass61_1242 = new Class61();
   public static int anInt1244 = -1;
   public static RSString aClass94_1932 = RSString.of(")4a=");
   public static RSInterface aClass11_1933;
   public static float[] aFloatArray1934 = new float[]{0.073F, 0.169F, 0.24F, 1.0F};
   public static RSString COMMAND_BREAK_CLIENT_CONNECTION = RSString.of("::clientdrop");
   public static Class8 aClass8_1936;
   public static Class3_Sub30_Sub1 aClass3_Sub30_Sub1_2942 = new Class3_Sub30_Sub1();
   public static int[] anIntArray2952 = new int[128];
   public static int anInt2958 = 0;
   public static Class61 aClass61_78 = new Class61();
   public static int anInt72 = 0;
   public static boolean[] aBooleanArray73 = new boolean[200];

   static void method2086() {
       try {
           int var1 = Class102.player.anInt2819 + Class3_Sub13_Sub18.anInt3216;
           int var2 = Class102.player.anInt2829 - -anInt42;
           if(-var1 + Class3_Sub13_Sub13.anInt3155 < -500 || -var1 + Class3_Sub13_Sub13.anInt3155 > 500 || anInt942 + -var2 < -500 || -var2 + anInt942 > 500) {
              Class3_Sub13_Sub13.anInt3155 = var1;
              anInt942 = var2;
           }

           if(var2 != anInt942) {
              anInt942 += (-anInt942 + var2) / 16;
           }

           if(var1 != Class3_Sub13_Sub13.anInt3155) {
              Class3_Sub13_Sub13.anInt3155 += (-Class3_Sub13_Sub13.anInt3155 + var1) / 16;
           }

           if(Class15.aBoolean346) {
              for(int var3 = 0; var3 < Class3_Sub23.anInt2537; ++var3) {
                 int var4 = Class133.inputTextCodeArray[var3];
                 if(98 == var4) {
                    Class3_Sub9.anInt2309 = -16 & Class3_Sub9.anInt2309 + 47;
                 } else if (var4 == 99) {
                     Class3_Sub9.anInt2309 = -16 & Class3_Sub9.anInt2309 - 17;
                 } else if (var4 == 96) {
                     GraphicDefinition.CAMERA_DIRECTION = GraphicDefinition.CAMERA_DIRECTION - 65 & -128;
                 } else if (var4 == 97) {
                     GraphicDefinition.CAMERA_DIRECTION = GraphicDefinition.CAMERA_DIRECTION + 191 & -128;
                 }
              }
           } else {
              if(ObjectDefinition.aBooleanArray1490[98]) {
                 Class27.anInt517 += (-Class27.anInt517 + 12) / 2;
              } else if(!ObjectDefinition.aBooleanArray1490[99]) {
                 Class27.anInt517 /= 2;
              } else {
                 Class27.anInt517 += (-Class27.anInt517 + -12) / 2;
              }

              if(!ObjectDefinition.aBooleanArray1490[96]) {
                 if(ObjectDefinition.aBooleanArray1490[97]) {
                    Class3_Sub5.anInt2281 += (-Class3_Sub5.anInt2281 + 24) / 2;
                 } else {
                    Class3_Sub5.anInt2281 /= 2;
                 }
              } else {
                 Class3_Sub5.anInt2281 += (-Class3_Sub5.anInt2281 + -24) / 2;
              }

              Class3_Sub9.anInt2309 += Class27.anInt517 / 2;
              GraphicDefinition.CAMERA_DIRECTION += Class3_Sub5.anInt2281 / 2;
           }

           Class47.method1098((byte)-94);
       } catch (RuntimeException var5) {
          throw Class44.clientError(var5, "uf.B(" + (byte) 68 + ')');
       }
    }

    static boolean method1529(int var0, int var1, int var2, int var3, int var4, int var6) {
       try {
          long var8 = Class157.method2174(var6, var1, var3 + var0);
          int var10;
          int var11;
          int var12;
          ObjectDefinition var13;
          int var14;
          int[] var15;
          int var16;
          if(var8 != 0) {
             var10 = 3 & (int)var8 >> 20;
             var11 = (508650 & (int)var8) >> 14;
             var12 = Integer.MAX_VALUE & (int)(var8 >>> 32);
             var13 = Class162.getObjectDefinition(var12);
             if(var13.anInt1516 == -1) {
                var14 = var2;
                if(var8 > 0) {
                   var14 = var4;
                }

                var15 = Class74.anIntArray1100;
                var16 = 4 * (-(var3 * 512) + '\uce00') + var1 * 4 + 24624;
                if(var11 == 0 || var11 == 2) {
                   if(var10 == 0) {
                      var15[var16] = var14;
                      var15[512 + var16] = var14;
                      var15[var16 - -1024] = var14;
                      var15[1536 + var16] = var14;
                   } else if(var10 == 1) {
                      var15[var16] = var14;
                      var15[1 + var16] = var14;
                      var15[var16 - -2] = var14;
                      var15[var16 - -3] = var14;
                   } else if (var10 == 2) {
                      var15[var16 - -3] = var14;
                      var15[var16 - -3 - -512] = var14;
                      var15[var16 - -3 + 1024] = var14;
                      var15[var16 + 3 + 1536] = var14;
                   } else {
                      var15[var16 + 1536] = var14;
                      var15[1536 + var16 - -1] = var14;
                      var15[var16 + 1538] = var14;
                      var15[3 + var16 + 1536] = var14;
                   }
                }

                if(var11 == 3) {
                   if(var10 == 0) {
                      var15[var16] = var14;
                   } else if(1 == var10) {
                      var15[var16 - -3] = var14;
                   } else if(var10 == 2) {
                      var15[var16 - -3 + 1536] = var14;
                   } else {
                      var15[var16 - -1536] = var14;
                   }
                }

                if(var11 == 2) {
                   if(var10 == 3) {
                      var15[var16] = var14;
                      var15[var16 - -512] = var14;
                      var15[var16 + 1024] = var14;
                      var15[1536 + var16] = var14;
                   } else if (var10 == 0) {
                      var15[var16] = var14;
                      var15[1 + var16] = var14;
                      var15[2 + var16] = var14;
                      var15[3 + var16] = var14;
                   } else if (var10 == 1) {
                      var15[var16 - -3] = var14;
                      var15[512 + 3 + var16] = var14;
                      var15[3 + (var16 - -1024)] = var14;
                      var15[1536 + var16 + 3] = var14;
                   } else {
                      var15[1536 + var16] = var14;
                      var15[var16 - -1536 + 1] = var14;
                      var15[1536 + var16 + 2] = var14;
                      var15[var16 + 1539] = var14;
                   }
                }
             } else if (Class15.method888(var1, var13, var0, 0, var3, var10)) {
                return false;
             }
          }

          var8 = Class3_Sub28_Sub5.method557(var6, var1, var0 + var3);
          if(var8 != 0L) {
             var10 = (int)var8 >> 20 & 3;
             var11 = ((int)var8 & 520964) >> 14;
             var12 = (int)(var8 >>> 32) & Integer.MAX_VALUE;
             var13 = Class162.getObjectDefinition(var12);
             if(var13.anInt1516 != -1) {
                if(Class15.method888(var1, var13, var0, 0, var3, var10)) {
                   return false;
                }
             } else if(var11 == 9) {
                var14 = 15658734;
                if(var8 > 0) {
                   var14 = 15597568;
                }

                var16 = var1 * 4 + (24624 - -(2048 * (103 - var3)));
                var15 = Class74.anIntArray1100;
                if(var10 == 0 || var10 == 2) {
                   var15[1536 + var16] = var14;
                   var15[var16 - -1025] = var14;
                   var15[var16 + 512 + 2] = var14;
                   var15[var16 - -3] = var14;
                } else {
                   var15[var16] = var14;
                   var15[var16 - -512 - -1] = var14;
                   var15[var16 - -1024 - -2] = var14;
                   var15[1536 + var16 - -3] = var14;
                }
             }
          }

          var8 = Class3_Sub2.method104(var6, var1, var3 + var0);
          if(var8 != 0L) {
             var10 = (int)var8 >> 20 & 3;
             var11 = (int)(var8 >>> 32) & Integer.MAX_VALUE;
             ObjectDefinition var18 = Class162.getObjectDefinition(var11);
             return var18.anInt1516 == -1 || !Class15.method888(var1, var18, var0, 0, var3, var10);
          }

          return true;
       } catch (RuntimeException var17) {
          throw Class44.clientError(var17, "na.N(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + 0 + ',' + var6 + ',' + true + ')');
       }
    }

    static int method1535(WorldListEntry var0, WorldListEntry var1, int var2, int var3, int var4, boolean var5, boolean var6) {
       try {
          int var7 = Class161.method2201(var1, var4, var2 + -5638, var0, var6);
          if(var7 == 0) {
             if(var2 != 5730) {
                return -76;
             } else if(var3 == -1) {
                return 0;
             } else {
                int var8 = Class161.method2201(var1, var3, var2 ^ 5651, var0, var5);
                return !var5?var8:-var8;
             }
          } else {
             return !var6?var7:-var7;
          }
       } catch (RuntimeException var9) {
          throw Class44.clientError(var9, "na.D(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
       }
    }

    static Class3_Sub28_Sub16_Sub2 method1537(CacheIndex var0, int var1) {
       try {
          if(Class140_Sub7.method2029((byte) -118, var0, var1)) {

             return Class117.method1722(-93);
          } else {
             return null;
          }
       } catch (RuntimeException var4) {
          throw Class44.clientError(var4, "na.GB(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + false + ')');
       }
    }

    static LDIndexedSprite method1539(int var2, CacheIndex var3) {
       try {
          //  System.out.println("RSString " + var2);
          return Class75_Sub4.method1351(var3, 0, var2, -30901)?Class77.method1364():null;
       } catch (RuntimeException var5) {
          throw Class44.clientError(var5, "na.MA(" + 0 + ',' + true + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
       }
    }

    static Class3_Sub28_Sub16 method1570(int var0, byte var1, boolean var2, int var3, boolean var4, int var5, int var6, boolean var7) {
       try {
          ItemDefinition item = Class38.getItemDefinition(var3, (byte)106);
          if(var6 > 1 && item.anIntArray804 != null) {
             int var9 = -1;

             for(int var10 = 0; var10 < 10; ++var10) {
                if(item.anIntArray766[var10] <= var6 && item.anIntArray766[var10] != 0) {
                   var9 = item.anIntArray804[var10];
                }
             }

             if(var9 != -1) {
                item = Class38.getItemDefinition(var9, (byte)84);
             }
          }

          Class140_Sub1_Sub2 var21 = item.method1120();
          if(null == var21) {
             return null;
          } else {
             Class3_Sub28_Sub16_Sub2 var22 = null;
             if(item.anInt791 == -1) {
                if(item.anInt762 != -1) {
                   var22 = (Class3_Sub28_Sub16_Sub2)method1570(var0, (byte)-107, true, item.anInt795, false, var5, var6, false);
                   if(null == var22) {
                      return null;
                   }
                }
             } else {
                var22 = (Class3_Sub28_Sub16_Sub2)method1570(0, (byte)116, true, item.anInt789, false, 1, 10, true);
                if(null == var22) {
                   return null;
                }
             }

             int[] var11 = Class74.anIntArray1100;
             int var12 = Class74.anInt1092;
             int var13 = Class74.anInt1094;
             int[] var14 = new int[4];
             Class74.method1325(var14);
             Class3_Sub28_Sub16_Sub2 var15 = new Class3_Sub28_Sub16_Sub2(36, 32);
             Class74.method1319(var15.anIntArray4081, 36, 32);
             Class51.method1134();
             Class51.method1145(16, 16);
             int var16 = item.anInt810;
             Class51.aBoolean843 = false;
             if(var7) {
                var16 = (int)((double)var16 * 1.5D);
             } else if(var5 == 2) {
                var16 = (int)(1.04D * (double)var16);
             }

             int var18 = Class51.anIntArray851[item.anInt786] * var16 >> 16;
             int var17 = Class51.anIntArray840[item.anInt786] * var16 >> 16;
             var21.method1893(item.anInt799, item.anInt768, item.anInt786, item.anInt792, var17 - (var21.method1871() / 2 + -item.anInt754), item.anInt754 + var18);
             if(var5 >= 1) {
                var15.method657(1);
                if(var5 >= 2) {
                   var15.method657(16777215);
                }

                Class74.method1319(var15.anIntArray4081, 36, 32);
             }

             if(var0 != 0) {
                var15.method668(var0);
             }

             if(item.anInt791 != -1) {
                Objects.requireNonNull(var22).method643(0, 0);
             } else if(-1 != item.anInt762) {
                Class74.method1319(Objects.requireNonNull(var22).anIntArray4081, 36, 32);
                var15.method643(0, 0);
                var15 = var22;
             }

             if(var4 && (item.stackingType == 1 || var6 != 1) && var6 != -1) {
                Class3_Sub13_Sub37.aClass3_Sub28_Sub17_Sub1_3440.method681(Class3_Sub7.itemStackColor(1000, var6), 0, 9, 16776960, 1);
             }

             Class74.method1319(var11, var12, var13);
             Class74.method1316(var14);
             Class51.method1134();
             Class51.aBoolean843 = true;
             return (Class3_Sub28_Sub16)(HDToolKit.highDetail && !var2?new Class3_Sub28_Sub16_Sub1(var15):var15);
          }
       } catch (RuntimeException var20) {
          throw Class44.clientError(var20, "na.WA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
       }
    }

    static RSString method802(int var0) {
        try {

            return Class163_Sub2_Sub1.aClass94Array4016[var0].length(-26) > 0 ?RenderAnimationDefinition.method903(new RSString[]{Class140_Sub7.aClass94Array2935[var0], TextCore.Spacer, Class163_Sub2_Sub1.aClass94Array4016[var0]}, (byte)-86):Class140_Sub7.aClass94Array2935[var0];
        } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "wa.RB(" + var0 + ',' + true + ')');
        }
    }

    public static void method83(byte var0) {
       try {
          ItemDefinition.stringsStack = null;
          if(var0 != 30) {
             method84((RSString)null, 89);
          }

          aClass61_78 = null;
          aBooleanArray73 = null;
       } catch (RuntimeException var2) {
          throw Class44.clientError(var2, "ab.H(" + var0 + ')');
       }
    }

   static void method1224(RSInterface var0, int var2, int var3) {
      try {
            if (0 == var0.aByte162) {
               var0.anInt210 = var0.y;
            } else if (var0.aByte162 == 1) {
               var0.anInt210 = (var2 - var0.anInt193) / 2 + var0.y;
            } else if (2 == var0.aByte162) {
               var0.anInt210 = var2 - var0.anInt193 - var0.y;
            } else if (var0.aByte162 == 3) {
               var0.anInt210 = var0.y * var2 >> 14;
            } else if (4 == var0.aByte162) {
               var0.anInt210 = (var2 * var0.y >> 14) + (-var0.anInt193 + var2) / 2;
            } else {
               var0.anInt210 = -(var2 * var0.y >> 14) + -var0.anInt193 + var2;
            }

            if (0 == var0.aByte273) {
               var0.anInt306 = var0.x;
            } else if (var0.aByte273 == 1) {
               var0.anInt306 = var0.x + (var3 - var0.anInt168) / 2;
            } else if (var0.aByte273 == 2) {
               var0.anInt306 = -var0.x + -var0.anInt168 + var3;
            } else if (3 == var0.aByte273) {
               var0.anInt306 = var0.x * var3 >> 14;
            } else if (4 == var0.aByte273) {
               var0.anInt306 = (var0.x * var3 >> 14) + (var3 - var0.anInt168) / 2;
            } else {
               var0.anInt306 = -(var3 * var0.x >> 14) + var3 + -var0.anInt168;
            }

            if (aBoolean1040 && (Client.method44(var0).anInt2205 != 0 || var0.type == 0)) {
               if (var0.anInt210 < 0) {
                  var0.anInt210 = 0;
               } else if (var0.anInt193 + var0.anInt210 > var2) {
                  var0.anInt210 = var2 + -var0.anInt193;
               }

               if (0 > var0.anInt306) {
                  var0.anInt306 = 0;
               } else if (var3 < var0.anInt306 - -var0.anInt168) {
                  var0.anInt306 = var3 + -var0.anInt168;
               }
            }

      } catch (RuntimeException var5) {
            throw Class44.clientError(var5, "ii.B(" + (var0 != null ? "{...}" : "null") + ',' + 23730 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static void method1225() {
      try {
            MouseListeningClass var1 = Class3_Sub28_Sub7_Sub1.aClass149_4047;
            synchronized (var1) {

               Class3_Sub13_Sub5.anInt3069 = GraphicDefinition.anInt549;
               Class126.anInt1676 = Class3_Sub21.anInt2493;
               Class130.anInt1709 = Class95.anInt1340;
               Class3_Sub28_Sub11.anInt3644 = Class140_Sub3.anInt2743;
               Class163_Sub1.anInt2993 = RenderAnimationDefinition.anInt362;
               ++Class3_Sub28_Sub7_Sub1.anInt4045;
               Class38_Sub1.anInt2614 = Class3_Sub13_Sub32.anInt3389;
               Class75.aLong1102 = Class140_Sub6.aLong2926;
               Class140_Sub3.anInt2743 = 0;
            }
      } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "ii.D(" + 18074 + ')');
      }
   }

    static void method848() {
       try {
          if(Class44.aFloat727 < NPC.aFloat3979) {
             Class44.aFloat727 = (float)((double)Class44.aFloat727 + (double)Class44.aFloat727 / 30.0D);
             if(NPC.aFloat3979 < Class44.aFloat727) {
                Class44.aFloat727 = NPC.aFloat3979;
             }

             Class3_Sub5.method117();
          } else if(NPC.aFloat3979 < Class44.aFloat727) {
             Class44.aFloat727 = (float)((double)Class44.aFloat727 - (double)Class44.aFloat727 / 30.0D);
             if(NPC.aFloat3979 > Class44.aFloat727) {
                Class44.aFloat727 = NPC.aFloat3979;
             }

             Class3_Sub5.method117();
          }

          if(Class82.anInt1150 != -1 && -1 != Class3_Sub13_Sub30.anInt3362) {
             int var1 = -Class3_Sub28_Sub1.anInt3536 + Class82.anInt1150;
             if(2 > var1 || var1 > 2) {
                var1 >>= 4;
             }

             int var2 = -Class3_Sub4.anInt2251 + Class3_Sub13_Sub30.anInt3362;
             if(var2 < 2 || var2 > 2) {
                var2 >>= 4;
             }

             Class3_Sub4.anInt2251 -= -var2;
             Class3_Sub28_Sub1.anInt3536 += var1;
             if(0 == var1 && 0 == var2) {
                Class82.anInt1150 = -1;
                Class3_Sub13_Sub30.anInt3362 = -1;
             }

             Class3_Sub5.method117();
          }

       } catch (RuntimeException var3) {
          throw Class44.clientError(var3, "bb.A(" + 4 + ')');
       }
    }

    static int bitwiseAnd(int var0, int var1) {
       try {
          return var0 & var1;
       } catch (RuntimeException var3) {
          throw Class44.clientError(var3, "qc.C(" + var0 + ',' + var1 + ')');
       }
    }

    static LDIndexedSprite[] method1281() {
       try {
          LDIndexedSprite[] var1 = new LDIndexedSprite[Class95.anInt1338];

          for(int var2 = 0; Class95.anInt1338 > var2; ++var2) {
             var1[var2] = new LDIndexedSprite(Class3_Sub15.anInt2426, Class133.anInt1748, Class164.anIntArray2048[var2], RSByteBuffer.anIntArray2591[var2], Class140_Sub7.anIntArray2931[var2], Class3_Sub13_Sub6.anIntArray3076[var2], Class163_Sub1.aByteArrayArray2987[var2], Class3_Sub13_Sub38.spritePalette);
          }

          Class39.method1035((byte)116);
          return var1;
       } catch (RuntimeException var3) {
          throw Class44.clientError(var3, "jg.A(" + 0 + ')');
       }
    }

    static void method1282(int var0, byte var1, int var2, int var3, int var4) {
       try {
          for(int var5 = 0; var5 < Class3_Sub28_Sub3.anInt3557; ++var5) {
             if(var0 < Class155.anIntArray1969[var5] - -Class3_Sub28_Sub18.anIntArray3768[var5] && var0 + var4 > Class155.anIntArray1969[var5] && var2 < Player.anIntArray3954[var5] - -Class140_Sub4.anIntArray2794[var5] && var3 + var2 > Player.anIntArray3954[var5]) {
                Class163_Sub1_Sub1.aBooleanArray4008[var5] = true;
             }
          }

       } catch (RuntimeException var7) {
          throw Class44.clientError(var7, "jg.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
       }
    }

   static Class3_Sub15 method1245(CacheIndex var1, int var2) {
      try {

            byte[] var3 = var1.method2138(var2);
            return var3 != null?new Class3_Sub15(var3):null;
      } catch (RuntimeException var4) {
            throw Class44.clientError(var4, "jb.F(" + 117 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static void method1250(int var0, boolean var1) {
      try {
            Class3_Sub10.aByteArrayArrayArray2339 = (byte[][][])null;
            Class44.anIntArrayArrayArray720 = (int[][][])null;
            if(var0 < 14) {
               method1250(10, true);
            }

            Class3_Sub28_Sub3.aClass11_3551 = null;
            RenderAnimationDefinition.aByteArrayArrayArray383 = (byte[][][])null;
            Class84.anIntArray1161 = null;
            CS2Script.aByteArrayArrayArray2452 = (byte[][][])null;
            if(var1 && null != RSByteBuffer.aClass3_Sub28_Sub3_2600) {
               Class3_Sub13_Sub19.aClass94_3220 = RSByteBuffer.aClass3_Sub28_Sub3_2600.aClass94_3561;
            } else {
               Class3_Sub13_Sub19.aClass94_3220 = null;
            }

            Class36.aByteArrayArrayArray640 = (byte[][][])null;
            Class3_Sub13_Sub33.aByteArrayArrayArray3390 = (byte[][][])null;
            Class29.anIntArrayArrayArray558 = (int[][][])null;
            Class146.anIntArrayArrayArray1903 = (int[][][])null;
            Class140_Sub3.anInt2737 = 0;
            RSByteBuffer.aClass3_Sub28_Sub3_2600 = null;
            Class84.aClass61_1162.method1211(-108);
            Class119.aClass131_1624 = null;
            Class3_Sub13_Sub30.anInt3362 = -1;
            Class75_Sub2.aClass33_2648 = null;
            Class91.aClass33_1305 = null;
            aClass33_1238 = null;
            Class161.aClass33_2034 = null;
            Class164_Sub2.aClass33_3019 = null;
            Class99.aClass33_1399 = null;
            Class75_Sub2.aClass33_2637 = null;
            Class119.aClass33_1626 = null;
            Class36.aClass3_Sub28_Sub16_637 = null;
            Class82.anInt1150 = -1;
            Class3_Sub13_Sub19.aClass3_Sub28_Sub16_Sub2_3221 = null;
      } catch (RuntimeException var3) {
            throw Class44.clientError(var3, "jb.E(" + var0 + ',' + var1 + ')');
      }
   }

   public static int[] method62() {
      try {

          int[] var8 = new int[2048];
         Class3_Sub13_Sub4 var9 = new Class3_Sub13_Sub4();
         var9.anInt3060 = 8;
         var9.anInt3058 = 4;
         var9.anInt3067 = 35;
         var9.anInt3056 = 8;
         var9.anInt3062 = (int)((float) 0.4 * 4096.0F);
         var9.aBoolean3065 = true;
         var9.method158(16251);
         Class3_Sub13_Sub3.method180(-106, 1, 2048);
         var9.method186(0, var8);
         return var8;
      } catch (RuntimeException var10) {
         throw Class44.clientError(var10, "qk.A(" + true + ',' + 14585 + ',' + 8 + ',' + 2048 + ',' + 4 + ',' + (float) 0.4 + ',' + 8 + ',' + 35 + ')');
      }
   }

   public static Class3_Sub13 method63(RSByteBuffer var1) {
      try {
         var1.readUnsignedByte();
         int var2 = var1.readUnsignedByte();
         Class3_Sub13 var3 = Class130.method1777(var2);
         Objects.requireNonNull(var3).anInt2381 = var1.readUnsignedByte();
         int var4 = var1.readUnsignedByte();
         for(int var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.readUnsignedByte();
            var3.method157(var6, var1, true);
         }

         var3.method158(16251);
         return var3;
      } catch (RuntimeException var7) {
         throw Class44.clientError(var7, "qk.B(" + (byte) -67 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   public static int method64(int var1) {
      try {
         return var1 >>> 8;
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "qk.D(" + true + ',' + var1 + ')');
      }
   }

   public static short[] method65(short[] var1) {
      try {
         if(null == var1) {
            return null;
         } else {
            short[] var2 = new short[var1.length];
            ArrayUtils.arraycopy(var1, 0, var2, 0, var1.length);
            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "vg.A(" + 23032 + ',' + "{...}" + ')');
      }
   }

   public static void method66(RSString var0, int var1, int var2, byte var3, int var4) {
      try {
         RSInterface var5 = Class3_Sub28_Sub16.method638(var4, var1);
         if(null != var5) {
            if(var5.anObjectArray314 != null) {
               CS2Script var6 = new CS2Script();
               var6.arguments = var5.anObjectArray314;
               var6.aClass11_2449 = var5;
               var6.aClass94_2439 = var0;
               var6.interfaceButtons = var2; // Set to 1 for jukebox/friends/all/game chat. set to non 1 for all other chat settings
               Class43.method1065(var6);
            }

            boolean var8 = true;
            if(0 < var5.anInt189) {
               var8 = Class3_Sub28_Sub19.method715(var5);
            }

            if(var8) {
               if(Client.method44(var5).method92(var2 - 1, (byte)-108)) {
                  if(1 == var2) {
                     Class3_Sub13_Sub1.outgoingBuffer.putOpcode(155);
                     Class3_Sub13_Sub1.outgoingBuffer.putInt(-120, var4);
                     Class3_Sub13_Sub1.outgoingBuffer.putShort(var1);
                  }

                  if(var3 < -7) {
                     if(var2 == 2) {
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(196);
                        Class3_Sub13_Sub1.outgoingBuffer.putInt(-122, var4);
                        Class3_Sub13_Sub1.outgoingBuffer.putShort(var1);
                     }

                     if(var2 == 3) {
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(124);
                        Class3_Sub13_Sub1.outgoingBuffer.putInt(-122, var4);
                        Class3_Sub13_Sub1.outgoingBuffer.putShort(var1);
                     }

                     if(var2 == 4) {
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(199);
                        Class3_Sub13_Sub1.outgoingBuffer.putInt(-126, var4);
                        Class3_Sub13_Sub1.outgoingBuffer.putShort(var1);
                     }

                     if(var2 == 5) {
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(234);
                        Class3_Sub13_Sub1.outgoingBuffer.putInt(-123, var4);
                        Class3_Sub13_Sub1.outgoingBuffer.putShort(var1);
                     }

                     if(6 == var2) {
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(168);
                        Class3_Sub13_Sub1.outgoingBuffer.putInt(-120, var4);
                        Class3_Sub13_Sub1.outgoingBuffer.putShort(var1);
                     }

                     if(var2 == 7) {
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(166);
                        Class3_Sub13_Sub1.outgoingBuffer.putInt(-123, var4);
                        Class3_Sub13_Sub1.outgoingBuffer.putShort(var1);
                     }

                     if(var2 == 8) {
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(64);
                        Class3_Sub13_Sub1.outgoingBuffer.putInt(-127, var4);
                        Class3_Sub13_Sub1.outgoingBuffer.putShort(var1);
                     }

                     if(var2 == 9) {
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(53);
                        Class3_Sub13_Sub1.outgoingBuffer.putInt(-123, var4);
                        Class3_Sub13_Sub1.outgoingBuffer.putShort(var1);
                     }

                     if(var2 == 10) {
                        Class3_Sub13_Sub1.outgoingBuffer.putOpcode(9);
                        Class3_Sub13_Sub1.outgoingBuffer.putInt(-125, var4);
                        Class3_Sub13_Sub1.outgoingBuffer.putShort(var1);
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw Class44.clientError(var7, "vg.D(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   public static void method68(int var0, Class140_Sub4 var2) {
      try {
         if(var2.anInt2800 <= Class44.anInt719) {
            if(var2.anInt2790 >= Class44.anInt719) {
               Class168.method2270(var2);
            } else {
               Class55.method1180((byte)-22, var2);
            }
         } else {
            Class140_Sub2.method1950(var2);
         }

         if(var2.anInt2819 < 128 || var2.anInt2829 < 128 || var2.anInt2819 >= 13184 || var2.anInt2829 >= 13184) {
            var2.anInt2771 = -1;
            var2.anInt2842 = -1;
            var2.anInt2800 = 0;
            var2.anInt2790 = 0;
            var2.anInt2819 = 128 * var2.anIntArray2767[0] - -(64 * var2.getSize());
            var2.anInt2829 = var2.anIntArray2755[0] * 128 + var2.getSize() * 64;
            var2.method1973(2279 + -2395);
         }

         if(var2 == Class102.player && (var2.anInt2819 < 1536 || var2.anInt2829 < 1536 || var2.anInt2819 >= 11776 || var2.anInt2829 >= 11776)) {
            var2.anInt2842 = -1;
            var2.anInt2800 = 0;
            var2.anInt2790 = 0;
            var2.anInt2771 = -1;
            var2.anInt2819 = var2.anIntArray2767[0] * 128 + var2.getSize() * 64;
            var2.anInt2829 = 128 * var2.anIntArray2755[0] + 64 * var2.getSize();
            var2.method1973(-98);
         }

         Class17.method904(65536, var2);
         RenderAnimationDefinition.method900(var2, -11973);
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "vg.C(" + var0 + ',' + 2279 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   public static void method1470(int var0, AnimationDefinition var1, int var2, int var3, boolean var4, int var5) {
       try {
           if(Class113.anInt1552 < 50) {
               if(var1.anIntArrayArray1867 != null && var1.anIntArrayArray1867.length > var5 && null != var1.anIntArrayArray1867[var5]) {
                   int var6 = var1.anIntArrayArray1867[var5][0];
                   int var7 = var6 >> 8;
                   int var10;
                   if(1 < var1.anIntArrayArray1867[var5].length) {
                       var10 = (int)((double)var1.anIntArrayArray1867[var5].length * Math.random());
                       if(0 < var10) {
                           var7 = var1.anIntArrayArray1867[var5][var10];
                       }
                   }

                   int var8 = var6 >> 5 & 7;
                   int var9 = var6 & 31;
                   if(var9 == 0) {
                       if(var4) {
                           Class3_Sub13_Sub6.method199(var8, var7, 0);
                       }

                   } else if (0 != Class14.anInt340) {
                       Class3_Sub25.anIntArray2550[Class113.anInt1552] = var7;
                       Class166.anIntArray2068[Class113.anInt1552] = var8;
                       int var11 = (-64 + var0) / 128;
                       var10 = (var3 + -64) / 128;
                       anIntArray2157[Class113.anInt1552] = 0;
                       Class102.aClass135Array2131[Class113.anInt1552] = null;
                       Class3_Sub13_Sub6.anIntArray3083[Class113.anInt1552] = var9 + (var10 << 16) + (var11 << 8);
                       if (var2 != 183921384) {
                           aClass33_1238 = (Class33) null;
                       }

                       ++Class113.anInt1552;
                   }
               }
           }
       } catch (RuntimeException var12) {
           throw Class44.clientError(var12, "ma.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
       }
   }

   public static void method1460(int var0, int var1, int var3, int var4, int var5, int var6) {
       try {
           if(Class101.anInt1425 <= var5 - var4 && Class3_Sub28_Sub18.anInt3765 >= var5 - -var4 && Class159.anInt2020 <= -var4 + var1 && Class57.anInt902 >= var4 + var1) {
               Class3_Sub13_Sub2.method175(var6, var0, var1, var3, var4, var5);
           } else {
               Class168.method2275(var3, var1, var4, var6, var0, var5);
           }

       } catch (RuntimeException var8) {
           throw Class44.clientError(var8, "ma.A(" + var0 + ',' + var1 + ',' + (byte) -113 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
       }
   }

   public static void method1469(int[] var0, int var1, int var2, int var3, int var4, int var5) {
       Class3_Sub2 var6 = Class75_Sub2.aClass3_Sub2ArrayArrayArray2638[var3][var4][var5];
       if(var6 != null) {
           Class126 var7 = var6.aClass126_2240;
           int var9;
           if(var7 == null) {
               Class35 var8 = var6.aClass35_2226;
               if(var8 != null) {
                   var9 = var8.anInt611;
                   int var10 = var8.anInt612;
                   int var11 = var8.anInt626;
                   int var12 = var8.anInt621;
                   int[] var13 = Class3_Sub13_Sub18.anIntArrayArray3215[var9];
                   int[] var14 = Class162.anIntArrayArray2039[var10];
                   int var15 = 0;
                   int var16;
                   if(var11 == 0) {
                       for(var16 = 0; var16 < 4; ++var16) {
                           if(var13[var14[var15++]] != 0) {
                               var0[var1] = var12;
                           }

                           if(var13[var14[var15++]] != 0) {
                               var0[var1 + 1] = var12;
                           }

                           if(var13[var14[var15++]] != 0) {
                               var0[var1 + 2] = var12;
                           }

                           if(var13[var14[var15++]] != 0) {
                               var0[var1 + 3] = var12;
                           }

                           var1 += var2;
                       }
                   } else {
                       for(var16 = 0; var16 < 4; ++var16) {
                           var0[var1] = var13[var14[var15++]] == 0?var11:var12;
                           var0[var1 + 1] = var13[var14[var15++]] == 0?var11:var12;
                           var0[var1 + 2] = var13[var14[var15++]] == 0?var11:var12;
                           var0[var1 + 3] = var13[var14[var15++]] == 0?var11:var12;
                           var1 += var2;
                       }
                   }

               }
           } else {
               int var17 = var7.anInt1673;
               if(var17 != 0) {
                   for(var9 = 0; var9 < 4; ++var9) {
                       var0[var1] = var17;
                       var0[var1 + 1] = var17;
                       var0[var1 + 2] = var17;
                       var0[var1 + 3] = var17;
                       var1 += var2;
                   }

               }
           }
       }
   }

   public static boolean method2096(int var0, int var1, int var2, long var3) {
      Class3_Sub2 var5 = Class75_Sub2.aClass3_Sub2ArrayArrayArray2638[var0][var1][var2];
      if(var5 == null) {
         return false;
      } else if(var5.aClass70_2234 != null && var5.aClass70_2234.aLong1048 == var3) {
         return true;
      } else if(var5.aClass19_2233 != null && var5.aClass19_2233.aLong428 == var3) {
         return true;
      } else if(var5.aClass12_2230 != null && var5.aClass12_2230.aLong328 == var3) {
         return true;
      } else {
         for(int var6 = 0; var6 < var5.anInt2223; ++var6) {
            if(var5.aClass25Array2221[var6].aLong498 == var3) {
               return true;
            }
         }

         return false;
      }
   }

   public static void method2099(int var1, CacheIndex var3, int var5) {
      try {
         Class101.aClass153_1423 = var3;
         Class132.anInt1741 = 0;
         Class3_Sub13_Sub39.anInt3463 = var1;
         Class3_Sub9.aBoolean2311 = false;
         Class10.anInt154 = 1;
         GraphicDefinition.anInt546 = 2;

         Class3_Sub13_Sub36.anInt3423 = var5;
      } catch (RuntimeException var8) {
         throw Class44.clientError(var8, "v.Q(" + true + ',' + var1 + ',' + 0 + ',' + (var3 != null?"{...}":"null") + ',' + false + ',' + var5 + ',' + 2 + ')');
      }
   }

   public static void updateLocalPosition() {
       try {
           GraphicDefinition.incomingBuffer.setBitAccess((byte) 118);
           int opcode = GraphicDefinition.incomingBuffer.getBits(1);
           if (opcode != 0) {
               int type = GraphicDefinition.incomingBuffer.getBits(2);
               if (0 == type) {
                   Class21.maskUpdateIndexes[maskUpdateCount++] = 2047;
               } else {
                   int var4;
                   int var5;
                   if (type == 1) { //Walk
                       var4 = GraphicDefinition.incomingBuffer.getBits(3);
                       Class102.player.walkStep(1, (byte) -128, var4);
                       var5 = GraphicDefinition.incomingBuffer.getBits(1);
                       if (var5 == 1) {
                           Class21.maskUpdateIndexes[maskUpdateCount++] = 2047;
                       }

                   } else if (2 == type) {
                       if (GraphicDefinition.incomingBuffer.getBits(1) == 1) {
                           var4 = GraphicDefinition.incomingBuffer.getBits(3);
                           Class102.player.walkStep(2, (byte) -104, var4);
                           var5 = GraphicDefinition.incomingBuffer.getBits(3);
                           Class102.player.walkStep(2, (byte) -126, var5);
                       } else {
                           var4 = GraphicDefinition.incomingBuffer.getBits(3);
                           Class102.player.walkStep(0, (byte) -109, var4);
                       }

                       var4 = GraphicDefinition.incomingBuffer.getBits(1);
                       if (var4 == 1) {
                           Class21.maskUpdateIndexes[maskUpdateCount++] = 2047;
                       }

                   } else if (type == 3) {
                       var4 = GraphicDefinition.incomingBuffer.getBits(7);
                       var5 = GraphicDefinition.incomingBuffer.getBits(1);
                       WorldListCountry.localPlane = GraphicDefinition.incomingBuffer.getBits(2);
                       int var6 = GraphicDefinition.incomingBuffer.getBits(1);
                       if (var6 == 1) {
                           Class21.maskUpdateIndexes[maskUpdateCount++] = 2047;
                       }

                       int var7 = GraphicDefinition.incomingBuffer.getBits(7);
                       Class102.player.method1981(var7, var5 == 1, var4);
                   }
               }
           }
       } catch (RuntimeException var8) {
           throw Class44.clientError(var8, "bg.G(" + (byte) 81 + ')');
       }
   }

   public static boolean method2103(int var0, int var1) {
       try {
           return var1 >= -78 || (var0 == 198 || 230 == var0 || var0 == 156 || var0 == 140 || 223 == var0);
       } catch (RuntimeException var3) {
           throw Class44.clientError(var3, "bg.P(" + var0 + ',' + var1 + ')');
       }
   }

   public static void method2104(RSInterface var0, boolean var1, int var2) {
       try {
           int var4 = var0.anInt240 != 0 ? var0.anInt240 : var0.anInt168;
           int var5 = var0.anInt252 != 0 ? var0.anInt252 : var0.anInt193;
           Class158.method2183(var0.anInt279, var1, var4, var5, GameObject.aClass11ArrayArray1834[var0.anInt279 >> 16]);
           if (var0.aClass11Array262 != null) {
               Class158.method2183(var0.anInt279, var1, var4, var5, var0.aClass11Array262);
           }

           Class3_Sub31 var6 = (Class3_Sub31) Class3_Sub13_Sub17.aClass130_3208.method1780((long) var0.anInt279);
           if (var6 != null) {
               Class75_Sub4.method1352(var5, var1, var6.anInt2602, var4);
           }

       } catch (RuntimeException var7) {
           throw Class44.clientError(var7, "bg.N(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
       }
   }

   public static void method84(RSString var0, int var1) {
      try {
         int var2 = Class100.method1602(var0);
         if(var2 != -1) {
            Class3_Sub28_Sub7.method565(Class119.aClass131_1624.aShortArray1727[var2], Class119.aClass131_1624.aShortArray1718[var2]);
         }
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "ab.N(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   public static void method87(int var0, int var1) {
      try {
         if(var0 >= -20) {
            method83((byte)44);
         }

         if(0 != var1) {
            if(var1 == 1) {
               Translation.englishToGerman(false);
            } else {
               if(2 != var1) {
                  throw new RuntimeException();
               }

               Translation.englishToFrench();
            }

         }
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "ab.K(" + var0 + ',' + var1 + ')');
      }
   }

   public static Class106[] method88() {
      try {

         if(Class56.aClass106Array890 == null) {
            Class106[] var1 = Class3_Sub28_Sub10_Sub2.method596(Class38.aClass87_665);
            Class106[] var2 = new Class106[var1.length];
            int var3 = 0;

            label58:
            for(int var4 = 0; var4 < var1.length; ++var4) {
               Class106 var5 = var1[var4];
               if((0 >= var5.anInt1450 || var5.anInt1450 >= 24) && var5.anInt1447 >= 800 && 600 <= var5.anInt1449) {
                  for(int var6 = 0; var3 > var6; ++var6) {
                     Class106 var7 = var2[var6];
                     if(var5.anInt1447 == var7.anInt1447 && var5.anInt1449 == var7.anInt1449) {
                        if(var7.anInt1450 < var5.anInt1450) {
                           var2[var6] = var5;
                        }
                        continue label58;
                     }
                  }

                  var2[var3] = var5;
                  ++var3;
               }
            }

            Class56.aClass106Array890 = new Class106[var3];
            ArrayUtils.arraycopy(var2, 0, Class56.aClass106Array890, 0, var3);
            int[] var9 = new int[Class56.aClass106Array890.length];

            for(int var10 = 0; Class56.aClass106Array890.length > var10; ++var10) {
               Class106 var11 = Class56.aClass106Array890[var10];
               var9[var10] = var11.anInt1449 * var11.anInt1447;
            }

            Class108.method1658(var9, Class56.aClass106Array890);
         }

         return Class56.aClass106Array890;
      } catch (RuntimeException var8) {
         throw Class44.clientError(var8, "ab.M(" + (byte) 28 + ')');
      }
   }

   public static void method89(CacheIndex var1, CacheIndex var2, CacheIndex var3, CacheIndex var4) {
      try {
         Class12.aClass153_323 = var2;
         Class97.aClass153_1378 = var1;
         Class3_Sub13_Sub29.aClass153_3361 = var3;
         Class119.aClass153_1628 = var4;

         GameObject.aClass11ArrayArray1834 = new RSInterface[Class3_Sub13_Sub29.aClass153_3361.method2121()][];
         Class130.aBooleanArray1703 = new boolean[Class3_Sub13_Sub29.aClass153_3361.method2121()];
      } catch (RuntimeException var6) {
         throw Class44.clientError(var6, "ab.J(" + true + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ',' + (var3 != null?"{...}":"null") + ',' + (var4 != null?"{...}":"null") + ')');
      }
   }
}

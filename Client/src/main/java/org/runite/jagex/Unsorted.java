package org.runite.jagex;

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

   static void method2086() {
       try {
           int var1 = Class102.player.anInt2819 + Class3_Sub13_Sub18.anInt3216;
           int var2 = Class102.player.anInt2829 - -InputStream_Sub1.anInt42;
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
             Class3.method84((RSString)null, 89);
          }

          Class3.aClass61_78 = null;
          Class3.aBooleanArray73 = null;
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

            if (Class69.aBoolean1040 && (Client.method44(var0).anInt2205 != 0 || var0.type == 0)) {
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
}

import java.io.IOException;
import java.net.Socket;

class Class127 {

   static int[] anIntArray1679 = new int[14];
   static Class153 aClass153_1680;
   static int[] anIntArray1681;


   static final void method1752(byte var0) {
      try {
         if(0 != Class3_Sub13_Sub25.anInt3305 && 5 != Class3_Sub13_Sub25.anInt3305) {
            try {
               if(~(++Class50.anInt820) < -2001) {
                  if(Class3_Sub15.aClass89_2429 != null) {
                     Class3_Sub15.aClass89_2429.method1468(14821);
                     Class3_Sub15.aClass89_2429 = null;
                  }

                  if(-2 >= ~Class166.anInt2079) {
                     Class158.anInt2005 = -5;
                     Class3_Sub13_Sub25.anInt3305 = 0;
                     return;
                  }

                  Class50.anInt820 = 0;
                  if(Class140_Sub6.anInt2894 != Class162.anInt2036) {
                     Class140_Sub6.anInt2894 = Class162.anInt2036;
                  } else {
                     Class140_Sub6.anInt2894 = Class26.anInt506;
                  }

                  Class3_Sub13_Sub25.anInt3305 = 1;
                  ++Class166.anInt2079;
               }

               if(Class3_Sub13_Sub25.anInt3305 == 1) {
                  Class3_Sub9.aClass64_2318 = Class38.aClass87_665.method1441((byte)8, Class38_Sub1.aString2611, Class140_Sub6.anInt2894);
                  Class3_Sub13_Sub25.anInt3305 = 2;
               }

               if(-3 == ~Class3_Sub13_Sub25.anInt3305) {
                  if(~Class3_Sub9.aClass64_2318.anInt978 == -3) {
                     throw new IOException();
                  }

                  if(1 != Class3_Sub9.aClass64_2318.anInt978) {
                     return;
                  }

                  Class3_Sub15.aClass89_2429 = new Class89((Socket)Class3_Sub9.aClass64_2318.anObject974, Class38.aClass87_665);
                  Class3_Sub9.aClass64_2318 = null;
                  long var1 = Class3_Sub13_Sub16.aLong3202 = Class3_Sub28_Sub14.aClass94_3675.method1578(-106);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.anInt2595 = 0;
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method752((byte)-40, 14);
                  int var3 = (int)(var1 >> 16 & 31L);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method752((byte)-39, var3);
                  Class3_Sub15.aClass89_2429.method1464(false, 0, Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.aByteArray2590, 2);
                  if(Class44_Sub1.aClass155_2627 != null) {
                     Class44_Sub1.aClass155_2627.method2159(106);
                  }

                  if(Class3_Sub21.aClass155_2491 != null) {
                     Class3_Sub21.aClass155_2491.method2159(var0 + 88);
                  }

                  int var4 = Class3_Sub15.aClass89_2429.method1462(var0 ^ -9);
                  if(Class44_Sub1.aClass155_2627 != null) {
                     Class44_Sub1.aClass155_2627.method2159(68);
                  }

                  if(null != Class3_Sub21.aClass155_2491) {
                     Class3_Sub21.aClass155_2491.method2159(109);
                  }

                  if(~var4 != -1) {
                     Class158.anInt2005 = var4;
                     Class3_Sub13_Sub25.anInt3305 = 0;
                     Class3_Sub15.aClass89_2429.method1468(var0 + 14830);
                     Class3_Sub15.aClass89_2429 = null;
                     return;
                  }

                  Class3_Sub13_Sub25.anInt3305 = 3;
               }

               if(Class3_Sub13_Sub25.anInt3305 == 3) {
                  if(~Class3_Sub15.aClass89_2429.method1465(-18358) > -9) {
                     return;
                  }

                  Class3_Sub15.aClass89_2429.method1461(0, 8, -18455, Class28.aClass3_Sub30_Sub1_532.aByteArray2590);
                  Class28.aClass3_Sub30_Sub1_532.anInt2595 = 0;
                  Class3_Sub13_Sub27.aLong3338 = Class28.aClass3_Sub30_Sub1_532.method756(-88);
                  int[] var9 = new int[4];
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.anInt2595 = 0;
                  var9[2] = (int)(Class3_Sub13_Sub27.aLong3338 >> 32);
                  var9[3] = (int)Class3_Sub13_Sub27.aLong3338;
                  var9[1] = (int)(Math.random() * 9.9999999E7D);
                  var9[0] = (int)(Math.random() * 9.9999999E7D);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method752((byte)-30, 10);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method738(-120, var9[0]);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method738(-125, var9[1]);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method738(-127, var9[2]);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method738(var0 + -111, var9[3]);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method740(Class3_Sub28_Sub14.aClass94_3675.method1578(var0 + -116), var0 + -2037491431);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method745(0, Class3_Sub28_Sub14.aClass94_3673);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method800(Class3_Sub13_Sub14.aBigInteger3162, Class3_Sub13_Sub37.aBigInteger3441, -296);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.anInt2595 = 0;
                  if(40 == Class143.anInt1875) {
                     Class151_Sub1.aClass3_Sub30_Sub1_2942.method752((byte)-81, 18);
                  } else {
                     Class151_Sub1.aClass3_Sub30_Sub1_2942.method752((byte)-100, 16);
                  }

                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method804(-20037, Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.anInt2595 + 159 - -Class3_Sub13_Sub33.method326((byte)111, Class163_Sub2.aClass94_2996));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(var0 ^ 113, 530);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method752((byte)-114, Class7.anInt2161);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method752((byte)-122, !Class3_Sub28_Sub19.aBoolean3779?0:1);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method752((byte)-103, 1);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method752((byte)-88, Class83.method1411(0));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method804(-20037, Class23.anInt454);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method804(-20037, Class140_Sub7.anInt2934);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method752((byte)-39, Class3_Sub28_Sub14.anInt3671);
                  Class81.method1397(Class151_Sub1.aClass3_Sub30_Sub1_2942, true);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method745(0, Class163_Sub2.aClass94_2996);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(var0 ^ 118, Class3_Sub26.anInt2554);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-121, Class84.method1421(-2));
                  Class140_Sub2.aBoolean2705 = true;
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method804(-20037, Class113.anInt1543);
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-122, Class75_Sub3.aClass153_2660.method2118((byte)-126));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(var0 ^ 115, Class3_Sub28_Sub19.aClass153_3772.method2118((byte)-125));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-123, Class164.aClass153_2052.method2118((byte)-128));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-123, Class140_Sub3.aClass153_2727.method2118((byte)-128));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-123, Class146.aClass153_1902.method2118((byte)-125));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-125, Class3_Sub13_Sub6.aClass153_3077.method2118((byte)-123));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-122, Class75_Sub2.aClass153_2645.method2118((byte)-126));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-121, Class159.aClass153_2019.method2118((byte)-125));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(var0 ^ 127, Class140_Sub6.aClass153_2906.method2118((byte)-125));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(var0 ^ 117, Class3_Sub13_Sub28.aClass153_3352.method2118((byte)-127));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-123, Class3_Sub13_Sub25.aClass153_3304.method2118((byte)-127));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-124, Class3_Sub28.aClass153_2573.method2118((byte)-118));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-126, Class3_Sub1.aClass153_2203.method2118((byte)-122));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(var0 ^ 115, Class153.aClass153_1948.method2118((byte)-118));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-122, Class3_Sub19.aClass153_2474.method2118((byte)-124));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-121, Class140_Sub4_Sub2.aClass153_3994.method2118((byte)-122));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-124, Class168.aClass153_2097.method2118((byte)-123));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(var0 + -117, Class140_Sub4_Sub2.aClass153_3993.method2118((byte)-124));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-128, Class101.aClass153_1428.method2118((byte)-122));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-124, Class100.aClass153_1410.method2118((byte)-127));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-120, Class3_Sub13_Sub36.aClass153_3429.method2118((byte)-123));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-120, Class70.aClass153_1058.method2118((byte)-117));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(var0 ^ 127, Class3_Sub22.aClass153_2528.method2118((byte)-117));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-125, Class133.aClass153_1751.method2118((byte)-122));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-127, Class140_Sub7.aClass153_2939.method2118((byte)-118));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-126, Class3_Sub4.aClass153_2258.method2118((byte)-128));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-120, Class97.aClass153_1376.method2118((byte)-123));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method738(-120, Class132.aClass153_1735.method2118((byte)-124));
                  Class151_Sub1.aClass3_Sub30_Sub1_2942.method753(Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.aByteArray2590, 0, Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.anInt2595, var0 + 117);
                  Class3_Sub15.aClass89_2429.method1464(false, 0, Class151_Sub1.aClass3_Sub30_Sub1_2942.aByteArray2590, Class151_Sub1.aClass3_Sub30_Sub1_2942.anInt2595);
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method814(var9, false);

                  for(int var2 = 0; ~var2 > -5; ++var2) {
                     var9[var2] += 50;
                  }

                  Class28.aClass3_Sub30_Sub1_532.method814(var9, false);
                  Class3_Sub13_Sub25.anInt3305 = 4;
               }

               if(-5 == ~Class3_Sub13_Sub25.anInt3305) {
                  if(~Class3_Sub15.aClass89_2429.method1465(-18358) > -2) {
                     return;
                  }

                  int var10 = Class3_Sub15.aClass89_2429.method1462(0);
                  if(~var10 != -22) {
                     if(var10 != 29) {
                        if(var10 == 1) {
                           Class3_Sub13_Sub25.anInt3305 = 5;
                           Class158.anInt2005 = var10;
                           return;
                        }

                        if(2 != var10) {
                           if(~var10 != -16) {
                              if(23 == var10 && ~Class166.anInt2079 > -2) {
                                 Class3_Sub13_Sub25.anInt3305 = 1;
                                 ++Class166.anInt2079;
                                 Class50.anInt820 = 0;
                                 Class3_Sub15.aClass89_2429.method1468(14821);
                                 Class3_Sub15.aClass89_2429 = null;
                                 return;
                              }

                              Class158.anInt2005 = var10;
                              Class3_Sub13_Sub25.anInt3305 = 0;
                              Class3_Sub15.aClass89_2429.method1468(var0 + 14830);
                              Class3_Sub15.aClass89_2429 = null;
                              return;
                           }

                           Class3_Sub13_Sub25.anInt3305 = 0;
                           Class158.anInt2005 = var10;
                           return;
                        }

                        Class3_Sub13_Sub25.anInt3305 = 8;
                     } else {
                        Class3_Sub13_Sub25.anInt3305 = 10;
                     }
                  } else {
                     Class3_Sub13_Sub25.anInt3305 = 7;
                  }
               }

               if(6 == Class3_Sub13_Sub25.anInt3305) {
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.anInt2595 = 0;
                  Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method816(0, 17);
                  Class3_Sub15.aClass89_2429.method1464(false, 0, Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.aByteArray2590, Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.anInt2595);
                  Class3_Sub13_Sub25.anInt3305 = 4;
                  return;
               }

               if(Class3_Sub13_Sub25.anInt3305 == 7) {
                  if(-2 >= ~Class3_Sub15.aClass89_2429.method1465(var0 + -18349)) {
                     Class3_Sub13_Sub34.anInt3413 = 60 * (3 + Class3_Sub15.aClass89_2429.method1462(var0 + 9));
                     Class3_Sub13_Sub25.anInt3305 = 0;
                     Class158.anInt2005 = 21;
                     Class3_Sub15.aClass89_2429.method1468(var0 + 14830);
                     Class3_Sub15.aClass89_2429 = null;
                     return;
                  }

                  return;
               }

               if(-11 == ~Class3_Sub13_Sub25.anInt3305) {
                  if(1 <= Class3_Sub15.aClass89_2429.method1465(var0 + -18349)) {
                     Class3_Sub26.anInt2561 = Class3_Sub15.aClass89_2429.method1462(var0 ^ -9);
                     Class3_Sub13_Sub25.anInt3305 = 0;
                     Class158.anInt2005 = 29;
                     Class3_Sub15.aClass89_2429.method1468(14821);
                     Class3_Sub15.aClass89_2429 = null;
                     return;
                  }

                  return;
               }

               if(Class3_Sub13_Sub25.anInt3305 == 8) {
                  if(~Class3_Sub15.aClass89_2429.method1465(-18358) > -15) {
                     return;
                  }

                  Class3_Sub15.aClass89_2429.method1461(0, 14, -18455, Class28.aClass3_Sub30_Sub1_532.aByteArray2590);
                  Class28.aClass3_Sub30_Sub1_532.anInt2595 = 0;
                  Class3_Sub13_Sub26.anInt3320 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-34);
                  Class3_Sub28_Sub19.anInt3775 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-86);
                  Class3_Sub15.aBoolean2433 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-67) == 1;
                  Class121.aBoolean1641 = 1 == Class28.aClass3_Sub30_Sub1_532.method803((byte)-25);
                  Class3_Sub28_Sub10_Sub1.aBoolean4063 = ~Class28.aClass3_Sub30_Sub1_532.method803((byte)-39) == -2;
                  Class3_Sub13_Sub14.aBoolean3166 = 1 == Class28.aClass3_Sub30_Sub1_532.method803((byte)-28);
                  Canvas_Sub2.aBoolean29 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-120) == 1;
                  Class3_Sub1.anInt2211 = Class28.aClass3_Sub30_Sub1_532.method737(var0 + 10);
                  Class3_Sub13_Sub29.aBoolean3358 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-127) == 1;
                  Class2.aBoolean66 = ~Class28.aClass3_Sub30_Sub1_532.method803((byte)-112) == -2;
                  Class113.method1702((byte)-124, Class2.aBoolean66);
                  Class8.method845(Class2.aBoolean66, 255);
                  if(!Class3_Sub28_Sub19.aBoolean3779) {
                     if((!Class3_Sub15.aBoolean2433 || Class3_Sub28_Sub10_Sub1.aBoolean4063) && !Class3_Sub13_Sub29.aBoolean3358) {
                        try {
                           Class27.aClass94_516.method1577(-1857, Class38.aClass87_665.anApplet1219);
                        } catch (Throwable var5) {
                           ;
                        }
                     } else {
                        try {
                           Class97.aClass94_1374.method1577(-1857, Class38.aClass87_665.anApplet1219);
                        } catch (Throwable var6) {
                           ;
                        }
                     }
                  }

                  Class94.anInt2147 = Class28.aClass3_Sub30_Sub1_532.method817(0);
                  Class130.anInt1704 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                  Class3_Sub13_Sub25.anInt3305 = 9;
               }

               if(-10 == ~Class3_Sub13_Sub25.anInt3305) {
                  if(~Class3_Sub15.aClass89_2429.method1465(-18358) > ~Class130.anInt1704) {
                     return;
                  }

                  Class28.aClass3_Sub30_Sub1_532.anInt2595 = 0;
                  Class3_Sub15.aClass89_2429.method1461(0, Class130.anInt1704, -18455, Class28.aClass3_Sub30_Sub1_532.aByteArray2590);
                  Class158.anInt2005 = 2;
                  Class3_Sub13_Sub25.anInt3305 = 0;
                  Class142.method2061(true);
                  Class3_Sub28_Sub7.anInt3606 = -1;
                  Class39.method1033(0, false);
                  Class94.anInt2147 = -1;
                  return;
               }

               if(var0 != -9) {
                  aClass153_1680 = (Class153)null;
               }
            } catch (IOException var7) {
               if(null != Class3_Sub15.aClass89_2429) {
                  Class3_Sub15.aClass89_2429.method1468(14821);
                  Class3_Sub15.aClass89_2429 = null;
               }

               if(Class166.anInt2079 >= 1) {
                  Class3_Sub13_Sub25.anInt3305 = 0;
                  Class158.anInt2005 = -4;
               } else {
                  Class3_Sub13_Sub25.anInt3305 = 1;
                  Class50.anInt820 = 0;
                  ++Class166.anInt2079;
                  if(~Class162.anInt2036 == ~Class140_Sub6.anInt2894) {
                     Class140_Sub6.anInt2894 = Class26.anInt506;
                  } else {
                     Class140_Sub6.anInt2894 = Class162.anInt2036;
                  }
               }
            }

         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ri.A(" + var0 + ')');
      }
   }

   static final int method1753(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   public static void method1754(int var0) {
      try {
         aClass153_1680 = null;
         anIntArray1679 = null;
         if(var0 >= -49) {
            method1752((byte)102);
         }

         anIntArray1681 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ri.B(" + var0 + ')');
      }
   }

}

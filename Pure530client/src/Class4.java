import java.io.IOException;

final class Class4 {

   static int anInt79;
   static int anInt80 = 0;
   static byte[][][] aByteArrayArrayArray81;
   static Class61 aClass61_82 = new Class61();
   static short aShort83 = 32767;
   static Class16 aClass16_84 = new Class16();
   static Class94 aClass94_85 = Class3_Sub4.method108("overlay", (byte)-126);
   static int anInt86 = 0;
   static int anInt87 = 0;
   static Class11 aClass11_88 = null;


   static final int method823(int var0, int var1, int var2, int var3) {
      try {
         if(var2 >= -76) {
            aShort83 = -91;
         }

         return (8 & Class9.aByteArrayArrayArray113[var3][var1][var0]) == 0?(~var3 < -1 && -1 != ~(Class9.aByteArrayArrayArray113[1][var1][var0] & 2)?-1 + var3:var3):0;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ac.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method824(long[] var0, Object[] var1, int var2) {
      try {
         int var3 = 38 % ((var2 - 28) / 52);
         Class134.method1809(var0.length - 1, var0, 122, 0, var1);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ac.E(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static final void method825(byte var0, int var1) {
      try {
         int var2 = -51 % ((26 - var0) / 33);
         Class3_Sub28_Sub6 var3 = Class3_Sub24_Sub3.method466(4, 1, var1);
         var3.a(true);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ac.D(" + var0 + ',' + var1 + ')');
      }
   }

   static final int method826(Class94 var0, int var1) {
      try {
         if(var1 != -1) {
            method826((Class94)null, 65);
         }

         if(var0 != null) {
            for(int var2 = 0; Class8.anInt104 > var2; ++var2) {
               if(var0.method1531(var1 ^ 107, Class70.aClass94Array1046[var2])) {
                  return var2;
               }
            }

            return -1;
         } else {
            return -1;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ac.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final boolean method827(byte var0) throws IOException {
      try {
         if(Class3_Sub15.aClass89_2429 == null) {
            return false;
         } else {
            int var1 = Class3_Sub15.aClass89_2429.method1465(-18358);
            if(0 == var1) {
               return false;
            } else {
               if(~Class94.anInt2147 == 0) {
                  --var1;
                  Class3_Sub15.aClass89_2429.method1461(0, 1, var0 ^ 18500, Class28.aClass3_Sub30_Sub1_532.aByteArray2590);
                  Class28.aClass3_Sub30_Sub1_532.anInt2595 = 0;
                  Class94.anInt2147 = Class28.aClass3_Sub30_Sub1_532.method817(0);
                  Class130.anInt1704 = Class75_Sub4.anIntArray2668[Class94.anInt2147];
               }

               if(Class130.anInt1704 == -1) {
                  if(0 >= var1) {
                     return false;
                  }

                  Class3_Sub15.aClass89_2429.method1461(0, 1, -18455, Class28.aClass3_Sub30_Sub1_532.aByteArray2590);
                  --var1;
                  Class130.anInt1704 = Class28.aClass3_Sub30_Sub1_532.aByteArray2590[0] & 255;
               }

               if(-2 == Class130.anInt1704) {
                  if(~var1 >= -2) {
                     return false;
                  }

                  var1 -= 2;
                  Class3_Sub15.aClass89_2429.method1461(0, 2, -18455, Class28.aClass3_Sub30_Sub1_532.aByteArray2590);
                  Class28.aClass3_Sub30_Sub1_532.anInt2595 = 0;
                  Class130.anInt1704 = Class28.aClass3_Sub30_Sub1_532.method737(1);
               }

               if(~Class130.anInt1704 < ~var1) {
                  return false;
               } else {
                  Class28.aClass3_Sub30_Sub1_532.anInt2595 = 0;
                  Class3_Sub15.aClass89_2429.method1461(0, Class130.anInt1704, -18455, Class28.aClass3_Sub30_Sub1_532.aByteArray2590);
                  Class24.anInt469 = Class7.anInt2166;
                  Class7.anInt2166 = Class3_Sub29.anInt2582;
                  Class3_Sub29.anInt2582 = Class94.anInt2147;
                  Class3_Sub28_Sub16.anInt3699 = 0;
                  int var20;
                  if(60 == Class94.anInt2147) {
                     var20 = Class28.aClass3_Sub30_Sub1_532.method758(var0 + 188);
                     byte var69 = Class28.aClass3_Sub30_Sub1_532.method763((byte)100);
                     Class3_Sub13_Sub23.method281((byte)99, var69, var20);
                     Class94.anInt2147 = -1;
                     return true;
                  } else {
                     int var5;
                     Class94 var24;
                     if(Class94.anInt2147 == 115) {
                        var20 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                        var24 = Class28.aClass3_Sub30_Sub1_532.method776(true);
                        Object[] var71 = new Object[var24.method1540(-92) - -1];

                        for(var5 = var24.method1540(var0 ^ 79) + -1; -1 >= ~var5; --var5) {
                           if(115 == var24.method1569(var5, (byte)-45)) {
                              var71[1 + var5] = Class28.aClass3_Sub30_Sub1_532.method776(true);
                           } else {
                              var71[1 + var5] = new Integer(Class28.aClass3_Sub30_Sub1_532.method748(Class93.method1519(var0, 502942853)));
                           }
                        }

                        var71[0] = new Integer(Class28.aClass3_Sub30_Sub1_532.method748(-502942936));
                        if(Class146.method2079(var20, (byte)-25)) {
                           Class3_Sub16 var66 = new Class3_Sub16();
                           var66.anObjectArray2448 = var71;
                           Class43.method1065(1073376993, var66);
                        }

                        Class94.anInt2147 = -1;
                        return true;
                     } else {
                        long var4;
                        boolean var31;
                        int var30;
                        Class94 var41;
                        if(-71 == ~Class94.anInt2147) {
                           Class94 var70 = Class28.aClass3_Sub30_Sub1_532.method776(true);
                           if(!var70.method1550((byte)-60, Class117.aClass94_1614)) {
                              if(!var70.method1550((byte)-47, Class30.aClass94_567)) {
                                 if(var70.method1550((byte)-98, Class3_Sub13_Sub26.aClass94_3330)) {
                                    var31 = false;
                                    var24 = var70.method1557(var70.method1551(Class155.aClass94_1970, 96), 0, 0);
                                    var4 = var24.method1578(-109);

                                    for(var30 = 0; ~Class3_Sub28_Sub5.anInt3591 < ~var30; ++var30) {
                                       if(var4 == Class114.aLongArray1574[var30]) {
                                          var31 = true;
                                          break;
                                       }
                                    }

                                    if(!var31 && ~Class44_Sub1.anInt2622 == -1) {
                                       Class3_Sub30_Sub1.method805(var24, 10, Class3_Sub28_Sub14.aClass94_3672, -1);
                                    }
                                 } else if(var70.method1550((byte)-128, Class3_Sub20.aClass94_2482)) {
                                    var24 = var70.method1557(var70.method1551(Class3_Sub20.aClass94_2482, var0 ^ -50), 0, 0);
                                    Class3_Sub30_Sub1.method805(Class3_Sub28_Sub14.aClass94_3672, 11, var24, -1);
                                 } else if(!var70.method1550((byte)-29, Class140_Sub4_Sub2.aClass94_3998)) {
                                    if(var70.method1550((byte)-80, Class143.aClass94_1877)) {
                                       var24 = var70.method1557(var70.method1551(Class143.aClass94_1877, 121), 0, 0);
                                       if(Class44_Sub1.anInt2622 == 0) {
                                          Class3_Sub30_Sub1.method805(Class3_Sub28_Sub14.aClass94_3672, 13, var24, -1);
                                       }
                                    } else if(!var70.method1550((byte)-42, Class27.aClass94_514)) {
                                       if(!var70.method1550((byte)-41, Class63.aClass94_965)) {
                                          if(var70.method1550((byte)-110, Class3_Sub13_Sub30.aClass94_3368)) {
                                             var24 = var70.method1557(var70.method1551(Class155.aClass94_1970, var0 + 138), 0, 0);
                                             var4 = var24.method1578(var0 + -23);
                                             var31 = false;

                                             for(var30 = 0; ~Class3_Sub28_Sub5.anInt3591 < ~var30; ++var30) {
                                                if(~var4 == ~Class114.aLongArray1574[var30]) {
                                                   var31 = true;
                                                   break;
                                                }
                                             }

                                             if(!var31 && Class44_Sub1.anInt2622 == 0) {
                                                Class3_Sub30_Sub1.method805(var24, 16, Class3_Sub28_Sub14.aClass94_3672, -1);
                                             }
                                          } else if(var70.method1550((byte)-41, Class94.aClass94_2155)) {
                                             var24 = var70.method1557(var70.method1551(Class155.aClass94_1970, var0 + 189), var0 + 83, 0);
                                             var31 = false;
                                             var4 = var24.method1578(-122);

                                             for(var30 = 0; ~Class3_Sub28_Sub5.anInt3591 < ~var30; ++var30) {
                                                if(~Class114.aLongArray1574[var30] == ~var4) {
                                                   var31 = true;
                                                   break;
                                                }
                                             }

                                             if(!var31 && Class44_Sub1.anInt2622 == 0) {
                                                var41 = var70.method1557(var70.method1540(-32) - 9, var0 ^ -83, 1 + var70.method1551(Class155.aClass94_1970, 92));
                                                Class3_Sub30_Sub1.method805(var24, 21, var41, -1);
                                             }
                                          } else {
                                             Class3_Sub30_Sub1.method805(Class3_Sub28_Sub14.aClass94_3672, 0, var70, var0 + 82);
                                          }
                                       } else {
                                          var24 = var70.method1557(var70.method1551(Class155.aClass94_1970, 118), 0, 0);
                                          var31 = false;
                                          var4 = var24.method1578(-120);

                                          for(var30 = 0; ~Class3_Sub28_Sub5.anInt3591 < ~var30; ++var30) {
                                             if(~Class114.aLongArray1574[var30] == ~var4) {
                                                var31 = true;
                                                break;
                                             }
                                          }

                                          if(!var31 && 0 == Class44_Sub1.anInt2622) {
                                             Class3_Sub30_Sub1.method805(var24, 15, Class3_Sub28_Sub14.aClass94_3672, -1);
                                          }
                                       }
                                    } else {
                                       var31 = false;
                                       var24 = var70.method1557(var70.method1551(Class155.aClass94_1970, 115), 0, 0);
                                       var4 = var24.method1578(-118);

                                       for(var30 = 0; Class3_Sub28_Sub5.anInt3591 > var30; ++var30) {
                                          if(var4 == Class114.aLongArray1574[var30]) {
                                             var31 = true;
                                             break;
                                          }
                                       }

                                       if(!var31 && -1 == ~Class44_Sub1.anInt2622) {
                                          Class3_Sub30_Sub1.method805(var24, 14, Class3_Sub28_Sub14.aClass94_3672, -1);
                                       }
                                    }
                                 } else {
                                    var24 = var70.method1557(var70.method1551(Class140_Sub4_Sub2.aClass94_3998, 102), 0, 0);
                                    if(0 == Class44_Sub1.anInt2622) {
                                       Class3_Sub30_Sub1.method805(Class3_Sub28_Sub14.aClass94_3672, 12, var24, -1);
                                    }
                                 }
                              } else {
                                 var24 = var70.method1557(var70.method1551(Class155.aClass94_1970, 75), 0, 0);
                                 var4 = var24.method1578(-110);
                                 var31 = false;

                                 for(var30 = 0; ~Class3_Sub28_Sub5.anInt3591 < ~var30; ++var30) {
                                    if(Class114.aLongArray1574[var30] == var4) {
                                       var31 = true;
                                       break;
                                    }
                                 }

                                 if(!var31 && Class44_Sub1.anInt2622 == 0) {
                                    var41 = var70.method1557(var70.method1540(var0 + -16) + -9, var0 ^ -83, 1 + var70.method1551(Class155.aClass94_1970, 101));
                                    Class3_Sub30_Sub1.method805(var24, 8, var41, var0 ^ 82);
                                 }
                              }
                           } else {
                              var24 = var70.method1557(var70.method1551(Class155.aClass94_1970, 65), 0, 0);
                              var4 = var24.method1578(-128);
                              var31 = false;

                              for(var30 = 0; ~var30 > ~Class3_Sub28_Sub5.anInt3591; ++var30) {
                                 if(~Class114.aLongArray1574[var30] == ~var4) {
                                    var31 = true;
                                    break;
                                 }
                              }

                              if(!var31 && ~Class44_Sub1.anInt2622 == -1) {
                                 Class3_Sub30_Sub1.method805(var24, 4, Class3_Sub6.aClass94_2285, var0 + 82);
                              }
                           }

                           Class94.anInt2147 = -1;
                           return true;
                        } else {
                           int var3;
                           Class94 var58;
                           if(~Class94.anInt2147 == -124) {
                              var20 = Class28.aClass3_Sub30_Sub1_532.method766(-69);
                              var3 = Class28.aClass3_Sub30_Sub1_532.method758(-126);
                              var58 = Class28.aClass3_Sub30_Sub1_532.method776(true);
                              if(Class146.method2079(var3, (byte)-25)) {
                                 Class3_Sub13_Sub27.method295(var58, (byte)40, var20);
                              }

                              Class94.anInt2147 = -1;
                              return true;
                           } else if(Class94.anInt2147 != 230) {
                              if(153 == Class94.anInt2147) {
                                 Class94.anInt2147 = -1;
                                 Class65.anInt987 = 0;
                                 return true;
                              } else {
                                 int var21;
                                 if(-221 == ~Class94.anInt2147) {
                                    var20 = Class28.aClass3_Sub30_Sub1_532.method798((byte)-59);
                                    var3 = Class28.aClass3_Sub30_Sub1_532.method766(-75);
                                    var21 = Class28.aClass3_Sub30_Sub1_532.method737(var0 + 84);
                                    if(Class146.method2079(var21, (byte)-25)) {
                                       Class3_Sub13_Sub33.method327(var3, var20, (byte)68);
                                    }

                                    Class94.anInt2147 = -1;
                                    return true;
                                 } else {
                                    long var2;
                                    int var10;
                                    int var11;
                                    long var29;
                                    long var36;
                                    if(81 == Class94.anInt2147) {
                                       var2 = Class28.aClass3_Sub30_Sub1_532.method756(-120);
                                       Class28.aClass3_Sub30_Sub1_532.method760(false);
                                       var4 = Class28.aClass3_Sub30_Sub1_532.method756(var0 ^ 54);
                                       var29 = (long)Class28.aClass3_Sub30_Sub1_532.method737(1);
                                       var36 = (long)Class28.aClass3_Sub30_Sub1_532.method794((byte)104);
                                       var10 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-80);
                                       boolean var63 = false;
                                       var11 = Class28.aClass3_Sub30_Sub1_532.method737(var0 ^ -84);
                                       long var55 = (var29 << 32) + var36;
                                       int var54 = 0;

                                       label1521:
                                       while(true) {
                                          if(100 > var54) {
                                             if(~var55 != ~Class163_Sub2_Sub1.aLongArray4017[var54]) {
                                                ++var54;
                                                continue;
                                             }

                                             var63 = true;
                                             break;
                                          }

                                          if(1 >= var10) {
                                             for(var54 = 0; ~Class3_Sub28_Sub5.anInt3591 < ~var54; ++var54) {
                                                if(~Class114.aLongArray1574[var54] == ~var2) {
                                                   var63 = true;
                                                   break label1521;
                                                }
                                             }
                                          }
                                          break;
                                       }

                                       if(!var63 && 0 == Class44_Sub1.anInt2622) {
                                          Class163_Sub2_Sub1.aLongArray4017[Class149.anInt1921] = var55;
                                          Class149.anInt1921 = (1 + Class149.anInt1921) % 100;
                                          Class94 var61 = Class3_Sub29.method733(12345678, var11).method555(28021, Class28.aClass3_Sub30_Sub1_532);
                                          if(-3 != ~var10 && 3 != var10) {
                                             if(~var10 != -2) {
                                                Class3_Sub28_Sub12.method611(var11, 20, var61, Class41.method1052(var0 + -29581, var4).method1545((byte)-50), (byte)50, Class41.method1052(-29664, var2).method1545((byte)-50));
                                             } else {
                                                Class3_Sub28_Sub12.method611(var11, 20, var61, Class41.method1052(-29664, var4).method1545((byte)-50), (byte)50, Class16.method903(new Class94[]{Class32.aClass94_592, Class41.method1052(var0 + -29581, var2).method1545((byte)-50)}, (byte)-109));
                                             }
                                          } else {
                                             Class3_Sub28_Sub12.method611(var11, 20, var61, Class41.method1052(var0 + -29581, var4).method1545((byte)-50), (byte)50, Class16.method903(new Class94[]{Class21.aClass94_444, Class41.method1052(-29664, var2).method1545((byte)-50)}, (byte)-124));
                                          }
                                       }

                                       Class94.anInt2147 = -1;
                                       return true;
                                    } else {
                                       int var6;
                                       int var8;
                                       boolean var32;
                                       if(~Class94.anInt2147 != -56) {
                                          if(Class94.anInt2147 == 164) {
                                             var20 = Class28.aClass3_Sub30_Sub1_532.method780(-1);
                                             Class136.aClass64_1778 = Class38.aClass87_665.method1449(var0 ^ -82, var20);
                                             Class94.anInt2147 = -1;
                                             return true;
                                          } else if(-226 != ~Class94.anInt2147) {
                                             if(Class94.anInt2147 == 48) {
                                                var20 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                var24 = Class28.aClass3_Sub30_Sub1_532.method776(true);
                                                var21 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-115);
                                                if(Class146.method2079(var20, (byte)-25)) {
                                                   Class3_Sub13_Sub27.method295(var24, (byte)40, var21);
                                                }

                                                Class94.anInt2147 = -1;
                                                return true;
                                             } else if(232 == Class94.anInt2147) {
                                                Class3_Sub13_Sub8.anInt3101 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-72);
                                                Class24.anInt467 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-128);
                                                Class45.anInt734 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-57);
                                                Class94.anInt2147 = -1;
                                                return true;
                                             } else {
                                                Class94 var56;
                                                if(Class94.anInt2147 == 44) {
                                                   var20 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-88);
                                                   if(var20 == '\uffff') {
                                                      var20 = -1;
                                                   }

                                                   var3 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-68);
                                                   var21 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-122);
                                                   var56 = Class28.aClass3_Sub30_Sub1_532.method776(true);
                                                   if(1 <= var21 && ~var21 >= -9) {
                                                      if(var56.method1531(-121, Class50.aClass94_829)) {
                                                         var56 = null;
                                                      }

                                                      Class91.aClass94Array1299[-1 + var21] = var56;
                                                      Class3_Sub13_Sub26.anIntArray3328[var21 + -1] = var20;
                                                      Class1.aBooleanArray54[var21 + -1] = ~var3 == -1;
                                                   }

                                                   Class94.anInt2147 = -1;
                                                   return true;
                                                } else if(Class94.anInt2147 != 226) {
                                                   if(Class94.anInt2147 == 21) {
                                                      var20 = Class28.aClass3_Sub30_Sub1_532.method786(true);
                                                      var3 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                      var21 = Class28.aClass3_Sub30_Sub1_532.method782(var0 ^ 19);
                                                      if(Class146.method2079(var3, (byte)-25)) {
                                                         Class3_Sub13_Sub19.method260(-16207, var21, var20);
                                                      }

                                                      Class94.anInt2147 = -1;
                                                      return true;
                                                   } else if(-146 == ~Class94.anInt2147) {
                                                      var20 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-110);
                                                      var3 = Class28.aClass3_Sub30_Sub1_532.method751((byte)-101);
                                                      var21 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-120);
                                                      if(Class146.method2079(var21, (byte)-25)) {
                                                         if(-3 == ~var3) {
                                                            Class7.method834((byte)-86);
                                                         }

                                                         Class3_Sub28_Sub12.anInt3655 = var20;
                                                         Class3_Sub13_Sub13.method232(var20, 16182);
                                                         Class124.method1746(false, (byte)-64);
                                                         Class3_Sub13_Sub12.method226(Class3_Sub28_Sub12.anInt3655, 69);

                                                         for(var5 = 0; -101 < ~var5; ++var5) {
                                                            Class3_Sub28_Sub14.aBooleanArray3674[var5] = true;
                                                         }
                                                      }

                                                      Class94.anInt2147 = -1;
                                                      return true;
                                                   } else if(-70 != ~Class94.anInt2147) {
                                                      if(141 == Class94.anInt2147) {
                                                         var2 = Class28.aClass3_Sub30_Sub1_532.method756(-125);
                                                         var21 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                         var56 = Class3_Sub29.method733(var0 + 12345761, var21).method555(28021, Class28.aClass3_Sub30_Sub1_532);
                                                         Class3_Sub28_Sub12.method611(var21, 19, var56, (Class94)null, (byte)50, Class41.method1052(-29664, var2).method1545((byte)-50));
                                                         Class94.anInt2147 = -1;
                                                         return true;
                                                      } else if(-170 != ~Class94.anInt2147) {
                                                         if(89 == Class94.anInt2147) {
                                                            Class3_Sub13_Sub2.method176(-117);
                                                            Class3_Sub30_Sub1.method819(false);
                                                            Class36.anInt641 += 32;
                                                            Class94.anInt2147 = -1;
                                                            return true;
                                                         } else if(-126 == ~Class94.anInt2147) {
                                                            var20 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                            var3 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-37);
                                                            var21 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-114);
                                                            var5 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                            var6 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-59);
                                                            var30 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-96);
                                                            if(Class146.method2079(var20, (byte)-25)) {
                                                               Class164_Sub1.method2238(var5, var21, var6, var3, (byte)-21, var30);
                                                            }

                                                            Class94.anInt2147 = -1;
                                                            return true;
                                                         } else if(-37 == ~Class94.anInt2147) {
                                                            var20 = Class28.aClass3_Sub30_Sub1_532.method798((byte)122);
                                                            var3 = Class28.aClass3_Sub30_Sub1_532.method791((byte)10);
                                                            var21 = Class28.aClass3_Sub30_Sub1_532.method758(114);
                                                            if(Class146.method2079(var21, (byte)-25)) {
                                                               Class131.method1790(var20, var3, var0 + 178);
                                                            }

                                                            Class94.anInt2147 = -1;
                                                            return true;
                                                         } else {
                                                            Class3_Sub1 var38;
                                                            Class3_Sub1 var47;
                                                            if(-10 == ~Class94.anInt2147) {
                                                               var20 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-97);
                                                               var3 = Class28.aClass3_Sub30_Sub1_532.method782(-101);
                                                               var21 = Class28.aClass3_Sub30_Sub1_532.method758(-105);
                                                               var5 = Class28.aClass3_Sub30_Sub1_532.method766(var0 ^ 23);
                                                               if(-65536 == ~var5) {
                                                                  var5 = -1;
                                                               }

                                                               var6 = Class28.aClass3_Sub30_Sub1_532.method758(127);
                                                               if(-65536 == ~var6) {
                                                                  var6 = -1;
                                                               }

                                                               if(Class146.method2079(var21, (byte)-25)) {
                                                                  for(var30 = var6; var5 >= var30; ++var30) {
                                                                     var36 = (long)var30 + ((long)var3 << 32);
                                                                     var47 = (Class3_Sub1)Class124.aClass130_1659.method1780(var36, 0);
                                                                     if(null != var47) {
                                                                        var38 = new Class3_Sub1(var47.anInt2205, var20);
                                                                        var47.method86(-1024);
                                                                     } else if(0 != ~var30) {
                                                                        var38 = new Class3_Sub1(0, var20);
                                                                     } else {
                                                                        var38 = new Class3_Sub1(Class7.method832((byte)119, var3).aClass3_Sub1_257.anInt2205, var20);
                                                                     }

                                                                     Class124.aClass130_1659.method1779(1, var38, var36);
                                                                  }
                                                               }

                                                               Class94.anInt2147 = -1;
                                                               return true;
                                                            } else {
                                                               int var33;
                                                               if(Class94.anInt2147 == 56) {
                                                                  var20 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                  var3 = Class28.aClass3_Sub30_Sub1_532.method766(var0 + -8);
                                                                  var21 = Class28.aClass3_Sub30_Sub1_532.method780(-1);
                                                                  var5 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-119);
                                                                  if(~(var21 >> 30) == -1) {
                                                                     Class142 var53;
                                                                     if(var21 >> 29 != 0) {
                                                                        var6 = '\uffff' & var21;
                                                                        Class140_Sub4_Sub2 var62 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var6];
                                                                        if(null != var62) {
                                                                           if(-65536 == ~var5) {
                                                                              var5 = -1;
                                                                           }

                                                                           var32 = true;
                                                                           if(0 != ~var5 && -1 != var62.anInt2842 && ~client.method45(Class16.method898((byte)42, var5).anInt542, (byte)-20).anInt1857 > ~client.method45(Class16.method898((byte)42, var62.anInt2842).anInt542, (byte)-20).anInt1857) {
                                                                              var32 = false;
                                                                           }

                                                                           if(var32) {
                                                                              var62.anInt2761 = 0;
                                                                              var62.anInt2842 = var5;
                                                                              var62.anInt2759 = Class44.anInt719 - -var20;
                                                                              var62.anInt2805 = 0;
                                                                              if(var62.anInt2759 > Class44.anInt719) {
                                                                                 var62.anInt2805 = -1;
                                                                              }

                                                                              var62.anInt2799 = var3;
                                                                              var62.anInt2826 = 1;
                                                                              if(~var62.anInt2842 != 0 && Class44.anInt719 == var62.anInt2759) {
                                                                                 var33 = Class16.method898((byte)42, var62.anInt2842).anInt542;
                                                                                 if(~var33 != 0) {
                                                                                    var53 = client.method45(var33, (byte)-20);
                                                                                    if(var53 != null && null != var53.anIntArray1851) {
                                                                                       Class89.method1470(var62.anInt2829, var53, 183921384, var62.anInt2819, false, 0);
                                                                                    }
                                                                                 }
                                                                              }
                                                                           }
                                                                        }
                                                                     } else if(-1 != ~(var21 >> 28)) {
                                                                        var6 = var21 & '\uffff';
                                                                        Class140_Sub4_Sub1 var60;
                                                                        if(~Class3_Sub1.anInt2211 == ~var6) {
                                                                           var60 = Class102.aClass140_Sub4_Sub1_2141;
                                                                        } else {
                                                                           var60 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var6];
                                                                        }

                                                                        if(null != var60) {
                                                                           if(var5 == '\uffff') {
                                                                              var5 = -1;
                                                                           }

                                                                           var32 = true;
                                                                           if(var5 != -1 && ~var60.anInt2842 != 0 && ~client.method45(Class16.method898((byte)42, var5).anInt542, (byte)-20).anInt1857 > ~client.method45(Class16.method898((byte)42, var60.anInt2842).anInt542, (byte)-20).anInt1857) {
                                                                              var32 = false;
                                                                           }

                                                                           if(var32) {
                                                                              var60.anInt2759 = var20 + Class44.anInt719;
                                                                              var60.anInt2799 = var3;
                                                                              var60.anInt2842 = var5;
                                                                              if(~var60.anInt2842 == -65536) {
                                                                                 var60.anInt2842 = -1;
                                                                              }

                                                                              var60.anInt2826 = 1;
                                                                              var60.anInt2761 = 0;
                                                                              var60.anInt2805 = 0;
                                                                              if(var60.anInt2759 > Class44.anInt719) {
                                                                                 var60.anInt2805 = -1;
                                                                              }

                                                                              if(0 != ~var60.anInt2842 && ~var60.anInt2759 == ~Class44.anInt719) {
                                                                                 var33 = Class16.method898((byte)42, var60.anInt2842).anInt542;
                                                                                 if(0 != ~var33) {
                                                                                    var53 = client.method45(var33, (byte)-20);
                                                                                    if(null != var53 && null != var53.anIntArray1851) {
                                                                                       Class89.method1470(var60.anInt2829, var53, 183921384, var60.anInt2819, var60 == Class102.aClass140_Sub4_Sub1_2141, 0);
                                                                                    }
                                                                                 }
                                                                              }
                                                                           }
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var6 = 3 & var21 >> 28;
                                                                     var30 = ((var21 & 268434277) >> 14) + -Class131.anInt1716;
                                                                     var8 = (var21 & 16383) + -Class82.anInt1152;
                                                                     if(~var30 <= -1 && var8 >= 0 && 104 > var30 && ~var8 > -105) {
                                                                        var8 = var8 * 128 - -64;
                                                                        var30 = 128 * var30 + 64;
                                                                        Class140_Sub2 var50 = new Class140_Sub2(var5, var6, var30, var8, -var3 + Class121.method1736(var6, 1, var30, var8), var20, Class44.anInt719);
                                                                        Class3_Sub13_Sub15.aClass61_3177.method1215(true, new Class3_Sub28_Sub2(var50));
                                                                     }
                                                                  }

                                                                  Class94.anInt2147 = -1;
                                                                  return true;
                                                               } else if(-208 != ~Class94.anInt2147) {
                                                                  if(~Class94.anInt2147 == -39) {
                                                                     Class3_Sub30_Sub1.method819(false);
                                                                     var20 = Class28.aClass3_Sub30_Sub1_532.method751((byte)-111);
                                                                     var3 = Class28.aClass3_Sub30_Sub1_532.method780(-1);
                                                                     var21 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-92);
                                                                     Class133.anIntArray1743[var21] = var3;
                                                                     Class3_Sub13_Sub15.anIntArray3185[var21] = var20;
                                                                     Class3_Sub20.anIntArray2480[var21] = 1;

                                                                     for(var5 = 0; 98 > var5; ++var5) {
                                                                        if(Class48.anIntArray781[var5] <= var3) {
                                                                           Class3_Sub20.anIntArray2480[var21] = var5 + 2;
                                                                        }
                                                                     }

                                                                     Class3_Sub28_Sub19.anIntArray3780[Class3_Sub28_Sub15.method633(31, Class49.anInt815++)] = var21;
                                                                     Class94.anInt2147 = -1;
                                                                     return true;
                                                                  } else if(Class94.anInt2147 != 104 && 121 != Class94.anInt2147 && -98 != ~Class94.anInt2147 && ~Class94.anInt2147 != -15 && ~Class94.anInt2147 != -203 && ~Class94.anInt2147 != -136 && ~Class94.anInt2147 != -18 && Class94.anInt2147 != 16 && Class94.anInt2147 != 240 && Class94.anInt2147 != 33 && -21 != ~Class94.anInt2147 && 195 != Class94.anInt2147 && 179 != Class94.anInt2147) {
                                                                     if(Class94.anInt2147 == 149) {
                                                                        var20 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                        var3 = Class28.aClass3_Sub30_Sub1_532.method748(var0 + -502942853);
                                                                        if(Class146.method2079(var20, (byte)-25)) {
                                                                           Class3_Sub31 var67 = (Class3_Sub31)Class3_Sub13_Sub17.aClass130_3208.method1780((long)var3, 0);
                                                                           if(null != var67) {
                                                                              Class3_Sub13_Sub18.method254(true, var67, false);
                                                                           }

                                                                           if(null != Class3_Sub13_Sub7.aClass11_3087) {
                                                                              Class20.method909(115, Class3_Sub13_Sub7.aClass11_3087);
                                                                              Class3_Sub13_Sub7.aClass11_3087 = null;
                                                                           }
                                                                        }

                                                                        Class94.anInt2147 = -1;
                                                                        return true;
                                                                     } else if(Class94.anInt2147 != 187) {
                                                                        if(Class94.anInt2147 == 132) {
                                                                           var20 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                           var3 = Class28.aClass3_Sub30_Sub1_532.method758(31);
                                                                           var21 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-117);
                                                                           var5 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-90);
                                                                           var6 = Class28.aClass3_Sub30_Sub1_532.method748(var0 + -502942853);
                                                                           if(Class146.method2079(var3, (byte)-25)) {
                                                                              Class153.method2143((byte)-124, var21, var6, var5, var20);
                                                                           }

                                                                           Class94.anInt2147 = -1;
                                                                           return true;
                                                                        } else if(112 == Class94.anInt2147) {
                                                                           Class65.anInt990 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-126);
                                                                           Class107.anInt1452 = Class28.aClass3_Sub30_Sub1_532.method786(true);

                                                                           for(var20 = Class65.anInt990; var20 < 8 + Class65.anInt990; ++var20) {
                                                                              for(var3 = Class107.anInt1452; ~var3 > ~(8 + Class107.anInt1452); ++var3) {
                                                                                 if(null != Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.anInt501][var20][var3]) {
                                                                                    Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.anInt501][var20][var3] = null;
                                                                                    Class128.method1760(var3, (byte)65, var20);
                                                                                 }
                                                                              }
                                                                           }

                                                                           for(Class3_Sub4 var68 = (Class3_Sub4)Class3_Sub13_Sub6.aClass61_3075.method1222(-81); null != var68; var68 = (Class3_Sub4)Class3_Sub13_Sub6.aClass61_3075.method1221(var0 + 87)) {
                                                                              if(~var68.anInt2264 <= ~Class65.anInt990 && 8 + Class65.anInt990 > var68.anInt2264 && var68.anInt2248 >= Class107.anInt1452 && ~var68.anInt2248 > ~(8 + Class107.anInt1452) && var68.anInt2250 == Class26.anInt501) {
                                                                                 var68.anInt2259 = 0;
                                                                              }
                                                                           }

                                                                           Class94.anInt2147 = -1;
                                                                           return true;
                                                                        } else if(Class94.anInt2147 == 144) {
                                                                           var20 = Class28.aClass3_Sub30_Sub1_532.method798((byte)72);
                                                                           Class11 var65 = Class7.method832((byte)111, var20);

                                                                           for(var21 = 0; var65.anIntArray254.length > var21; ++var21) {
                                                                              var65.anIntArray254[var21] = -1;
                                                                              var65.anIntArray254[var21] = 0;
                                                                           }

                                                                           Class20.method909(123, var65);
                                                                           Class94.anInt2147 = -1;
                                                                           return true;
                                                                        } else if(-131 == ~Class94.anInt2147) {
                                                                           var20 = Class28.aClass3_Sub30_Sub1_532.method782(-104);
                                                                           var3 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-125);
                                                                           var21 = Class28.aClass3_Sub30_Sub1_532.method758(var0 ^ -2);
                                                                           if(var21 == '\uffff') {
                                                                              var21 = -1;
                                                                           }

                                                                           if(Class146.method2079(var3, (byte)-25)) {
                                                                              Class3_Sub13_Sub18.method256(-1, 1, var20, (byte)-109, var21);
                                                                           }

                                                                           Class94.anInt2147 = -1;
                                                                           return true;
                                                                        } else if(-193 == ~Class94.anInt2147) {
                                                                           Class161.anInt2028 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-59);
                                                                           Class94.anInt2147 = -1;
                                                                           return true;
                                                                        } else if(~Class94.anInt2147 == -14) {
                                                                           var20 = Class28.aClass3_Sub30_Sub1_532.method754(true);
                                                                           var3 = Class28.aClass3_Sub30_Sub1_532.method751((byte)108);
                                                                           var21 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-41);
                                                                           Class26.anInt501 = var3 >> 1;
                                                                           Class102.aClass140_Sub4_Sub1_2141.method1981((byte)126, var20, ~(var3 & 1) == -2, var21);
                                                                           Class94.anInt2147 = -1;
                                                                           return true;
                                                                        } else {
                                                                           int var12;
                                                                           Class94 var57;
                                                                           Class94 var64;
                                                                           if(-63 == ~Class94.anInt2147) {
                                                                              var2 = Class28.aClass3_Sub30_Sub1_532.method756(-127);
                                                                              var21 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                              var5 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-99);
                                                                              var31 = true;
                                                                              if(var2 < 0L) {
                                                                                 var2 &= Long.MAX_VALUE;
                                                                                 var31 = false;
                                                                              }

                                                                              var41 = Class3_Sub28_Sub14.aClass94_3672;
                                                                              if(-1 > ~var21) {
                                                                                 var41 = Class28.aClass3_Sub30_Sub1_532.method776(true);
                                                                              }

                                                                              Class94 var46 = Class41.method1052(-29664, var2).method1545((byte)-50);

                                                                              for(var33 = 0; var33 < Class8.anInt104; ++var33) {
                                                                                 if(var2 == Class50.aLongArray826[var33]) {
                                                                                    if(~var21 != ~Class55.anIntArray882[var33]) {
                                                                                       Class55.anIntArray882[var33] = var21;
                                                                                       if(0 < var21) {
                                                                                          Class3_Sub30_Sub1.method805(Class3_Sub28_Sub14.aClass94_3672, 5, Class16.method903(new Class94[]{var46, Class3_Sub28_Sub10_Sub1.aClass94_4058}, (byte)-77), -1);
                                                                                       }

                                                                                       if(var21 == 0) {
                                                                                          Class3_Sub30_Sub1.method805(Class3_Sub28_Sub14.aClass94_3672, 5, Class16.method903(new Class94[]{var46, Class50.aClass94_822}, (byte)-97), -1);
                                                                                       }
                                                                                    }

                                                                                    Class3_Sub28.aClass94Array2566[var33] = var41;
                                                                                    Class57.anIntArray904[var33] = var5;
                                                                                    var46 = null;
                                                                                    Class3.aBooleanArray73[var33] = var31;
                                                                                    break;
                                                                                 }
                                                                              }

                                                                              boolean var45 = false;
                                                                              if(null != var46 && 200 > Class8.anInt104) {
                                                                                 Class50.aLongArray826[Class8.anInt104] = var2;
                                                                                 Class70.aClass94Array1046[Class8.anInt104] = var46;
                                                                                 Class55.anIntArray882[Class8.anInt104] = var21;
                                                                                 Class3_Sub28.aClass94Array2566[Class8.anInt104] = var41;
                                                                                 Class57.anIntArray904[Class8.anInt104] = var5;
                                                                                 Class3.aBooleanArray73[Class8.anInt104] = var31;
                                                                                 ++Class8.anInt104;
                                                                              }

                                                                              Class110.anInt1472 = Class3_Sub13_Sub17.anInt3213;
                                                                              var10 = Class8.anInt104;

                                                                              while(~var10 < -1) {
                                                                                 --var10;
                                                                                 var45 = true;

                                                                                 for(var11 = 0; var11 < var10; ++var11) {
                                                                                    if(~Class55.anIntArray882[var11] != ~Class3_Sub16.anInt2451 && ~Class3_Sub16.anInt2451 == ~Class55.anIntArray882[var11 - -1] || Class55.anIntArray882[var11] == 0 && Class55.anIntArray882[var11 - -1] != 0) {
                                                                                       var45 = false;
                                                                                       var12 = Class55.anIntArray882[var11];
                                                                                       Class55.anIntArray882[var11] = Class55.anIntArray882[var11 - -1];
                                                                                       Class55.anIntArray882[1 + var11] = var12;
                                                                                       var64 = Class3_Sub28.aClass94Array2566[var11];
                                                                                       Class3_Sub28.aClass94Array2566[var11] = Class3_Sub28.aClass94Array2566[var11 + 1];
                                                                                       Class3_Sub28.aClass94Array2566[var11 - -1] = var64;
                                                                                       var57 = Class70.aClass94Array1046[var11];
                                                                                       Class70.aClass94Array1046[var11] = Class70.aClass94Array1046[var11 + 1];
                                                                                       Class70.aClass94Array1046[var11 - -1] = var57;
                                                                                       long var15 = Class50.aLongArray826[var11];
                                                                                       Class50.aLongArray826[var11] = Class50.aLongArray826[var11 - -1];
                                                                                       Class50.aLongArray826[var11 - -1] = var15;
                                                                                       int var17 = Class57.anIntArray904[var11];
                                                                                       Class57.anIntArray904[var11] = Class57.anIntArray904[var11 - -1];
                                                                                       Class57.anIntArray904[1 + var11] = var17;
                                                                                       boolean var18 = Class3.aBooleanArray73[var11];
                                                                                       Class3.aBooleanArray73[var11] = Class3.aBooleanArray73[var11 - -1];
                                                                                       Class3.aBooleanArray73[var11 - -1] = var18;
                                                                                    }
                                                                                 }

                                                                                 if(var45) {
                                                                                    break;
                                                                                 }
                                                                              }

                                                                              Class94.anInt2147 = -1;
                                                                              return true;
                                                                           } else if(-161 == ~Class94.anInt2147) {
                                                                              if(0 != Class130.anInt1704) {
                                                                                 Class3_Sub13_Sub28.aClass94_3353 = Class28.aClass3_Sub30_Sub1_532.method776(true);
                                                                              } else {
                                                                                 Class3_Sub13_Sub28.aClass94_3353 = Class56.aClass94_891;
                                                                              }

                                                                              Class94.anInt2147 = -1;
                                                                              return true;
                                                                           } else if(128 != Class94.anInt2147) {
                                                                              if(~Class94.anInt2147 == -155) {
                                                                                 var20 = Class28.aClass3_Sub30_Sub1_532.method737(var0 ^ -84);
                                                                                 var3 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-56);
                                                                                 var21 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-23);
                                                                                 var5 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                 var6 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-123);
                                                                                 var30 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-92);
                                                                                 if(Class146.method2079(var20, (byte)-25)) {
                                                                                    Class3_Sub20.method390(true, var6, var5, var30, (byte)-124, var21, var3);
                                                                                 }

                                                                                 Class94.anInt2147 = -1;
                                                                                 return true;
                                                                              } else if(247 == Class94.anInt2147) {
                                                                                 var2 = Class28.aClass3_Sub30_Sub1_532.method756(-115);
                                                                                 var4 = (long)Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                 var29 = (long)Class28.aClass3_Sub30_Sub1_532.method794((byte)77);
                                                                                 var8 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-28);
                                                                                 var33 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                 boolean var49 = false;
                                                                                 long var51 = (var4 << -737495840) - -var29;
                                                                                 int var59 = 0;

                                                                                 label1603:
                                                                                 while(true) {
                                                                                    if(100 > var59) {
                                                                                       if(~var51 != ~Class163_Sub2_Sub1.aLongArray4017[var59]) {
                                                                                          ++var59;
                                                                                          continue;
                                                                                       }

                                                                                       var49 = true;
                                                                                       break;
                                                                                    }

                                                                                    if(var8 <= 1) {
                                                                                       for(var59 = 0; ~var59 > ~Class3_Sub28_Sub5.anInt3591; ++var59) {
                                                                                          if(var2 == Class114.aLongArray1574[var59]) {
                                                                                             var49 = true;
                                                                                             break label1603;
                                                                                          }
                                                                                       }
                                                                                    }
                                                                                    break;
                                                                                 }

                                                                                 if(!var49 && ~Class44_Sub1.anInt2622 == -1) {
                                                                                    Class163_Sub2_Sub1.aLongArray4017[Class149.anInt1921] = var51;
                                                                                    Class149.anInt1921 = (1 + Class149.anInt1921) % 100;
                                                                                    var64 = Class3_Sub29.method733(12345678, var33).method555(28021, Class28.aClass3_Sub30_Sub1_532);
                                                                                    if(-3 == ~var8) {
                                                                                       Class3_Sub28_Sub12.method611(var33, 18, var64, (Class94)null, (byte)50, Class16.method903(new Class94[]{Class21.aClass94_444, Class41.method1052(-29664, var2).method1545((byte)-50)}, (byte)-105));
                                                                                    } else if(1 == var8) {
                                                                                       Class3_Sub28_Sub12.method611(var33, 18, var64, (Class94)null, (byte)50, Class16.method903(new Class94[]{Class32.aClass94_592, Class41.method1052(-29664, var2).method1545((byte)-50)}, (byte)-113));
                                                                                    } else {
                                                                                       Class3_Sub28_Sub12.method611(var33, 18, var64, (Class94)null, (byte)50, Class41.method1052(var0 + -29581, var2).method1545((byte)-50));
                                                                                    }
                                                                                 }

                                                                                 Class94.anInt2147 = -1;
                                                                                 return true;
                                                                              } else {
                                                                                 Class3_Sub31 var26;
                                                                                 if(~Class94.anInt2147 != -177) {
                                                                                    if(Class94.anInt2147 != 27) {
                                                                                       if(Class94.anInt2147 == 2) {
                                                                                          var20 = Class28.aClass3_Sub30_Sub1_532.method780(-1);
                                                                                          var3 = Class28.aClass3_Sub30_Sub1_532.method758(-114);
                                                                                          var21 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-119);
                                                                                          if(Class146.method2079(var3, (byte)-25)) {
                                                                                             Class79.method1385(var21, var20, (byte)-127);
                                                                                          }

                                                                                          Class94.anInt2147 = -1;
                                                                                          return true;
                                                                                       } else if(-86 == ~Class94.anInt2147) {
                                                                                          Class38_Sub1.anInt2617 = Class28.aClass3_Sub30_Sub1_532.method737(1) * 30;
                                                                                          Class94.anInt2147 = -1;
                                                                                          Class140_Sub6.anInt2905 = Class3_Sub13_Sub17.anInt3213;
                                                                                          return true;
                                                                                       } else if(~Class94.anInt2147 == -115) {
                                                                                          Class3_Sub13_Sub29.method305(Class38.aClass87_665, Class28.aClass3_Sub30_Sub1_532, Class130.anInt1704, (byte)-126);
                                                                                          Class94.anInt2147 = -1;
                                                                                          return true;
                                                                                       } else if(65 == Class94.anInt2147) {
                                                                                          var20 = Class28.aClass3_Sub30_Sub1_532.method766(var0 ^ 13);
                                                                                          var3 = Class28.aClass3_Sub30_Sub1_532.method786(true);
                                                                                          var21 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-100);
                                                                                          if(Class146.method2079(var20, (byte)-25)) {
                                                                                             Class3_Sub13_Sub18.method255(var21, var3, var0 ^ -84);
                                                                                          }

                                                                                          Class94.anInt2147 = -1;
                                                                                          return true;
                                                                                       } else if(Class94.anInt2147 == 234) {
                                                                                          Class3_Sub30_Sub1.method819(false);
                                                                                          Class9.anInt136 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-104);
                                                                                          Class140_Sub6.anInt2905 = Class3_Sub13_Sub17.anInt3213;
                                                                                          Class94.anInt2147 = -1;
                                                                                          return true;
                                                                                       } else if(var0 != -83) {
                                                                                          return false;
                                                                                       } else if(~Class94.anInt2147 == -210) {
                                                                                          if(-1 != Class3_Sub28_Sub12.anInt3655) {
                                                                                             Class3_Sub8.method124(48, 0, Class3_Sub28_Sub12.anInt3655);
                                                                                          }

                                                                                          Class94.anInt2147 = -1;
                                                                                          return true;
                                                                                       } else if(~Class94.anInt2147 != -192) {
                                                                                          if(-103 == ~Class94.anInt2147) {
                                                                                             var20 = Class28.aClass3_Sub30_Sub1_532.method766(-116);
                                                                                             var3 = Class28.aClass3_Sub30_Sub1_532.method754(true);
                                                                                             var21 = Class28.aClass3_Sub30_Sub1_532.method737(var0 ^ -84);
                                                                                             Class140_Sub4_Sub2 var39 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var20];
                                                                                             if(null != var39) {
                                                                                                Class130.method1772(var3, var21, 39, var39);
                                                                                             }

                                                                                             Class94.anInt2147 = -1;
                                                                                             return true;
                                                                                          } else if(Class94.anInt2147 != 159) {
                                                                                             if(~Class94.anInt2147 == -72) {
                                                                                                var2 = Class28.aClass3_Sub30_Sub1_532.method756(var0 ^ 28);
                                                                                                var58 = Class3_Sub28_Sub17.method686(Class32.method992(Class28.aClass3_Sub30_Sub1_532, var0 ^ -29539).method1536(121));
                                                                                                Class3_Sub30_Sub1.method805(Class41.method1052(-29664, var2).method1545((byte)-50), 6, var58, var0 ^ 82);
                                                                                                Class94.anInt2147 = -1;
                                                                                                return true;
                                                                                             } else if(-43 != ~Class94.anInt2147) {
                                                                                                if(-112 == ~Class94.anInt2147) {
                                                                                                   var20 = Class28.aClass3_Sub30_Sub1_532.method758(-123);
                                                                                                   var3 = Class28.aClass3_Sub30_Sub1_532.method798((byte)-45);
                                                                                                   var21 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-109);
                                                                                                   var5 = Class28.aClass3_Sub30_Sub1_532.method766(var0 + 19);
                                                                                                   var6 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-107);
                                                                                                   if(Class146.method2079(var20, (byte)-25)) {
                                                                                                      Class3_Sub13_Sub18.method256(var21, 7, var3, (byte)-126, var5 << -311274832 | var6);
                                                                                                   }

                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(37 == Class94.anInt2147) {
                                                                                                   var20 = Class28.aClass3_Sub30_Sub1_532.method751((byte)122);
                                                                                                   var3 = Class28.aClass3_Sub30_Sub1_532.method766(-124);
                                                                                                   Class163.method2209((byte)-122, var20, var3);
                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(~Class94.anInt2147 == -156) {
                                                                                                   var20 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-66);
                                                                                                   var3 = Class28.aClass3_Sub30_Sub1_532.method798((byte)-51);
                                                                                                   var21 = Class28.aClass3_Sub30_Sub1_532.method758(var0 + 163);
                                                                                                   var5 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                   if(Class146.method2079(var21, (byte)-25)) {
                                                                                                      var26 = (Class3_Sub31)Class3_Sub13_Sub17.aClass130_3208.method1780((long)var3, 0);
                                                                                                      if(null != var26) {
                                                                                                         Class3_Sub13_Sub18.method254(var26.anInt2602 != var5, var26, false);
                                                                                                      }

                                                                                                      Class21.method914(6422, var5, var3, var20);
                                                                                                   }

                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(~Class94.anInt2147 == -132) {
                                                                                                   for(var20 = 0; var20 < Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269.length; ++var20) {
                                                                                                      if(Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var20] != null) {
                                                                                                         Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var20].anInt2771 = -1;
                                                                                                      }
                                                                                                   }

                                                                                                   for(var20 = 0; ~Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292.length < ~var20; ++var20) {
                                                                                                      if(null != Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var20]) {
                                                                                                         Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var20].anInt2771 = -1;
                                                                                                      }
                                                                                                   }

                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(~Class94.anInt2147 == -218) {
                                                                                                   var20 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-30);
                                                                                                   Class96 var48 = new Class96();
                                                                                                   var3 = var20 >> 340093798;
                                                                                                   var48.anInt1360 = var20 & 63;
                                                                                                   var48.anInt1351 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-49);
                                                                                                   if(~var48.anInt1351 <= -1 && ~var48.anInt1351 > ~Class166.aClass3_Sub28_Sub16Array2072.length) {
                                                                                                      if(~var48.anInt1360 != -2 && 10 != var48.anInt1360) {
                                                                                                         if(-3 >= ~var48.anInt1360 && 6 >= var48.anInt1360) {
                                                                                                            if(var48.anInt1360 == 2) {
                                                                                                               var48.anInt1346 = 64;
                                                                                                               var48.anInt1350 = 64;
                                                                                                            }

                                                                                                            if(-4 == ~var48.anInt1360) {
                                                                                                               var48.anInt1346 = 0;
                                                                                                               var48.anInt1350 = 64;
                                                                                                            }

                                                                                                            if(4 == var48.anInt1360) {
                                                                                                               var48.anInt1346 = 128;
                                                                                                               var48.anInt1350 = 64;
                                                                                                            }

                                                                                                            if(5 == var48.anInt1360) {
                                                                                                               var48.anInt1346 = 64;
                                                                                                               var48.anInt1350 = 0;
                                                                                                            }

                                                                                                            if(-7 == ~var48.anInt1360) {
                                                                                                               var48.anInt1346 = 64;
                                                                                                               var48.anInt1350 = 128;
                                                                                                            }

                                                                                                            var48.anInt1360 = 2;
                                                                                                            var48.anInt1356 = Class28.aClass3_Sub30_Sub1_532.method737(var0 + 84);
                                                                                                            var48.anInt1347 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                            var48.anInt1353 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-32);
                                                                                                         }
                                                                                                      } else {
                                                                                                         var48.anInt1359 = Class28.aClass3_Sub30_Sub1_532.method737(var0 ^ -84);
                                                                                                         Class28.aClass3_Sub30_Sub1_532.anInt2595 += 3;
                                                                                                      }

                                                                                                      var48.anInt1355 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                      if(var48.anInt1355 == '\uffff') {
                                                                                                         var48.anInt1355 = -1;
                                                                                                      }

                                                                                                      RuntimeException_Sub1.aClass96Array2114[var3] = var48;
                                                                                                   }

                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(126 == Class94.anInt2147) {
                                                                                                   Class3_Sub28_Sub5.anInt3591 = Class130.anInt1704 / 8;

                                                                                                   for(var20 = 0; ~var20 > ~Class3_Sub28_Sub5.anInt3591; ++var20) {
                                                                                                      Class114.aLongArray1574[var20] = Class28.aClass3_Sub30_Sub1_532.method756(-120);
                                                                                                      Class3_Sub13_Sub27.aClass94Array3341[var20] = Class41.method1052(-29664, Class114.aLongArray1574[var20]);
                                                                                                   }

                                                                                                   Class110.anInt1472 = Class3_Sub13_Sub17.anInt3213;
                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(~Class94.anInt2147 == -33) {
                                                                                                   Class3_Sub13_Sub14.method237(8169);
                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(-120 == ~Class94.anInt2147) {
                                                                                                   var20 = Class28.aClass3_Sub30_Sub1_532.method758(-125);
                                                                                                   var3 = Class28.aClass3_Sub30_Sub1_532.method782(-48);
                                                                                                   var21 = Class28.aClass3_Sub30_Sub1_532.method787((byte)74);
                                                                                                   var5 = Class28.aClass3_Sub30_Sub1_532.method747(-58);
                                                                                                   if(Class146.method2079(var20, (byte)-25)) {
                                                                                                      Class168.method2271(var21, var3, 1, var5);
                                                                                                   }

                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(Class94.anInt2147 == 235) {
                                                                                                   var20 = Class28.aClass3_Sub30_Sub1_532.method754(true);
                                                                                                   var3 = var20 >> -518983614;
                                                                                                   var21 = 3 & var20;
                                                                                                   var5 = Class75.anIntArray1107[var3];
                                                                                                   var6 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                   var30 = Class28.aClass3_Sub30_Sub1_532.method748(-502942936);
                                                                                                   if('\uffff' == var6) {
                                                                                                      var6 = -1;
                                                                                                   }

                                                                                                   var10 = 16383 & var30;
                                                                                                   var33 = 16383 & var30 >> 2070792462;
                                                                                                   var33 -= Class131.anInt1716;
                                                                                                   var10 -= Class82.anInt1152;
                                                                                                   var8 = 3 & var30 >> 765199868;
                                                                                                   Class50.method1131(var8, 110, var21, var3, var10, var5, var33, var6);
                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(Class94.anInt2147 == 0) {
                                                                                                   var2 = Class28.aClass3_Sub30_Sub1_532.method756(-85);
                                                                                                   var4 = (long)Class28.aClass3_Sub30_Sub1_532.method737(var0 + 84);
                                                                                                   var29 = (long)Class28.aClass3_Sub30_Sub1_532.method794((byte)93);
                                                                                                   var8 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-106);
                                                                                                   boolean var42 = false;
                                                                                                   long var35 = var29 + (var4 << -1802335520);
                                                                                                   var12 = 0;

                                                                                                   label1651:
                                                                                                   while(true) {
                                                                                                      if(-101 >= ~var12) {
                                                                                                         if(var8 <= 1) {
                                                                                                            if((!Class3_Sub15.aBoolean2433 || Class121.aBoolean1641) && !Class3_Sub13_Sub14.aBoolean3166) {
                                                                                                               for(var12 = 0; var12 < Class3_Sub28_Sub5.anInt3591; ++var12) {
                                                                                                                  if(~var2 == ~Class114.aLongArray1574[var12]) {
                                                                                                                     var42 = true;
                                                                                                                     break label1651;
                                                                                                                  }
                                                                                                               }
                                                                                                            } else {
                                                                                                               var42 = true;
                                                                                                            }
                                                                                                         }
                                                                                                         break;
                                                                                                      }

                                                                                                      if(~var35 == ~Class163_Sub2_Sub1.aLongArray4017[var12]) {
                                                                                                         var42 = true;
                                                                                                         break;
                                                                                                      }

                                                                                                      ++var12;
                                                                                                   }

                                                                                                   if(!var42 && -1 == ~Class44_Sub1.anInt2622) {
                                                                                                      Class163_Sub2_Sub1.aLongArray4017[Class149.anInt1921] = var35;
                                                                                                      Class149.anInt1921 = (Class149.anInt1921 - -1) % 100;
                                                                                                      Class94 var52 = Class3_Sub28_Sub17.method686(Class32.method992(Class28.aClass3_Sub30_Sub1_532, var0 ^ -29539).method1536(96));
                                                                                                      if(-3 != ~var8 && ~var8 != -4) {
                                                                                                         if(var8 != 1) {
                                                                                                            Class3_Sub30_Sub1.method805(Class41.method1052(var0 + -29581, var2).method1545((byte)-50), 3, var52, var0 + 82);
                                                                                                         } else {
                                                                                                            Class3_Sub30_Sub1.method805(Class16.method903(new Class94[]{Class32.aClass94_592, Class41.method1052(-29664, var2).method1545((byte)-50)}, (byte)-71), 7, var52, -1);
                                                                                                         }
                                                                                                      } else {
                                                                                                         Class3_Sub30_Sub1.method805(Class16.method903(new Class94[]{Class21.aClass94_444, Class41.method1052(-29664, var2).method1545((byte)-50)}, (byte)-105), 7, var52, -1);
                                                                                                      }
                                                                                                   }

                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(-55 != ~Class94.anInt2147) {
                                                                                                   if(-215 == ~Class94.anInt2147) {
                                                                                                      Class39.method1033(0, true);
                                                                                                      Class94.anInt2147 = -1;
                                                                                                      return true;
                                                                                                   } else if(~Class94.anInt2147 != -173) {
                                                                                                      if(-67 == ~Class94.anInt2147) {
                                                                                                         var20 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-87);
                                                                                                         var3 = Class28.aClass3_Sub30_Sub1_532.method780(-1);
                                                                                                         if(Class146.method2079(var20, (byte)-25)) {
                                                                                                            var21 = 0;
                                                                                                            if(Class102.aClass140_Sub4_Sub1_2141.aClass52_3962 != null) {
                                                                                                               var21 = Class102.aClass140_Sub4_Sub1_2141.aClass52_3962.method1163(-24861);
                                                                                                            }

                                                                                                            Class3_Sub13_Sub18.method256(-1, 3, var3, (byte)-110, var21);
                                                                                                         }

                                                                                                         Class94.anInt2147 = -1;
                                                                                                         return true;
                                                                                                      } else if(Class94.anInt2147 == 171) {
                                                                                                         var20 = Class28.aClass3_Sub30_Sub1_532.method798((byte)-55);
                                                                                                         var24 = Class28.aClass3_Sub30_Sub1_532.method776(true);
                                                                                                         var21 = Class28.aClass3_Sub30_Sub1_532.method758(103);
                                                                                                         if(Class146.method2079(var21, (byte)-25)) {
                                                                                                            Class3_Sub28_Sub7.method566(var24, 0, var20);
                                                                                                         }

                                                                                                         Class94.anInt2147 = -1;
                                                                                                         return true;
                                                                                                      } else if(~Class94.anInt2147 == -85) {
                                                                                                         var20 = Class28.aClass3_Sub30_Sub1_532.method782(-79);
                                                                                                         var3 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-96);
                                                                                                         Class163.method2209((byte)-106, var20, var3);
                                                                                                         Class94.anInt2147 = -1;
                                                                                                         return true;
                                                                                                      } else {
                                                                                                         Class11 var25;
                                                                                                         if(Class94.anInt2147 != 22) {
                                                                                                            if(Class94.anInt2147 == 24) {
                                                                                                               var20 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                               if(Class146.method2079(var20, (byte)-25)) {
                                                                                                                  Class3_Sub28_Sub5.method560(-21556);
                                                                                                               }

                                                                                                               Class94.anInt2147 = -1;
                                                                                                               return true;
                                                                                                            } else if(~Class94.anInt2147 == -87) {
                                                                                                               Class167.method2269((byte)46);
                                                                                                               Class94.anInt2147 = -1;
                                                                                                               return false;
                                                                                                            } else if(116 == Class94.anInt2147) {
                                                                                                               var20 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-62);
                                                                                                               if(-1 != ~Class28.aClass3_Sub30_Sub1_532.method803((byte)-124)) {
                                                                                                                  --Class28.aClass3_Sub30_Sub1_532.anInt2595;
                                                                                                                  Class3_Sub13_Sub33.aClass133Array3393[var20] = new Class133(Class28.aClass3_Sub30_Sub1_532);
                                                                                                               } else {
                                                                                                                  Class3_Sub13_Sub33.aClass133Array3393[var20] = new Class133();
                                                                                                               }

                                                                                                               Class94.anInt2147 = -1;
                                                                                                               Class121.anInt1642 = Class3_Sub13_Sub17.anInt3213;
                                                                                                               return true;
                                                                                                            } else if(-74 == ~Class94.anInt2147) {
                                                                                                               var20 = Class28.aClass3_Sub30_Sub1_532.method758(-121);
                                                                                                               var3 = Class28.aClass3_Sub30_Sub1_532.method782(-105);
                                                                                                               if(~var20 == -65536) {
                                                                                                                  var20 = -1;
                                                                                                               }

                                                                                                               var21 = Class28.aClass3_Sub30_Sub1_532.method766(var0 ^ 19);
                                                                                                               if(Class146.method2079(var21, (byte)-25)) {
                                                                                                                  Class3_Sub13_Sub18.method256(-1, 2, var3, (byte)-113, var20);
                                                                                                               }

                                                                                                               Class94.anInt2147 = -1;
                                                                                                               return true;
                                                                                                            } else if(~Class94.anInt2147 == -163) {
                                                                                                               Class39.method1033(var0 ^ -83, false);
                                                                                                               Class94.anInt2147 = -1;
                                                                                                               return true;
                                                                                                            } else if(165 != Class94.anInt2147) {
                                                                                                               if(Class94.anInt2147 == 197) {
                                                                                                                  Class96.anInt1357 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-104);
                                                                                                                  Class110.anInt1472 = Class3_Sub13_Sub17.anInt3213;
                                                                                                                  Class94.anInt2147 = -1;
                                                                                                                  return true;
                                                                                                               } else if(Class94.anInt2147 != 196) {
                                                                                                                  if(50 != Class94.anInt2147) {
                                                                                                                     if(~Class94.anInt2147 != -106) {
                                                                                                                        if(~Class94.anInt2147 == -143) {
                                                                                                                           Class3_Sub29.method734(0, Class28.aClass3_Sub30_Sub1_532.method776(true));
                                                                                                                           Class94.anInt2147 = -1;
                                                                                                                           return true;
                                                                                                                        } else if(Class94.anInt2147 != 26) {
                                                                                                                           if(4 == Class94.anInt2147) {
                                                                                                                              var20 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-121);
                                                                                                                              if(var20 == '\uffff') {
                                                                                                                                 var20 = -1;
                                                                                                                              }

                                                                                                                              Class86.method1427(true, var20);
                                                                                                                              Class94.anInt2147 = -1;
                                                                                                                              return true;
                                                                                                                           } else if(Class94.anInt2147 != 208) {
                                                                                                                              Class49.method1125("T1 - " + Class94.anInt2147 + "," + Class7.anInt2166 + "," + Class24.anInt469 + " - " + Class130.anInt1704, (Throwable)null, (byte)117);
                                                                                                                              Class167.method2269((byte)46);
                                                                                                                              return true;
                                                                                                                           } else {
                                                                                                                              var20 = Class28.aClass3_Sub30_Sub1_532.method755((byte)-118);
                                                                                                                              var3 = Class28.aClass3_Sub30_Sub1_532.method766(-57);
                                                                                                                              if(var3 == '\uffff') {
                                                                                                                                 var3 = -1;
                                                                                                                              }

                                                                                                                              Class167.method2266(var20, var3, (byte)-1);
                                                                                                                              Class94.anInt2147 = -1;
                                                                                                                              return true;
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           Class65.anInt990 = Class28.aClass3_Sub30_Sub1_532.method786(true);
                                                                                                                           Class107.anInt1452 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-62);
                                                                                                                           Class94.anInt2147 = -1;
                                                                                                                           return true;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var20 = Class28.aClass3_Sub30_Sub1_532.method748(-502942936);
                                                                                                                        var3 = Class28.aClass3_Sub30_Sub1_532.method737(var0 ^ -84);
                                                                                                                        if(~var20 > 69999) {
                                                                                                                           var3 += '\u8000';
                                                                                                                        }

                                                                                                                        if(0 <= var20) {
                                                                                                                           var25 = Class7.method832((byte)118, var20);
                                                                                                                        } else {
                                                                                                                           var25 = null;
                                                                                                                        }

                                                                                                                        if(var25 != null) {
                                                                                                                           for(var5 = 0; var25.anIntArray254.length > var5; ++var5) {
                                                                                                                              var25.anIntArray254[var5] = 0;
                                                                                                                              var25.anIntArray317[var5] = 0;
                                                                                                                           }
                                                                                                                        }

                                                                                                                        Class10.method852((byte)114, var3);
                                                                                                                        var5 = Class28.aClass3_Sub30_Sub1_532.method737(1);

                                                                                                                        for(var6 = 0; var5 > var6; ++var6) {
                                                                                                                           var30 = Class28.aClass3_Sub30_Sub1_532.method754(true);
                                                                                                                           if(255 == var30) {
                                                                                                                              var30 = Class28.aClass3_Sub30_Sub1_532.method748(-502942936);
                                                                                                                           }

                                                                                                                           var8 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                                           if(null != var25 && ~var6 > ~var25.anIntArray254.length) {
                                                                                                                              var25.anIntArray254[var6] = var8;
                                                                                                                              var25.anIntArray317[var6] = var30;
                                                                                                                           }

                                                                                                                           Class168.method2277(-1 + var8, var6, var30, var3, (byte)41);
                                                                                                                        }

                                                                                                                        if(var25 != null) {
                                                                                                                           Class20.method909(-9, var25);
                                                                                                                        }

                                                                                                                        Class3_Sub30_Sub1.method819(false);
                                                                                                                        Class3_Sub28_Sub4.anIntArray3565[Class3_Sub28_Sub15.method633(Class62.anInt944++, 31)] = Class3_Sub28_Sub15.method633(32767, var3);
                                                                                                                        Class94.anInt2147 = -1;
                                                                                                                        return true;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var20 = Class28.aClass3_Sub30_Sub1_532.method748(var0 ^ 502942853);
                                                                                                                     var3 = Class28.aClass3_Sub30_Sub1_532.method798((byte)-79);
                                                                                                                     var21 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-118);
                                                                                                                     if('\uffff' == var21) {
                                                                                                                        var21 = -1;
                                                                                                                     }

                                                                                                                     var5 = Class28.aClass3_Sub30_Sub1_532.method766(-85);
                                                                                                                     if(Class146.method2079(var5, (byte)-25)) {
                                                                                                                        Class11 var34 = Class7.method832((byte)115, var3);
                                                                                                                        Class48 var43;
                                                                                                                        if(var34.aBoolean233) {
                                                                                                                           Class140_Sub6.method2026((byte)122, var3, var20, var21);
                                                                                                                           var43 = Class38.method1023(var21, (byte)70);
                                                                                                                           Class153.method2143((byte)-128, var43.anInt810, var3, var43.anInt799, var43.anInt786);
                                                                                                                           Class84.method1420(var3, var43.anInt768, var43.anInt754, var43.anInt792, (byte)-85);
                                                                                                                        } else {
                                                                                                                           if(-1 == var21) {
                                                                                                                              var34.anInt202 = 0;
                                                                                                                              Class94.anInt2147 = -1;
                                                                                                                              return true;
                                                                                                                           }

                                                                                                                           var43 = Class38.method1023(var21, (byte)91);
                                                                                                                           var34.anInt182 = var43.anInt786;
                                                                                                                           var34.anInt164 = 100 * var43.anInt810 / var20;
                                                                                                                           var34.anInt202 = 4;
                                                                                                                           var34.anInt201 = var21;
                                                                                                                           var34.anInt308 = var43.anInt799;
                                                                                                                           Class20.method909(117, var34);
                                                                                                                        }
                                                                                                                     }

                                                                                                                     Class94.anInt2147 = -1;
                                                                                                                     return true;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var2 = Class28.aClass3_Sub30_Sub1_532.method756(-93);
                                                                                                                  var21 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                                  byte var28 = Class28.aClass3_Sub30_Sub1_532.method760(false);
                                                                                                                  var31 = false;
                                                                                                                  if(-1L != ~(Long.MIN_VALUE & var2)) {
                                                                                                                     var31 = true;
                                                                                                                  }

                                                                                                                  if(!var31) {
                                                                                                                     var41 = Class28.aClass3_Sub30_Sub1_532.method776(true);
                                                                                                                     Class3_Sub19 var40 = new Class3_Sub19();
                                                                                                                     var40.aLong71 = var2;
                                                                                                                     var40.aClass94_2476 = Class41.method1052(-29664, var40.aLong71);
                                                                                                                     var40.aByte2472 = var28;
                                                                                                                     var40.aClass94_2473 = var41;
                                                                                                                     var40.anInt2478 = var21;

                                                                                                                     for(var33 = -1 + Class3_Sub28.anInt2572; ~var33 <= -1; --var33) {
                                                                                                                        var10 = Class3_Sub28_Sub15.aClass3_Sub19Array3694[var33].aClass94_2476.method1559(var40.aClass94_2476, var0 ^ 82);
                                                                                                                        if(-1 == ~var10) {
                                                                                                                           Class3_Sub28_Sub15.aClass3_Sub19Array3694[var33].anInt2478 = var21;
                                                                                                                           Class3_Sub28_Sub15.aClass3_Sub19Array3694[var33].aByte2472 = var28;
                                                                                                                           Class3_Sub28_Sub15.aClass3_Sub19Array3694[var33].aClass94_2473 = var41;
                                                                                                                           if(~var2 == ~Class3_Sub13_Sub16.aLong3202) {
                                                                                                                              Class91.aByte1308 = var28;
                                                                                                                           }

                                                                                                                           Class167.anInt2087 = Class3_Sub13_Sub17.anInt3213;
                                                                                                                           Class94.anInt2147 = -1;
                                                                                                                           return true;
                                                                                                                        }

                                                                                                                        if(var10 < 0) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     }

                                                                                                                     if(Class3_Sub28_Sub15.aClass3_Sub19Array3694.length <= Class3_Sub28.anInt2572) {
                                                                                                                        Class94.anInt2147 = -1;
                                                                                                                        return true;
                                                                                                                     }

                                                                                                                     for(var10 = Class3_Sub28.anInt2572 + -1; ~var33 > ~var10; --var10) {
                                                                                                                        Class3_Sub28_Sub15.aClass3_Sub19Array3694[1 + var10] = Class3_Sub28_Sub15.aClass3_Sub19Array3694[var10];
                                                                                                                     }

                                                                                                                     if(-1 == ~Class3_Sub28.anInt2572) {
                                                                                                                        Class3_Sub28_Sub15.aClass3_Sub19Array3694 = new Class3_Sub19[100];
                                                                                                                     }

                                                                                                                     Class3_Sub28_Sub15.aClass3_Sub19Array3694[1 + var33] = var40;
                                                                                                                     if(Class3_Sub13_Sub16.aLong3202 == var2) {
                                                                                                                        Class91.aByte1308 = var28;
                                                                                                                     }

                                                                                                                     ++Class3_Sub28.anInt2572;
                                                                                                                  } else {
                                                                                                                     if(~Class3_Sub28.anInt2572 == -1) {
                                                                                                                        Class94.anInt2147 = -1;
                                                                                                                        return true;
                                                                                                                     }

                                                                                                                     boolean var37 = false;
                                                                                                                     var2 &= Long.MAX_VALUE;

                                                                                                                     for(var30 = 0; ~Class3_Sub28.anInt2572 < ~var30 && (var2 != Class3_Sub28_Sub15.aClass3_Sub19Array3694[var30].aLong71 || ~var21 != ~Class3_Sub28_Sub15.aClass3_Sub19Array3694[var30].anInt2478); ++var30) {
                                                                                                                        ;
                                                                                                                     }

                                                                                                                     if(var30 < Class3_Sub28.anInt2572) {
                                                                                                                        while(~(-1 + Class3_Sub28.anInt2572) < ~var30) {
                                                                                                                           Class3_Sub28_Sub15.aClass3_Sub19Array3694[var30] = Class3_Sub28_Sub15.aClass3_Sub19Array3694[1 + var30];
                                                                                                                           ++var30;
                                                                                                                        }

                                                                                                                        --Class3_Sub28.anInt2572;
                                                                                                                        Class3_Sub28_Sub15.aClass3_Sub19Array3694[Class3_Sub28.anInt2572] = null;
                                                                                                                     }
                                                                                                                  }

                                                                                                                  Class94.anInt2147 = -1;
                                                                                                                  Class167.anInt2087 = Class3_Sub13_Sub17.anInt3213;
                                                                                                                  return true;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var20 = Class28.aClass3_Sub30_Sub1_532.method766(-95);
                                                                                                               var3 = Class28.aClass3_Sub30_Sub1_532.method766(-72);
                                                                                                               if(var3 == '\uffff') {
                                                                                                                  var3 = -1;
                                                                                                               }

                                                                                                               var21 = Class28.aClass3_Sub30_Sub1_532.method748(-502942936);
                                                                                                               var5 = Class28.aClass3_Sub30_Sub1_532.method758(23);
                                                                                                               var6 = Class28.aClass3_Sub30_Sub1_532.method780(-1);
                                                                                                               if(~var5 == -65536) {
                                                                                                                  var5 = -1;
                                                                                                               }

                                                                                                               if(Class146.method2079(var20, (byte)-25)) {
                                                                                                                  for(var30 = var5; ~var3 <= ~var30; ++var30) {
                                                                                                                     var36 = ((long)var21 << -1381724512) - -((long)var30);
                                                                                                                     var47 = (Class3_Sub1)Class124.aClass130_1659.method1780(var36, 0);
                                                                                                                     if(var47 == null) {
                                                                                                                        if(-1 == var30) {
                                                                                                                           var38 = new Class3_Sub1(var6, Class7.method832((byte)116, var21).aClass3_Sub1_257.anInt2202);
                                                                                                                        } else {
                                                                                                                           var38 = new Class3_Sub1(var6, -1);
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var38 = new Class3_Sub1(var6, var47.anInt2202);
                                                                                                                        var47.method86(-1024);
                                                                                                                     }

                                                                                                                     Class124.aClass130_1659.method1779(1, var38, var36);
                                                                                                                  }
                                                                                                               }

                                                                                                               Class94.anInt2147 = -1;
                                                                                                               return true;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var20 = Class28.aClass3_Sub30_Sub1_532.method748(-502942936);
                                                                                                            var3 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                            if(69999 < ~var20) {
                                                                                                               var3 += '\u8000';
                                                                                                            }

                                                                                                            if(var20 < 0) {
                                                                                                               var25 = null;
                                                                                                            } else {
                                                                                                               var25 = Class7.method832((byte)127, var20);
                                                                                                            }

                                                                                                            for(; ~Class28.aClass3_Sub30_Sub1_532.anInt2595 > ~Class130.anInt1704; Class168.method2277(var6 + -1, var5, var30, var3, (byte)46)) {
                                                                                                               var5 = Class28.aClass3_Sub30_Sub1_532.method778(true);
                                                                                                               var6 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                               var30 = 0;
                                                                                                               if(var6 != 0) {
                                                                                                                  var30 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-52);
                                                                                                                  if(-256 == ~var30) {
                                                                                                                     var30 = Class28.aClass3_Sub30_Sub1_532.method748(-502942936);
                                                                                                                  }
                                                                                                               }

                                                                                                               if(var25 != null && ~var5 <= -1 && ~var25.anIntArray254.length < ~var5) {
                                                                                                                  var25.anIntArray254[var5] = var6;
                                                                                                                  var25.anIntArray317[var5] = var30;
                                                                                                               }
                                                                                                            }

                                                                                                            if(var25 != null) {
                                                                                                               Class20.method909(-128, var25);
                                                                                                            }

                                                                                                            Class3_Sub30_Sub1.method819(false);
                                                                                                            Class3_Sub28_Sub4.anIntArray3565[Class3_Sub28_Sub15.method633(Class62.anInt944++, 31)] = Class3_Sub28_Sub15.method633(32767, var3);
                                                                                                            Class94.anInt2147 = -1;
                                                                                                            return true;
                                                                                                         }
                                                                                                      }
                                                                                                   } else {
                                                                                                      var20 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                      var3 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-102);
                                                                                                      if(-65536 == ~var20) {
                                                                                                         var20 = -1;
                                                                                                      }

                                                                                                      var21 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                      Class3_Sub13_Sub6.method199(var3, var20, var21, -799);
                                                                                                      Class94.anInt2147 = -1;
                                                                                                      return true;
                                                                                                   }
                                                                                                } else {
                                                                                                   var2 = Class28.aClass3_Sub30_Sub1_532.method756(-122);
                                                                                                   Class28.aClass3_Sub30_Sub1_532.method760(false);
                                                                                                   var4 = Class28.aClass3_Sub30_Sub1_532.method756(-124);
                                                                                                   var29 = (long)Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                                   var36 = (long)Class28.aClass3_Sub30_Sub1_532.method794((byte)81);
                                                                                                   long var44 = (var29 << -164903776) + var36;
                                                                                                   var10 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-40);
                                                                                                   boolean var13 = false;
                                                                                                   int var14 = 0;

                                                                                                   label1774:
                                                                                                   while(true) {
                                                                                                      if(var14 >= 100) {
                                                                                                         if(1 >= var10) {
                                                                                                            if((!Class3_Sub15.aBoolean2433 || Class121.aBoolean1641) && !Class3_Sub13_Sub14.aBoolean3166) {
                                                                                                               for(var14 = 0; Class3_Sub28_Sub5.anInt3591 > var14; ++var14) {
                                                                                                                  if(Class114.aLongArray1574[var14] == var2) {
                                                                                                                     var13 = true;
                                                                                                                     break label1774;
                                                                                                                  }
                                                                                                               }
                                                                                                            } else {
                                                                                                               var13 = true;
                                                                                                            }
                                                                                                         }
                                                                                                         break;
                                                                                                      }

                                                                                                      if(Class163_Sub2_Sub1.aLongArray4017[var14] == var44) {
                                                                                                         var13 = true;
                                                                                                         break;
                                                                                                      }

                                                                                                      ++var14;
                                                                                                   }

                                                                                                   if(!var13 && 0 == Class44_Sub1.anInt2622) {
                                                                                                      Class163_Sub2_Sub1.aLongArray4017[Class149.anInt1921] = var44;
                                                                                                      Class149.anInt1921 = (Class149.anInt1921 + 1) % 100;
                                                                                                      var57 = Class3_Sub28_Sub17.method686(Class32.method992(Class28.aClass3_Sub30_Sub1_532, 29488).method1536(116));
                                                                                                      if(-3 != ~var10 && -4 != ~var10) {
                                                                                                         if(~var10 == -2) {
                                                                                                            Class3_Sub13_Sub11.method221(-1, var57, Class16.method903(new Class94[]{Class32.aClass94_592, Class41.method1052(var0 ^ 29581, var2).method1545((byte)-50)}, (byte)-85), Class41.method1052(-29664, var4).method1545((byte)-50), 9);
                                                                                                         } else {
                                                                                                            Class3_Sub13_Sub11.method221(-1, var57, Class41.method1052(-29664, var2).method1545((byte)-50), Class41.method1052(-29664, var4).method1545((byte)-50), 9);
                                                                                                         }
                                                                                                      } else {
                                                                                                         Class3_Sub13_Sub11.method221(-1, var57, Class16.method903(new Class94[]{Class21.aClass94_444, Class41.method1052(-29664, var2).method1545((byte)-50)}, (byte)-59), Class41.method1052(var0 + -29581, var4).method1545((byte)-50), 9);
                                                                                                      }
                                                                                                   }

                                                                                                   Class94.anInt2147 = -1;
                                                                                                   return true;
                                                                                                }
                                                                                             } else {
                                                                                                if(null != Class3_Sub13_Sub10.aFrame3121) {
                                                                                                   Class140.method1862(false, Class3_Sub28.anInt2577, -8914, -1, -1);
                                                                                                }

                                                                                                byte[] var22 = new byte[Class130.anInt1704];
                                                                                                Class28.aClass3_Sub30_Sub1_532.method811((byte)30, 0, var22, Class130.anInt1704);
                                                                                                var24 = Class3_Sub13_Sub3.method178(var22, -4114, Class130.anInt1704, 0);
                                                                                                if(null == Class3_Sub13_Sub7.aFrame3092 && (3 == Class87.anInt1214 || !Class87.aString1202.startsWith("win") || Class106.aBoolean1451)) {
                                                                                                   Class99.method1596(var24, (byte)127, true);
                                                                                                } else {
                                                                                                   Class3_Sub13_Sub24.aClass94_3295 = var24;
                                                                                                   Class94.aBoolean2154 = true;
                                                                                                   Class15.aClass64_351 = Class38.aClass87_665.method1452(new String(var24.method1568(0), "ISO-8859-1"), true);
                                                                                                }

                                                                                                Class94.anInt2147 = -1;
                                                                                                return true;
                                                                                             }
                                                                                          } else {
                                                                                             Class3_Sub30_Sub1.method819(false);
                                                                                             Class149.anInt1925 = Class28.aClass3_Sub30_Sub1_532.method787((byte)59);
                                                                                             Class140_Sub6.anInt2905 = Class3_Sub13_Sub17.anInt3213;
                                                                                             Class94.anInt2147 = -1;
                                                                                             return true;
                                                                                          }
                                                                                       } else {
                                                                                          var20 = Class28.aClass3_Sub30_Sub1_532.method766(-59);
                                                                                          Class3_Sub28_Sub1.method532(var20, var0 ^ 28185);
                                                                                          Class3_Sub28_Sub4.anIntArray3565[Class3_Sub28_Sub15.method633(31, Class62.anInt944++)] = Class3_Sub28_Sub15.method633(var20, 32767);
                                                                                          Class94.anInt2147 = -1;
                                                                                          return true;
                                                                                       }
                                                                                    } else {
                                                                                       var20 = Class28.aClass3_Sub30_Sub1_532.method737(var0 + 84);
                                                                                       var3 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-104);
                                                                                       var21 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-128);
                                                                                       var5 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-102);
                                                                                       var6 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-81);
                                                                                       var30 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                                       if(Class146.method2079(var20, (byte)-25)) {
                                                                                          Class104.aBooleanArray2169[var3] = true;
                                                                                          Class3_Sub13_Sub32.anIntArray3383[var3] = var21;
                                                                                          Class166.anIntArray2073[var3] = var5;
                                                                                          Class3_Sub13_Sub29.anIntArray3359[var3] = var6;
                                                                                          Class163_Sub1_Sub1.anIntArray4009[var3] = var30;
                                                                                       }

                                                                                       Class94.anInt2147 = -1;
                                                                                       return true;
                                                                                    }
                                                                                 } else {
                                                                                    var20 = Class28.aClass3_Sub30_Sub1_532.method780(var0 ^ 82);
                                                                                    var3 = Class28.aClass3_Sub30_Sub1_532.method758(19);
                                                                                    var21 = Class28.aClass3_Sub30_Sub1_532.method780(-1);
                                                                                    if(Class146.method2079(var3, (byte)-25)) {
                                                                                       Class3_Sub31 var23 = (Class3_Sub31)Class3_Sub13_Sub17.aClass130_3208.method1780((long)var20, var0 ^ -83);
                                                                                       var26 = (Class3_Sub31)Class3_Sub13_Sub17.aClass130_3208.method1780((long)var21, 0);
                                                                                       if(null != var26) {
                                                                                          Class3_Sub13_Sub18.method254(null == var23 || var26.anInt2602 != var23.anInt2602, var26, false);
                                                                                       }

                                                                                       if(null != var23) {
                                                                                          var23.method86(-1024);
                                                                                          Class3_Sub13_Sub17.aClass130_3208.method1779(1, var23, (long)var21);
                                                                                       }

                                                                                       Class11 var27 = Class7.method832((byte)113, var20);
                                                                                       if(var27 != null) {
                                                                                          Class20.method909(var0 + 57, var27);
                                                                                       }

                                                                                       var27 = Class7.method832((byte)114, var21);
                                                                                       if(null != var27) {
                                                                                          Class20.method909(119, var27);
                                                                                          Class151_Sub1.method2104(var27, true, 48);
                                                                                       }

                                                                                       if(0 != ~Class3_Sub28_Sub12.anInt3655) {
                                                                                          Class3_Sub8.method124(28, 1, Class3_Sub28_Sub12.anInt3655);
                                                                                       }
                                                                                    }

                                                                                    Class94.anInt2147 = -1;
                                                                                    return true;
                                                                                 }
                                                                              }
                                                                           } else {
                                                                              for(var20 = 0; ~Class163_Sub1.anIntArray2985.length < ~var20; ++var20) {
                                                                                 if(~Class57.anIntArray898[var20] != ~Class163_Sub1.anIntArray2985[var20]) {
                                                                                    Class163_Sub1.anIntArray2985[var20] = Class57.anIntArray898[var20];
                                                                                    Class46.method1087(98, var20);
                                                                                    Class44.anIntArray726[Class3_Sub28_Sub15.method633(Class36.anInt641++, 31)] = var20;
                                                                                 }
                                                                              }

                                                                              Class94.anInt2147 = -1;
                                                                              return true;
                                                                           }
                                                                        }
                                                                     } else {
                                                                        var20 = Class28.aClass3_Sub30_Sub1_532.method766(-107);
                                                                        var3 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                        var21 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                                        if(Class146.method2079(var3, (byte)-25)) {
                                                                           Class28.anInt531 = var20;
                                                                           Class3_Sub9.anInt2309 = var21;
                                                                           if(-3 == ~Class133.anInt1753) {
                                                                              Class139.anInt1823 = Class3_Sub9.anInt2309;
                                                                              Class3_Sub13_Sub25.anInt3315 = Class28.anInt531;
                                                                           }

                                                                           Class47.method1098((byte)-117);
                                                                        }

                                                                        Class94.anInt2147 = -1;
                                                                        return true;
                                                                     }
                                                                  } else {
                                                                     Class39.method1038((byte)-99);
                                                                     Class94.anInt2147 = -1;
                                                                     return true;
                                                                  }
                                                               } else {
                                                                  var20 = Class28.aClass3_Sub30_Sub1_532.method798((byte)-87);
                                                                  var3 = Class28.aClass3_Sub30_Sub1_532.method758(var0 + 92);
                                                                  var21 = Class28.aClass3_Sub30_Sub1_532.method737(var0 ^ -84);
                                                                  var5 = Class28.aClass3_Sub30_Sub1_532.method758(-113);
                                                                  if(Class146.method2079(var3, (byte)-25)) {
                                                                     Class114.method1708(var5 + (var21 << 16), var20, var0 ^ 2474);
                                                                  }

                                                                  Class94.anInt2147 = -1;
                                                                  return true;
                                                               }
                                                            }
                                                         }
                                                      } else {
                                                         Class162.method2204(Class28.aClass3_Sub30_Sub1_532, var0 ^ -43);
                                                         Class94.anInt2147 = -1;
                                                         return true;
                                                      }
                                                   } else {
                                                      var20 = Class28.aClass3_Sub30_Sub1_532.method781((byte)-113);
                                                      var3 = Class28.aClass3_Sub30_Sub1_532.method748(-502942936);
                                                      var21 = Class28.aClass3_Sub30_Sub1_532.method758(-107);
                                                      if(Class146.method2079(var20, (byte)-25)) {
                                                         Class3_Sub13_Sub18.method255(var21, var3, 1);
                                                      }

                                                      Class94.anInt2147 = -1;
                                                      return true;
                                                   }
                                                } else {
                                                   var20 = Class28.aClass3_Sub30_Sub1_532.method748(-502942936);
                                                   var3 = Class28.aClass3_Sub30_Sub1_532.method758(-112);
                                                   Class3_Sub13_Sub23.method281((byte)99, var20, var3);
                                                   Class94.anInt2147 = -1;
                                                   return true;
                                                }
                                             }
                                          } else {
                                             Class163_Sub3.method2228((byte)-122);
                                             Class94.anInt2147 = -1;
                                             return true;
                                          }
                                       } else {
                                          Class167.anInt2087 = Class3_Sub13_Sub17.anInt3213;
                                          var2 = Class28.aClass3_Sub30_Sub1_532.method756(-110);
                                          if(~var2 == -1L) {
                                             Class161.aClass94_2035 = null;
                                             Class94.anInt2147 = -1;
                                             Class11.aClass94_251 = null;
                                             Class3_Sub28_Sub15.aClass3_Sub19Array3694 = null;
                                             Class3_Sub28.anInt2572 = 0;
                                             return true;
                                          } else {
                                             var4 = Class28.aClass3_Sub30_Sub1_532.method756(-126);
                                             Class11.aClass94_251 = Class41.method1052(-29664, var4);
                                             Class161.aClass94_2035 = Class41.method1052(var0 + -29581, var2);
                                             Class140_Sub4_Sub1.aByte3953 = Class28.aClass3_Sub30_Sub1_532.method760(false);
                                             var6 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-86);
                                             if(255 == var6) {
                                                Class94.anInt2147 = -1;
                                                return true;
                                             } else {
                                                Class3_Sub28.anInt2572 = var6;
                                                Class3_Sub19[] var7 = new Class3_Sub19[100];

                                                for(var8 = 0; ~Class3_Sub28.anInt2572 < ~var8; ++var8) {
                                                   var7[var8] = new Class3_Sub19();
                                                   var7[var8].aLong71 = Class28.aClass3_Sub30_Sub1_532.method756(var0 + 4);
                                                   var7[var8].aClass94_2476 = Class41.method1052(var0 + -29581, var7[var8].aLong71);
                                                   var7[var8].anInt2478 = Class28.aClass3_Sub30_Sub1_532.method737(1);
                                                   var7[var8].aByte2472 = Class28.aClass3_Sub30_Sub1_532.method760(false);
                                                   var7[var8].aClass94_2473 = Class28.aClass3_Sub30_Sub1_532.method776(true);
                                                   if(~Class3_Sub13_Sub16.aLong3202 == ~var7[var8].aLong71) {
                                                      Class91.aByte1308 = var7[var8].aByte2472;
                                                   }
                                                }

                                                var32 = false;
                                                var10 = Class3_Sub28.anInt2572;

                                                while(-1 > ~var10) {
                                                   var32 = true;
                                                   --var10;

                                                   for(var11 = 0; ~var10 < ~var11; ++var11) {
                                                      if(-1 > ~var7[var11].aClass94_2476.method1559(var7[var11 - -1].aClass94_2476, var0 ^ 82)) {
                                                         var32 = false;
                                                         Class3_Sub19 var9 = var7[var11];
                                                         var7[var11] = var7[1 + var11];
                                                         var7[var11 + 1] = var9;
                                                      }
                                                   }

                                                   if(var32) {
                                                      break;
                                                   }
                                                }

                                                Class3_Sub28_Sub15.aClass3_Sub19Array3694 = var7;
                                                Class94.anInt2147 = -1;
                                                return true;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           } else {
                              Class107.anInt1452 = Class28.aClass3_Sub30_Sub1_532.method751((byte)-88);
                              Class65.anInt990 = Class28.aClass3_Sub30_Sub1_532.method754(true);

                              while(~Class130.anInt1704 < ~Class28.aClass3_Sub30_Sub1_532.anInt2595) {
                                 Class94.anInt2147 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-60);
                                 Class39.method1038((byte)-82);
                              }

                              Class94.anInt2147 = -1;
                              return true;
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var19) {
         throw Class44.method1067(var19, "ac.C(" + var0 + ')');
      }
   }

   public static void method828(int var0) {
      try {
         aClass16_84 = null;
         aByteArrayArrayArray81 = (byte[][][])null;
         aClass94_85 = null;
         if(var0 > -88) {
            method828(-84);
         }

         aClass61_82 = null;
         aClass11_88 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ac.A(" + var0 + ')');
      }
   }

   static final void method829(int var0) {
      try {
         Class20.method909(var0 + 111, Class56.aClass11_886);
         ++Class75_Sub3.anInt2658;
         if(Class21.aBoolean440 && Class85.aBoolean1167) {
            int var1 = Class126.anInt1676;
            var1 -= Class144.anInt1881;
            if(Class3_Sub13_Sub13.anInt3156 > var1) {
               var1 = Class3_Sub13_Sub13.anInt3156;
            }

            int var2 = Class130.anInt1709;
            if(~(Class3_Sub13_Sub13.anInt3156 + aClass11_88.anInt168) > ~(var1 - -Class56.aClass11_886.anInt168)) {
               var1 = -Class56.aClass11_886.anInt168 + Class3_Sub13_Sub13.anInt3156 + aClass11_88.anInt168;
            }

            var2 -= Class95.anInt1336;
            if(~var2 > ~Class134.anInt1761) {
               var2 = Class134.anInt1761;
            }

            if(Class134.anInt1761 - -aClass11_88.anInt193 < var2 - -Class56.aClass11_886.anInt193) {
               var2 = Class134.anInt1761 + aClass11_88.anInt193 + -Class56.aClass11_886.anInt193;
            }

            if(var0 != -1) {
               aClass61_82 = (Class61)null;
            }

            int var4 = var2 - Class3_Sub2.anInt2218;
            int var3 = var1 + -Class3_Sub15.anInt2421;
            int var6 = var1 + -Class3_Sub13_Sub13.anInt3156 + aClass11_88.anInt247;
            int var7 = aClass11_88.anInt208 + -Class134.anInt1761 + var2;
            int var5 = Class56.aClass11_886.anInt214;
            if(~Class75_Sub3.anInt2658 < ~Class56.aClass11_886.anInt179 && (~var5 > ~var3 || ~(-var5) < ~var3 || var4 > var5 || var4 < -var5)) {
               Class140_Sub4_Sub2.aBoolean3975 = true;
            }

            Class3_Sub16 var8;
            if(Class56.aClass11_886.anObjectArray295 != null && Class140_Sub4_Sub2.aBoolean3975) {
               var8 = new Class3_Sub16();
               var8.aClass11_2449 = Class56.aClass11_886;
               var8.anObjectArray2448 = Class56.aClass11_886.anObjectArray295;
               var8.anInt2447 = var6;
               var8.anInt2441 = var7;
               Class43.method1065(1073376993, var8);
            }

            if(0 == Class3_Sub13_Sub5.anInt3069) {
               if(Class140_Sub4_Sub2.aBoolean3975) {
                  if(Class56.aClass11_886.anObjectArray229 != null) {
                     var8 = new Class3_Sub16();
                     var8.anInt2441 = var7;
                     var8.aClass11_2438 = Class27.aClass11_526;
                     var8.anInt2447 = var6;
                     var8.anObjectArray2448 = Class56.aClass11_886.anObjectArray229;
                     var8.aClass11_2449 = Class56.aClass11_886;
                     Class43.method1065(1073376993, var8);
                  }

                  if(Class27.aClass11_526 != null && client.method42(Class56.aClass11_886) != null) {
                     Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method816(0, 79);
                     ++Class23.anInt456;
                     Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method759(-93, Class56.aClass11_886.anInt279);
                     Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method796(var0 ^ 0, Class27.aClass11_526.anInt191);
                     Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method738(-125, Class27.aClass11_526.anInt279);
                     Class3_Sub13_Sub1.aClass3_Sub30_Sub1_3035.method796(-1, Class56.aClass11_886.anInt191);
                  }
               } else if((-2 == ~Class66.anInt998 || Class3_Sub13_Sub39.method353(-1 + Class3_Sub13_Sub34.anInt3415, ~var0)) && Class3_Sub13_Sub34.anInt3415 > 2) {
                  Class132.method1801((byte)-97);
               } else if(~Class3_Sub13_Sub34.anInt3415 < -1) {
                  Class3_Sub13_Sub8.method203(96);
               }

               Class56.aClass11_886 = null;
            }

         } else {
            if(-2 > ~Class75_Sub3.anInt2658) {
               Class56.aClass11_886 = null;
            }

         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "ac.F(" + var0 + ')');
      }
   }

}

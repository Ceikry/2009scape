
final class Class75_Sub4 extends Class75 {

   static Class94 aClass94_2662 = Class3_Sub4.method108("Zugewiesener Speicher)3", (byte)-123);
   static int[] anIntArray2663;
   static int[] anIntArray2664;
   private static Class94 aClass94_2665 = Class3_Sub4.method108("Choose Option", (byte)-123);
   private int anInt2666;
   static Class94 aClass94_2667 = aClass94_2665;
   static int[] anIntArray2668 = new int[]{-1, 0, 8, 0, 2, 0, 0, 0, 0, 12, 0, 1, 0, 3, 7, 0, 15, 6, 0, 0, 4, 7, -2, -1, 2, 0, 2, 8, 0, 0, 0, 0, -2, 5, 0, 0, 8, 3, 6, 0, 0, 0, -1, 0, -1, 0, 0, 6, -2, 0, 12, 0, 0, 0, -1, -2, 10, 0, 0, 0, 3, 0, -1, 0, 0, 5, 6, 0, 0, 8, -1, -1, 0, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 6, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 12, 2, 0, -2, -2, 20, 0, 0, 10, 0, 15, 0, -1, 0, 8, -2, 0, 0, 0, 8, 0, 12, 0, 0, 7, 0, 0, 0, 0, 0, -1, -1, 0, 4, 5, 0, 0, 0, 6, 0, 0, 0, 0, 8, 9, 0, 0, 0, 2, -1, 0, -2, 0, 4, 14, 0, 0, 0, 24, 0, -2, 5, 0, 0, 0, 10, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 2, 1, 0, 0, 2, -1, 1, 0, 0, 0, 0, 14, 0, 0, 0, 0, 10, 5, 0, 0, 0, 0, 0, -2, 0, 0, 9, 0, 0, 8, 0, 0, 0, 0, -2, 6, 0, 0, 0, -2, 0, 3, 0, 1, 7, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0};
   private int anInt2669;
   static int anInt2670 = 0;
   private int anInt2671;
   private int anInt2672;


   static final void method1349(int var0) {
      try {
         int var1;
         for(var1 = 0; Class66.anInt997 > var1; ++var1) {
            int var2 = Class21.anIntArray441[var1];
            Class140_Sub4_Sub2 var3 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var2];
            int var4 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-122);
            if((var4 & 8) != 0) {
               var4 += Class28.aClass3_Sub30_Sub1_532.method803((byte)-90) << 8;
            }

            int var5;
            int var6;
            if(-1 != ~(64 & var4)) {
               var5 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-57);
               var6 = Class28.aClass3_Sub30_Sub1_532.method786(true);
               var3.method1970(var6, -8, Class44.anInt719, var5);
               var3.anInt2781 = 300 + Class44.anInt719;
               var3.anInt2775 = Class28.aClass3_Sub30_Sub1_532.method754(true);
            }

            if((var4 & 2) != 0) {
               var5 = Class28.aClass3_Sub30_Sub1_532.method786(true);
               var6 = Class28.aClass3_Sub30_Sub1_532.method754(true);
               var3.method1970(var6, -8, Class44.anInt719, var5);
            }

            if((var4 & 16) != 0) {
               var5 = Class28.aClass3_Sub30_Sub1_532.method737(1);
               var6 = Class28.aClass3_Sub30_Sub1_532.method803((byte)-83);
               if('\uffff' == var5) {
                  var5 = -1;
               }

               Class130.method1772(var6, var5, 39, var3);
            }

            if(-1 != ~(var4 & 4)) {
               var3.anInt2772 = Class28.aClass3_Sub30_Sub1_532.method758(-117);
               if(-65536 == ~var3.anInt2772) {
                  var3.anInt2772 = -1;
               }
            }

            if(0 != (var4 & 128)) {
               var5 = Class28.aClass3_Sub30_Sub1_532.method758(46);
               if(var5 == '\uffff') {
                  var5 = -1;
               }

               var6 = Class28.aClass3_Sub30_Sub1_532.method782(-46);
               boolean var7 = true;
               if(0 != ~var5 && 0 != ~var3.anInt2842 && client.method45(Class16.method898((byte)42, var5).anInt542, (byte)-20).anInt1857 < client.method45(Class16.method898((byte)42, var3.anInt2842).anInt542, (byte)-20).anInt1857) {
                  var7 = false;
               }

               if(var7) {
                  var3.anInt2842 = var5;
                  var3.anInt2759 = ('\uffff' & var6) + Class44.anInt719;
                  var3.anInt2761 = 0;
                  var3.anInt2805 = 0;
                  var3.anInt2799 = var6 >> 16;
                  var3.anInt2826 = 1;
                  if(var3.anInt2759 > Class44.anInt719) {
                     var3.anInt2805 = -1;
                  }

                  if(var3.anInt2842 != -1 && ~var3.anInt2759 == ~Class44.anInt719) {
                     int var8 = Class16.method898((byte)42, var3.anInt2842).anInt542;
                     if(0 != ~var8) {
                        Class142 var9 = client.method45(var8, (byte)-20);
                        if(null != var9 && var9.anIntArray1851 != null) {
                           Class89.method1470(var3.anInt2829, var9, 183921384, var3.anInt2819, false, 0);
                        }
                     }
                  }
               }
            }

            if((1 & var4) != 0) {
               if(var3.aClass90_3976.method1474(-1)) {
                  Class3_Sub28_Sub8.method574(var3, false);
               }

               var3.method1987(-1, Class3_Sub28.method522(Class28.aClass3_Sub30_Sub1_532.method766(-84), 27112));
               var3.method1976(var3.aClass90_3976.anInt1245, 2);
               var3.anInt2763 = var3.aClass90_3976.anInt1280;
               if(var3.aClass90_3976.method1474(-1)) {
                  Class70.method1286(var3.anIntArray2755[0], false, (Class111)null, 0, var3, var3.anIntArray2767[0], Class26.anInt501, (Class140_Sub4_Sub1)null);
               }
            }

            if(-1 != ~(var4 & 32)) {
               var3.aClass94_2825 = Class28.aClass3_Sub30_Sub1_532.method776(true);
               var3.anInt2814 = 100;
            }

            if((256 & var4) != 0) {
               var5 = Class28.aClass3_Sub30_Sub1_532.method786(true);
               int[] var12 = new int[var5];
               int[] var13 = new int[var5];
               int[] var14 = new int[var5];

               for(int var15 = 0; ~var15 > ~var5; ++var15) {
                  int var10 = Class28.aClass3_Sub30_Sub1_532.method766(-101);
                  if(var10 == '\uffff') {
                     var10 = -1;
                  }

                  var12[var15] = var10;
                  var13[var15] = Class28.aClass3_Sub30_Sub1_532.method754(true);
                  var14[var15] = Class28.aClass3_Sub30_Sub1_532.method737(1);
               }

               Class3_Sub13_Sub22.method273(var14, (byte)92, var3, var13, var12);
            }

            if((var4 & 512) != 0) {
               var3.anInt2786 = Class28.aClass3_Sub30_Sub1_532.method758(-103);
               var3.anInt2762 = Class28.aClass3_Sub30_Sub1_532.method737(1);
            }
         }

         var1 = 44 % ((27 - var0) / 39);
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "ta.M(" + var0 + ')');
      }
   }

   final void method1337(int var1, boolean var2, int var3) {
      try {
         int var5 = var3 * this.anInt2666 >> 12;
         int var7 = this.anInt2669 * var1 >> 12;
         int var4 = this.anInt2671 * var3 >> 12;
         int var6 = this.anInt2672 * var1 >> 12;
         if(var2) {
            Class145.method2072(this.anInt1104, var4, var6, var5, var7, this.anInt1106, -2);
         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ta.E(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void method1350(byte var0) {
      try {
         anIntArray2664 = null;
         aClass94_2662 = null;
         aClass94_2665 = null;
         if(var0 != 75) {
            method1350((byte)-116);
         }

         aClass94_2667 = null;
         anIntArray2668 = null;
         anIntArray2663 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ta.C(" + var0 + ')');
      }
   }

   Class75_Sub4(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var5, var6, var7);

      try {
         this.anInt2672 = var2;
         this.anInt2666 = var3;
         this.anInt2671 = var1;
         this.anInt2669 = var4;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "ta.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   final void method1341(int var1, int var2, int var3) {
      try {
         int var4 = this.anInt2671 * var2 >> 12;
         int var5 = var2 * this.anInt2666 >> 12;
         int var6 = var3 * this.anInt2672 >> 12;
         int var7 = var3 * this.anInt2669 >> 12;
         Class3_Sub29.method730(var4, this.anInt1101, (byte)121, var7, var5, var6);
         if(var1 != 2) {
            aClass94_2665 = (Class94)null;
         }

      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ta.A(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final boolean method1351(Class153 var0, int var1, int var2, int var3) {
      try {
         byte[] var4 = var0.method2133(var2, (byte)-122, var1);
         if(var3 != -30901) {
            aClass94_2662 = (Class94)null;
         }

         if(var4 != null) {
            Class45.method1082(var4, 98);
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ta.N(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void method1335(int var1, int var2, int var3) {
      try {
         if(var3 == 4898) {
            int var4 = var2 * this.anInt2671 >> 12;
            int var6 = this.anInt2672 * var1 >> 12;
            int var5 = var2 * this.anInt2666 >> 12;
            int var7 = this.anInt2669 * var1 >> 12;
            Class3_Sub13_Sub5.method194(this.anInt1106, var7, this.anInt1101, this.anInt1104, var6, 4096, var5, var4);
         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ta.D(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method1352(int var0, boolean var1, int var2, int var3, int var4) {
      try {
         if(Canvas_Sub2.method57(var3, 104)) {
            Class158.method2183(var2, var1, var4, 235, var0, Class140.aClass11ArrayArray1834[var3]);
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "ta.K(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void method1353(Class3_Sub28_Sub16_Sub2[] var0, int var1, Class153 var2) {
      try {
         Class3_Sub13_Sub17.aClass153_3210 = var2;
         Class140.aClass3_Sub28_Sub16_Sub2Array1839 = var0;
         if(var1 == -11931) {
            Class3_Sub24_Sub4.aBooleanArray3503 = new boolean[Class140.aClass3_Sub28_Sub16_Sub2Array1839.length];
            Class134.aClass61_1758.method1211(-68);
            int var3 = Class3_Sub13_Sub17.aClass153_3210.method2120(Class3_Sub8.aClass94_2304, (byte)-30);
            int[] var4 = Class3_Sub13_Sub17.aClass153_3210.method2141((byte)-128, var3);

            for(int var5 = 0; ~var4.length < ~var5; ++var5) {
               Class134.aClass61_1758.method1215(true, Class124.method1747(new Class3_Sub30(Class3_Sub13_Sub17.aClass153_3210.method2133(var3, (byte)-122, var4[var5])), true));
            }

         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "ta.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final void method1354(int var0, int var1, boolean var2, int var3, int var4) {
      try {
         if(var4 >= Class159.anInt2020 && var4 <= Class57.anInt902) {
            var0 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var0, (byte)0, Class101.anInt1425);
            var3 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var3, (byte)0, Class101.anInt1425);
            Class3_Sub13_Sub32.method320(var1, var4, var3, (byte)-123, var0);
         }

         if(!var2) {
            aClass94_2665 = (Class94)null;
         }

      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "ta.L(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void method1355(boolean var0) {
      try {
         Class3_Sub25.aClass129_2552.method1770(-124);

         int var1;
         for(var1 = 0; var1 < 32; ++var1) {
            Class163_Sub1.aLongArray2986[var1] = 0L;
         }

         if(var0) {
            for(var1 = 0; var1 < 32; ++var1) {
               Class134.aLongArray1766[var1] = 0L;
            }

            Class133.anInt1754 = 0;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ta.O(" + var0 + ')');
      }
   }

}

package org.runite.jagex;

// TODO LDToolkit
public final class Class74 {

   static int anInt1092;
   static int clipLeft = 0;
   static int anInt1094;
   static int clipTop = 0;
   static int clipRight = 0;
   static int[] anIntArray1097;
   static int[] anIntArray1098;
   static int clipBottom = 0;
   static int[] buffer;


   static void method1310() {
      anIntArray1097 = null;
      anIntArray1098 = null;
   }

   static void method1311(int var0, int var1, int var2, int var3, int var4) {
      method1317(var0, var1, var2, var4);
      method1317(var0, var1 + var3 - 1, var2, var4);
      method1318(var0, var1, var3, var4);
      method1318(var0 + var2 - 1, var1, var3, var4);
   }

   public static void fillRectangle(int x, int y, int width, int height, int rgb, int opacity) {
      if(x < clipLeft) {
         width -= clipLeft - x;
         x = clipLeft;
      }

      if(y < clipTop) {
         height -= clipTop - y;
         y = clipTop;
      }

      if(x + width > clipRight) {
         width = clipRight - x;
      }

      if(y + height > clipBottom) {
         height = clipBottom - y;
      }

      rgb = ((rgb & 16711935) * opacity >> 8 & 16711935) + ((rgb & '\uff00') * opacity >> 8 & '\uff00');
      int invertedOpacity = 256 - opacity;
      int var7 = anInt1092 - width;
      int var8 = x + y * anInt1092;

      for(int lx = 0; lx < height; ++lx) {
         for(int ly = -width; ly < 0; ++ly) {
            int old = buffer[var8];
            old = ((old & 16711935) * invertedOpacity >> 8 & 16711935) + ((old & '\uff00') * invertedOpacity >> 8 & '\uff00');
            buffer[var8++] = rgb + old;
         }

         var8 += var7;
      }

   }

   private static void method1313(int var0, int var1) {
      if(var0 >= clipLeft && var1 >= clipTop && var0 < clipRight && var1 < clipBottom) {
         buffer[var0 + var1 * anInt1092] = 16776960;
      }
   }

   static void method1314(int[] var0, int[] var1) {
      if(var0.length == clipBottom - clipTop && var1.length == clipBottom - clipTop) {
         anIntArray1097 = var0;
         anIntArray1098 = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static void method1315(int var0, int var1, int var2, int var3, int var4, int var5) {
      method1321(var0, var1, var2, var4, var5);
      method1321(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method1327(var0, var1 + 1, var3 - 2, var4, var5);
         method1327(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   static void method1316(int[] var0) {
      clipLeft = var0[0];
      clipTop = var0[1];
      clipRight = var0[2];
      clipBottom = var0[3];
      method1310();
   }

   static void method1317(int var0, int var1, int var2, int var3) {
      if(var1 >= clipTop && var1 < clipBottom) {
         if(var0 < clipLeft) {
            var2 -= clipLeft - var0;
            var0 = clipLeft;
         }

         if(var0 + var2 > clipRight) {
            var2 = clipRight - var0;
         }

         int var4 = var0 + var1 * anInt1092;

         for(int var5 = 0; var5 < var2; ++var5) {
            buffer[var4 + var5] = var3;
         }

      }
   }

   static void method1318(int var0, int var1, int var2, int var3) {
      if(var0 >= clipLeft && var0 < clipRight) {
         if(var1 < clipTop) {
            var2 -= clipTop - var1;
            var1 = clipTop;
         }

         if(var1 + var2 > clipBottom) {
            var2 = clipBottom - var1;
         }

         int var4 = var0 + var1 * anInt1092;

         for(int var5 = 0; var5 < var2; ++var5) {
            buffer[var4 + var5 * anInt1092] = var3;
         }

      }
   }

   static void method1319(int[] var0, int var1, int var2) {
      buffer = var0;
      anInt1092 = var1;
      anInt1094 = var2;
      method1324(0, 0, var1, var2);
   }

   static void method1320() {
      int var0 = 0;

      int var1;
      for(var1 = anInt1092 * anInt1094 - 7; var0 < var1; buffer[var0++] = 0) {
         buffer[var0++] = 0;
         buffer[var0++] = 0;
         buffer[var0++] = 0;
         buffer[var0++] = 0;
         buffer[var0++] = 0;
         buffer[var0++] = 0;
         buffer[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; buffer[var0++] = 0) {
      }

   }

   private static void method1321(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= clipTop && var1 < clipBottom) {
         if(var0 < clipLeft) {
            var2 -= clipLeft - var0;
            var0 = clipLeft;
         }

         if(var0 + var2 > clipRight) {
            var2 = clipRight - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * anInt1092;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (buffer[var12] >> 16 & 255) * var5;
            int var10 = (buffer[var12] >> 8 & 255) * var5;
            int var11 = (buffer[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            buffer[var12++] = var14;
         }

      }
   }

   static void method1322(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      int var8 = var6 >= 0?var6:-var6;
      int var9 = var7 >= 0?var7:-var7;
      int var10 = var8;
      if(var8 < var9) {
         var10 = var9;
      }

      if(var10 != 0) {
         int var11 = (var6 << 16) / var10;
         int var12 = (var7 << 16) / var10;
         if(var12 <= var11) {
            var11 = -var11;
         } else {
            var12 = -var12;
         }

         int var13 = var5 * var12 >> 17;
         int var14 = var5 * var12 + 1 >> 17;
         int var15 = var5 * var11 >> 17;
         int var16 = var5 * var11 + 1 >> 17;
         var0 -= Class51.method1139();
         var1 -= Class51.method1153();
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var6 + var13;
         int var21 = var1 + var15;
         int var22 = var1 - var16;
         int var23 = var1 + var7 - var16;
         int var24 = var1 + var7 + var15;
         Class51.method1148(var17, var18, var19);
         Class51.method1144(var21, var22, var23, var17, var18, var19, var4);
         Class51.method1148(var17, var19, var20);
         Class51.method1144(var21, var23, var24, var17, var19, var20, var4);
      }
   }

   static void method1323(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < clipLeft) {
         var2 -= clipLeft - var0;
         var0 = clipLeft;
      }

      if(var1 < clipTop) {
         var3 -= clipTop - var1;
         var1 = clipTop;
      }

      if(var0 + var2 > clipRight) {
         var2 = clipRight - var0;
      }

      if(var1 + var3 > clipBottom) {
         var3 = clipBottom - var1;
      }

      int var5 = anInt1092 - var2;
      int var6 = var0 + var1 * anInt1092;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            buffer[var6++] = var4;
         }

         var6 += var5;
      }

   }

   static void method1324(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > anInt1092) {
         var2 = anInt1092;
      }

      if(var3 > anInt1094) {
         var3 = anInt1094;
      }

      clipLeft = var0;
      clipTop = var1;
      clipRight = var2;
      clipBottom = var3;
      method1310();
   }

   static void method1325(int[] var0) {
      var0[0] = clipLeft;
      var0[1] = clipTop;
      var0[2] = clipRight;
      var0[3] = clipBottom;
   }

   static void method1326(int var0, int var1, int var2, int var3) {
      if(clipLeft < var0) {
         clipLeft = var0;
      }

      if(clipTop < var1) {
         clipTop = var1;
      }

      if(clipRight > var2) {
         clipRight = var2;
      }

      if(clipBottom > var3) {
         clipBottom = var3;
      }

      method1310();
   }

   private static void method1327(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= clipLeft && var0 < clipRight) {
         if(var1 < clipTop) {
            var2 -= clipTop - var1;
            var1 = clipTop;
         }

         if(var1 + var2 > clipBottom) {
            var2 = clipBottom - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * anInt1092;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (buffer[var12] >> 16 & 255) * var5;
            int var10 = (buffer[var12] >> 8 & 255) * var5;
            int var11 = (buffer[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            buffer[var12] = var14;
            var12 += anInt1092;
         }

      }
   }

   static void method1328(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method1317(var0, var1, var2 + 1, var4);
         } else {
            method1317(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if(var2 == 0) {
         if(var3 >= 0) {
            method1318(var0, var1, var3 + 1, var4);
         } else {
            method1318(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if(var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if(var2 > var3) {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if(var0 < clipLeft) {
               var1 += var5 * (clipLeft - var0);
               var0 = clipLeft;
            }

            if(var2 >= clipRight) {
               var2 = clipRight - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if(var6 >= clipTop && var6 < clipBottom) {
                  buffer[var0 + var6 * anInt1092] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += '\u8000';
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < clipTop) {
               var0 += var5 * (clipTop - var1);
               var1 = clipTop;
            }

            if(var3 >= clipBottom) {
               var3 = clipBottom - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if(var6 >= clipLeft && var6 < clipRight) {
                  buffer[var6 + var1 * anInt1092] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   private static void method1329(int var0, int var1, int var2) {
      if(var2 == 0) {
         method1313(var0, var1);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < clipTop) {
            var4 = clipTop;
         }

         int var5 = var1 + var2 + 1;
         if(var5 > clipBottom) {
            var5 = clipBottom;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if(var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if(var12 < clipLeft) {
               var12 = clipLeft;
            }

            var13 = var0 + var8;
            if(var13 > clipRight) {
               var13 = clipRight;
            }

            var14 = var12 + var6 * anInt1092;

            for(var15 = var12; var15 < var13; ++var15) {
               buffer[var14++] = 16776960;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < clipLeft) {
               var12 = clipLeft;
            }

            var13 = var0 + var8;
            if(var13 > clipRight - 1) {
               var13 = clipRight - 1;
            }

            var14 = var12 + var6 * anInt1092;

            for(var15 = var12; var15 <= var13; ++var15) {
               buffer[var14++] = 16776960;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   static void method1330(int var0, int var1, int var2, int var4) {
      if(var4 != 0) {
         if(var4 == 256) {
            method1329(var0, var1, var2);
         } else {
            if(var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (16776960 >> 16 & 255) * var4;
            int var7 = (16776960 >> 8 & 255) * var4;
            int var8 = 0;
            int var12 = var1 - var2;
            if(var12 < clipTop) {
               var12 = clipTop;
            }

            int var13 = var1 + var2 + 1;
            if(var13 > clipBottom) {
               var13 = clipBottom;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if(var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var21;
            int var20;
            int var23;
            int var22;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if(var20 < clipLeft) {
                  var20 = clipLeft;
               }

               var21 = var0 + var16;
               if(var21 > clipRight) {
                  var21 = clipRight;
               }

               var22 = var20 + var14 * anInt1092;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (buffer[var22] >> 16 & 255) * var5;
                  var10 = (buffer[var22] >> 8 & 255) * var5;
                  var11 = (buffer[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  buffer[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if(var20 < clipLeft) {
                  var20 = clipLeft;
               }

               var21 = var0 + var16;
               if(var21 > clipRight - 1) {
                  var21 = clipRight - 1;
               }

               var22 = var20 + var14 * anInt1092;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (buffer[var22] >> 16 & 255) * var5;
                  var10 = (buffer[var22] >> 8 & 255) * var5;
                  var11 = (buffer[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  buffer[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   static void method1331() {
      clipLeft = 0;
      clipTop = 0;
      clipRight = anInt1092;
      clipBottom = anInt1094;
      method1310();
   }

   static void method1332(int var0, int var1, int[] var3, int[] var4) {
      int var5 = var0 + var1 * anInt1092;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            buffer[var6++] = 0;
         }

         var5 += anInt1092;
      }

   }

}

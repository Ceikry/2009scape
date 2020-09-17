package org.runite.jagex;

import org.rs09.client.Linkable;
import org.rs09.client.data.Queue;

abstract class AbstractIndexedSprite {

   int width;
   static int anInt1462;
   static int anInt1463 = -16 + (int)(Math.random() * 33.0D);
   int anInt1464;
   static long aLong1465 = 0L;
   int anInt1467;
   int height;
   int anInt1469;
   int anInt1470;


   static void method1662(Linkable var0, Linkable var1) {
      try {
         if(null != var0.previous) {
            var0.unlink();
         }

         var0.next = var1;
         var0.previous = var1.previous;
         var0.previous.next = var0;
         var0.next.previous = var0;
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "ok.C(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + -16 + ')');
      }
   }

   static Queue method1664(int var0, int var1) {
      try {
         Queue var3 = new Queue();

         for(Class3_Sub28_Sub3 var4 = (Class3_Sub28_Sub3)Class134.aClass61_1758.method1222(); var4 != null; var4 = (Class3_Sub28_Sub3)Class134.aClass61_1758.method1221()) {
            if(var4.aBoolean3553 && var4.method537(var1, var0)) {
               var3.offer(var4);
            }
         }

         return var3;
      } catch (RuntimeException var5) {
         throw Class44.clientError(var5, "ok.B(" + var0 + ',' + var1 + ',' + (byte) -118 + ')');
      }
   }

   static void method1665(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = var5 + var2;
         int var8 = -var5 + var4;
         if(var0 != -19619) {
            method1665(-17, 11, -118, -38, 115, -2, 113);
         }

         int var9 = var5 + var6;

         int var11;
         for(var11 = var2; var7 > var11; ++var11) {
            Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var11], var6, -91, var1, var3);
         }

         for(var11 = var4; var8 < var11; --var11) {
            Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var11], var6, -113, var1, var3);
         }

         int var10 = -var5 + var1;

         for(var11 = var7; var11 <= var8; ++var11) {
            int[] var12 = Class38.anIntArrayArray663[var11];
            Class3_Sub13_Sub23_Sub1.method282(var12, var6, -111, var9, var3);
            Class3_Sub13_Sub23_Sub1.method282(var12, var10, -124, var1, var3);
         }

      } catch (RuntimeException var13) {
         throw Class44.clientError(var13, "ok.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   abstract void method1666(int var1, int var2, int var3);

   abstract void method1667(int var1, int var2);

}

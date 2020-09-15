package org.runite.jagex;

import org.rs09.client.collections.HashTable;

import java.util.Objects;

final class Class93 {

   static int anInt1325;
   static RSString aClass94_1326 = RSString.of(")2");
   private int anInt1327;
   static byte[][][] aByteArrayArrayArray1328;
   private final Queue aClass13_1329 = new Queue();
   private int anInt1331;
   private HashTable aHashTable_1332;


   final void put(byte var1, Object var2, long var3) {
      try {
         this.method1518(var3, (byte)-124);
         if(var1 > -72) {
            this.aHashTable_1332 = (HashTable)null;
         }

         if(this.anInt1327 == 0) {
            Class3_Sub28_Sub7 var5 = (Class3_Sub28_Sub7)this.aClass13_1329.poll();
            Objects.requireNonNull(var5).unlink();
            var5.unlinkNode();
         } else {
            --this.anInt1327;
         }

         Class3_Sub28_Sub7_Sub1 var7 = new Class3_Sub28_Sub7_Sub1(var2);
         this.aHashTable_1332.put(var3, var7);
         this.aClass13_1329.offer(var7);
         var7.nodeKey = 0L;
      } catch (RuntimeException var6) {
         throw Class44.clientError(var6, "n.F(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   static void method1516(int var0, int var1) {
      try {
         Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(3, var0);
         var2.a();
         if(var1 < 87) {
            aClass94_1326 = (RSString)null;
         }

      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "n.L(" + var0 + ',' + var1 + ')');
      }
   }

  /** static final void method1517(byte var0) {
      try {
         Class139.aFontMetrics1822 = null;
         TextCore.Helvetica = null;
         if(var0 != -118) {
            method1516(64, 82);
         }

         Class129_Sub1.anImage2695 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "n.J(" + var0 + ')');
      }
   }**/
   
   static void method1517() {
	      try {
	         Class139.aFontMetrics1822 = null;

             //MillisTimer.anImage2695 = null;
	      } catch (RuntimeException var2) {
	         throw Class44.clientError(var2, "n.J(" + (byte) -118 + ')');
	      }
	   }

   final void method1518(long var1, byte var3) {
      try {
         Class3_Sub28_Sub7 var4 = (Class3_Sub28_Sub7)this.aHashTable_1332.get(var1);
         if(var3 == -124) {
            if(null != var4) {
               var4.unlink();
               var4.unlinkNode();
               ++this.anInt1327;
            }

         }
      } catch (RuntimeException var5) {
         throw Class44.clientError(var5, "n.C(" + var1 + ',' + var3 + ')');
      }
   }

   static int bitwiseXOR(int var0, int var1) {
      try {
         return var0 ^ var1;
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "n.E(" + var0 + ',' + var1 + ')');
      }
   }

   final int method1520() {
      try {
         int var2 = 0;

         for(Class3_Sub28_Sub7 var3 = (Class3_Sub28_Sub7)this.aClass13_1329.getFront(); var3 != null; var3 = (Class3_Sub28_Sub7)this.aClass13_1329.next()) {
            if(!var3.method568()) {
               ++var2;
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "n.D(" + -12623 + ')');
      }
   }

   final void method1522(int var1, int var2) {
      try {
         if(null != Class3_Sub28_Sub20.aClass118_3794) {
            for(Class3_Sub28_Sub7 var3 = (Class3_Sub28_Sub7)this.aClass13_1329.getFront(); null != var3; var3 = (Class3_Sub28_Sub7)this.aClass13_1329.next()) {
               if(!var3.method568()) {
                  if(++var3.nodeKey > (long)var2) {
                     Class3_Sub28_Sub7 var4 = Class3_Sub28_Sub20.aClass118_3794.method1725(var3);
                     this.aHashTable_1332.put(var3.linkableKey, var4);
                     Class45.method1084(var3, var4);
                     var3.unlink();
                     var3.unlinkNode();
                  }
               } else if(null == var3.method567()) {
                  var3.unlink();
                  var3.unlinkNode();
                  ++this.anInt1327;
               }
            }
         }

         if(var1 > -124) {
            this.method1518(24L, (byte)-18);
         }

      } catch (RuntimeException var5) {
         throw Class44.clientError(var5, "n.G(" + var1 + ',' + var2 + ')');
      }
   }

   final void method1523(byte var1) {
      try {
         for(Class3_Sub28_Sub7 var2 = (Class3_Sub28_Sub7)this.aClass13_1329.getFront(); var2 != null; var2 = (Class3_Sub28_Sub7)this.aClass13_1329.next()) {
            if(var2.method568()) {
               var2.unlink();
               var2.unlinkNode();
               ++this.anInt1327;
            }
         }

         if(var1 > -98) {
            this.anInt1331 = 56;
         }

      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "n.B(" + var1 + ')');
      }
   }

   final void method1524() {
      try {
         this.aClass13_1329.clear();
         this.aHashTable_1332.clear();
         this.anInt1327 = this.anInt1331;
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "n.H(" + 3 + ')');
      }
   }

   Class93(int var1) {
      try {
         this.anInt1331 = var1;

         int var2;
         for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         }

         this.anInt1327 = var1;
         this.aHashTable_1332 = new HashTable(var2);
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "n.<init>(" + var1 + ')');
      }
   }

   static void method1525(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = Class40.method1040(Class57.anInt902, var3, Class159.anInt2020);
         int var7 = Class40.method1040(Class57.anInt902, var5, Class159.anInt2020);
         int var8 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var4, Class101.anInt1425);

         int var9 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var2, Class101.anInt1425);

         for(int var10 = var6; var10 <= var7; ++var10) {
            Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var10], var8, 3074 + -2974, var9, var1);
         }

      } catch (RuntimeException var11) {
         throw Class44.clientError(var11, "n.I(" + 3074 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   final Object get(long key) {
      try {
         Class3_Sub28_Sub7 var4 = (Class3_Sub28_Sub7)this.aHashTable_1332.get(key);
         if(null == var4) {
            return null;
         } else {
            Object var5 = var4.method567();
            if(var5 == null) {
               var4.unlink();
               var4.unlinkNode();
               ++this.anInt1327;
               return null;
            } else {
               if(var4.method568()) {
                  Class3_Sub28_Sub7_Sub1 var6 = new Class3_Sub28_Sub7_Sub1(var5);
                  this.aHashTable_1332.put(var4.linkableKey, var6);
                  this.aClass13_1329.offer(var6);
                  var6.nodeKey = 0L;
                  var4.unlink();
                  var4.unlinkNode();
               } else {
                  this.aClass13_1329.offer(var4);
                  var4.nodeKey = 0L;
               }

               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw Class44.clientError(var7, "n.K(" + key + ',' + (byte) 121 + ')');
      }
   }

}

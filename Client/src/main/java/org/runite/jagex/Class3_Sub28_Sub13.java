package org.runite.jagex;

import org.rs09.client.Linkable;

public final class Class3_Sub28_Sub13 extends Node {

   static int anInt3657;
   int anInt3658;
   static int anInt3660 = 0;
   int anInt3662;
   Class130 aClass130_3663;
   private RSString aClass94_3664;
   static boolean aBoolean3665 = true;
   private Class130 aClass130_3666;
   private int anInt3667;


   private void method615(int var1, RSByteBuffer var2) {
      try {

         if(var1 == 1) {
            this.anInt3662 = var2.readUnsignedByte();
         } else if (var1 == 2) {
            this.anInt3658 = var2.readUnsignedByte();
         } else if (3 == var1) {
            this.aClass94_3664 = var2.getString();
         } else if (var1 == 4) {
            this.anInt3667 = var2.readInt();
         } else if (5 == var1 || var1 == 6) {
            int var4 = var2.getShort();
            this.aClass130_3663 = new Class130(Class95.method1585((byte) 94, var4));

            for (int var5 = 0; var5 < var4; ++var5) {
               int var6 = var2.readInt();
               Object var7;
               if (var1 == 5) {
                  var7 = new Class3_Sub29(var2.getString());
               } else {
                  var7 = new Class3_Sub18(var2.readInt());
               }

               this.aClass130_3663.method1779((Linkable) var7, (long) var6);
            }
         }

      } catch (RuntimeException var8) {
         throw Class44.clientError(var8, "ml.C(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + (byte) -84 + ')');
      }
   }

   final RSString method616(int var1, byte var2) {
      try {
         if(null == this.aClass130_3663) {
            return this.aClass94_3664;
         } else {
            Class3_Sub29 var4 = (Class3_Sub29)this.aClass130_3663.method1780((long)var1);
            return null == var4?this.aClass94_3664:var4.aClass94_2586;
         }
      } catch (RuntimeException var5) {
         throw Class44.clientError(var5, "ml.S(" + var1 + ',' + var2 + ')');
      }
   }

   final boolean method617(RSString var1) {
      try {
         if (null != this.aClass130_3663) {

            if (null == this.aClass130_3666) {
               this.method618();
            }

            for (Class3_Sub10 var3 = (Class3_Sub10) this.aClass130_3666.method1780(var1.method1538(23)); var3 != null; var3 = (Class3_Sub10) this.aClass130_3666.method1784()) {
               if (var3.aClass94_2341.equalsString(var1)) {
                  return true;
               }
            }

         }
         return false;
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "ml.F(" + (var1 != null?"{...}":"null") + ',' + 8729 + ')');
      }
   }

   private void method618() {
      try {
         this.aClass130_3666 = new Class130(this.aClass130_3663.method1785(81));
         Class3_Sub29 var2 = (Class3_Sub29)this.aClass130_3663.method1776(88);
         while(var2 != null) {
            Class3_Sub10 var3 = new Class3_Sub10(var2.aClass94_2586, (int)var2.linkableKey);
            this.aClass130_3666.method1779(var3, var2.aClass94_2586.method1538(61));
            var2 = (Class3_Sub29)this.aClass130_3663.method1778(-99);
         }

      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "ml.O(" + 0 + ')');
      }
   }

   static LDIndexedSprite[] method619(byte var0, int var1, CacheIndex var2) {
      try {
         return Class140_Sub7.method2029((byte)-119, var2, var1)?(var0 <= 52?(LDIndexedSprite[])null: Unsorted.method1281()):null;
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "ml.A(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   final int method620(int var2) {
      try {
         if(this.aClass130_3663 == null) {
            return this.anInt3667;
         } else {
            Class3_Sub18 var3 = (Class3_Sub18)this.aClass130_3663.method1780((long)var2);
            return var3 != null?var3.anInt2467:this.anInt3667;
         }
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "ml.E(" + 0 + ',' + var2 + ')');
      }
   }

   final boolean method621(int var2) {
      try {
         if(null == this.aClass130_3663) {
            return false;
         } else {
            if(this.aClass130_3666 == null) {
               this.method622();
            }

            Class3_Sub18 var3 = (Class3_Sub18)this.aClass130_3666.method1780((long)var2);
            return var3 != null;
         }
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "ml.B(" + -8143 + ',' + var2 + ')');
      }
   }

   private void method622() {
      try {
         this.aClass130_3666 = new Class130(this.aClass130_3663.method1785(93));

         for(Class3_Sub18 var2 = (Class3_Sub18)this.aClass130_3663.method1776(123); null != var2; var2 = (Class3_Sub18)this.aClass130_3663.method1778(-88)) {
            Class3_Sub18 var4 = new Class3_Sub18((int)var2.linkableKey);
            this.aClass130_3666.method1779(var4, (long)var2.anInt2467);
         }

      } catch (RuntimeException var5) {
         throw Class44.clientError(var5, "ml.D(" + 109 + ')');
      }
   }

   final void method625(RSByteBuffer var1) {
      try {
         while(true) {
            int var3 = var1.readUnsignedByte();
            if(var3 == 0) {
               return;
            }

            this.method615(var3, var1);
         }
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "ml.Q(" + (var1 != null?"{...}":"null") + ',' + -122 + ')');
      }
   }

   public Class3_Sub28_Sub13() {
      this.aClass94_3664 = Class47.aClass94_750;
   }

}

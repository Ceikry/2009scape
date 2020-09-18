package org.runite.jagex;

import org.rs09.client.Node;
import org.rs09.client.data.NodeCache;

final class Class3_Sub28_Sub19 extends Node {

   static CacheIndex aClass153_3772;
   static int anInt3773;
   static int anInt3775 = 0;
   static NodeCache aClass47_3776 = new NodeCache(64);
   static RSString aClass94_3777 = RSString.parse(" x ");
   Class140_Sub6 aClass140_Sub6_3778;
   static boolean aBoolean3779 = false;
   static int[] anIntArray3780 = new int[32];


   static boolean method715(RSInterface var1) {
      try {
         if(205 == var1.anInt189) {
            Class159.anInt2023 = 250;
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "ud.B(" + 205 + ',' + "null" + ')');
      }
   }

   static void method716() {
      try {
         Class136.aReferenceCache_1772.clear();

      } catch (RuntimeException var2) {
         throw Class44.clientError(var2, "ud.A(" + 14073 + ')');
      }
   }

   Class3_Sub28_Sub19(Class140_Sub6 var1) {
      try {
         this.aClass140_Sub6_3778 = var1;
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "ud.<init>(" + (var1 != null?"{...}":"null") + ')');
      }
   }

}

package org.runite.jagex;

import java.util.Objects;

class Class163 {

   static Class47 aClass47_2041 = new Class47(64);
   static int[] anIntArray2043 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   static RSString aClass94_2044 = RSString.of("cookieprefix");
   static RSString COMMAND_ERROR_TEST = RSString.of("::errortest");
   static int localNPCCount = 0;


   static void method2209(byte var0, int var1, int var2) {
      try {
         if(var0 >= -99) {
            method2209((byte)57, -14, 120);
         }

         Class79 var3 = CS2Script.method378(var2, (byte)127);
         int var4 = Objects.requireNonNull(var3).anInt1128;
         int var6 = var3.anInt1125;
         int var5 = var3.anInt1123;
         int var7 = Class3_Sub6.anIntArray2288[var6 - var5];
         if(var1 < 0 || var7 < var1) {
            var1 = 0;
         }

         var7 <<= var5;
         Class3_Sub13_Sub23.method281(var1 << var5 & var7 | ~var7 & Class57.anIntArray898[var4], var4);
      } catch (RuntimeException var8) {
         throw Class44.clientError(var8, "wd.K(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

}

package org.runite.jagex;

import org.rs09.client.Linkable;

final class Class3_Sub31 extends Linkable {

   int anInt2602;
   int anInt2603;
   static Class93 aClass93_2604 = new Class93(64);
   static RSString COMMAND_BREAK_JS5_CLIENT_CONNECTION = RSString.of("::clientjs5drop");
   static int[] anIntArray2606;
   static int countryId;
   static RSString aClass94_2608 = RSString.of(")4l=");


   static void method820(int var0, int var1) {
      try {
         KeyboardListener.aClass93_1911.method1522(-127, var0);
         if(var1 == 64) {
            Unsorted.aClass93_1131.method1522(-126, var0);
         }
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "wk.C(" + var0 + ',' + var1 + ')');
      }
   }

   static RSString[] method822(RSString[] var1) {
      try {
         RSString[] var2 = new RSString[5];

          for(int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = RenderAnimationDefinition.method903(new RSString[]{
                    Class72.method1298((byte)9, var3), Class3_Sub28_Sub4.aClass94_3577});
            if(var1 != null && null != var1[var3]) {
               var2[var3] = RenderAnimationDefinition.method903(new RSString[]{var2[var3], var1[var3]});
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "wk.A(" + 19406 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

}

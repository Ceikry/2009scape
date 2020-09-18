package org.runite.jagex;

import org.rs09.client.Linkable;
import org.rs09.client.data.ReferenceCache;

final class Class3_Sub31 extends Linkable {

   int anInt2602;
   int anInt2603;
   static ReferenceCache aReferenceCache_2604 = new ReferenceCache(64);
   static RSString COMMAND_BREAK_JS5_CLIENT_CONNECTION = RSString.parse("::clientjs5drop");
   static int[] anIntArray2606;
   static int countryId;
   static RSString aClass94_2608 = RSString.parse(")4l=");


   static void method820(int var0, int var1) {
      try {
         KeyboardListener.aReferenceCache_1911.sweep(var0);
         if(var1 == 64) {
            Unsorted.aReferenceCache_1131.sweep(var0);
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

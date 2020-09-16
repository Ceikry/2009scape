package org.runite.jagex;

final class Class106 {

   static boolean aBoolean1441 = true;
   static int anInt1442 = 0;
   static Class67 aClass67_1443;
   static short aShort1444 = 256;
   static int anInt1446 = 0;
   int anInt1447;
   int anInt1449;
   int anInt1450;
   static boolean hasInternetExplorer6 = false;


   static void method1642(RSString var1) {
      try {
         if(null != PacketParser.aClass3_Sub19Array3694) {

             long var3 = var1.toLong();
            int var2 = 0;
            if(var3 != 0L) {
               while(PacketParser.aClass3_Sub19Array3694.length > var2 && var3 != PacketParser.aClass3_Sub19Array3694[var2].linkableKey) {
                  ++var2;
               }

               if(var2 < PacketParser.aClass3_Sub19Array3694.length && null != PacketParser.aClass3_Sub19Array3694[var2]) {
                  Class3_Sub13_Sub1.outgoingBuffer.putOpcode(162);
                  Class3_Sub13_Sub1.outgoingBuffer.writeLong(PacketParser.aClass3_Sub19Array3694[var2].linkableKey);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw Class44.clientError(var5, "od.C(" + 3803 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static int method1643(boolean var1, int var2, int var3) {
      try {

          Class3_Sub25 var4 = (Class3_Sub25)Class3_Sub2.aHashTable_2220.get((long)var2);
         if(null == var4) {
            return 0;
         } else {
            int var5 = 0;

            for(int var6 = 0; var6 < var4.anIntArray2547.length; ++var6) {
               if(var4.anIntArray2547[var6] >= 0 && Class3_Sub13_Sub23.itemDefinitionSize > var4.anIntArray2547[var6]) {
                  ItemDefinition var7 = Class38.getItemDefinition(var4.anIntArray2547[var6], (byte)79);
                  if(null != var7.aHashTable_798) {
                     Class3_Sub18 var8 = (Class3_Sub18)var7.aHashTable_798.get((long)var3);
                     if(null != var8) {
                        if(var1) {
                           var5 += var4.anIntArray2551[var6] * var8.anInt2467;
                        } else {
                           var5 += var8.anInt2467;
                        }
                     }
                  }
               }
            }

            return var5;
         }
      } catch (RuntimeException var9) {
         throw Class44.clientError(var9, "od.B(" + 10131 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

}

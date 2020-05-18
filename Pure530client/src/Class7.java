
final class Class7 implements Interface4 {

   static Class153 aClass153_2160;
   static int anInt2161 = -1;
   static int anInt2162;
   static Class94 aClass94_2163 = Class3_Sub4.method108("Gegenstand f-Ur Mitglieder", (byte)-128);
   static Class94 aClass94_2164 = Class3_Sub4.method108("hint_mapedge", (byte)-120);
   static int anInt2165;
   static int anInt2166 = 0;
   static short[] aShortArray2167 = new short[]{(short)30, (short)6, (short)31, (short)29, (short)10, (short)44, (short)37, (short)57};
   static Class94 aClass94_2168 = Class3_Sub4.method108("<br>", (byte)-122);


   static final void method831(int var0, String var1) {
      System.out.println("Error: " + Class3_Sub28_Sub6.a("%0a", "\n", 105, var1));
      if(var0 < 33) {
         aClass94_2163 = (Class94)null;
      }

   }

   static final Class11 method832(byte var0, int var1) {
      try {
         int var2 = var1 >> 16;
         if(var0 < 108) {
            method832((byte)87, 19);
         }

         int var3 = '\uffff' & var1;
         if(Class140.aClass11ArrayArray1834[var2] == null || null == Class140.aClass11ArrayArray1834[var2][var3]) {
            boolean var4 = Canvas_Sub2.method57(var2, 104);
            if(!var4) {
               return null;
            }
         }

         return Class140.aClass11ArrayArray1834[var2][var3];
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "af.F(" + var0 + ',' + var1 + ')');
      }
   }

   public static void method833(byte var0) {
      try {
         aShortArray2167 = null;
         aClass153_2160 = null;
         aClass94_2164 = null;
         aClass94_2168 = null;
         int var1 = 124 / ((var0 - 28) / 41);
         aClass94_2163 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "af.E(" + var0 + ')');
      }
   }

   public final Class94 method20(int var1, int[] var2, int var3, long var4) {
      try {
         if(var1 != 0) {
            if(var1 != 1 && ~var1 != -11) {
               return var1 != 6 && var1 != 7 && 11 != var1?(var3 != 4936?(Class94)null:null):Class3_Sub13_Sub36.method342(var2[0], true).method616((int)var4, (byte)-69);
            } else {
               Class48 var8 = Class38.method1023((int)var4, (byte)82);
               return var8.aClass94_770;
            }
         } else {
            Class3_Sub28_Sub13 var6 = Class3_Sub13_Sub36.method342(var2[0], true);
            return var6.method616((int)var4, (byte)120);
         }
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "af.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void method834(byte var0) {
      try {
         Class66.method1250(43, false);
         System.gc();
         Class117.method1719(25, 5);
         if(var0 >= -80) {
            anInt2166 = -89;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "af.D(" + var0 + ')');
      }
   }

   static final boolean method835(int var0, int var1, int var2, int var3, int var4, int var5, Class140 var6, int var7, long var8) {
      if(var6 == null) {
         return true;
      } else {
         int var10 = var1 * 128 + 64 * var4;
         int var11 = var2 * 128 + 64 * var5;
         return Class56.method1189(var0, var1, var2, var4, var5, var10, var11, var3, var6, var7, false, var8);
      }
   }

}

package org.runite.jagex;

public class Unsorted {
    static void method2086() {
       try {
           int var1 = Class102.player.anInt2819 + Class3_Sub13_Sub18.anInt3216;
           int var2 = Class102.player.anInt2829 - -InputStream_Sub1.anInt42;
           if(-var1 + Class3_Sub13_Sub13.anInt3155 < -500 || -var1 + Class3_Sub13_Sub13.anInt3155 > 500 || ReferenceTable.anInt942 + -var2 < -500 || -var2 + ReferenceTable.anInt942 > 500) {
              Class3_Sub13_Sub13.anInt3155 = var1;
              ReferenceTable.anInt942 = var2;
           }

           if(var2 != ReferenceTable.anInt942) {
              ReferenceTable.anInt942 += (-ReferenceTable.anInt942 + var2) / 16;
           }

           if(var1 != Class3_Sub13_Sub13.anInt3155) {
              Class3_Sub13_Sub13.anInt3155 += (-Class3_Sub13_Sub13.anInt3155 + var1) / 16;
           }

           if(Class15.aBoolean346) {
              for(int var3 = 0; var3 < Class3_Sub23.anInt2537; ++var3) {
                 int var4 = Class133.inputTextCodeArray[var3];
                 if(98 == var4) {
                    Class3_Sub9.anInt2309 = -16 & Class3_Sub9.anInt2309 + 47;
                 } else if (var4 == 99) {
                     Class3_Sub9.anInt2309 = -16 & Class3_Sub9.anInt2309 - 17;
                 } else if (var4 == 96) {
                     GraphicDefinition.CAMERA_DIRECTION = GraphicDefinition.CAMERA_DIRECTION - 65 & -128;
                 } else if (var4 == 97) {
                     GraphicDefinition.CAMERA_DIRECTION = GraphicDefinition.CAMERA_DIRECTION + 191 & -128;
                 }
              }
           } else {
              if(ObjectDefinition.aBooleanArray1490[98]) {
                 Class27.anInt517 += (-Class27.anInt517 + 12) / 2;
              } else if(!ObjectDefinition.aBooleanArray1490[99]) {
                 Class27.anInt517 /= 2;
              } else {
                 Class27.anInt517 += (-Class27.anInt517 + -12) / 2;
              }

              if(!ObjectDefinition.aBooleanArray1490[96]) {
                 if(ObjectDefinition.aBooleanArray1490[97]) {
                    Class3_Sub5.anInt2281 += (-Class3_Sub5.anInt2281 + 24) / 2;
                 } else {
                    Class3_Sub5.anInt2281 /= 2;
                 }
              } else {
                 Class3_Sub5.anInt2281 += (-Class3_Sub5.anInt2281 + -24) / 2;
              }

              Class3_Sub9.anInt2309 += Class27.anInt517 / 2;
              GraphicDefinition.CAMERA_DIRECTION += Class3_Sub5.anInt2281 / 2;
           }

           Class47.method1098((byte)-94);
       } catch (RuntimeException var5) {
          throw Class44.clientError(var5, "uf.B(" + (byte) 68 + ')');
       }
    }
}

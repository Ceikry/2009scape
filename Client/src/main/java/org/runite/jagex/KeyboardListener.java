package org.runite.jagex;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class KeyboardListener implements KeyListener, FocusListener {

   static int[] KEY_CODE_MAP = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   static boolean aBoolean1905 = true;
   static int anInt1908 = 0;
   static Class93 aClass93_1911 = new Class93(260);
   static int anInt1912;
   static int anInt1914;
   static RSString aClass94_1915 = RSString.createRSString("Null");
   static CacheIndex aClass153_1916;
   static int anInt1918 = 0;

   static void adjustKeyCodeMap() {
         if(!Signlink.javaVendor.toLowerCase().contains("microsoft")) {
            if(null == Signlink.aMethod1222) {
               KEY_CODE_MAP[192] = 58;
               KEY_CODE_MAP[222] = 59;
            } else {
               KEY_CODE_MAP[222] = 58;
               KEY_CODE_MAP[192] = 28;
               KEY_CODE_MAP[520] = 59;
            }

            KEY_CODE_MAP[45] = 26;
            KEY_CODE_MAP[61] = 27;
            KEY_CODE_MAP[91] = 42;
            KEY_CODE_MAP[59] = 57;
            KEY_CODE_MAP[93] = 43;
            KEY_CODE_MAP[44] = 71;
            KEY_CODE_MAP[92] = 74;
            KEY_CODE_MAP[46] = 72;
            KEY_CODE_MAP[47] = 73;
         } else {
            KEY_CODE_MAP[187] = 27;
            KEY_CODE_MAP[223] = 28;
            KEY_CODE_MAP[221] = 43;
            KEY_CODE_MAP[188] = 71;
            KEY_CODE_MAP[222] = 59;
            KEY_CODE_MAP[192] = 58;
            KEY_CODE_MAP[191] = 73;
            KEY_CODE_MAP[219] = 42;
            KEY_CODE_MAP[190] = 72;
            KEY_CODE_MAP[186] = 57;
            KEY_CODE_MAP[220] = 74;
            KEY_CODE_MAP[189] = 26;
         }
   }


   public final synchronized void keyPressed(KeyEvent var1) {
      try {
         switch (var1.getKeyCode())
         {
            case 16:
               MouseWheel.shiftDown = true;
               break;
            case 17:
               MouseWheel.ctrlDown = true;
               break;
         }
         if(null != Class3_Sub13_Sub3.aClass148_3049) {
            Class3_Sub13_Sub33.anInt3398 = 0;
            int var2 = var1.getKeyCode();
//            switch(var2) {
//               case 112://f1
//                  var2 = 115;
//                  break;
//               case 113://f2
//                  var2 = 116;
//                  break;
//               case 114://f3
//                  var2 = 117;
//                  break;
//               case 115://f4
//                  var2 = 118;
//                  break;
//               case 116://f5
//                  var2 = 112;
//                  break;
//            }
            if(0 <= var2 && KEY_CODE_MAP.length > var2) {
               var2 = KEY_CODE_MAP[var2];
               // System.out.println(var2);
               if(0 != (var2 & 128)) {
                  var2 = -1;
               }
            } else {
               var2 = -1;
            }
            
            
            
            /**
             * Tab to reply
             */
			if (var1.getKeyCode() == KeyEvent.VK_TAB) {
				Class73.ClientCommands(RSString.createRSString("::reply"));
			}

			if (var1.getKeyCode() == KeyEvent.VK_ESCAPE)
            {
               Class73.ClientCommands(RSString.createRSString("::shutdowninterface"));
            }
			
			//causing issues when in other interfaces, such as GE interface. My quick thing impl didn't work - Jamix77
			
			/**if (var1.getKeyCode() == KeyEvent.VK_SPACE)
            {
               Class2.method78(40, false, 0);
            }**/
			
            
            /**
             * Controls arrow key mouse movement
             */
            if(Class3_Sub13.anInt2384 >= 0 && var2 >= 0) {
               Class151_Sub1.anIntArray2952[Class3_Sub13.anInt2384] = var2;
               Class3_Sub13.anInt2384 = 127 & Class3_Sub13.anInt2384 - -1;
               if(Class3_Sub13.anInt2384 == Class133.anInt1744) {
                  Class3_Sub13.anInt2384 = -1;
               }
            }

            int var3;
            if(var2 >= 0) {
               var3 = 127 & 1 + Class25.anInt491;
               if(var3 != Class3_Sub28_Sub9.anInt3620) {
                  Class129.anIntArray1693[Class25.anInt491] = var2;
                  Class155.anIntArray1978[Class25.anInt491] = -1;
                  Class25.anInt491 = var3;
               }
            }

            var3 = var1.getModifiers();
            if((var3 & 10) != 0 || 85 == var2 || var2 == 10) {
               var1.consume();
            }
         }

      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "uf.keyPressed(" + (var1 != null?"{...}":"null") + ')');
      }
   }

   public final void keyTyped(KeyEvent var1) {
      try {
    	 
         if(Class3_Sub13_Sub3.aClass148_3049 != null) {
            int var2 = Class79.method1386(var1);
            if(var2 >= 0) {
               int var3 = 1 + Class25.anInt491 & 127;
               if(var3 != Class3_Sub28_Sub9.anInt3620) {
                  Class129.anIntArray1693[Class25.anInt491] = -1;
                  Class155.anIntArray1978[Class25.anInt491] = var2;
                  Class25.anInt491 = var3;
               }
            }
         }

         var1.consume();
      } catch (RuntimeException var4) {
         throw Class44.clientError(var4, "uf.keyTyped(" + (var1 != null?"{...}":"null") + ')');
      }
   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         if(null != Class3_Sub13_Sub3.aClass148_3049) {
            Class3_Sub13.anInt2384 = -1;
         }

      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "uf.focusLost(" + (var1 != null?"{...}":"null") + ')');
      }
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      switch (var1.getKeyCode())
      {
         case 16:
            MouseWheel.shiftDown = false;
            break;
         case 17:
            MouseWheel.ctrlDown = false;
            break;
      }
      try {
         if(null != Class3_Sub13_Sub3.aClass148_3049) {
            Class3_Sub13_Sub33.anInt3398 = 0;
            int var2 = var1.getKeyCode();
            if(var2 >= 0 && var2 < KEY_CODE_MAP.length) {
               var2 = KEY_CODE_MAP[var2] & -129;
            } else {
               var2 = -1;
            }

            if(Class3_Sub13.anInt2384 >= 0 && var2 >= 0) {
               Class151_Sub1.anIntArray2952[Class3_Sub13.anInt2384] = ~var2;
               Class3_Sub13.anInt2384 = 127 & 1 + Class3_Sub13.anInt2384;
               if(Class3_Sub13.anInt2384 == Class133.anInt1744) {
                  Class3_Sub13.anInt2384 = -1;
               }
            }
         }

         var1.consume();
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "uf.keyReleased(" + "{...}" + ')');
      }
   }

   public final void focusGained(FocusEvent var1) {}

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

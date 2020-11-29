package org.runite.client;

import java.awt.*;

final class Class119 {

    static Class131 aClass131_1624;
    static Class33 aClass33_1626;
    static CacheIndex aClass153_1628;


    static void method1729() {
        try {
            Container var1;
            if (null == GameShell.aFrame3121) {
                if (GameShell.frame == null) {
                    var1 = Signlink.aClass87_665.applet;
                } else {
                    var1 = GameShell.frame;
                }
            } else {
                var1 = GameShell.aFrame3121;
            }

            Unsorted.anInt2334 = var1.getSize().width;
            Class70.anInt1047 = var1.getSize().height;
            Insets var2;
            if (var1 == GameShell.frame) {
                var2 = GameShell.frame.getInsets();
                Class70.anInt1047 -= var2.bottom + var2.top;
                Unsorted.anInt2334 -= var2.right + var2.left;
            }

            if (Class83.method1411(0) >= 2) {
                GameShell.gameShellAWTWidth = Unsorted.anInt2334;
                Class84.anInt1164 = 0;
                Class106.anInt1442 = 0;
                GameShell.gameShellAWTHeight = Class70.anInt1047;
            } else {
                Class106.anInt1442 = 0;
                Class84.anInt1164 = (-765 + Unsorted.anInt2334) / 2;
                GameShell.gameShellAWTHeight = 503;
                GameShell.gameShellAWTWidth = 765;
            }

            if (HDToolKit.highDetail) {
                HDToolKit.setHDWindowSize(GameShell.gameShellAWTWidth, GameShell.gameShellAWTHeight);
            }

            GameShell.canvas.setSize(GameShell.gameShellAWTWidth, GameShell.gameShellAWTHeight);
            if (var1 == GameShell.frame) {
                var2 = GameShell.frame.getInsets();
                GameShell.canvas.setLocation(var2.left + Class84.anInt1164, Class106.anInt1442 + var2.top);
            } else {
                GameShell.canvas.setLocation(Class84.anInt1164, Class106.anInt1442);
            }

            if (Class3_Sub28_Sub12.anInt3655 != -1) {
                Class124.method1746(true, (byte) -125);
            }

            Unsorted.method1396(-1);
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "qh.C(" + true + ')');
        }
    }

    static void method1730(Signlink var0) {
        try {
            RandomAccessFileWrapper var2 = null;

            try {
                Class64 var3 = var0.method1433("runescape", 12);

                while (0 == var3.anInt978) {
                    TimeUtils.sleep(1L);
                }

                if (var3.anInt978 == 1) {
                    var2 = (RandomAccessFileWrapper) var3.anObject974;
                    DataBuffer var4 = Class23.method939();
                    var2.write(var4.buffer, var4.index, 0);
                }
            } catch (Exception var6) {
            }

            try {
                if (var2 != null) {
                    var2.close();
                }
            } catch (Exception var5) {
            }

        } catch (RuntimeException var7) {
            throw ClientErrorException.clientError(var7, "qh.A(" + (var0 != null ? "{...}" : "null") + ',' + (byte) 14 + ')');
        }
    }

}

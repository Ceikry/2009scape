package org.runite.client;

public class CS2Methods {


    static void method34() {
        try {
            if (null != WorldListEntry.aClass155_2627) {
                WorldListEntry.aClass155_2627.method2163();
            }

            if (Class3_Sub21.aClass155_2491 != null) {
                Class3_Sub21.aClass155_2491.method2163();
            }

            Class140_Sub3.method1959(Class3_Sub13_Sub15.aBoolean3184);
            WorldListEntry.aClass155_2627 = Class58.method1195(22050, Signlink.aClass87_665, GameShell.canvas, 0);
            WorldListEntry.aClass155_2627.method2154(114, Client.aClass3_Sub24_Sub4_1193);
            Class3_Sub21.aClass155_2491 = Class58.method1195(2048, Signlink.aClass87_665, GameShell.canvas, 1);
            Class3_Sub21.aClass155_2491.method2154(-126, Class3_Sub26.aClass3_Sub24_Sub2_2563);
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "rc.DA(" + -32589 + ')');
        }
    }

    static void method1479(int var0) {
        try {
            Class3_Sub13_Sub30.anInt3362 = -1;

            if (var0 == 37) {
                NPC.aFloat3979 = 3.0F;
            } else if (50 == var0) {
                NPC.aFloat3979 = 4.0F;
            } else if (var0 == 75) {
                NPC.aFloat3979 = 6.0F;
            } else if (var0 == 100) {
                NPC.aFloat3979 = 8.0F;
            } else if (var0 == 200) {
                NPC.aFloat3979 = 16.0F;
            }

        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "me.C(" + var0 + ',' + (byte) 56 + ')');
        }
    }

    static void method2092(int var0) {
        try {
            Class3_Sub28_Sub6 var2 = Class3_Sub24_Sub3.method466(9, var0);
            var2.a();
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ug.B(" + var0 + ',' + (byte) -47 + ')');
        }
    }
}

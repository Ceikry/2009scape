package org.runite.client;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;
import static org.lwjgl.opengl.GL15.glDeleteBuffers;
import org.rs09.client.config.GameConfig;

import java.util.Objects;

final class WaterfallShader implements ShaderInterface {

    static boolean[] aBooleanArray2169 = new boolean[5];
    static CacheIndex aClass153_2172;
    static int waterfallTextureId = -1;
    private static RSString aClass94_2175 = RSString.parse(")4a=");
    private final float[] aFloatArray2174 = new float[4];
    private int listId;


    public WaterfallShader() {
        try {
            this.method1631();
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "ob.<init>()");
        }
    }

    static boolean method1627(int var0, byte var1) {
        try {
            WorldListEntry var2 = Class3_Sub8.getWorld(97, var0);
            if (var2 == null) {
                return false;
            } else if (1 != Signlink.anInt1214 && Signlink.anInt1214 != 2 && Client.modeWhereValue != 2) {
                RSString var9 = TextCore.aClass94_8;
                if (Client.modeWhereValue != 0) {
                    var9 = RSString.stringCombiner(new RSString[]{TextCore.aClass94_4007, RSString.stringAnimator(var2.worldId + 7000)});
                }

                if (var1 > -2) {
                    return false;
                } else {
                    RSString var4 = TextCore.aClass94_8;
                    if (Class163_Sub2.aClass94_2996 != null) {
                        var4 = RSString.stringCombiner(new RSString[]{Class97.aClass94_1380, Class163_Sub2.aClass94_2996});
                    }
                    RSString var5 = RSString.stringCombiner(new RSString[]{RSString.parse("http:)4)4"), var2.address, var9, TextCore.aClass94_2608, RSString.stringAnimator(Class3_Sub20.language), aClass94_2175, RSString.stringAnimator(Class3_Sub26.anInt2554), var4, TextCore.aClass94_1133, !Unsorted.aBoolean3641 ? TextCore.aClass94_3013 : TextCore.aClass94_339, TextCore.aClass94_2610, !Class163_Sub2_Sub1.aBoolean4018 ? TextCore.aClass94_3013 : TextCore.aClass94_339, TextCore.aClass94_1617, Client.aBoolean3779 ? TextCore.aClass94_339 : TextCore.aClass94_3013});

                    try {
                        System.out.println("Trying to get this applet 6.");
                        Objects.requireNonNull(Class126.aClient1671.getAppletContext()).showDocument(var5.toURL(), "_self");
                    } catch (Exception var7) {
                        return false;
                    }

                    return true;
                }
            } else {
                GameConfig.IP_ADDRESS = var2.address.toString();
                System.out.println(GameConfig.IP_ADDRESS);
//            GameLaunch.SETTINGS.setIp(var2.address.toString());
                var2.address.method1568();
                CS2Script.anInt2451 = var2.worldId;
                if (Client.modeWhereValue != 0) {
                    Class162.anInt2036 = '\u9c40' + CS2Script.anInt2451;
                    Class140_Sub6.accRegistryPort = Class162.anInt2036;
                    Client.currentPort = CS2Script.anInt2451 + '\uc350';
                }

                return true;
            }
        } catch (RuntimeException var8) {
            throw ClientErrorException.clientError(var8, "ob.E(" + var0 + ',' + var1 + ')');
        }
    }

    public static void method1630(byte var0) {
        try {
            TextCore.aClass94_2171 = null;
            aClass153_2172 = null;
            aBooleanArray2169 = null;
            if (var0 > -112) {
                method1632(-116, 108, 54, -120, 44, 6);
            }
            aClass94_2175 = null;
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "ob.J(" + var0 + ')');
        }
    }

    static void method1632(int var0, int var1, int var2, int var3, int var4, int var5) {
        try {
            if (var0 <= 66) {
                method1630((byte) -33);
            }

            for (int var6 = var3; var6 <= var1; ++var6) {
                Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var6], var4, 121, var2, var5);
            }

        } catch (RuntimeException var7) {
            throw ClientErrorException.clientError(var7, "ob.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
        }
    }

    public final int method24() {
        try {
            return 0;
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "ob.C()");
        }
    }

    public final void method23(int var1) {
        try {
            float var4 = (float) (1 + (var1 >> 3 & 3)) * 0.01F;
            float var3 = -0.01F * (float) (1 + (var1 & 3));
            float var5 = 0 == (var1 & 64) ? 4.8828125E-4F : 9.765625E-4F;
            boolean var6 = (128 & var1) != 0;
            if (var6) {
                this.aFloatArray2174[0] = var5;
                this.aFloatArray2174[1] = 0.0F;
                this.aFloatArray2174[2] = 0.0F;
                this.aFloatArray2174[3] = 0.0F;
            } else {
                this.aFloatArray2174[2] = var5;
                this.aFloatArray2174[1] = 0.0F;
                this.aFloatArray2174[3] = 0.0F;
                this.aFloatArray2174[0] = 0.0F;
            }

            glActiveTexture(GL_TEXTURE1);
            glMatrixMode(GL_MODELVIEW);
            glPushMatrix();
            glLoadIdentity();
            glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            glRotatef((float) Class140_Sub7.anInt2938 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            glRotatef(360.0F * (float) Class3_Sub13_Sub8.anInt3103 / 2048.0F, 0.0F, 1.0F, 0.0F);
            glTranslatef((float) (-Unsorted.anInt144), (float) (-Unsorted.anInt3695), (float) (-LinkableRSString.anInt2587));
            glTexGenfv(GL_S, GL_EYE_PLANE, this.aFloatArray2174);
            this.aFloatArray2174[3] = var3 * (float) HDToolKit.anInt1791;
            this.aFloatArray2174[0] = 0.0F;
            this.aFloatArray2174[2] = 0.0F;
            this.aFloatArray2174[1] = var5;
            glTexGenfv(GL_T, GL_EYE_PLANE, this.aFloatArray2174);
            glPopMatrix();
            if (Class88.Texture3DEnabled) {
                this.aFloatArray2174[3] = (float) HDToolKit.anInt1791 * var4;
                this.aFloatArray2174[1] = 0.0F;
                this.aFloatArray2174[0] = 0.0F;
                this.aFloatArray2174[2] = 0.0F;
                glTexGenfv(GL_R, GL_OBJECT_PLANE, this.aFloatArray2174);
            } else {
                int var7 = (int) ((float) HDToolKit.anInt1791 * var4 * 64.0F);
                glBindTexture(GL_TEXTURE_2D, Class88.anIntArray1223[var7 % 64]);
            }

            glActiveTexture(GL_TEXTURE0);
        } catch (RuntimeException var8) {
            throw ClientErrorException.clientError(var8, "ob.B(" + var1 + ')');
        }
    }

    public final void method21() {
        try {
            glCallList(1 + this.listId);
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "ob.A()");
        }
    }

    public final void method22() {
        try {
            glCallList(this.listId);
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "ob.D()");
        }
    }

    private void method1631() {
        try {
            this.listId = glGenLists(2);
            glNewList(this.listId, GL_COMPILE);//COMPILE
            glActiveTexture(GL_TEXTURE1);//TEXTURE1
            if (Class88.Texture3DEnabled) {
                glBindTexture(GL_TEXTURE_3D, waterfallTextureId);//TEXTURE_3D
                glTexGeni(GL_R, GL_TEXTURE_GEN_MODE, GL_OBJECT_LINEAR);//R, TEXTURE_GEN_MODE, OBJECT_LINEAR
                glEnable(GL_TEXTURE_GEN_R);//TEXTURE_GEN_R
                glEnable(GL_TEXTURE_3D);//TEXTURE_3D
            } else {
                glEnable(GL_TEXTURE_2D);//TEXTURE_2D
            }

            glTexGeni(GL_S, GL_TEXTURE_GEN_MODE, GL_EYE_LINEAR);//S, TEXTURE_GEN_MODE, EYE_LINEAR
            glTexGeni(GL_T, GL_TEXTURE_GEN_MODE, GL_EYE_LINEAR);//T, TEXTURE_GEN_MODE, EYE_LINEAR
            glEnable(GL_TEXTURE_GEN_S);//TEXTURE_GEN_S
            glEnable(GL_TEXTURE_GEN_T);//TEXTURE_GEN_T
            glActiveTexture(GL_TEXTURE0);//TEXTURE1
            glEndList();
            glNewList(this.listId + 1, GL_COMPILE);//COMPILE
            glActiveTexture(GL_TEXTURE1);//TEXTURE1
            if (Class88.Texture3DEnabled) {
                glDisable(GL_TEXTURE_3D);//TEXTURE_3D
                glDisable(GL_TEXTURE_GEN_R);//TEXTURE_GEN_R
            } else {
                glDisable(GL_TEXTURE_2D);//TEXTURE_2D
            }

            glDisable(GL_TEXTURE_GEN_S);//TEXTURE_GEN_S
            glDisable(GL_TEXTURE_GEN_T);//TEXTURE_GEN_T
            glActiveTexture(GL_TEXTURE0);//TEXTURE0
            glEndList();
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ob.I(" + 2 + ')');
        }
    }

}

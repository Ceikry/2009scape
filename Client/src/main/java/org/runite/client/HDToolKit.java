package org.runite.client;

import org.lwjgl.glfw.GLFW;
import org.rs09.client.config.GameConfig;

import java.awt.*;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;
import static org.lwjgl.opengl.GL15.glGenBuffers;
import static org.lwjgl.opengl.GL20.GL_MAX_TEXTURE_COORDS;
import static org.lwjgl.opengl.GL20.GL_MAX_TEXTURE_IMAGE_UNITS;

public final class HDToolKit {

    private static final float[] aFloatArray1808 = new float[16];
    private static final RSString aClass94_1819 = RSString.parse("radeon");
    /**
     * JOGL GL4bc related
     */
    public static boolean highDetail = false;
    public static int viewHeight;
    public static int viewWidth;
    static int maxTextureUnits;
    static boolean aBoolean1790;
    static int anInt1791 = 0;
    static boolean enableNormalArrayState = true;
    static boolean allows3DTextureMapping;
    static boolean supportMultisample;
    static int anInt1810;
    static boolean supportVertexBufferObject;
    static boolean aBoolean1817;
    static boolean supportVertexProgram;
    static boolean supportTextureCubeMap;
    private static String vendor;
    private static String renderer;
    private static float aFloat1787;
    private static boolean aBoolean1788 = false;
    private static int anInt1792 = 0;
    private static int anInt1793 = 0;
    private static float aFloat1794 = 0.0F;
    private static float aFloat1795;
    private static boolean enableLightingState = true;
    private static float aFloat1797 = 0.0F;
    private static boolean viewportSetup = false;
    private static int anInt1803 = -1;
    private static boolean enableDepthTestState = true;
    private static int anInt1812;
    private static boolean enableFogState = true;


    /*
     *  GLFW
     */
    public static long window;

    private static RSString method1820(String var0) {
        byte[] var1;
        var1 = var0.getBytes(StandardCharsets.ISO_8859_1);

        return Class3_Sub13_Sub3.method178(var1, var1.length, 0);
    }

    static void method1821(int offsetX, int offsetY, int ratioWidth, int ratioHeight) {
        viewport(0, 0, viewWidth, viewHeight, offsetX, offsetY, 0.0F, 0.0F, ratioWidth, ratioHeight);
    }

    static void method1822() {
        Class3_Sub28_Sub4.method551(0, 0);
        setupViewport();
        method1856(1);
        setTextureEnvironmentParameter(1);
        enableLighting(false);
        enableDepthTest(false);
        enableFog(false);
        method1823();
    }

    static void method1823() {
        if (aBoolean1788) {
            glMatrixMode(GL_TEXTURE);
            glLoadIdentity();
            glMatrixMode(GL_MODELVIEW);
            aBoolean1788 = false;
        }

    }

    static void method1824() {
        Class3_Sub28_Sub4.method551(0, 0);
        setupViewport();
        method1856(0);
        setTextureEnvironmentParameter(0);
        enableLighting(false);
        enableDepthTest(false);
        enableFog(false);
        method1823();
    }

    static void method1825(float var0, float var1) {
        if (!viewportSetup) {
            if (var0 != aFloat1797 || var1 != aFloat1794) {
                aFloat1797 = var0;
                aFloat1794 = var1;
                if (var1 == 0.0F) {
                    aFloatArray1808[10] = aFloat1787;
                    aFloatArray1808[14] = aFloat1795;
                } else {
                    float var2 = var0 / (var1 + var0);
                    float var3 = var2 * var2;
                    float var4 = -aFloat1795 * (1.0F - var2) * (1.0F - var2) / var1;
                    aFloatArray1808[10] = aFloat1787 + var4;
                    aFloatArray1808[14] = aFloat1795 * var3;
                }

                glMatrixMode(GL_PROJECTION);
                glLoadMatrixf(aFloatArray1808);
                glMatrixMode(GL_MODELVIEW);
            }
        }
    }

    static void bufferSwap() {
        try {
            glfwSwapBuffers(window);//TODO: This is where the window will be swapped over to GLFW
        } catch (Exception var1) {
        }

    }

    static void enableFog(boolean fogEnabled) {
        if (fogEnabled != enableFogState) {
            if (fogEnabled) {
                glEnable(GL_FOG);
            } else {
                glDisable(GL_FOG);
            }
            enableFogState = fogEnabled;
        }
    }

    static void method1828() {
        Class3_Sub28_Sub4.method551(0, 0);
        setupViewport();
        method1856(0);
        setTextureEnvironmentParameter(0);
        enableLighting(false);
        enableDepthTest(false);
        enableFog(false);
        method1823();
    }

    private static void method1829() {
        viewportSetup = false;
        glDisable(GL_TEXTURE_2D);
        anInt1803 = -1;
        glTexEnvi(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_COMBINE);
        glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
        anInt1793 = 0;
        glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_MODULATE);
        anInt1792 = 0;
        glEnable(GL_LIGHTING);
        glEnable(GL_FOG);
        glEnable(GL_DEPTH_TEST);
        enableLightingState = true;
        enableDepthTestState = true;
        enableFogState = true;
        Class44.method1073();
        glActiveTexture(GL_TEXTURE1);
        glTexEnvi(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_COMBINE);
        glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
        glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_MODULATE);
        glActiveTexture(GL_TEXTURE0);
        glfwSwapInterval(0);// TODO: Swap Interval. May have to move this into main
        glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        glShadeModel(GL_SMOOTH);
        glClearDepth(1.0D);
        glDepthFunc(GL_LEQUAL);
        enableDepthMask();
        glMatrixMode(GL_TEXTURE);
        glLoadIdentity();
        glPolygonMode(GL_FRONT, GL_FILL);
        glEnable(GL_CULL_FACE);
        glCullFace(GL_BACK);
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        glEnable(GL_ALPHA_TEST);
        glAlphaFunc(GL_GREATER, 0.0F);
        glEnableClientState(GL_VERTEX_ARRAY);
        glEnableClientState(GL_NORMAL_ARRAY);
        enableNormalArrayState = true;
        glEnableClientState(GL_COLOR_ARRAY);
        glEnableClientState(GL_TEXTURE_COORD_ARRAY);
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        Class92.method1511();
        Class68.method1275();
    }

    static void enableDepthMask() {
        glDepthMask(true);
    }

    static void enableDepthTest(boolean depthTestEnabled) {
        if (depthTestEnabled != enableDepthTestState) {
            if (depthTestEnabled) {
                glEnable(GL_DEPTH_TEST);
            } else {
                glDisable(GL_DEPTH_TEST);
            }
            enableDepthTestState = depthTestEnabled;
        }
    }

    static void method1832(float var0) {
        method1825(3000.0F, var0 * 1.5F);
    }

    static void method1833() {
        int[] var0 = new int[2];
        glGetIntegerv(GL_DRAW_BUFFER, var0);//pos0
        glGetIntegerv(GL_READ_BUFFER, var0);//pos1
        glDrawBuffer(GL_BACK_LEFT);
        glReadBuffer(GL_FRONT_LEFT);
        bindTexture2D(-1);
        glPushAttrib(GL_S);
        glDisable(GL_FOG);
        glDisable(GL_BLEND);
        glDisable(GL_DEPTH_TEST);
        glDisable(GL_ALPHA_TEST);
        glRasterPos2i(GL_FALSE, GL_FALSE);
        glCopyPixels(GL_FALSE, GL_FALSE, viewWidth, viewHeight, GL_COLOR);
        glPopAttrib();
        glDrawBuffer(var0[0]);
        glReadBuffer(var0[1]);
    }

    /*
     *  HD -> SD
     *  Clears the canvas of the OpenGL draw calls
     *  TODO: Remove this method completely, the new client will only support OpenGL
     */
    static void method1834(Canvas canvas) {
        try {
            if (!canvas.isDisplayable()) {
                return;
            }

//            GLCapabilities glCapabilities = new GLCapabilities(GLProfile.getDefault());
//            AWTGraphicsConfiguration configuration = AWTGraphicsConfiguration.create(canvas.getGraphicsConfiguration(), glCapabilities, glCapabilities);
//            NativeWindow nativeWindow = NativeWindowFactory.getNativeWindow(canvas, configuration);
//            GLDrawableFactory glDrawableFactory = GLDrawableFactory.getDesktopFactory();
//            GLDrawable gldrawable = glDrawableFactory.createGLDrawable(nativeWindow);
//            gldrawable.setRealized(true);
//            GLContext glcontext = gldrawable.createContext(null);
//            glcontext.makeCurrent();
//            glcontext.release();
//            glcontext.destroy();
//            gldrawable.setRealized(false);
        } catch (Throwable var4) {
        }

    }

    public static void method1835() {
        Class3_Sub28_Sub4.method551(0, 0);
        setupViewport();
        bindTexture2D(-1);
        enableLighting(false);
        enableDepthTest(false);
        enableFog(false);
        method1823();
    }

    private static void setupViewport() {
        if (!viewportSetup) {
            glMatrixMode(GL_PROJECTION);
            glLoadIdentity();
            glOrtho(0.0D, viewWidth, 0.0D, viewHeight, -1.0D, 1.0D);
            glViewport(0, 0, viewWidth, viewHeight);
            glMatrixMode(GL_MODELVIEW);
            glLoadIdentity();
            viewportSetup = true;
        }
    }

    static void enableLighting(boolean lightingEnabled) {
        if (lightingEnabled != enableLightingState) {
            if (lightingEnabled) {
                glEnable(GL_LIGHTING);
            } else {
                glDisable(GL_LIGHTING);
            }
            enableLightingState = lightingEnabled;
        }
    }

    static float method1839() {
        return aFloat1794;
    }

    private static int method1840() {
        int var0 = 0;
        vendor = glGetString(GL_VENDOR);
        renderer = glGetString(GL_RENDERER);
        String var1 = vendor.toLowerCase();
        if (var1.contains("microsoft")) {
            var0 |= 1;
        }

        if (var1.contains("brian paul") || var1.contains("mesa")) {
            var0 |= 1;
        }

        String versionString = glGetString(GL_VERSION);
        String[] var3 = versionString.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                anInt1812 = var4 * 10 + var5;
            } catch (NumberFormatException var11) {
                var0 |= 4;
            }
        } else {
            var0 |= 4;
        }

        if (anInt1812 < 12) {
            var0 |= 2;
        }

        if (!glfwExtensionSupported("GL_ARB_multitexture")) {
            var0 |= 8;
        }
        if (!glfwExtensionSupported("GL_ARB_texture_env_combine")) {
            var0 |= 32;
        }

        int[] var12 = new int[1];
        glGetIntegerv(GL_MAX_TEXTURE_UNITS, var12);//pos0
        maxTextureUnits = var12[0];
        glGetIntegerv(GL_MAX_TEXTURE_COORDS, var12);//pos0
        int anInt1814 = var12[0];
        glGetIntegerv(GL_MAX_TEXTURE_IMAGE_UNITS, var12);//pos0
        int anInt1806 = var12[0];
        if (maxTextureUnits < 2 || anInt1814 < 2 || anInt1806 < 2) {
            var0 |= 16;
        }

        if (var0 == 0) {
            aBoolean1790 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;

            supportVertexBufferObject = glfwExtensionSupported("GL_ARB_vertex_buffer_object");
            supportMultisample = glfwExtensionSupported("GL_ARB_multisample");
            supportTextureCubeMap = glfwExtensionSupported("GL_ARB_texture_cube_map");
            supportVertexProgram = glfwExtensionSupported("GL_ARB_vertex_program");
            allows3DTextureMapping = glfwExtensionSupported("GL_EXT_texture3D");


            RSString var13 = method1820(renderer).toLowercase();
            if (var13.indexOf(aClass94_1819, 57) != -1) {
                int version = 0;
                RSString[] var7 = var13.method1565().method1567(32, (byte) -98);

                for (RSString var9 : var7) {
                    if (var9.length() >= 4 && var9.substring(0, 4, 0).isInteger()) {
                        version = var9.substring(0, 4, 0).parseInt();
                        break;
                    }
                }

                if (version >= 7000 && version <= 7999) {
                    supportVertexBufferObject = false;
                }

                if (version >= 7000 && version <= 9250) {
                    allows3DTextureMapping = false;
                }

                aBoolean1817 = supportVertexBufferObject;
            }

            if (supportVertexBufferObject) {
                try {
                    int[] var14 = new int[1];
                    glGenBuffers(var14);//1, buffer, 0 OLD
                } catch (Throwable var10) {
                    return -4;
                }
            }
            return 0;
        } else {
            return var0;
        }
    }

    static void clearAccumulationBuffer() {
        glClear(GL_ACCUM);
    }

    /*
     *  Unsure the purpose of this method, but I'd assume it was used to also
     *  swap between HD and SD
     */
    static void method1842() {
//        if (gl != null) {
//            try {
//                Class101.method1609();
//            } catch (Throwable var4) {
//            }
//
//            gl = null;
//        }
//
//        if (glContext != null) {
//            Class31.method988();
//
//            try {
//                if (GLContext.getCurrent() == glContext) {
//                    glContext.release();
//                }
//            } catch (Throwable var3) {
//            }
//
//            try {
//                glContext.destroy();
//            } catch (Throwable var2) {
//            }
//
//            glContext = null;
//        }
//
//        if (glDrawable != null) {
//            try {
//                glDrawable.setRealized(false);
//            } catch (Throwable var1) {
//            }
//
//            glDrawable = null;
//        }

        Class68.method1273();
        highDetail = false;
    }

    static void method1843(float var0, float var1) {
        glMatrixMode(GL_TEXTURE);
        if (aBoolean1788) {
            glLoadIdentity();
        }
        glTranslatef(var0, var1, (float) 0.0);
        glMatrixMode(GL_MODELVIEW);
        aBoolean1788 = true;
    }

    static void viewport(int x, int y, int width, int height, int offsetX, int offsetY, float rotationX, float rotationY, int ratioWidth, int ratioHeight) {
        int left = (x - offsetX << 8) / ratioWidth;
        int right = (x + width - offsetX << 8) / ratioWidth;
        int top = (y - offsetY << 8) / ratioHeight;
        int bottom = (y + height - offsetY << 8) / ratioHeight;
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        float constantFloat = 0.09765625F;
        method1848((float) left * constantFloat, (float) right * constantFloat, (float) (-bottom) * constantFloat, (float) (-top) * constantFloat, 50.0F, GameConfig.RENDER_DISTANCE_VALUE);
        glViewport(x, viewHeight - y - height, width, height);
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (rotationX != 0.0F) {
            glRotatef(rotationX, 1.0F, 0.0F, 0.0F);
        }
        if (rotationY != 0.0F) {
            glRotatef(rotationY, 0.0F, 1.0F, 0.0F);
        }

        viewportSetup = false;
        Class139.screenLowerX = left;
        Class145.screenUpperX = right;
        Class1.screenUpperY = top;
        AtmosphereParser.screenLowerY = bottom;
    }

    private static void enableNormalArray(boolean normalArrayEnabled) {
        if (normalArrayEnabled != enableNormalArrayState) {
            if (normalArrayEnabled) {
                glEnableClientState(GL_NORMAL_ARRAY);
            } else {
                glDisableClientState(GL_NORMAL_ARRAY);
            }
            enableNormalArrayState = normalArrayEnabled;
        }
    }

    static void method1846() {
        if (Class106.aBoolean1441) {
            enableLighting(true);
            enableNormalArray(true);
        } else {
            enableLighting(false);
            enableNormalArray(false);
        }
    }

    static void setTextureEnvironmentParameter(int var0) {
        if (var0 != anInt1792) {
            //sets a texture environment parameter.
            //TEXTURE_ENV, COMBINE_ALPHA,
            if (var0 == 0) {
                glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_MODULATE);
            }
            if (var0 == 1) {
                glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_REPLACE);
            }
            if (var0 == 2) {
                glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, GL_ADD);
            }
            anInt1792 = var0;
        }
    }

    private static void method1848(float left, float right, float bottom, float top, float constantFloat, float renderDistance) {
        float var6 = constantFloat * 2.0F;
        aFloatArray1808[0] = var6 / (right - left);
        aFloatArray1808[1] = 0.0F;
        aFloatArray1808[2] = 0.0F;
        aFloatArray1808[3] = 0.0F;
        aFloatArray1808[4] = 0.0F;
        aFloatArray1808[5] = var6 / (top - bottom);
        aFloatArray1808[6] = 0.0F;
        aFloatArray1808[7] = 0.0F;
        aFloatArray1808[8] = (right + left) / (right - left);
        aFloatArray1808[9] = (top + bottom) / (top - bottom);
        aFloatArray1808[10] = aFloat1787 = -(renderDistance + constantFloat) / (renderDistance - constantFloat);
        aFloatArray1808[11] = -1.0F;
        aFloatArray1808[12] = 0.0F;
        aFloatArray1808[13] = 0.0F;
        aFloatArray1808[14] = aFloat1795 = -(var6 * renderDistance) / (renderDistance - constantFloat);
        aFloatArray1808[15] = 0.0F;
        glLoadMatrixf(aFloatArray1808);
        aFloat1797 = 0.0F;
        aFloat1794 = 0.0F;
    }

    /**
     * clearScreen takes an int of color (can be replaced with whatever color you see fit)
     *
     * @param color
     */
    static void clearScreen(int color) {
        glClearColor((float) (color >> 16 & 255) / 255.0F, (float) (color >> 8 & 255) / 255.0F, (float) (color & 255) / 255.0F, 0.0F);
        glClear(16640);
        glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    static void bindTexture2D(int boundTexture) {
        if (boundTexture != anInt1803) {
            if (boundTexture == -1) {
                glDisable(GL_TEXTURE_2D);
            } else {
                if (anInt1803 == -1) {
                    glEnable(GL_TEXTURE_2D);
                }
                glBindTexture(GL_TEXTURE_2D, boundTexture);
            }
            anInt1803 = boundTexture;
        }
    }

    static void depthBufferWritingDisabled() {
        glDepthMask(false);
    }

    static float method1852() {
        return aFloat1797;
    }


    /*
     *  TODO: Place this inside of GameShell, Support for Standard definition is dropping
     *   and will become its own separate client
     *  GL should automatically initiate upon client startup, this will go where
     *  we first initialize the window/GLFW
     */
    static void method1853(Canvas canvas, int SceneMSAASamples) {

        try {
            /*
             *  This is how you would start HD and it would overlay the canvas in JOGL
             *  It first got the capabilities of the profile,
             *  Then setup the window accordingly to swap from Standard Definition
             *  OLD JOGL methods are disabled until LWJGL is fully implemented
             */
            if (canvas.isDisplayable()) {
//                GLProfile.initSingleton();
//                GLCapabilities glCapabilities = new GLCapabilities(GLProfile.getDefault());
                System.out.println("Scene MSAASamples = " + SceneMSAASamples);
                if (SceneMSAASamples > 0) {
//                    glCapabilities.setSampleBuffers(true);
//                    glCapabilities.setNumSamples(SceneMSAASamples);
                }


//                AWTGraphicsConfiguration configuration = AWTGraphicsConfiguration.create(canvas.getGraphicsConfiguration(), glCapabilities, glCapabilities);
//                NativeWindow nativeWindow = NativeWindowFactory.getNativeWindow(canvas, configuration);
//                GLDrawableFactory glDrawableFactory = GLDrawableFactory.getDesktopFactory();
//                glDrawable = glDrawableFactory.createGLDrawable(nativeWindow);
//                glDrawable.setRealized(true);

                int var4 = 0;
//                int var5;
                int var5 = 0;
                while (true) {
//                    glContext = glDrawable.createContext(null);

                    try {
//                        var5 = glContext.makeCurrent();
                        if (var5 != 0) {
                            break;
                        }
                    } catch (Exception var8) {
                    }

                    if (var4++ > 5) {
                        return;
                    }

                    TimeUtils.sleep(1000L);
                }

//                gl = glContext.getGL().getGL2();
//                new GLUgl2();
                highDetail = true;
                System.out.println("Setting high detail to " + highDetail);
                viewWidth = canvas.getSize().width;
                viewHeight = canvas.getSize().height;
                var5 = method1840();
                if (var5 == 0) {
                    method1857();
                    method1829();
                    glClear(GL_COLOR_BUFFER_BIT);
                    var4 = 0;

                    while (true) {
                        try {
//                            glDrawable.swapBuffers();
                            break;
                        } catch (Exception var7) {
                            if (var4++ > 5) {
                                method1842();
                                return;
                            }

                            TimeUtils.sleep(100L);
                        }
                    }
                    glClear(GL_COLOR_BUFFER_BIT);
                } else {
                    method1842();
                }
            } else {
            }
        } catch (Throwable var9) {
            System.err.println("Failed to enter HD");
            method1842();
        }
    }

    static void setHDWindowSize(int width, int height) {
        viewWidth = width;
        viewHeight = height;
        viewportSetup = false;
    }

    static void method1855(int var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = -var0;
        int var7 = viewWidth - var0;
        int var8 = -var1;
        int var9 = viewHeight - var1;
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        float var10 = (float) var2 / 512.0F;
        float var11 = var10 * (256.0F / (float) var4);
        float var12 = var10 * (256.0F / (float) var5);
        glOrtho((float) var6 * var11, (float) var7 * var11, (float) (-var9) * var12, (float) (-var8) * var12, 50 - var3, 3584 - var3);
        glViewport(0, 0, viewWidth, viewHeight);
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        viewportSetup = false;
    }

    static void method1856(int var0) {
        if (var0 != anInt1793) {
            if (var0 == 0) {
                glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_MODULATE);
            }

            if (var0 == 1) {
                glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_REPLACE);
            }

            if (var0 == 2) {
                glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_ADD);
            }

            if (var0 == 3) {
                glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_SUBTRACT);
            }

            if (var0 == 4) {
                glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_ADD_SIGNED);
            }

            if (var0 == 5) {
                glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, GL_INTERPOLATE);
            }

            anInt1793 = var0;
        }
    }

    private static void method1857() {
        int[] var0 = new int[1];
        glGenTextures(var0);//1, buffer, 0 OLD
        anInt1810 = var0[0];
        glBindTexture(GL_TEXTURE_2D, anInt1810);
        glTexImage2D(GL_TEXTURE_2D, 0, 4, 1, 1, 0, GL_RGBA, GL_UNSIGNED_BYTE, IntBuffer.wrap(new int[]{-1}));
        Class68.method1276();
        Class3_Sub24_Sub3.method468();
    }

}

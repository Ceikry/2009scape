package org.runite.client;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Objects;

public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

    /*
     *  AWT Canvas
     */
    public static Canvas canvas;

    /*
     *  AWT Dimensions
     */
    public static int gameShellAWTHeight;
    public static int gameShellAWTWidth;

    /*
     *  AWT Frame (s)
     */
    static Frame frame;
    static Frame aFrame3121;

    /*
     *  Window FPS display
     */
    static int fpsCounter = 0;
    static int anInt950;
    static long[] aLongArray2986 = new long[32];
    static int anInt3313 = 500;

    /*
     *  Client memory
     */
    static int clientMemory = 64;

    /*
     *  Timers
     */
    static long aLong2313 = 0L;
    static volatile long aLong1847 = 0L;


    static volatile boolean hasWindowFocus = true;

    static int anInt4033;
    static int anInt1737 = 1;
    static boolean aBoolean1784 = false;

    static boolean aBoolean11 = false;
    static volatile boolean aBoolean3116 = true;
    static boolean aBoolean554 = false;
    static GameShell anApplet_Sub1_2588 = null;
    static int anInt2626 = 20;
    private boolean displayErrorPopupMessage = false;

    /*
     *  Launch method
     */
    public static void launchDesktop() {
        System.out.println("Trying to launch Desktop");
        ClientLoader.create().launch();
    }

    /*
     * AWT window Events
     */
    public final void focusGained(FocusEvent var1) {
        try {
            hasWindowFocus = true;
            aBoolean3116 = true;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "rc.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusLost(FocusEvent var1) {
        try {
            hasWindowFocus = false;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "rc.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void start() {
        try {
            if (anApplet_Sub1_2588 == this && !aBoolean554) {
                aLong2313 = 0L;
            }
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "rc.start()");
        }
    }

    public final void destroy() {
        try {
            if (this == anApplet_Sub1_2588 && !aBoolean554) {
                aLong2313 = TimeUtils.time();
                TimeUtils.sleep(5000L);
                Class3_Sub13_Sub10.aClass87_3125 = null;
                this.method35(46, false);
            }
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "rc.destroy()");
        }
    }

    public final void update(Graphics g) {
        this.paint(g);
    }

    public final void windowOpened(WindowEvent var1) {
    }

    public final void windowClosing(WindowEvent var1) {
        try {
            this.destroy();
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "rc.windowClosing(" + (var1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void windowIconified(WindowEvent var1) {
    }

    public final void windowDeiconified(WindowEvent var1) {
    }

    public final void windowActivated(WindowEvent var1) {
    }

    public final void windowDeactivated(WindowEvent var1) {
    }

    public final void windowClosed(WindowEvent var1) {
    }

    static void checkMaxMemory() {
        try {
            try {
                Method maxMemory = Runtime.class.getMethod("maxMemory");
                try {
                    Runtime runtime = Runtime.getRuntime();
                    Long memoryLong = (Long) maxMemory.invoke(runtime, (Object[]) null);
                    clientMemory = (int) (memoryLong / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            } catch (Throwable var4) {
            }

        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "sd.A(" + 0 + ')');
        }
    }

    abstract void method25();

    public final AppletContext getAppletContext() {
        try {
            System.out.println("Trying this applet 3");
            return null != frame ? null : (Signlink.aClass87_665 != null && this != Signlink.aClass87_665.applet ? Signlink.aClass87_665.applet.getAppletContext() : super.getAppletContext());
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "rc.getAppletContext()");
        }
    }


    final synchronized void method30() {
        try {
            if (canvas != null) {
                canvas.removeFocusListener(this);
                canvas.getParent().remove(canvas);
            }

            Container var2;
            if (aFrame3121 != null) {
                var2 = aFrame3121;
            } else if (null == frame) {
                var2 = Signlink.aClass87_665.applet;
            } else {
                var2 = frame;
            }
            var2.setLayout(null);
            canvas = new ComponentWrappedCanvas(this);
            var2.add(canvas);
            canvas.setSize(gameShellAWTWidth, gameShellAWTHeight);
            canvas.setVisible(true);
            if (var2 == frame) {
                Insets var3 = frame.getInsets();
                canvas.setLocation(Class84.anInt1164 + var3.left, var3.top + Class106.anInt1442);
            } else {
                canvas.setLocation(Class84.anInt1164, Class106.anInt1442);
            }
            canvas.addFocusListener(this);
            canvas.requestFocus();
            hasWindowFocus = true;
            aBoolean3116 = true;
            Class3_Sub13_Sub6.aBoolean3078 = true;
            Client.forceReplaceCanvasEnable = false;
            aLong1847 = TimeUtils.time();
            ClientCommands.tweeningEnabled = true;
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "rc.BA(" + ')');
        }
    }

    final void displayGameErrorPopupMessage(String var1) {
        try {
            if (!this.displayErrorPopupMessage) {
                this.displayErrorPopupMessage = true;
                System.out.println("error_game_" + var1);
                JOptionPane.showMessageDialog(frame, "Error: " + var1 + (var1.contains("js5connect") ? ". The game is likely down." : "") + "\nCheck Discord (Red Bracket#8151) or Github (https://github.com/dginovker/RS-2009/releases) for a potential solution.");
                try {
                    System.out.println("Trying this applet 4");
                    Objects.requireNonNull(this.getAppletContext()).showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_top");
                } catch (Exception var4) {
                }

            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "rc.U(" + (var1 != null ? "{...}" : "null") + ',' + -48 + ')');
        }
    }

    abstract void method32();

    abstract void method33();

    public final URL getDocumentBase() {
        try {
            return null != frame ? null : (Signlink.aClass87_665 != null && this != Signlink.aClass87_665.applet ? Signlink.aClass87_665.applet.getDocumentBase() : super.getDocumentBase());
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "rc.getDocumentBase()");
        }
    }

    public final synchronized void paint(Graphics g) {
        if (anApplet_Sub1_2588 == this && !aBoolean554) {
            aBoolean3116 = true;

            if (aBoolean1784 && !HDToolKit.highDetail && -aLong1847 + TimeUtils.time() > 1000) {
                Rectangle var2 = g.getClipBounds();

                if (var2 == null || Unsorted.anInt2334 <= var2.width && var2.height >= Class70.anInt1047) {
                    Client.forceReplaceCanvasEnable = true;
                }
            }
        }
    }

    private void method35(int var1, boolean var2) {
        try {
            synchronized (this) {
                if (aBoolean554) {
                    return;
                }

                aBoolean554 = true;
            }

            if (Signlink.aClass87_665.applet != null) {
                Signlink.aClass87_665.applet.destroy();
            }

            try {
                this.method32();
            } catch (Exception var8) {
            }

            if (canvas != null) {
                try {
                    canvas.removeFocusListener(this);
                    canvas.getParent().remove(canvas);
                } catch (Exception var7) {
                }
            }

            if (null != Signlink.aClass87_665) {
                try {
                    Signlink.aClass87_665.method1445(0);
                } catch (Exception var6) {
                }
            }

            this.method33();
            if (var1 <= 31) {
                this.launch();
            }

            if (null != frame) {
                try {
                    System.exit(0);
                } catch (Throwable var5) {
                }
            }

            System.out.println("Shutdown complete - clean:" + var2);
        } catch (RuntimeException var10) {
            throw ClientErrorException.clientError(var10, "rc.EA(" + var1 + ',' + var2 + ')');
        }
    }



    private void method36() {
        try {
            long var2 = TimeUtils.time();
            Class134.aLongArray1766[Unsorted.anInt1953] = var2;
            Unsorted.anInt1953 = 31 & Unsorted.anInt1953 + 1;
            synchronized (this) {

                Class3_Sub13_Sub6.aBoolean3078 = hasWindowFocus;
            }

            this.method25();

        } catch (RuntimeException var9) {
            throw ClientErrorException.clientError(var9, "rc.R(" + true + ')');
        }
    }

    private void method37() {
        try {
            long var2 = TimeUtils.time();
            long var4 = aLongArray2986[anInt950];

            aLongArray2986[anInt950] = var2;
            anInt950 = 31 & anInt950 + 1;
            if (var4 != 0 && var2 > var4) {
                int var6 = (int) (var2 + -var4);
                fpsCounter = (32000 + (var6 >> 1)) / var6;
            }

            if (50 < anInt3313++) {
                aBoolean3116 = true;
                anInt3313 -= 50;
                canvas.setSize(gameShellAWTWidth, gameShellAWTHeight);
                canvas.setVisible(true);
                if (frame != null && null == aFrame3121) {
                    Insets frameInsets = frame.getInsets();
                    canvas.setLocation(frameInsets.left + Class84.anInt1164, Class106.anInt1442 + frameInsets.top);
                } else {
                    canvas.setLocation(Class84.anInt1164, Class106.anInt1442);
                }
            }

            this.method38();
        } catch (RuntimeException var7) {
            throw ClientErrorException.clientError(var7, "rc.AA(" + 0 + ')');
        }
    }

    abstract void method38();

    public final URL getCodeBase() {
        return frame == null ? (null != Signlink.aClass87_665 && this != Signlink.aClass87_665.applet ? Signlink.aClass87_665.applet.getCodeBase() : super.getCodeBase()) : null;
    }

    public final void run() {
        try {
            try {
                if (null != Signlink.javaVendor) {
                    String javaVendor = Signlink.javaVendor.toLowerCase();
                    if (!javaVendor.contains("sun") && !javaVendor.contains("apple")) {
                        if (javaVendor.contains("ibm") && Signlink.javaVendor.equals("1.4.2")) {
                            this.displayGameErrorPopupMessage("wrongjava");
                            return;
                        }
                    } else {
                        String javaVersion = Signlink.javaVersion;
                        if (javaVersion.equals("1.1") || javaVersion.startsWith("1.1.") || javaVersion.equals("1.2") || javaVersion.startsWith("1.2.")) {
                            this.displayGameErrorPopupMessage("wrongjava");
                            return;
                        }

                        anInt1737 = 5;
                    }
                }

                int var7;
                if (null != Signlink.javaVendor && Signlink.javaVendor.startsWith("1.")) {
                    var7 = 2;

                    int var9;
                    for (var9 = 0; Signlink.javaVendor.length() > var7; ++var7) {
                        char var3 = Signlink.javaVendor.charAt(var7);
                        if (var3 < 48 || 57 < var3) {
                            break;
                        }

                        var9 = var9 * 10 - (-var3 - -48);
                    }

                    if (var9 >= 5) {
                        aBoolean1784 = true;
                    }
                }

                if (null != Signlink.aClass87_665.applet) {
                    Method var8 = Signlink.setFocusCycleRoot;
                    if (null != var8) {
                        try {
                            var8.invoke(Signlink.aClass87_665.applet, Boolean.TRUE);
                        } catch (Throwable var4) {
                        }
                    }
                }

                checkMaxMemory();
                this.method30();
                Class164_Sub1.aClass158_3009 = Class3_Sub13_Sub23_Sub1.method285(gameShellAWTHeight, gameShellAWTWidth, canvas);
                this.method39();
                Class3_Sub25.aClass129_2552 = Class36.method1012();

                while (aLong2313 == 0 || aLong2313 > TimeUtils.time()) {
                    Class133.anInt1754 = Class3_Sub25.aClass129_2552.method1767(-1, anInt1737, anInt2626);

                    for (var7 = 0; var7 < Class133.anInt1754; ++var7) {
                        this.method36();
                    }

                    this.method37();
                    Class81.method1400(Signlink.aClass87_665, canvas, -80);
                }
            } catch (Exception var5) {
                ClientErrorException.method1125(null, var5);
                this.displayGameErrorPopupMessage("crash");
            }

            this.method35(107, true);
        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "rc.run()");
        }
    }


    public final String getParameter(String var1) {
        try {
            return frame == null ? (Signlink.aClass87_665 != null && this != Signlink.aClass87_665.applet ? Signlink.aClass87_665.applet.getParameter(var1) : super.getParameter(var1)) : null;
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "rc.getParameter(" + (var1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void method39();

    public final void stop() {
        try {
            if (anApplet_Sub1_2588 == this && !aBoolean554) {
                aLong2313 = 4000L + TimeUtils.time();
            }
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "rc.stop()");
        }
    }

    public abstract void init();

    final void launch() {
        try {
            try {
                gameShellAWTHeight = 768;
                Class70.anInt1047 = 768;
                Class84.anInt1164 = 0;
                anInt4033 = 530;
                gameShellAWTWidth = 1024;
                Unsorted.anInt2334 = 1024;
                Class106.anInt1442 = 0;
                anApplet_Sub1_2588 = this;
                Frame frame = new Frame();
                frame.setTitle("Jagex");
                frame.setResizable(true);
                frame.addWindowListener(this);
                frame.setVisible(true);
                frame.toFront();
                Insets var9 = frame.getInsets();
                frame.setSize(var9.left + Unsorted.anInt2334 + var9.right, var9.top + Class70.anInt1047 + var9.bottom);
                Class3_Sub13_Sub10.aClass87_3125 = Signlink.aClass87_665 = new Signlink(null, 32 + Class3_Sub13_Sub13.anInt3148, "runescape", 29);
                Class64 var10 = Signlink.aClass87_665.method1451(1, this);

                while (0 == Objects.requireNonNull(var10).anInt978) {
                    TimeUtils.sleep(10L);
                }

                Class17.aThread409 = (Thread) var10.anObject974;
                ClientLoader.create().launch();
            } catch (Exception var11) {
                ClientErrorException.method1125(null, var11);
            }

        } catch (RuntimeException var12) {
            throw ClientErrorException.clientError(var12, "rc.S(" + ',' + 1024 + ',' + "{...}" + ',' + 768 + ',' + -8057 + ',' + 28 + ')');
        }
    }

    final void method41(int var3) {
        try {
            try {
                if (anApplet_Sub1_2588 != null) {
                    ++Class36.anInt639;
                    if (Class36.anInt639 >= 3) {
                        this.displayGameErrorPopupMessage("alreadyloaded");
                        return;
                    }

                    System.out.println("Trying to get this applet 5");
                    Objects.requireNonNull(this.getAppletContext()).showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                anApplet_Sub1_2588 = this;
                Class106.anInt1442 = 0;
                anInt4033 = 1530;
                gameShellAWTWidth = 765;
                Unsorted.anInt2334 = 765;
                Class84.anInt1164 = 0;
                gameShellAWTHeight = 503;
                Class70.anInt1047 = 503;
                String var6 = this.getParameter("openwinjs");
                Class3_Sub28_Sub6.aBoolean3594 = var6 != null && var6.equals("1");

                if (null == Signlink.aClass87_665) {
                    Class3_Sub13_Sub10.aClass87_3125 = Signlink.aClass87_665 = new Signlink(this, var3, null, 0);
                }

                Class64 var7 = Signlink.aClass87_665.method1451(1, this);

                while (Objects.requireNonNull(var7).anInt978 == 0) {
                    TimeUtils.sleep(10L);
                }

                Class17.aThread409 = (Thread) var7.anObject974;
            } catch (Exception var8) {
                ClientErrorException.method1125(null, var8);
                this.displayGameErrorPopupMessage("crash");
            }

        } catch (RuntimeException var9) {
            throw ClientErrorException.clientError(var9, "rc.CA(" + (byte) -56 + ',' + 765 + ',' + var3 + ',' + 1530 + ',' + 503 + ')');
        }
    }

}

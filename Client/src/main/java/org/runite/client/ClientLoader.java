package org.runite.client;

import org.rs09.client.config.GameConfig;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

/**
 * The client loader used to initialize the game.
 *
 * @author Jagex
 * @author Keldagrim Development Team
 */
public class ClientLoader extends Applet {

    /**
     * The serial version UID.
     */
    private static final long serialVersionUID = -4744673981053459832L;

    /**
     * The properties being used.
     */
    public static Properties props = new Properties();
    /**
     * The world name.
     */
    public static String world;
    /**
     * The game client.
     */
    public static Client game;
    /**
     * The client loader.
     */
    public static ClientLoader loader;
    /**
     * The JFrame the clients hosted in.
     */
    public JFrame frame;
    /**
     * The jpanel of the client.
     */
    public JPanel jp = new JPanel();
    /*
     *	The window handle GLFW
     */
//    public long window;

    /**
     * Creates the client loader instance.
     *
     * @return the client load.
     */
    public static ClientLoader create() {
        System.setProperty("sun.java2d.noddraw", "true"); //Fixes fullscreen mode
        System.out.println("Creating client loader...");
        loader = new ClientLoader();
        return loader;
    }

    public static void providesignlink(Signlink var0) {
        try {
            System.out.println("Providing signlink...");
            Signlink.aClass87_665 = var0;
            Class3_Sub13_Sub10.aClass87_3125 = var0;
            Class3_Sub13_Sub1.method445();
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "rc.providesignlink(" + (var0 != null ? "{...}" : "null") + ')');
        }
    }

    /**
     * Launches the client.
     */
    public void launch() {
        try {
            System.out.println("Starting launch...");
            ClientLoader.world = "" + GameConfig.SERVER_NAME;
            //System.out.println(GameLaunch.SETTINGS.getWorld());

//            //Error callback
//            GLFWErrorCallback.createPrint(System.err).set();
//
//            if (!glfwInit())
//                throw new IllegalStateException("Unable to initialize GLFW");
//
//            glfwDefaultWindowHints();
//            glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
//            glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
//            glfwWindowHint(GLFW_REFRESH_RATE, GLFW_DONT_CARE);
//
//            window = glfwCreateWindow(765, 503, GameConfig.SERVER_NAME, NULL, NULL);
//            if (window == NULL)
//                throw new RuntimeException("Failed to create the GLFW window");
//
//            glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
//                if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE)
//                    glfwSetWindowShouldClose(window, true);
//            });
//
//            try (MemoryStack stack = stackPush()) {
//                IntBuffer pWidth = stack.mallocInt(1);
//                IntBuffer pHeight = stack.mallocInt(1);
//
//                glfwGetWindowSize(window, pWidth, pHeight);
//                GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());
//                glfwSetWindowPos(
//                        window,
//                        (vidmode.width() - pWidth.get(0)) / 2,
//                        (vidmode.height() - pHeight.get(0)) / 2
//                );
//            }
//
//            glfwMakeContextCurrent(window);
//            GL.createCapabilities();
//            glfwSwapInterval(0);
//            glfwShowWindow(window);
//
//            /* Set the key callback */
//            glfwSetKeyCallback(window, keyCallback);
//
//            /* Declare buffers for using inside the loop */
//            IntBuffer width = MemoryUtil.memAllocInt(1);
//            IntBuffer height = MemoryUtil.memAllocInt(1);
//
//            /* Loop until window gets closed */
//            while (!glfwWindowShouldClose(window)) {
//                float ratio;
//
//                /* Get width and height to calcualte the ratio */
//                glfwGetFramebufferSize(window, width, height);
//                ratio = width.get() / (float) height.get();
//
//                /* Rewind buffers for next get */
//                width.rewind();
//                height.rewind();
//
//                /* Set viewport and clear screen */
//                glViewport(0, 0, width.get(), height.get());
//                glClear(GL_COLOR_BUFFER_BIT);
//
//                /* Set ortographic projection */
//                glMatrixMode(GL_PROJECTION);
//                glLoadIdentity();
//                glOrtho(-ratio, ratio, -1f, 1f, 1f, -1f);
//                glMatrixMode(GL_MODELVIEW);
//
//                /* Rotate matrix */
//                glLoadIdentity();
//                glRotatef((float) glfwGetTime() * 50f, 0f, 0f, 1f);
//
//                /* Render triangle */
//                glBegin(GL_TRIANGLES);
//                glColor3f(1f, 0f, 1f);
//                glVertex3f(-0.6f, -0.4f, 0f);
//                glColor3f(0f, 1f, 0f);
//                glVertex3f(0.6f, -0.4f, 0f);
//                glColor3f(0f, 0f, 1f);
//                glVertex3f(0f, 0.6f, 0f);
//                glEnd();
//
//                /* Swap buffers and poll Events */
//                glfwSwapBuffers(window);
//                glfwPollEvents();
//
//                /* Flip buffers for next loop */
//                width.flip();
//                height.flip();
//            }
//
//            /* Free buffers */
//            MemoryUtil.memFree(width);
//            MemoryUtil.memFree(height);
//
//            /* Release window and its callbacks */
//            glfwDestroyWindow(window);
//            keyCallback.free();
//
//            /* Terminate GLFW and release the error callback */
//            glfwTerminate();
//            errorCallback.free();




            /*
             *	Old AWT frame information
             */
			this.frame = new JFrame(GameConfig.SERVER_NAME);
			this.frame.setLayout(new BorderLayout());
			this.frame.setBackground(Color.BLACK);
			this.frame.setResizable(true);
			this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.jp.setLayout(new BorderLayout());
			this.jp.add(this);
			this.jp.setBackground(Color.black);
			this.jp.setPreferredSize(new Dimension(765, 503));
			//this.frame.setIconImage(Toolkit.getDefaultToolkit().getImage("./res/favicon.png"));
			this.frame.getContentPane().add(this.jp, "Center");
			this.frame.pack();
			this.frame.setVisible(true);
			this.frame.setLocationRelativeTo(null);
            System.out.println("AWT information set...");
            props.put("worldid", "" + GameConfig.WORLD);
            props.put("members", "1");
            props.put("modewhat", "1");
            props.put("modewhere", "0");
            props.put("safemode", "0");
            props.put("game", "0");
            props.put("js", "1");
            props.put("lang", "0");
            props.put("affid", "0");
            props.put("advertsuppressed", "1");
            props.put("lowmem", "0");
            props.put("settings", "kKmok3kJqOeN6D3mDdihco3oPeYN2KFy6W5--vZUbNA");
            Signlink sn = new Signlink(this, 32, "runescape", 29);
            System.out.println("Providing signlink...3");
            providesignlink(sn);
            System.out.println("Providing signlink...4");
            game = new Client();
            System.out.println("Starting new Client()...");
            game.init();
        } catch (Exception localException) {
            localException.printStackTrace();
        }
    }

//    private static GLFWErrorCallback errorCallback
//            = GLFWErrorCallback.createPrint(System.err);
//
//    /**
//     * This key callback will check if ESC is pressed and will close the window
//     * if it is pressed.
//     */
//    private static GLFWKeyCallback keyCallback = new GLFWKeyCallback() {
//
//        @Override
//        public void invoke(long window, int key, int scancode, int action, int mods) {
//            if (key == GLFW_KEY_ESCAPE && action == GLFW_PRESS) {
//                glfwSetWindowShouldClose(window, true);
//            }
//        }
//    };

    /**
     * Gets a property parameter.
     *
     * @return the parameter string.
     */
    public String getParameter(String paramString) {
        return ((String) props.get(paramString));
    }

    /**
     * Gets document base.
     *
     * @return the URL.
     */
    public URL getDocumentBase() {
        return getCodeBase();
    }

    /**
     * Gets the code base.
     *
     * @return The URL.
     */
    public URL getCodeBase() {
        try {
            return new URL("http://" + GameConfig.IP_ADDRESS);
        } catch (MalformedURLException localException) {
            System.out.println("World List Loading might not be working or something else is wrong.");
            System.out.println("Stack Trace:");
            localException.printStackTrace();
            return null;
        }
    }

}
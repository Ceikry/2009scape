package org.rs09.client.window

import org.lwjgl.Version
import org.lwjgl.glfw.GLFW.*
import org.lwjgl.glfw.GLFWErrorCallback
import org.lwjgl.opengl.GL
import org.lwjgl.opengl.GL11.*
import org.lwjgl.system.MemoryStack.stackPush
import org.lwjgl.system.MemoryUtil.NULL
import org.rs09.client.config.GameConfig
import org.runite.client.*
import java.net.MalformedURLException
import java.net.URL
import java.util.*


class GLFWWindow {

    var window = 0L

    /*
     *  Props required for Client launch
     */
    var props = Properties()

    /**
     * The client loader.
     */
    var loader: GLFWWindow? = null

    /*
     *	The window handle GLFW
     */
    //    public long window;
    fun create(): GLFWWindow {
        //System.setProperty("sun.java2d.noddraw", "true") //Fixes fullscreen mode
        println("Creating client loader...")
        loader = GLFWWindow()
        return loader as GLFWWindow
    }

    /*
     *	The window handle GLFW
     */
    //    public long window;
    fun providesignlink(var0: Signlink?) {
        try {
            println("Providing signlink...")
            Signlink.aClass87_665 = var0
            Class3_Sub13_Sub10.aClass87_3125 = var0
            Class3_Sub13_Sub1.generateComputerUserInformation()
        } catch (var2: RuntimeException) {
            throw ClientErrorException.clientError(var2, "rc.providesignlink(" + (if (var0 != null) "{...}" else "null") + ')')
        }
    }

    fun launch() {
        try {
            println("Hello LWJGL " + Version.getVersion() + "!")
            println("Starting launch...")

            /*
             * Generate GLFW Window
             */
            GLFWErrorCallback.createPrint(System.err).set()

            if (!glfwInit())
                throw IllegalStateException("Unable to initialize GLFW")

            glfwDefaultWindowHints()
            glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE)
            glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE)

            window = glfwCreateWindow(765, 503, GameConfig.SERVER_NAME, NULL, NULL)

            glfwSetKeyCallback(window) { window: Long, key: Int, scancode: Int, action: Int, mods: Int ->
                if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) glfwSetWindowShouldClose(window, true) // We will detect this in the rendering loop
            }

            stackPush().use { stack ->
                val pWidth = stack.mallocInt(1) // int*
                val pHeight = stack.mallocInt(1) // int*

                // Get the window size passed to glfwCreateWindow
                glfwGetWindowSize(window, pWidth, pHeight)

                // Get the resolution of the primary monitor
                val vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor())

                // Center the window
                glfwSetWindowPos(
                        window,
                        (vidmode!!.width() - pWidth[0]) / 2,
                        (vidmode.height() - pHeight[0]) / 2
                )
            }

            glfwMakeContextCurrent(window)
            glfwSwapInterval(0)
            glfwShowWindow(window)

            /*
             *  Set props + generate signlink
             */
            println("Submitting properties...")
            ClientLoader.world = "" + GameConfig.SERVER_NAME
            props["worldid"] = "" + GameConfig.WORLD
            props["members"] = "1"
            props["modewhat"] = "1"
            props["modewhere"] = "0"
            props["safemode"] = "0"
            props["game"] = "0"
            props["js"] = "1"
            props["lang"] = "0"
            props["affid"] = "0"
            props["advertsuppressed"] = "1"
            props["lowmem"] = "0"
            props["settings"] = "kKmok3kJqOeN6D3mDdihco3oPeYN2KFy6W5--vZUbNA"
            //val sn = Signlink(this, 32, "runescape", 29)//TODO: Provide signlink information
            println("Providing signlink...3")
            //providesignlink(sn)//TODO: Remove applet from signlink
            println("Providing signlink...4")
            ClientLoader.game = Client()
            println("Starting new Client()...")
            ClientLoader.game.init()
        } catch (e: Exception) {
            System.err.println("Error during GLFW Window creation")
        }
    }

    fun getParameter(paramString: String): String {
        return props.getProperty(paramString)
    }

    fun getDocumentBase(): URL? {
        return getCodeBase()
    }

    fun getCodeBase(): URL? {
        return try {
            URL("http://" + GameConfig.IP_ADDRESS)
        } catch (localException: MalformedURLException) {
            println("World List Loading might not be working or something else is wrong.")
            println("Stack Trace:")
            localException.printStackTrace()
            null
        }
    }

    fun run() {
        loop()


        // Terminate GLFW and free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null)?.free()
    }


    fun loop() {
        GL.createCapabilities()

        glClearColor(1.0f, 1.0f, 1.0f, 0.0f)

        while (!glfwWindowShouldClose(window)) {
            glClear(GL_COLOR_BUFFER_BIT or GL_DEPTH_BUFFER_BIT)
            glfwSwapBuffers(window)
            glfwPollEvents()

        }
    }
}


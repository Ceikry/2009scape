package org.rs09.client.window

import org.lwjgl.Version
import org.lwjgl.glfw.GLFW.*
import org.lwjgl.glfw.GLFWErrorCallback
import org.lwjgl.opengl.GL
import org.lwjgl.opengl.GL11.*
import org.lwjgl.system.MemoryStack.stackPush
import org.lwjgl.system.MemoryUtil.NULL
import org.rs09.client.config.GameConfig


class GLFWWindow {

    var window = 0L

    fun run() {
        println("Hello LWJGL " + Version.getVersion() + "!");

        init()
        loop()


        // Terminate GLFW and free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null)?.free();
    }

    fun init() {

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
        glfwSwapInterval(1)
        glfwShowWindow(window)
    }
    fun loop() {
        GL.createCapabilities()

        glClearColor(1.0f, 0.0f, 0.0f, 0.0f)

        while (!glfwWindowShouldClose(window)) {
            glClear(GL_COLOR_BUFFER_BIT or GL_DEPTH_BUFFER_BIT)
            glfwSwapBuffers(window)
            glfwPollEvents()

        }
    }
}


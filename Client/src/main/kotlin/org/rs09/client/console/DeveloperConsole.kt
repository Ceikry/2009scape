package org.rs09.client.console

import org.rs09.client.rendering.RenderingUtils

object DeveloperConsole {

    var open = false

    fun toggle() {
        open = !open
        println("Toggle console: ${open}")
    }

    fun draw() {
        if (!open) return

        RenderingUtils.fillRect(0, 0, RenderingUtils.width, 200, 255, 128)
    }

}
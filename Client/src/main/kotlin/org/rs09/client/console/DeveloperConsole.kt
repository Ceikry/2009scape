package org.rs09.client.console

import org.rs09.client.rendering.RenderingUtils
import org.runite.jagex.Class74
import java.awt.event.KeyEvent

object DeveloperConsole {

    private const val HEIGHT = 300
    private const val BACKGROUND_COLOR = 0x332277

    private var tempBuffer: IntArray? = null
    private var str: String = ""
    var open = false

    fun toggle() {
        open = !open
    }

    fun draw() {
        if (!open) return

        RenderingUtils.fillRect(0, 0, RenderingUtils.width, HEIGHT, BACKGROUND_COLOR, 128)
        RenderingUtils.drawHorizontalLine(0, HEIGHT - 14 - 2, RenderingUtils.width, -1)
        RenderingUtils.drawText("530", RenderingUtils.width - 27, HEIGHT - 2, -1)
        RenderingUtils.drawText("> $str", 3, HEIGHT - 2, -1)
    }

    fun preDraw() {
        if (RenderingUtils.hd) return

        val copy = IntArray(Class74.buffer.size)
        System.arraycopy(Class74.buffer, 0, copy, 0, copy.size)
        tempBuffer = copy
    }

    fun postDraw() {
        if (RenderingUtils.hd) return

        if (tempBuffer != null) {
            System.arraycopy(tempBuffer!!, 0, Class74.buffer, 0, Class74.buffer.size)
        }
        tempBuffer = null
    }

    fun handleKey(evt: KeyEvent) {
        if (evt.keyChar == '`' || evt.keyChar == '\t' || evt.keyChar == '\n') return

        if (evt.keyChar == '\b' && str.isNotEmpty()) str = str.substring(0, str.length - 1)
        else str += evt.keyChar
    }

}
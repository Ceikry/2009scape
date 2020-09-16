package org.rs09.client.console

import org.rs09.client.rendering.RenderingUtils
import org.rs09.client.rendering.Toolkit
import org.runite.jagex.RSString
import org.runite.jagex.TimeUtils
import java.awt.event.KeyEvent
import java.util.*


// TODO Escape characters in the string rendering - is this something we can do using RSString / the text renders?
object DeveloperConsole {

    private val LOCK = Any()


    private const val HEIGHT = 300
    private const val BACKGROUND_COLOR = 0x332277
    private const val MAX_LINES = 100
    private const val SCROLL_SPEED = 25

    private val calendar = Calendar.getInstance()
    private var tempBuffer: IntArray? = null
    private val lines = LinkedList<RSString>()
    private var scrollOffset = 0
    private var str: String = ""

    var open = false

    fun toggle() {
        open = !open
    }

    fun draw() {
        if (!open) return

        Toolkit.getActiveToolkit().fillRect(0, 0, RenderingUtils.width, HEIGHT, BACKGROUND_COLOR, 128)
        Toolkit.getActiveToolkit().drawHorizontalLine(0, HEIGHT - 14 - 2, RenderingUtils.width, -1)
        RenderingUtils.drawText("530", RenderingUtils.width - 27, HEIGHT - 2, -1)
        RenderingUtils.drawText("> $str", 3, HEIGHT - 2, -1)

        RenderingUtils.setClipping(0, 0, RenderingUtils.width, HEIGHT - 16)
        synchronized(LOCK) {
            lines.forEachIndexed { i, line -> RenderingUtils.drawText(line, 3, scrollOffset + HEIGHT - 20 - i * 14, -1) }
        }
        RenderingUtils.resetClipping()
    }

    fun println(line: String) {
        synchronized(LOCK) {
            lines.addFirst(RSString.of(line))
            if (lines.size >= MAX_LINES) lines.removeLast()

            if (scrollOffset != 0) {
                val room = HEIGHT - 20
                val max = lines.size * 14
                val diff = max - room
                if (scrollOffset < diff) {
                    scrollOffset += 14
                    if (scrollOffset > diff) scrollOffset = diff
                }
            }
        }
    }

    fun preDraw() {
        if (RenderingUtils.hd) return

        val copy = IntArray(Toolkit.JAVA_TOOLKIT.buffer.size)
        System.arraycopy(Toolkit.JAVA_TOOLKIT.buffer, 0, copy, 0, copy.size)
        tempBuffer = copy
    }

    fun postDraw() {
        if (RenderingUtils.hd) return

        if (tempBuffer != null) {
            System.arraycopy(tempBuffer!!, 0, Toolkit.JAVA_TOOLKIT.buffer, 0, Toolkit.JAVA_TOOLKIT.buffer.size)
        }
        tempBuffer = null
    }

    fun onConsoleInput(str: String) {
        calendar.time = Date(TimeUtils.time())
        val h: Int = calendar.get(Calendar.HOUR_OF_DAY)
        val m: Int = calendar.get(Calendar.MINUTE)
        val s: Int = calendar.get(Calendar.SECOND)

        println("<col=8888cc>[$h:$m:$s]</col> <col=ff3333>TODO!</col> Handle '$str'")
    }

    fun handleKeyDown(evt: KeyEvent) {
        if (evt.keyCode == KeyEvent.VK_DOWN) {
            if (scrollOffset > SCROLL_SPEED) scrollOffset -= SCROLL_SPEED else scrollOffset = 0
        } else if (evt.keyCode == KeyEvent.VK_UP) {
            val room = HEIGHT - 20
            val max = lines.size * 14
            val diff = max - room
            if (scrollOffset < diff) {
                scrollOffset += SCROLL_SPEED
                if (scrollOffset > diff) scrollOffset = diff
            }
        }
    }

    fun handleKeyPressed(evt: KeyEvent) {
        if (evt.keyChar == '`' || evt.keyChar == '\t') return

        when {
            evt.keyChar == '\n' -> {
                if (str.isNotBlank()) onConsoleInput(str.trim())
                str = ""
            }
            evt.keyChar == '\b' && str.isNotEmpty() -> str = str.substring(0, str.length - 1)
            else -> str += evt.keyChar
        }
    }

}
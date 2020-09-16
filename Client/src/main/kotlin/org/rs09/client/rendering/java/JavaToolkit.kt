package org.rs09.client.rendering.java

import org.rs09.client.rendering.Toolkit

class JavaToolkit : Toolkit() {
    var buffer: IntArray = IntArray(0)

    @JvmField
    var clipLeft: Int = 0

    @JvmField
    var clipTop: Int = 0

    @JvmField
    var clipRight: Int = 0

    @JvmField
    var clipBottom: Int = 0

    @JvmField
    var width: Int = 0

    @JvmField
    var height: Int = 0

    override fun fillRect(x: Int, y: Int, w: Int, h: Int, rgb: Int, alpha: Int) {
        var x = x
        var y = y
        var width = w
        var height = h
        var rgb = rgb

        if (x < this.clipLeft) {
            width -= this.clipLeft - x
            x = this.clipLeft
        }

        if (y < this.clipTop) {
            height -= this.clipTop - y
            y = this.clipTop
        }

        if (x + width > this.clipRight) {
            width = this.clipRight - x
        }

        if (y + height > this.clipBottom) {
            height = this.clipBottom - y
        }

        rgb = ((rgb and 0xff00ff) * alpha shr 8 and 0xff00ff) + ((rgb and 0xff00) * alpha shr 8 and 0xff00)
        val invertedOpacity = 256 - alpha
        val skipPerLine = this.width - width
        var offset = x + y * this.width

        for (lx in 0 until height) {
            for (ly in -width..-1) {
                var old = buffer[offset]
                old = ((old and 0xff00ff) * invertedOpacity shr 8 and 0xff00ff) + ((old and 0xff00) * invertedOpacity shr 8 and 0xff00)
                buffer[offset++] = rgb + old
            }
            offset += skipPerLine
        }
    }

    override fun drawHorizontalLine(x: Int, y: Int, w: Int, rgb: Int) {
        var x = x
        var width = w

        if (y < clipTop || y >= clipBottom)
            return

        if (x < clipLeft) {
            width -= clipLeft - x
            x = clipLeft
        }
        if (x + width > clipRight) {
            width = clipRight - x
        }

        val var4 = x + y * this.width
        for (var5 in 0 until width) {
            buffer[var4 + var5] = rgb
        }
    }

    fun resetBuffer() {
        buffer = IntArray(0)
    }
}
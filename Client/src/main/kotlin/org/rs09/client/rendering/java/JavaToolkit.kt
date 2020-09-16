package org.rs09.client.rendering.java

import org.rs09.client.rendering.Toolkit
import org.runite.jagex.Class74

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
        TODO("Not yet implemented")
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
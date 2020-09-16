package org.rs09.client.rendering.opengl

import org.rs09.client.rendering.Toolkit
import org.rs09.client.rendering.opengl.enums.GLBeginMode
import org.runite.jagex.HDToolKit

class OpenGlToolkit: Toolkit() {
    override fun fillRect(x: Int, y: Int, w: Int, h: Int, rgb: Int, alpha: Int) {
        HDToolKit.method1835()
        val var6 = x.toFloat()
        val var7 = var6 + w.toFloat()
        val var8 = (HDToolKit.height - y).toFloat()
        val var9 = var8 - h.toFloat()
        val var10 = HDToolKit.gl

        var10.glBegin(GLBeginMode.TRIANGLE_FAN)
        var10.glColor4ub((rgb shr 16).toByte(), (rgb shr 8).toByte(), rgb.toByte(), if (alpha > 255) -1 else alpha.toByte())
        var10.glVertex2f(var6, var8)
        var10.glVertex2f(var6, var9)
        var10.glVertex2f(var7, var9)
        var10.glVertex2f(var7, var8)
        var10.glEnd()
    }

    override fun drawHorizontalLine(x: Int, y: Int, w: Int, rgb: Int) {
        HDToolKit.method1835()
        val startX = x.toFloat() + 0.3f
        val endX = startX + w.toFloat()
        val yPos = HDToolKit.height.toFloat() - (y.toFloat() + 0.3f)
        val gl = HDToolKit.gl

        gl.glBegin(GLBeginMode.LINES)
        gl.glColor3ub((rgb shr 16).toByte(), (rgb shr 8).toByte(), rgb.toByte())
        gl.glVertex2f(startX, yPos)
        gl.glVertex2f(endX, yPos)
        gl.glEnd()
    }
}
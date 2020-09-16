package org.rs09.client.rendering

import org.runite.jagex.*

/**
 * A utility class to make rendering new things easier. This should only be used for new things. Ideally only port the
 * necessary calls to this utility class.
 *
 * In the future, instead of utilizing this class, a toolkit system should be used.
 */
object RenderingUtils {
    val hd: Boolean
        get() = HDToolKit.highDetail

    // TODO Is this actually the width?
    val width: Int
        get() = Class23.anInt454

    // TODO Is this actually the height?
    val height: Int
        get() = Class140_Sub7.anInt2934

    /*
                windowHeight = Class140_Sub7.anInt2934;
            windowWidth = Class23.anInt454;
     */

    fun fillRect(x: Int, y: Int, w: Int, h: Int, rgb: Int, alpha: Int) {
        if (hd) Class22.method930(x, y, w, h, rgb, alpha)
        else Class74.fillRectangle(x, y, w, h, rgb, alpha)
    }
}
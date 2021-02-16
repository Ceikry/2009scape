package org.rs09

import org.rs09.client.config.GameConfig

/**
 * Handles custom client vars because I did it the lazy way
 * @author Ceikry
 */
object CustomVars {
    @JvmStatic
    fun parse(varID: Int, varValue: Int): Boolean{
        return when(varID){
            2501 -> {
                GameConfig.xpDropsEnabled = (varValue and 1) == 1
                GameConfig.xpDropMode = (varValue shr 1) and 1
                GameConfig.xpTrackMode = (varValue shr 2) and 1
                true
            }
            else -> false
        }
    }
}
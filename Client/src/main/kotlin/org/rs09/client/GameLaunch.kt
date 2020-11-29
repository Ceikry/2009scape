package org.rs09.client

import org.rs09.client.config.GameConfig
import org.rs09.client.window.GLFWWindow
import org.runite.client.GameShell

object GameLaunch {

    /**
     * The main method.
     * r @param args the arguments casted on runtime.
     * r_game
     *
     */
    @JvmStatic
    fun main(args: Array<String>) {
        for (i in args.indices) {
            val cmd = args[i].split("=").toTypedArray()
            when (cmd[0]) {
                "ip" -> GameConfig.IP_ADDRESS = cmd[1]
                "world" -> GameConfig.WORLD = cmd[1].toInt()
                else -> GameConfig.configLocation = cmd[0]
            }
        }
        try {
            println("Trying to parse config at " + GameConfig.configLocation)
            GameConfig.parse(GameConfig.configLocation)
            GameConfig.implementHoliday()
        } catch (e: Exception) {
            GameConfig.IP_ADDRESS = "play.2009scape.org"
            GameConfig.IP_MANAGEMENT = "play.2009scape.org"
            GameConfig.IP_ACCOUNT_REGISTRATION = "play.2009scape.org"
            GameConfig.SERVER_PORT = 43594
            GameConfig.WL_PORT = 5555
            GameConfig.RCM_STYLE_PRESET = "classic"
            GameConfig.RCM_TITLE = "<col=5d5447>Choose Option</col>"
            GameConfig.RENDER_DISTANCE_INCREASE = true
            e.printStackTrace()
        }
        /**
         * Launches the client
         */
//        GLFWWindow().run()
        GameShell.launchDesktop()
    }

}
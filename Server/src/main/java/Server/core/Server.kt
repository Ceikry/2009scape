package core

import core.game.system.*
import core.game.system.config.ServerConfigParser
import core.game.system.mysql.SQLManager
import core.game.world.GameWorld
import core.game.world.repository.Repository
import core.gui.ConsoleFrame
import core.net.NioReactor
import core.net.amsc.WorldCommunicator
import core.tools.TimeStamp
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import core.game.ge.GEAutoStock
import java.io.File
import java.net.BindException
import java.util.*

/**
 * The main class, for those that are unable to read the class' name.
 * @author Emperor
 * @author Vexia
 */
object Server {
    /**
     * The time stamp of when the server started running.
     */
	@JvmField
	var startTime: Long = 0

    /**
     * The NIO reactor.
     */
    var reactor: NioReactor? = null

    /**
     * The main method, in this method we load background utilities such as
     * cache and our world, then end with starting networking.
     * @param args The arguments cast on runtime.
     * @throws Throwable When an exception occurs.
     */
    @Throws(Throwable::class)
    @JvmStatic
    fun main(args: Array<String>) {
        if (args.isNotEmpty()) {
            ServerConfigParser(args[0])
        } else {
            println("Using config file worldprops/default.json")
            ServerConfigParser("worldprops" + File.separator + "default.json")
        }
        if (GameWorld.settings?.isGui == true) {
            try {
                ConsoleFrame.getInstance().init()
            } catch (e: Exception) {
                println("X11 server missing - launching server with no GUI!")
            }
        }
        startTime = System.currentTimeMillis()
        val t = TimeStamp()
        GameWorld.prompt(true)
        SQLManager.init()
        Runtime.getRuntime().addShutdownHook(ServerConstants.SHUTDOWN_HOOK)
        SystemLogger.log("Starting NIO reactor...")
        try {
            NioReactor.configure(43594 + GameWorld.settings?.worldId!!).start()
        } catch (e: BindException) {
            println("Port " + (43594 + GameWorld.settings?.worldId!!) + " is already in use!")
            throw e
        }
        WorldCommunicator.connect()
        SystemLogger.log(GameWorld.settings?.name + " flags " + GameWorld.settings?.toString())
        SystemLogger.log(GameWorld.settings?.name + " started in " + t.duration(false, "") + " milliseconds.")

        GEAutoStock.autostock()
        val scanner = Scanner(System.`in`)
        GlobalScope.launch {
            while(scanner.hasNextLine()){
                val command = scanner.nextLine()
                when(command){
                    "stop" -> SystemManager.flag(SystemState.TERMINATED)
                    "players" -> System.out.println("Players online: " + (Repository.LOGGED_IN_PLAYERS.size))
                    "update" -> SystemManager.flag(SystemState.UPDATING)
                    "help","commands" -> printCommands()
                    "restartworker" -> SystemManager.flag(SystemState.ACTIVE)

                }
            }
        }
    }

    fun printCommands(){
        println("stop - stop the server (saves all accounts and such)")
        println("players - show online player count")
        println("update - initiate an update with a countdown visible to players")
        println("help, commands - show this")
        println("restartworker - Reboots the major update worker in case of a travesty.")
    }

    fun autoReconnect() {
        /*SystemLogger.log("Attempting autoreconnect of server")
        WorldCommunicator.connect()*/
    }
    /**
     * Gets the startTime.
     * @return the startTime
     */
    fun getStartTime(): Long {
        return startTime
    }

    /**
     * Sets the bastartTime.ZZ
     * @param startTime the startTime to set.
     */
    fun setStartTime(startTime: Long) {
        Server.startTime = startTime
    }
}

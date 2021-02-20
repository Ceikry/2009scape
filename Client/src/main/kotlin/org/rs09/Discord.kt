package org.rs09

import net.arikia.dev.drpc.DiscordEventHandlers
import net.arikia.dev.drpc.DiscordRPC
import net.arikia.dev.drpc.DiscordRichPresence

/**
 * Handles discord rich presence integration
 * @author Ceikry
 * library thanks to Vatuu on Github
 */
object Discord {
    const val APP_ID = "812421731238019073";
    var presence = DiscordRichPresence()

    @JvmStatic
    fun checkInitializable() : Boolean{
        val OS = System.getProperty("os.name")
        if(OS.toLowerCase().startsWith("windows") || OS.toLowerCase().contains("nux")){
            val arch = System.getProperty("os.arch")
            return arch != "aarch64"
        }
        return false
    }

    @JvmStatic
    fun initialize() {
        val handlers = DiscordEventHandlers.Builder().setReadyEventHandler { user ->
            System.out.println("Discord Initialized, welcome " + user.username + user.discriminator + "!")
        }.setErroredEventHandler { errorCode, message ->
            System.out.println("Discord error encountered: [$errorCode] $message")
            DiscordRPC.discordShutdown()
        }.build()

        DiscordRPC.discordInitialize(APP_ID,handlers,true)
    }

    @JvmStatic
    fun updatePresence(stateMessage: String,details: String,imageKey : String) {
        if(presence.state == stateMessage && presence.details == details && imageKey == presence.smallImageKey) return
        val newPresence = DiscordRichPresence.Builder(stateMessage).setDetails(details).build()
        newPresence.startTimestamp = System.currentTimeMillis()
        if(newPresence.details.startsWith("Training")){
            newPresence.smallImageKey = imageKey
        }
        newPresence.largeImageKey = "logo"
        newPresence.largeImageText = "2009Scape, a free MMO."
        DiscordRPC.discordUpdatePresence(newPresence)
        presence = newPresence
        DiscordRPC.discordRunCallbacks()
    }
}
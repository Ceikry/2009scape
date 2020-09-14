package org.rs09.client.console

object DeveloperConsole {

    var open = false

    fun toggle() {
        open = !open
        println("Toggle console: ${open}")
    }

    fun draw() {

    }

}
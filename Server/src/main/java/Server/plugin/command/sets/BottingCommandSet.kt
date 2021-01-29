package plugin.command.sets

import core.plugin.InitializablePlugin
import plugin.command.Command
import plugin.command.CommandSet

@InitializablePlugin
class BottingCommandSet : CommandSet(Command.Privilege.STANDARD) {
    override fun defineCommands() {
        define("scripts"){player, _ ->

        }
        define("script"){player,args ->

        }
        define("stopscript"){player,args ->

        }
    }
}
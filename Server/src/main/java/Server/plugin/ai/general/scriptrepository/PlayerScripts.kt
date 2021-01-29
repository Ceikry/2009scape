package plugin.ai.general.scriptrepository

import core.game.system.SystemLogger
import io.github.classgraph.ClassGraph

object PlayerScripts {
    val scripts = ArrayList<PlayerScript>()
    class PlayerScript(val identifier: String, val description: String)

    fun init(){
        val result = ClassGraph().enableAnnotationInfo().acceptPackages("plugin.ai.general.scriptrepository").scan()
        result.getClassesWithAnnotation("plugin.ai.general.scriptrepository.PlayerCompatible").forEach {
            val description = it.getAnnotationInfo("plugin.ai.general.scriptrepository.ScriptDescription").parameterValues[0].value.toString()
            val identifier = it.getAnnotationInfo("plugin.ai.general.scriptrepository.ScriptIdentifier").parameterValues[0].value.toString()
            scripts.add(PlayerScript(identifier,description))
        }
    }
}
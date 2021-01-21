package plugin.quest.members.thelosttribe

import core.game.node.entity.player.Player
import core.game.node.entity.player.link.quest.Quest
import core.plugin.InitializablePlugin
import plugin.skill.Skills

@InitializablePlugin
class LostTribe : Quest("Lost Tribe",84,83,1) {
    override fun newInstance(`object`: Any?): Quest {
        return this
    }

    override fun drawJournal(player: Player?, stage: Int) {
        super.drawJournal(player, stage)
        player ?: return
        var line = 11
        if(stage == 0){
            line(player,"I can start this quest by speaking to !!Sigmund?? in !!Lumbridge??",line++)
            line(player,"!!Castle.??",line++)
            line(player,"I must have completed:",line++)
            line(player,"Rune Mysteries",line++,player?.questRepository?.isComplete("Rune Mysteries") == true)
            line(player,"Goblin Diplomacy",line++,player?.questRepository?.isComplete("Goblin Diplomacy") == true)
            line(player,"and have:",line++)
            line(player,"Level 17 mining",line++,player.skills.getLevel(Skills.MINING) >= 17)
            line(player,"Level 13 agility",line++,player.skills.getLevel(Skills.AGILITY) >= 13)
            line(player,"Level 13 thieving",line++,player.skills.getLevel(Skills.THIEVING) >= 13)
        } else {
            if(stage >= 10) {
                line(player, "!!Sigmund?? said I should ask around town and see", line++, stage >= 20)
                line(player, "if anyone had seen what happened in the !!cellar??.", line++, stage >= 20)
            }
            if(stage >= 20){
                line(player, "I found out that someone had seen a !!goblin-like?? creature in the cellar.",line++,stage >= 30)
                line(player,"I should go speak to !!The Duke?? about this.",line++,stage >= 30)
            }
            if(stage >= 30){
                line(player,"The Duke gave me permission to investigate !!the tunnel??.",line++,stage >= 40)
                line(player,"I should get down into the !!cellar?? and try to unblock the !!tunnel??.",line++,stage >= 40)
            }
            if(stage >= 40){
                line(player,"The Duke asked me to speak with the !!librarian?? in !!Varrock??",line++,stage >= 43)
                line(player,"and see if he can identify the brooch.",line++,stage >= 43)
            }
            if(stage >= 43){
                line(player,"I should go speak with some !!goblins?? who might be able",line++,stage >= 44)
                line(player,"to teach me more about the !!Dorgeshuun??. Perhaps the",line++,stage >= 44)
                line(player,"!!generals in Goblin Village?? can help.",line++,stage >= 44)
            }
        }

    }

    override fun getConfig(player: Player?, stage: Int): IntArray {
        player ?: return intArrayOf(465,0)
        if(stage >= 30 && player.getAttribute("tlt-hole-cleared",false)){
            return intArrayOf(465,4)
        }
        if(stage >= 60 && player.getAttribute("tlt-goblin-emotes",false)){
            return intArrayOf(465,7)
        }
        if(stage > 0) return intArrayOf(465,1)
        return intArrayOf(465,0)
    }
}
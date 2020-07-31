/*
package plugin.ai.general.scriptrepository

import core.game.node.item.Item
import core.game.world.update.flag.context.Animation
import core.game.world.update.flag.context.Graphics
import core.tools.ItemNames
import plugin.activity.mta.AlchemySpell
import plugin.ai.skillingbot.SkillingBotAssembler
import plugin.skill.Skills
import plugin.skill.magic.Runes

class AlchingIdler() : Script(){

    var alching = false
    override fun tick() {
        if(!alching) {
            bot.inventory.add(Item(4151))
            AlchemySpell(55, 65.0, Animation.create(713), Graphics(113, 96), true, Runes.FIRE_RUNE.getItem(5), Runes.NATURE_RUNE.getItem(1)).cast(bot,Item(4151))
        }
    }

    override fun newInstance(): Script {
        val script = AlchingIdler()
        script.bot = SkillingBotAssembler().produce(SkillingBotAssembler.Wealth.RICH,bot.startLocation)
        return script
    }

    init {
        equipment.add(Item(ItemNames.STAFF_OF_FIRE))
        inventory.add(Item(ItemNames.NATURE_RUNE,100000))
        skills[Skills.MAGIC] = 99
    }
}*/

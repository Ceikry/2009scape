package plugin.ai.pvmbots

import core.game.node.item.Item
import core.game.system.SystemLogger
import core.game.world.map.Location
import core.tools.ItemNames
import core.tools.RandomFunction
import plugin.ai.AIPlayer
import plugin.skill.Skills
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class CombatBotAssembler {
    enum class Type{
        RANGE,
        MAGE,
        MELEE
    }
    enum class Tier{
        LOW,
        MED,
        HIGH
    }
        fun produce(type: Type, tier: Tier, location: Location): AIPlayer? {
            return when (type) {
                Type.RANGE -> assembleRangedBot(tier, location)
                Type.MELEE -> assembleMeleeBot(tier,location)
                Type.MAGE -> assembleMeleeBot(tier,location)
            }
        }

        fun assembleRangedBot(tier: Tier, location: Location, crossbow: Boolean? = null): CombatBot {
            val bot = CombatBot(location)

            generateStats(bot, tier, Skills.RANGE, Skills.DEFENCE)
            gearRangedBot(bot, crossbow ?: Random().nextInt() % 2 == 0)
            return bot
        }

        fun assembleMeleeBot(tier: Tier, location: Location): CombatBot {
            val bot = CombatBot(location)

            generateStats(bot, tier, Skills.ATTACK, Skills.STRENGTH, Skills.DEFENCE)
            gearMeleeBot(bot)
            return bot
        }

        fun assembleMeleeDragonBot(tier: Tier, location: Location): CombatBot{
            val bot = CombatBot(location)
            generateStats(bot,tier,Skills.ATTACK, Skills.STRENGTH, Skills.DEFENCE)
            equipHighest(bot, MELEE_HELMS, 50)
            equipHighest(bot, MELEE_TOP, 40)
            equipHighest(bot, MELEE_LEG, 40)
            equipHighest(bot, MELEE_WEP, 60)
            return bot
        }

        fun assembleRangeDragonBot(tier: Tier, location: Location): CombatBot{
            val bot = CombatBot(location)
            generateStats(bot,tier,Skills.RANGE,Skills.DEFENCE)
            equipHighest(bot,RANGE_HELMS,50)
            equipHighest(bot,RANGE_TOPS,50)
            equipHighest(bot,RANGE_LEGS,50)
            equipHighest(bot,CROSSBOWS,50)
            bot.equipment.add(Item(ItemNames.BRONZE_BOLTS,100000),13,false,false)
            return bot
        }

        fun gearRangedBot(bot: AIPlayer, crossbow: Boolean? = false) {
            equipHighest(bot, RANGE_HELMS)
            equipHighest(bot, RANGE_TOPS)
            equipHighest(bot, RANGE_LEGS)
            if(crossbow == true) { equipHighest(bot,CROSSBOWS); equipHighest(bot,MELEE_SHIELD); bot.equipment.add(Item(ItemNames.BRONZE_BOLTS,Integer.MAX_VALUE),13,false,false) }
            else {equipHighest(bot, BOWS); bot.equipment.add(Item(ItemNames.BRONZE_ARROW,Integer.MAX_VALUE),13,false,false) }
            bot.equipment.refresh()
        }

        fun gearMeleeBot(bot: AIPlayer){
            equipHighest(bot, MELEE_HELMS)
            equipHighest(bot, MELEE_LEG)
            equipHighest(bot, MELEE_SHIELD)
            equipHighest(bot, MELEE_TOP)
            equipHighest(bot, MELEE_WEP)
            bot.equipment.refresh()
        }

        fun gearRichMeleeBot(bot: AIPlayer){
            equipHighest(bot, MELEE_HELMS)
            bot.equipment.refresh()
        }


        fun generateStats(bot: AIPlayer, tier: Tier, vararg skills: Int) {
            var totalXPAdd = 0.0
            var skillAmt = 0.0
            val variance = 0.50
            var max = 0
            val initial = when (tier) {
                Tier.LOW -> RandomFunction.random(33).also { max = 33 }
                Tier.MED -> RandomFunction.random(33, 66).also { max = 66 }
                Tier.HIGH -> RandomFunction.random(66, 99).also { max = 99 }
            }
            for (skill in skills.indices) {
                val perc = RandomFunction.random(-variance,variance)
                var level = initial +  (perc * 33).toInt()
                if(level < 1)
                    level = 1
                if(level > max)
                    level = max
                bot.skills.setLevel(skills[skill], level)
                bot.skills.setStaticLevel(skills[skill], level)
                totalXPAdd += bot.skills.getExperience(skills[skill])
                skillAmt++
            }
            bot.skills.addExperience(Skills.HITPOINTS, (totalXPAdd / skillAmt) * 0.2)
            SystemLogger.log("hp: ${(totalXPAdd / skillAmt) * 0.2}")
            val new_hp = bot.skills.levelFromXP((totalXPAdd / skillAmt) * 0.2)
            bot.skills.setStaticLevel(Skills.HITPOINTS,10 + new_hp)
            bot.skills.updateCombatLevel()
            bot.fullRestore()
        }

        private fun equipHighest(bot: AIPlayer, set: Array<Int>, levelcap: Int? = null) {
            val highestItems = ArrayList<Item>()
            var highest: Item? = null
            for (i in set.indices) {
                val item = Item(set[i])
                var canEquip = true
                (item.definition.configurations.getOrDefault("requirements",null) as HashMap<Int,Int>?)?.let { map ->
                    levelcap?.let {levelcap ->
                        map.map {
                            if (bot.skills.getLevel(it.key) < it.value || it.value > levelcap)
                                canEquip = false
                        }
                    } ?: map.map {
                            if (bot.skills.getLevel(it.key) < it.value)
                                canEquip = false
                        }
                }
                if (canEquip) {
                    if (highest == null) {
                        highest = item
                        highestItems.add(item)
                        continue
                    }
                    if (item.lvlAvg() > highest.lvlAvg()) {
                        highest = item
                        highestItems.clear()
                        highestItems.add(item)
                    } else if(item.lvlAvg() == highest.lvlAvg()){
                        highestItems.add(item)
                    }
                }
            }
            bot.equipment.add(highestItems.random(), highest!!.definition!!.configurations["equipment_slot"] as Int, false, false)
        }

        fun Item.lvlAvg(): Int {
            var total = 1
            var count = 1
            (definition.configurations.getOrDefault("requirements",null) as HashMap<Int,Int>?)?.let { map ->
                map.map {
                    total += it.value
                    count++
                }
            }
            return total / count
        }


        val RANGE_HELMS = arrayOf(1167, 4732, 12936)
        val RANGE_TOPS = arrayOf(1129, 1131)
        val RANGE_LEGS = arrayOf(1095, 1097, 1099)
        val BOWS = arrayOf(841, 843, 847, 853)
        val CROSSBOWS  = arrayOf(9185,9174,9177,9176,9179,9181,9183)

        val MELEE_HELMS = arrayOf(1137,1139, 1141, 6621, 1143,1145,1147,1149,1151,1153, 6623, 1159,1163,1165,3748, 3751, 10828, 11335, 3753, 4716,4724, 4745, 4753)
        val MELEE_TOP = arrayOf(1101,1103,1105,1107,1109,1111,1113,2513,1115,1117,1119,1121,1123,1125,1127,4720,4728)
        val MELEE_LEG = arrayOf(1081,1083,1085,1087,1089,1091,1093,4759,1067,1069,1071,1073,1075,1077,1079,4722,4751)
        val MELEE_SHIELD = arrayOf(1171,1173,1175,1177,1179,1181,1183,1185,1187,1189,1191,1193,1195,1197,1199,1201)
        val MELEE_WEP = arrayOf(1277,1279,1281,1283,1285,1287,1289,1291,1293,1295,1297,1299,1301,1303,1305,1321,1323,1325,1327,1329,1331,1333,4587,4151,1363,1365,1367,1369,1371,1373,1375,1377)

        val RICH_MELEE_HELMS = arrayOf(2587, 2595, 2605, 2613, 2619, 2627, 2657, 2665, 2673, 3486, 10350)
}
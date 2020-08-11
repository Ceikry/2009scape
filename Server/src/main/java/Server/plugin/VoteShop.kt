package plugin

import core.cache.def.impl.ItemDefinition
import core.game.content.global.shop.Shop
import core.game.content.global.shop.ShopViewer
import core.game.node.entity.player.Player
import core.game.node.item.Item
import core.tools.ItemNames

class VoteShop : Shop("Vote Shop", listOf(
        Item(ItemNames.RED_PARTYHAT,100),
        Item(ItemNames.BLUE_PARTYHAT, 100),
        Item(ItemNames.GREEN_PARTYHAT, 100),
        Item(ItemNames.YELLOW_PARTYHAT, 100),
        Item(ItemNames.PURPLE_PARTYHAT,100),
        Item(ItemNames.WHITE_PARTYHAT, 100),
        Item(ItemNames.RED_HALLOWEEN_MASK,100),
        Item(ItemNames.BLUE_HALLOWEEN_MASK, 100),
        Item(ItemNames.GREEN_HALLOWEEN_MASK,100),
        Item(13887,100),
        Item(13893, 100),
        Item(13899,100),
        Item(13858,100),
        Item(13861, 100),
        Item(13864,100),
        Item(13867,100),
        Item(ItemNames.SCYTHE_10735,200),
        Item(14643,100)
).toTypedArray(),false,13940,false){
    val prices = hashMapOf(
            ItemNames.RED_PARTYHAT to 1,
            ItemNames.BLUE_PARTYHAT to 50,
            ItemNames.GREEN_PARTYHAT to 50,
            ItemNames.YELLOW_PARTYHAT to 50,
            ItemNames.PURPLE_PARTYHAT to 50,
            ItemNames.WHITE_PARTYHAT to 50,
            ItemNames.RED_HALLOWEEN_MASK to 60,
            ItemNames.BLUE_HALLOWEEN_MASK to 60,
            ItemNames.GREEN_HALLOWEEN_MASK to 60,
            13887 to 100,
            13893 to 100,
            13899 to 100,
            13858 to 100,
            13861 to 100,
            13864 to 100,
            13867 to 100,
            10735 to 200,
            14643 to 125
    )

    override fun open(player: Player?) {
        player ?: return
        super.open(player)
    }


    override fun getBuyPrice(item: Item?, player: Player?): Int {
        return prices.get(item?.id) ?: Integer.MAX_VALUE.also { player?.sendMessage("This item's price hasn't been defined. Please contact us.") }
    }

    override fun canSell(player: Player?, item: Item?, def: ItemDefinition?): Boolean {
        player ?: return false
        player.sendMessage("This shop cannot be sold to.")
        return false
    }

    override fun value(player: Player?, viewer: ShopViewer?, item: Item?, sell: Boolean) {
        item ?: return
        player ?: return
        var multiple: Boolean
        if(sell){
            player.sendMessage("This shop cannot be sold to.").also { return }
        }
        player.sendMessage("This item costs " + (prices[item.id] ?: Integer.MAX_VALUE).also { multiple = it > 1 } + " " + "vote token" + if(multiple) "s." else ".")
    }

    override fun decrementPoints(player: Player?, decrement: Int) {
        player ?: return
        player.details.credits -= decrement
    }

}
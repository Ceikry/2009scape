package core.game.node.entity.player

import core.game.node.item.Item
import core.game.system.SystemLogger
import core.game.system.mysql.SQLManager
import java.nio.ByteBuffer
import java.sql.ResultSet
import kotlin.experimental.and

class VoteManager(val player: Player) {
    class Vote(val id: Int)
    var votes  = arrayListOf<Vote>()
    var claimedVotes = arrayListOf<Int>()
    fun init() {
        val conn = SQLManager.getConnection()
        val statement = conn.createStatement()
        val rs: ResultSet

        rs = statement.executeQuery("SELECT * FROM votes WHERE username = '" + player.name + "'");
        while(rs.next()){
            val siteName = rs.getString("site").toString()
            val voteDate = rs.getString("timestamp").toString()
            votes.add(Vote((siteName + voteDate).hashCode()))
        }
    }

    fun claimAll(){
        var claimed = 0
        for(vote in votes){
            if(!claimedVotes.contains(vote.id)){
                player.inventory.add(Item(13940))
                claimedVotes.add(vote.id)
                claimed++
            }
        }
        if(claimed > 0) {
            player.sendMessage("You have claimed $claimed votes.")
        } else {
            player.sendMessage("You had no votes to claim!")
            player.sendMessage("If you have recently voted, try waiting and relogging!")
        }
    }

    fun save(buffer: ByteBuffer){
        buffer.put(118)
        for(vote in claimedVotes){
            buffer.put(1)
            buffer.putInt(vote)
        }
        buffer.put(0)
    }

    fun parse(buffer: ByteBuffer){
        while(buffer.get() != 0.toByte()){
            val vote = Vote(buffer.int)
            claimedVotes.add(vote.id)
            SystemLogger.log(vote.id.toString())
        }
    }
}
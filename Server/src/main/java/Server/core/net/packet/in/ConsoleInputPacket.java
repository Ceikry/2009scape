package core.net.packet.in;

import core.game.node.entity.player.Player;
import core.net.packet.IncomingPacket;
import core.net.packet.IoBuffer;

public class ConsoleInputPacket implements IncomingPacket {
    @Override
    public void decode(Player player, int opcode, IoBuffer buffer) {
        String message = buffer.getString();
        player.sendMessage("You sent " + message);
    }
}

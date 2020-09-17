package core.net.packet.in;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import core.game.node.entity.player.Player;
import core.net.packet.IncomingPacket;
import core.net.packet.IoBuffer;
import core.net.packet.PacketRepository;
import core.net.packet.context.ConsoleAutocompleteContext;
import core.net.packet.context.ConsoleMessageContext;
import core.net.packet.out.ConsoleAutocomplete;
import core.net.packet.out.ConsoleMessage;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ConsoleAutocompleteRequestPacket implements IncomingPacket {
    @Override
    public void decode(Player player, int opcode, IoBuffer buffer) {
        String message = buffer.getString();
        player.sendMessage("You tried autocompleting " + message);
        PacketRepository.send(ConsoleMessage.class, new ConsoleMessageContext(player, "You tried autocompleting '" + message + "'"));

        List<String> completions = ImmutableList.of("This is the first entry", "Some other entry", message + " something", message + " else");
        PacketRepository.send(ConsoleAutocomplete.class, new ConsoleAutocompleteContext(player, message, completions, ThreadLocalRandom.current().nextInt(completions.size(), completions.size() + 100)));
    }
}

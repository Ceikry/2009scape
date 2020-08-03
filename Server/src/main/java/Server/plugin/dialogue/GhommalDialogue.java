package plugin.dialogue;

import core.game.content.global.shop.ShopViewer;
import core.game.system.config.ShopParser;
import plugin.skill.Skills;
import core.game.node.entity.npc.NPC;
import core.plugin.InitializablePlugin;
import core.game.node.entity.player.Player;

/**
 * Represents the ghommal dialogue plugin.
 * @author 'Vexia
 * @version 1.0
 */
@InitializablePlugin
public final class GhommalDialogue extends DialoguePlugin {

	/**
	 * Constructs a new {@code GhommalDialogue} {@code Object}.
	 */
	public GhommalDialogue() {
		/**
		 * empty.
		 */
	}

	/**
	 * Constructs a new {@code GhommalDialogue} {@code Object}.
	 * @param player the player.
	 */
	public GhommalDialogue(Player player) {
		super(player);
	}

	@Override
	public DialoguePlugin newInstance(Player player) {
		return new GhommalDialogue(player);
	}

	@Override
	public boolean open(Object... args) {
		npc = (NPC) args[0];
		npc.openShop(player);
		return true;
	}

	@Override
	public boolean handle(int interfaceId, int buttonId) {
		return true;
	}

	@Override
	public int[] getIds() {
		return new int[] { 4285 };
	}
}

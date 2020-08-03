package plugin.interaction.object.wildyditch;

import core.cache.def.impl.ObjectDefinition;
import core.game.component.Component;
import core.game.interaction.MovementPulse;
import core.game.interaction.OptionHandler;
import core.game.node.Node;
import core.game.node.entity.player.Player;
import core.game.node.object.GameObject;
import core.plugin.Plugin;
import core.plugin.InitializablePlugin;
import core.plugin.PluginManager;

/**
 * Represents the plugin to handle the crossing.
 * @author 'Vexia
 * @version 1.0
 */
@InitializablePlugin
public final class WildernessDitchPlugin extends OptionHandler {

	@Override
	public Plugin<Object> newInstance(Object arg) throws Throwable {
		ObjectDefinition.forId(23271).getConfigurations().put("option:cross", this);
		PluginManager.definePlugin(new WildernessInterfacePlugin());
		return this;
	}

	@Override
	public boolean handle(final Player player, final Node node, String option) {
		if (player.getLocation().getDistance(node.getLocation()) < 3) {
			handleDitch(player, node);
		} else {
			player.getPulseManager().run(new MovementPulse(player, node) {
				@Override
				public boolean pulse() {
					handleDitch(player, node);
					return true;
				}
			}, "movement");
		}
		return true;
	}

	/**
	 * Handles the wilderness ditch jumping.
	 * @param player The player.
	 * @param node The ditch object.
	 */
	public void handleDitch(final Player player, Node node) {
		player.faceLocation(node.getLocation());
		GameObject ditch = (GameObject) node;
		player.setAttribute("wildy_ditch", ditch);
		if (ditch.getRotation() % 2 == 0) {
			if (player.getLocation().getY() <= node.getLocation().getY()) {
				if(!player.isArtificial())
					player.getInterfaceManager().open(new Component(382));
				else
					WildernessInterfacePlugin.handleDitch(player);
				return;
			}
		} else {
			if (player.getLocation().getX() > node.getLocation().getX()) {
				player.getInterfaceManager().open(new Component(382));
				return;
			}
		}
		WildernessInterfacePlugin.handleDitch(player);
	}

	@Override
	public boolean isWalk() {
		return true;
	}
}

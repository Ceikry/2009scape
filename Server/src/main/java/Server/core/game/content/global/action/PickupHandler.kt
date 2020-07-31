package core.game.content.global.action;

import core.game.system.config.GroundSpawnLoader;
import plugin.ai.AIPlayer;
import plugin.ai.AIRepository;
import plugin.dialogue.FacialExpression;
import core.game.content.global.GodType;
import plugin.skill.runecrafting.RunePouch;
import core.game.node.entity.player.Player;
import core.game.node.entity.player.link.audio.Audio;
import core.game.node.entity.player.link.diary.DiaryType;
import core.game.node.item.GroundItem;
import core.game.node.item.GroundItemManager;
import core.game.node.item.Item;
import core.game.system.SystemLogger;
import core.game.world.GameWorld;
import core.game.world.map.RegionManager;
import core.game.world.update.flag.context.Animation;

/**
 * A class used to handle the picking up of ground items.
 * @author 'Vexia
 */
public final class PickupHandler {

	/**
	 * Method used to take a ground item.
	 * @param player the player.
	 * @param item the item.
	 * @return {@code True} if taken.
	 */
	public static boolean take(final Player player, final GroundItem item) {
		if (item.getLocation() == null) {
			player.getPacketDispatch().sendMessage("Invalid ground item!");
			return true;
		}
		if (!GroundItemManager.getItems().contains(item)) {
			player.getPacketDispatch().sendMessage("Too late!");
			return true;
		}
		if (player.getAttribute("droppedItem:" + item.getId(), 0) > GameWorld.getTicks()) {//Splinter
			SystemLogger.log(player + ", tried to do the drop & quick pick-up Ground Item dupe.");
			return true;
		}
		if (!(item instanceof GroundSpawnLoader.GroundSpawn) && item.isRemainPrivate() && !item.droppedBy(player)) {
			player.sendMessage("You can't take that item!");
			return true;
		}
		Item add = new Item(item.getId(), item.getAmount(), item.getCharge());
		if (!player.getInventory().hasSpaceFor(add)) {
			player.getPacketDispatch().sendMessage("You don't have enough inventory space to hold that item.");
			return true;
		}
		if (!canTake(player, item, 0)) {
			return true;
		}
		if (item.isActive() && player.getInventory().add(add)) {
			if (!RegionManager.isTeleportPermitted(item.getLocation())) {
				player.animate(Animation.create(535));
			}
			if (item instanceof GroundSpawnLoader.GroundSpawn && item.getId() == 401 && player.getZoneMonitor().isInZone("karamja") && !player.getAchievementDiaryManager().hasCompletedTask(DiaryType.KARAMJA, 0, 7)) {
				int seaweed = player.getAttribute("seaweed", 0);
				seaweed++;
				player.setAttribute("seaweed", seaweed);
				player.getAchievementDiaryManager().updateTask(player, DiaryType.KARAMJA, 0, 7, seaweed == 5);
			}
			GroundItemManager.destroy(item);
			if(item.getDropper().isArtificial()) {
				AIRepository.getItems(item.getDropper()).remove(item);
			}
			player.getAudioManager().send(new Audio(2582, 10, 1));
		}
		return true;
	}

	/**
	 * Checks if the player can take an item.
	 * @param player the player.
	 * @param item the item.
	 * @param type the type (1= ground, 2=telegrab)
	 * @return {@code True} if so.
	 */
	public static boolean canTake(Player player, GroundItem item, int type) {
		if (item.getDropper() != null && !item.droppedBy(player) && player.getIronmanManager().checkRestriction()) {
			return false;
		}
		if (item.getId() == 8858 || item.getId() == 8859) {
			player.getDialogueInterpreter().sendDialogues(4300, FacialExpression.FURIOUS, "Hey! You can't take that, it's guild property. Take one", "from the pile.");
			return false;
		}
		if (GodType.forCape(item) != null) {
			if (GodType.hasAny(player)) {
				player.sendMessages("You may only possess one sacred cape at a time.", "The conflicting powers of the capes drive them apart.");
				return false;
			}
		}
		if (RunePouch.forItem(item) != null) {
			if (player.hasItem(item)) {
				player.sendMessage("A mystical force prevents you from picking up the pouch.");
				return false;
			}
		}
		if (item.hasItemPlugin()) {
			return item.getPlugin().canPickUp(player, item, type);
		}
		return true;
	}

}

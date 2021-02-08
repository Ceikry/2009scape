package core.game.content.consumable.effects;

import core.game.node.entity.player.Player;
import core.game.node.entity.state.EntityState;
import core.game.content.consumable.ConsumableEffect;

public class RemoveStateEffect extends ConsumableEffect {
    int state;
    public RemoveStateEffect(int state){
        this.state = state;
    }
    @Override
    public void activate(Player p) {
        p.getStateManager().remove(EntityState.values()[state]);
    }
}

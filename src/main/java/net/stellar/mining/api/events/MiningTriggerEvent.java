package net.stellar.mining.api.events;

import net.stellar.mining.storage.StellarOre;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MiningTriggerEvent extends Event implements Cancellable {

    private HandlerList handlers = new HandlerList();

    private Player player;
    private Block block;
    private StellarOre ore;

    private boolean cancelled;

    public MiningTriggerEvent(Player player, Block block, StellarOre ore) {
        this.player = player;
        this.block = block;
        this.ore = ore;
        cancelled = false;
    }

    public Player getPlayer() {
        return player;
    }

    public Block getBlock() {
        return block;
    }

    public StellarOre getOre() {
        return ore;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }
}

package me.ninjak.mysticrunes.Events;

import me.ninjak.mysticrunes.GUI.RunesInv;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 30.03.2022
 */
public class PlayerInteractListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        var player = event.getPlayer();

        if (player.isSneaking()) {
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (event.getClickedBlock().getType() == Material.ANVIL) {
                    event.setCancelled(true);
                    RunesInv.openAnvilInv(player);
                }
            }
        }

    }
}

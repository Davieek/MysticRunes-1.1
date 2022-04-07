package me.ninjak.mysticrunes.Events;

import jdk.jshell.execution.Util;
import me.ninjak.mysticrunes.Items.RunesAnvil.RunesAnvil;
import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;


/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 06.04.2022
 */
public class BlockPlaceListener implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        var player = event.getPlayer();
        if (event.getBlockPlaced().getType() != Material.END_PORTAL_FRAME) {
            return;
        }
        if (event.getBlockPlaced().getType() == Material.END_PORTAL_FRAME) {
            if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.fixColor("&d• Runiczny Piedestał"))) {
                var block = event.getBlock();

                var item = player.getWorld().dropItem(new Location(block.getWorld(), block.getX()+0.5, block.getY()+0.85, block.getZ()+0.5),RunesAnvil.AnvilItem);
                item.setCanMobPickup(false);
                item.setVelocity(item.getVelocity().zero());
                item.setGravity(true);
                item.setOwner(Bukkit.getPlayer("_Ninjak").getUniqueId());
                item.setWillAge(false);
                item.setFireTicks(0);
                item.setCanPlayerPickup(false);
                item.setCustomNameVisible(true);
                item.setCustomName(Utils.fixColor("&c• Runiczny Piedestał"));
            }
        }
    }
    @EventHandler
    public void onBlockPlac2e(BlockBreakEvent event) {
        var player = event.getPlayer();
        if (event.getBlock().getType() != Material.END_PORTAL_FRAME) {
            return;
        }
        if (event.getBlock().getType() == Material.END_PORTAL_FRAME) {
            var block = event.getBlock();
            var test2 = block.getLocation().getNearbyEntities(0.5, 1,0.5);
            for (Entity entity : test2) {
                if (entity.getType() == EntityType.PLAYER) {
                    return;
                }
                if (entity.getCustomName() == null) {
                    return;
                }
                if (entity.getCustomName().equalsIgnoreCase(Utils.fixColor("&c• Runiczny Piedestał"))) {
                    entity.remove();
                }
            }
        }
    }
}

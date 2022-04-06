package me.ninjak.mysticrunes.Events;

import me.ninjak.mysticrunes.RunesAnvil.RunesAnvil;
import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
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
//                ArmorStand stand = player.getLocation().getWorld().spawn(new Location(block.getWorld(), block.getX()+0.5, block.getY()-0.2, block.getZ()+0.7), ArmorStand.class);
//                ItemStack head = new ItemStack(Material.MAGMA_CREAM, 1);
//                stand.setHelmet(head);
//                stand.setSmall(true);
//                stand.setGravity(false);
//                stand.setInvisible(true);
//                stand.setMarker(true);

                var test = player.getWorld().dropItem(new Location(block.getWorld(), block.getX()+0.5, block.getY()+0.85, block.getZ()+0.5),RunesAnvil.AnvilItem);
                test.setCanMobPickup(false);
                test.setVelocity(test.getVelocity().zero());
                test.setGravity(true);
                test.setOwner(Bukkit.getPlayer("_Ninjak").getUniqueId());
                test.setWillAge(false);
                test.setFireTicks(0);
                test.setCanPlayerPickup(false);
                test.setCustomNameVisible(true);
                test.setCustomName(Utils.fixColor("&d• Runiczny Piedestał"));
//                ArmorStand stand2 = player.getLocation().getWorld().spawn(new Location(block.getWorld(), block.getX()+0.5, block.getY()-0.6, block.getZ()+0.5), ArmorStand.class);
//                stand2.setInvisible(true);
//                ItemStack head2 = new ItemStack(Material.GLASS, 1);
//                stand2.setHelmet(head2);
//                stand2.setGravity(false);
//                stand2.setMarker(true);
//
//                ArmorStand stand3 = player.getLocation().getWorld().spawn(new Location(block.getWorld(), block.getX()+0.5, block.getY()+0.7, block.getZ()+0.5), ArmorStand.class);
//                stand3.setGravity(false);
//                stand3.setInvisible(true);
//                stand3.setMarker(true);
//                stand3.setCustomName(Utils.fixColor("&c◆"));
//                stand3.setCustomNameVisible(true);
//                player.sendMessage("test");
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
            var test = block.getLocation().getNearbyEntitiesByType(ArmorStand.class, 0.9);
            var test2 = block.getLocation().getNearbyEntities(0.5, 1,0.5);
//            for (Entity entity : test) {
//                entity.remove();
//            }
            for (Entity entity : test2) {
                if (entity.getType() == EntityType.PLAYER) {
                    return;
                }
                entity.remove();
            }
        }
    }
}

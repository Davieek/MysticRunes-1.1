package me.ninjak.mysticrunes.Events;

import me.ninjak.mysticrunes.GUI.ItemsOnGui.ToolsList;
import me.ninjak.mysticrunes.GUI.RunesInv;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 30.03.2022
 */
public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryCLick(InventoryClickEvent event) {
        var player = (Player) event.getWhoClicked();
        var guiName = RunesInv.getGuiName();
        if (!event.getView().getTitle().equalsIgnoreCase(guiName)) {
            return;
        }
        if (event.getView().getTitle().equalsIgnoreCase(guiName)) {

            event.setCancelled(true);

            if (!player.hasPermission("mysticrunes.commands.runesinventory")) {
                player.closeInventory();
                return;
            }

            if (event.getRawSlot() == 11) {
                RunesInv.openPickaxeRunes(player);
            }
        }
    }

    @EventHandler
    public void onInventoryCLick$2(InventoryClickEvent event) {
        var player = (Player) event.getWhoClicked();
        var guiName = RunesInv.getPickaxeGuiName();
        if (!event.getView().getTitle().equalsIgnoreCase(guiName)) {
            return;
        }
        if (event.getView().getTitle().equalsIgnoreCase(guiName)) {

            event.setCancelled(true);

            if (!player.hasPermission("mysticrunes.commands.runesinventory")) {
                player.closeInventory();
                return;
            }

        }
    }

}

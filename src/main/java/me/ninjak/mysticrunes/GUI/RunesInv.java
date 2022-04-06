package me.ninjak.mysticrunes.GUI;

import me.ninjak.mysticrunes.GUI.ItemsOnGui.GlassList;
import me.ninjak.mysticrunes.Runes.Pickaxe.Telekinesis;
import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;

import static me.ninjak.mysticrunes.GUI.ItemsOnGui.GlassList.*;
import static me.ninjak.mysticrunes.GUI.ItemsOnGui.ToolsList.*;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 29.03.2022
 */
public class RunesInv {

    private static String GuiName = Utils.fixColor("&8[&d&lM&8] &5Runes Inventory");
    private static String PickaxeGuiName = Utils.fixColor("&8[&d&lM&8] &5Pickaxe Runes");

    public static void openRunesInv(Player player) {
        Inventory inv = Bukkit.createInventory(player, 27, GuiName);

        inv.setItem(0, white);
        inv.setItem(1, white);
        inv.setItem(2, white);
        inv.setItem(3, white);
        inv.setItem(4, white);
        inv.setItem(5, white);
        inv.setItem(6, white);
        inv.setItem(7, white);
        inv.setItem(8, white);

        inv.setItem(9, orange);
        inv.setItem(10, yellow);
        inv.setItem(16, yellow);
        inv.setItem(17, orange);

        inv.setItem(18, white);
        inv.setItem(19, white);
        inv.setItem(20, white);
        inv.setItem(21, white);
        inv.setItem(22, white);
        inv.setItem(23, white);
        inv.setItem(24, white);
        inv.setItem(25, white);
        inv.setItem(26, white);

        inv.setItem(11, pickaxe);
        inv.setItem(12, axe);
        inv.setItem(13, sword);
        inv.setItem(14, armor);
        inv.setItem(15, ogreHeart);

        player.openInventory(inv);

    }

    public static void openAnvilInv(Player player) {
        Inventory inv2 = Bukkit.createInventory(player, InventoryType.ANVIL, Utils.fixColor("&8[&d&lM&8] &5Runes Anvil"));

        player.openInventory(inv2);
    }

    public static void openPickaxeRunes(Player player) {
        Inventory inv = Bukkit.createInventory(player, 45, PickaxeGuiName);

        inv.setItem(0, white);
        inv.setItem(1, white);
        inv.setItem(2, white);
        inv.setItem(3, white);
        inv.setItem(4, white);
        inv.setItem(5, white);
        inv.setItem(6, white);
        inv.setItem(7, white);
        inv.setItem(8, white);
        inv.setItem(9, white);
        inv.setItem(10, white);
        inv.setItem(11, white);
        inv.setItem(12, white);
        inv.setItem(17, white);
        inv.setItem(18, white);
        inv.setItem(19, white);
        inv.setItem(21, white);
        inv.setItem(26, white);
        inv.setItem(27, white);
        inv.setItem(28, white);
        inv.setItem(29, white);
        inv.setItem(30, white);
        inv.setItem(35, white);
        inv.setItem(36, white);
        inv.setItem(37, white);
        inv.setItem(38, white);
        inv.setItem(39, white);
        inv.setItem(40, white);
        inv.setItem(41, white);
        inv.setItem(42, white);
        inv.setItem(43, white);
        inv.setItem(44, white);

        inv.setItem(20, pickaxe$2);
        inv.setItem(22, Telekinesis.telekinesis);

        player.openInventory(inv);
    }

    public static String getGuiName() {
        return GuiName;
    }
    public static String getPickaxeGuiName() {
        return PickaxeGuiName;
    }

}

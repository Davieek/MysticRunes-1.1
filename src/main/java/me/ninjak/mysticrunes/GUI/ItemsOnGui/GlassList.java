package me.ninjak.mysticrunes.GUI.ItemsOnGui;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 30.03.2022
 */
public class GlassList {
    public static ItemStack white;
    public static ItemStack yellow;
    public static ItemStack orange;

    public static void init() {
        loadWhiteGlass();
        loadYellowGlass();
        loadOrangeGlass();
    }

    private static void loadWhiteGlass() {
        var item = new ItemStack(Material.WHITE_STAINED_GLASS_PANE, 1);
        var meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        white = item;
    }
    private static void loadYellowGlass() {
        var item = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE, 1);
        var meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        yellow = item;
    }
    private static void loadOrangeGlass() {
        var item = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE, 1);
        var meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        orange = item;
    }
}

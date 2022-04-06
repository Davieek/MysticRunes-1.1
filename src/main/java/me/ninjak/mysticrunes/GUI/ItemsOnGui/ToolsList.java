package me.ninjak.mysticrunes.GUI.ItemsOnGui;

import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

import static me.ninjak.mysticrunes.FilesManager.LanguageManager.lan;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 29.03.2022
 */
public class ToolsList {
    public static ItemStack pickaxe;
    public static ItemStack pickaxe$2;
    public static ItemStack axe;
    public static ItemStack sword;
    public static ItemStack armor;
    public static ItemStack coming;
    public static ItemStack ogreHeart;

    public static void init() {
        loadPickaxe();
        loadAxe();
        loadSword();
        loadArmor();
        loadComing();
        ogreHeart();
        loadPickaxe$2();
    }

    private static void loadPickaxe() {
        var item = new ItemStack(Material.NETHERITE_PICKAXE, 1);
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor(lan.getString("GUI.pickaxeNameRunesGUI")));
        item.setItemMeta(meta);
        pickaxe = item;
    }

    private static void loadPickaxe$2() {
        var item = new ItemStack(Material.NETHERITE_PICKAXE, 1);
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor("&aWszystkie runy na kilof."));
        item.setItemMeta(meta);
        pickaxe$2 = item;
    }

    private static void loadAxe() {
        var item = new ItemStack(Material.NETHERITE_AXE, 1);
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor(lan.getString("GUI.axeNameRunesGUI")));
        item.setItemMeta(meta);
        axe = item;
    }
    private static void loadSword() {
        var item = new ItemStack(Material.NETHERITE_SWORD, 1);
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor(lan.getString("GUI.swordNameRunesGUI")));
        item.setItemMeta(meta);
        sword = item;
    }
    private static void loadArmor() {
        var item = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor(lan.getString("GUI.armorNameRunesGUI")));
        item.setItemMeta(meta);
        armor = item;
    }
    private static void loadComing() {
        var item = new ItemStack(Material.BARRIER, 1);
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor("&cCOMING SOON!"));
        item.setItemMeta(meta);
        coming = item;
    }
    private static void ogreHeart() {
        var item = new ItemStack(Material.SCUTE);
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor(lan.getString("GUI.mobsDropNameRunesGUI")));
        meta.setCustomModelData(321321);
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.fixColor(""));
        meta.setLore(lore);
        item.setItemMeta(meta);
        ogreHeart = item;

    }
}

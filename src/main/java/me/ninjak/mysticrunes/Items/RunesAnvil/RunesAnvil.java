package me.ninjak.mysticrunes.Items.RunesAnvil;

import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 05.04.2022
 */
public class RunesAnvil {
    public static ItemStack AnvilItem;

    public static void loadAnvilItem() {
        var item = new ItemStack(Material.END_PORTAL_FRAME);
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor("&c• Runiczny Piedestał"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.fixColor("&7Daje możliwość łączenia run z itemami."));
        lore.add(Utils.fixColor(""));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.setCustomModelData(123213);
        item.setItemMeta(meta);
        AnvilItem = item;
    }
}

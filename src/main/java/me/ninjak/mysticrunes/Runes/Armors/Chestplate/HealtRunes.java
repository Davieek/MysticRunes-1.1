package me.ninjak.mysticrunes.Runes.Armors.Chestplate;

import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 30.03.2022
 */
public class HealtRunes {
    public HealtRunes() {

    }

    public static ItemStack healtRunes;

    public static void loadHealtRunes() {
        var item = new ItemStack(Material.AMETHYST_SHARD, 1);
        var meta = item.getItemMeta();
        meta.setCustomModelData(132132123);
        meta.setDisplayName("Runa Życia");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.fixColor(""));
        meta.setLore(lore);
        item.setItemMeta(meta);
        healtRunes = item;

    }
}

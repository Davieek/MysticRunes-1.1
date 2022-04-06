package me.ninjak.mysticrunes.MobsItem;

import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 30.03.2022
 */
public class OgreHeart {
    public static ItemStack ogreHeart;

    public static void loadOgreHeart() {
        var item = new ItemStack(Material.SCUTE);
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor("&ASerce ogra"));
        meta.setCustomModelData(321321);
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.fixColor(""));
        meta.setLore(lore);
        item.setItemMeta(meta);
        ogreHeart = item;

    }
}

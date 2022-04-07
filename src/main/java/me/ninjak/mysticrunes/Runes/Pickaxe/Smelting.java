package me.ninjak.mysticrunes.Runes.Pickaxe;

import me.ninjak.mysticrunes.API.MysticRunesAPI;
import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 07.04.2022
 */
public class Smelting {

    private static ItemStack smelting;

    public static void loadSmelting() {
        var item = MysticRunesAPI.getHead("");
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor(""));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.fixColor("&8przedmiot: kilof"));
        lore.add(Utils.fixColor(" "));
        lore.add(Utils.fixColor("&7Wszystkie rudy, które wykopiesz "));
        lore.add(Utils.fixColor("&7zostają automatycznie przepalone."));
        lore.add(Utils.fixColor(" "));
        lore.add(Utils.fixColor("&7Runę wytapiania można połączyć tylko z kilofem."));
        lore.add(Utils.fixColor(" "));
        lore.add(Utils.fixColor("&9&lRARE"));
        meta.setLore(lore);
        item.setItemMeta(meta);
    }
}

package me.ninjak.mysticrunes.Runes.Pickaxe;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import me.ninjak.mysticrunes.API.MysticRunesAPI;
import me.ninjak.mysticrunes.MysticRunes;
import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.UUID;

import static co.aikar.timings.TimingsManager.url;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 03.04.2022
 */
public class Telekinesis {

    public static ItemStack telekinesis;

    public static void onLoadTelekinesis() {
        var item = MysticRunesAPI.getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmMxYzE3OWFkNTE5NTVmMTUyMmM0OGVhOTkzMWYwOWMxNjI3NDFiNDVlMjJlOWQzZmViNjgyYzdlNWVkODI3NCJ9fX0=");
        var meta = item.getItemMeta();
        meta.setDisplayName(Utils.fixColor("&a◆ Telekineza"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(Utils.fixColor("&8przedmiot: kilof"));
        lore.add(Utils.fixColor(" "));
        lore.add(Utils.fixColor("&7Wszystkie rudy, które wykopiesz wpadną "));
        lore.add(Utils.fixColor("&7do twojego ekwipunku."));
        lore.add(Utils.fixColor(" "));
        lore.add(Utils.fixColor("&7Runę telekinezy można połączyć tylko z kilofem."));
        lore.add(Utils.fixColor(" "));
        lore.add(Utils.fixColor("&9&lRARE"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        telekinesis = item;
    }


}

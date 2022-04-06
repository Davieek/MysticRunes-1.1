package me.ninjak.mysticrunes.API;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import java.util.UUID;


/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 03.04.2022
 */
public class MysticRunesAPI {
    public static ItemStack getHead(String value) {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD);

        UUID hashAsId = new UUID(value.hashCode(), value.hashCode());
        return Bukkit.getUnsafe().modifyItemStack(skull,
                "{SkullOwner:{Id:\"" + hashAsId + "\",Properties:{textures:[{Value:\"" + value + "\"}]}}}"
        );
    }
}

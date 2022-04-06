package me.ninjak.mysticrunes.Utils;

import org.bukkit.ChatColor;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 29.03.2022
 */
public class Utils {
    public Utils() {}

    public static String fixColor(String message) {
        return
        ChatColor.translateAlternateColorCodes('&', message);
    }
}

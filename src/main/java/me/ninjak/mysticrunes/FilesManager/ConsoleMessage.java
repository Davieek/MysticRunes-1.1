package me.ninjak.mysticrunes.FilesManager;

import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Bukkit;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 29.03.2022
 */
public class ConsoleMessage {

    public static void enableMessage() {
        var console = Bukkit.getConsoleSender();



        console.sendMessage("");
        console.sendMessage("");
        console.sendMessage(Utils.fixColor("&5     #######               #######"));
        console.sendMessage(Utils.fixColor("&5     ########             ########"));
        console.sendMessage(Utils.fixColor("&5     #########           #########"));
        console.sendMessage(Utils.fixColor("&5     ##########         ##########"));
        console.sendMessage(Utils.fixColor("&5     ###########       ###########"));
        console.sendMessage(Utils.fixColor("&5     ############     ############"));
        console.sendMessage(Utils.fixColor("&5     ###### ######   ###### ######        &fMystic&r &fRunes&r"));
        console.sendMessage(Utils.fixColor("&5     ######  ###### ######  ######"));
        console.sendMessage(Utils.fixColor("&5     ######   ###########   ######           &fWELCOME!"));
        console.sendMessage(Utils.fixColor("&5     ######     #######     ######     &fPlugin Version: 1.1"));
        console.sendMessage(Utils.fixColor("&5     ######                 ######       &fAuthor: _Ninjak"));
        console.sendMessage(Utils.fixColor("&5     ######                 ######"));
        console.sendMessage(Utils.fixColor("&5     ######                 ######"));
        console.sendMessage(Utils.fixColor("&5     ######                 ######"));
        console.sendMessage(Utils.fixColor("&5     ######                 ######"));
        console.sendMessage("");
        console.sendMessage("");

    }
    public static void disableMessage() {
        var console = Bukkit.getConsoleSender();

        console.sendMessage("");
        console.sendMessage("");
        console.sendMessage(Utils.fixColor("&c     #######               #######"));
        console.sendMessage(Utils.fixColor("&c     ########             ########"));
        console.sendMessage(Utils.fixColor("&c     #########           #########"));
        console.sendMessage(Utils.fixColor("&c     ##########         ##########"));
        console.sendMessage(Utils.fixColor("&c     ###########       ###########"));
        console.sendMessage(Utils.fixColor("&c     ############     ############"));
        console.sendMessage(Utils.fixColor("&c     ###### ######   ###### ######        &fMystic Runes"));
        console.sendMessage(Utils.fixColor("&c     ######  ###### ######  ######"));
        console.sendMessage(Utils.fixColor("&c     ######   ###########   ######           &fGOODBYE!"));
        console.sendMessage(Utils.fixColor("&c     ######     #######     ######     &fPlugin Version: 1.1"));
        console.sendMessage(Utils.fixColor("&c     ######                 ######       &fAuthor: _Ninjak"));
        console.sendMessage(Utils.fixColor("&c     ######                 ######"));
        console.sendMessage(Utils.fixColor("&c     ######                 ######"));
        console.sendMessage(Utils.fixColor("&c     ######                 ######"));
        console.sendMessage(Utils.fixColor("&c     ######                 ######"));
        console.sendMessage("");
        console.sendMessage("");
    }
}

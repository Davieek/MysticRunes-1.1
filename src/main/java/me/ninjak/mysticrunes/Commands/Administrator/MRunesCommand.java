package me.ninjak.mysticrunes.Commands.Administrator;

import me.ninjak.mysticrunes.FilesManager.ConfigManager;
import me.ninjak.mysticrunes.GUI.RunesInv;
import me.ninjak.mysticrunes.MysticRunes;
import me.ninjak.mysticrunes.Items.RunesAnvil.RunesAnvil;
import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static me.ninjak.mysticrunes.FilesManager.LanguageManager.lan;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 29.03.2022
 */
public class MRunesCommand implements CommandExecutor {
    private MysticRunes main = MysticRunes.getPlugin(MysticRunes.class);




    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            var console = Bukkit.getConsoleSender();
            console.sendMessage(Utils.fixColor("&8(&dM&8) &cconsole not execute this command"));
            return true;
        }

        if (command.getName().equalsIgnoreCase("mrunes")) {
            var player = (Player) sender;
            if (args[0].equalsIgnoreCase("inv")) {
                if (!player.hasPermission("mysticrunes.commands.runesinventory")) {
                    player.sendMessage(Utils.fixColor(ConfigManager.config.getString("config.Prefix")+ " " + lan.getString("playerNotPermissions")));
                    return true;
                }
                if (player.hasPermission("mysticrunes.commands.runesinventory")) {
                    RunesInv.openRunesInv(player);
                    player.getInventory().addItem(RunesAnvil.AnvilItem);
                }
            }
            else {
                player.sendMessage(Utils.fixColor(ConfigManager.config.getString("config.Prefix")+ " " + lan.getString("playerNotPermissions")));
            }
        }
        return false;
    }
}

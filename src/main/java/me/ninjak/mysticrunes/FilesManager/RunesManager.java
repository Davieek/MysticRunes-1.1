package me.ninjak.mysticrunes.FilesManager;

import me.ninjak.mysticrunes.MysticRunes;
import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 29.03.2022
 */
public class RunesManager {
    private static MysticRunes main = MysticRunes.getPlugin(MysticRunes.class);

    public static FileConfiguration runes;
    public static File runesFile;


    public static void setup() {
        var console = Bukkit.getConsoleSender();

        if (!ConfigManager.configFile.exists()) {
            ConfigManager.setup();
            ConfigManager.saveConfig();
        }

        runesFile = new File(main.getDataFolder() + "/runes.yml");

        if (!runesFile.exists()) {
            console.sendMessage(Utils.fixColor("&8(&dM&8) &ecreate runes file"));
            main.saveResource("runes.yml", false);
            console.sendMessage(Utils.fixColor("&8(&dM&8) &aSuccess runes config file"));
        }
        runes = YamlConfiguration.loadConfiguration(runesFile);
        console.sendMessage(" ");

    }

    public static void saveRunes() {
        try {
            runes.save(runesFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reloadRunes() {
        runes = YamlConfiguration.loadConfiguration(runesFile);
    }
}

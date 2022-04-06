package me.ninjak.mysticrunes.FilesManager;

import me.ninjak.mysticrunes.MysticRunes;
import me.ninjak.mysticrunes.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 29.03.2022
 */
public class ConfigManager {
    private static MysticRunes main = MysticRunes.getPlugin(MysticRunes.class);

    private static Logger logger = Logger.getLogger("Minecraft");

    public static FileConfiguration config;
    public static File configFile;


    public static void setup() {

        var console = Bukkit.getConsoleSender();

        // create default folder
        if (!main.getDataFolder().exists()) {
            console.sendMessage(Utils.fixColor("&8(&dM&8) &ecreate plugin folder"));
            main.getDataFolder().mkdir();
            console.sendMessage(Utils.fixColor("&8(&dM&8) &aSuccess create plugin folder"));
        }
        configFile = new File(main.getDataFolder() + "/config.yml");


        // Create config file
        if (!configFile.exists()) {
            console.sendMessage(Utils.fixColor("&8(&dM&8) &ecreate config file"));
            main.saveResource("config.yml", false);
            console.sendMessage(Utils.fixColor("&8(&dM&8) &aSuccess create config file"));
        }
        config = YamlConfiguration.loadConfiguration(configFile);
        console.sendMessage(" ");


    }
    public static void saveConfig() {
        try {
            config.save(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reloadConfig() {
        config = YamlConfiguration.loadConfiguration(configFile);
    }
}

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
 * @date 07.04.2022
 */
public class RunicPedestalManager {
    private static MysticRunes main = MysticRunes.getPlugin(MysticRunes.class);

    private static Logger logger = Logger.getLogger("Minecraft");

    public static FileConfiguration runic;
    public static File runicFile;


    public static void setup() {

        var console = Bukkit.getConsoleSender();

        // create default folder
        if (!main.getDataFolder().exists()) {
            console.sendMessage(Utils.fixColor("&8(&dM&8) &ecreate plugin folder"));
            main.getDataFolder().mkdir();
            console.sendMessage(Utils.fixColor("&8(&dM&8) &aSuccess create plugin folder"));
        }
        runicFile = new File(main.getDataFolder() + "/players/runicpedestal.yml");


        // Create config file
        if (!runicFile.exists()) {
            console.sendMessage(Utils.fixColor("&8(&dM&8) &ecreate runic file"));
            main.saveResource("/players/runicpedestal.yml", false);
            console.sendMessage(Utils.fixColor("&8(&dM&8) &aSuccess create runic file"));
        }
        runic = YamlConfiguration.loadConfiguration(runicFile);
        console.sendMessage(" ");


    }
    public static void saveConfig() {
        try {
            runic.save(runicFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reloadConfig() {
        runic = YamlConfiguration.loadConfiguration(runicFile);
    }
}

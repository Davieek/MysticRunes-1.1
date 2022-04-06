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
public class LanguageManager {

    private static MysticRunes main = MysticRunes.getPlugin(MysticRunes.class);

    public static FileConfiguration languagePL;
    public static FileConfiguration languageEN;
    public static File languageFilePL;
    public static File languageFileEN;

    private static Object language2 = ConfigManager.config.get("config.Language");


    public static File lanFile;
    public static FileConfiguration lan;


    public static void setup() {
        var console = Bukkit.getConsoleSender();

        languageFilePL = new File(main.getDataFolder() + "/language/PL-pl.yml");

        if (!languageFilePL.exists()) {
            console.sendMessage(Utils.fixColor("&8(&dM&8) &ecreate language (PL-pl) file"));
            main.saveResource("language/PL-pl.yml", false);
            console.sendMessage(Utils.fixColor("&8(&dM&8) &aSuccess language (PL-pl) config file"));
        }
        languagePL = YamlConfiguration.loadConfiguration(languageFilePL);
        console.sendMessage(" ");

        languageFileEN = new File(main.getDataFolder() + "/language/EN-en.yml");

        if (!languageFileEN.exists()) {
            console.sendMessage(Utils.fixColor("&8(&dM&8) &ecreate language (EN-en) file"));
            main.saveResource("language/EN-en.yml", false);
            console.sendMessage(Utils.fixColor("&8(&dM&8) &aSuccess language (EN-en) config file"));
        }
        languageEN = YamlConfiguration.loadConfiguration(languageFileEN);

        lanFile = new File(main.getDataFolder() + "/language/"+language2+"-"+language2.toString().toLowerCase()+".yml");


        if (!lanFile.exists()) {
            ConfigManager.config.set("config.Language", "EN");
            ConfigManager.saveConfig();
            YamlConfiguration.loadConfiguration(lanFile);
            console.sendMessage(Utils.fixColor("&8(&dM&8) &clanguage file " + lanFile.getName() + " does not exist"));
        }
        lan = YamlConfiguration.loadConfiguration(lanFile);



        console.sendMessage(" ");



    }

    public static void saveConfig() {
        try {
            languageEN.save(languageFileEN);
            languagePL.save(languageFilePL);
            lan.save(lanFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void reloadConfig() {
        languageEN = YamlConfiguration.loadConfiguration(languageFileEN);
        languagePL = YamlConfiguration.loadConfiguration(languageFilePL);
        lan = YamlConfiguration.loadConfiguration(lanFile);
    }
}

package me.ninjak.mysticrunes;

import me.ninjak.mysticrunes.Commands.Administrator.MRunesCommand;
import me.ninjak.mysticrunes.Events.BlockPlaceListener;
import me.ninjak.mysticrunes.Events.InventoryClickListener;
import me.ninjak.mysticrunes.Events.PlayerInteractListener;
import me.ninjak.mysticrunes.FilesManager.*;
import me.ninjak.mysticrunes.GUI.ItemsOnGui.GlassList;
import me.ninjak.mysticrunes.GUI.ItemsOnGui.ToolsList;
import me.ninjak.mysticrunes.MobsItem.LoadMobsDrop;
import me.ninjak.mysticrunes.Runes.LoadRunes;
import me.ninjak.mysticrunes.Items.RunesAnvil.RunesAnvil;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 29.03.2022
 */
public final class MysticRunes extends JavaPlugin {



    @Override
    public void onEnable() {

        LoadMobsDrop.init();
        LoadRunes.init();
        RunesAnvil.loadAnvilItem();

        setupFiles();
        ToolsList.init();
        GlassList.init();
        getCommand("mrunes").setExecutor(new MRunesCommand());

        registerEvents(new InventoryClickListener(), this);
        registerEvents(new PlayerInteractListener(), this);
        registerEvents(new BlockPlaceListener(), this);
    }

    @Override
    public void onDisable() {
        ConsoleMessage.disableMessage();
    }


    private void registerEvents(Listener listener, Plugin plugin) {
        this.getServer().getPluginManager().registerEvents(listener, plugin);
    }

    private static void setupFiles() {
        ConsoleMessage.enableMessage();
        RunicPedestalManager.setup();
        RunicPedestalManager.saveConfig();
        ConfigManager.setup();
        ConfigManager.saveConfig();
        RunesManager.setup();
        RunesManager.saveRunes();
        LanguageManager.setup();
        LanguageManager.saveConfig();
        LanguageManager.reloadConfig();
    }




}

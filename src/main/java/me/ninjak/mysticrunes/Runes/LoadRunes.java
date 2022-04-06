package me.ninjak.mysticrunes.Runes;

import me.ninjak.mysticrunes.Runes.Armors.Chestplate.HealtRunes;
import me.ninjak.mysticrunes.Runes.Pickaxe.Telekinesis;

/**
 * @author _Ninjak
 * @project MysticRunes
 * @date 03.04.2022
 */
public class LoadRunes {

    public static void init() {
        HealtRunes.loadHealtRunes();
        Telekinesis.onLoadTelekinesis();
    }
}

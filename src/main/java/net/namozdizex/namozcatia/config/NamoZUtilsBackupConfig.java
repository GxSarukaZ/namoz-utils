package net.namozdizex.namozcatia.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import net.minecraft.client.main.Main;

@Config(name = "namozutils")
@Config.Gui.Background("minecraft:textures/block/netherite_block.png")
public class NamoZUtilsBackupConfig implements ConfigData {

    @ConfigEntry.Category("general")
    @ConfigEntry.Gui.TransitiveObject
    public Main main;


    public NamoZUtilsBackupConfig() {
        this.main = new Main();
    }

    public static class Main {
        public boolean glowingSkin = true;
    }
}

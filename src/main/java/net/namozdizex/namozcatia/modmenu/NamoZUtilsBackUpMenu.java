package net.namozdizex.namozcatia.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;
import net.namozdizex.namozcatia.config.NamoZUtilsBackupConfig;

public class NamoZUtilsBackUpMenu implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory()
    {
        return parent -> AutoConfig.getConfigScreen(NamoZUtilsBackupConfig.class, parent).get();
    }
}

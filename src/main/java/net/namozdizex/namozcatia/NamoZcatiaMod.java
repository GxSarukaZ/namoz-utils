package net.namozdizex.namozcatia;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.namozdizex.namozcatia.config.NamoZUtilsBackupConfig;
import net.namozdizex.namozcatia.registry.ModItems;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class NamoZcatiaMod implements ModInitializer {
	public static final String MOD_ID = "namozutils";
	public static NamoZUtilsBackupConfig CONFIG;

	@Override
	public void onInitialize() {
		AutoConfig.register(NamoZUtilsBackupConfig.class, GsonConfigSerializer::new);
		NamoZcatiaMod.CONFIG = AutoConfig.getConfigHolder(NamoZUtilsBackupConfig.class).getConfig();

		ModItems.init();
	}
}

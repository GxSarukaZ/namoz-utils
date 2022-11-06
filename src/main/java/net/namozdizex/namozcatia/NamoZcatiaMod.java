package net.namozdizex.namozcatia;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.namozdizex.namozcatia.config.NamoZUtilsBackupConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NamoZcatiaMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("modid");
	public static final String MOD_ID = "namozutils";
	public static NamoZUtilsBackupConfig CONFIG;

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}{
		AutoConfig.register(NamoZUtilsBackupConfig.class, GsonConfigSerializer::new);
		NamoZcatiaMod.CONFIG = AutoConfig.getConfigHolder(NamoZUtilsBackupConfig.class).getConfig();
	}
}

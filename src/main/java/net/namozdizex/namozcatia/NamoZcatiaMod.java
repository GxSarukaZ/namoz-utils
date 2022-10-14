package net.namozdizex.namozcatia;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NamoZcatiaMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("modid");
	public static final String MOD_ID = "namozutils";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}

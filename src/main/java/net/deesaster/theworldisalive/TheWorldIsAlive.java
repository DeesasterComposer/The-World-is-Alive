package net.deesaster.theworldisalive;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheWorldIsAlive implements ModInitializer {
	public static final String MOD_ID = "theworldisalive";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("The World is Alive!");
	}
}

package net.mango.illusions;

import net.fabricmc.api.ModInitializer;

import net.mango.illusions.instruments.ModInstruments;
import net.mango.illusions.item.ModItemGroups;
import net.mango.illusions.item.ModItems;
import net.mango.illusions.item.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.mango.illusions.item.ModItems.registerModItems;

public class Illusions implements ModInitializer {
	public static final String MOD_ID = "illusions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModSounds.registerSounds();
	}
}
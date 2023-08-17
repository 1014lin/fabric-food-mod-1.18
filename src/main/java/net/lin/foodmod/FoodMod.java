package net.lin.foodmod;

import net.fabricmc.api.ModInitializer;
import net.lin.foodmod.block.ModBlocks;
import net.lin.foodmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodMod implements ModInitializer {
	public static final String MOD_ID ="foodmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}

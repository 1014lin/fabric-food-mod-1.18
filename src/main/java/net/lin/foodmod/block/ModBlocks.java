package net.lin.foodmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lin.foodmod.FoodMod;
import net.lin.foodmod.block.custom.*;
import net.lin.foodmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block GRAPE_VINE = registerBlockWithoutBlockItem("grape_vine",
            new GrapeVineBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()), ModItemGroup.foodmod);
    public static final Block BEEF_NOODLE = registerBlock("beef_noodle",
            new BeefNoodleBlock(FabricBlockSettings.of(Material.AIR).nonOpaque()), ModItemGroup.foodmod_taiwanesefood);
    public static final Block COLD_NOODLE = registerBlock("cold_noodle",
            new ColdNoodleBlock(FabricBlockSettings.of(Material.AIR).nonOpaque()), ModItemGroup.foodmod_taiwanesefood);
    public static final Block STINKY_TOFU = registerBlock("stinky_tofu",
            new StinkyTofuBlock(FabricBlockSettings.of(Material.AIR).nonOpaque()), ModItemGroup.foodmod_taiwanesefood);
    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(FoodMod.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FoodMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(FoodMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks(){
        FoodMod.LOGGER.info("Registering Mod Block For"+FoodMod.MOD_ID);
    }
}

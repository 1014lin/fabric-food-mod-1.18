package net.lin.foodmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lin.foodmod.FoodMod;
import net.lin.foodmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup foodmod = FabricItemGroupBuilder.build(new Identifier(FoodMod.MOD_ID,"mod"),
            () -> new ItemStack(ModItems.GRAPE_PIE));
    public static final ItemGroup foodmod_taiwanesefood = FabricItemGroupBuilder.build(new Identifier(FoodMod.MOD_ID,"taiwanese_food"),
            () -> new ItemStack(ModBlocks.BEEF_NOODLE));
}

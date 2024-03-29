package net.lin.foodmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lin.foodmod.FoodMod;
import net.lin.foodmod.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CHOPSTICKS = registerItem("chopsticks",new Item(new FabricItemSettings().group(ModItemGroup.foodmod_taiwanesefood)));
    public static final Item COLD_NOODLE_SAUCE = registerItem("cold_noodle_sauce", new Item(new FabricItemSettings().group(ModItemGroup.foodmod_taiwanesefood)));
    public static final Item GRAPE = registerItem("grape",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.GRAPE)));
    public static final Item GRAPE_SEEDS = registerItem("grape_seeds",
            new AliasedBlockItem(ModBlocks.GRAPE_VINE,new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item SWEET_BERRY_RAISINS = registerItem("sweet_berry_raisins",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item GLOW_BERRY_RAISINS = registerItem("glow_berry_raisins",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item GRAPE_RAISINS = registerItem("grape_raisins",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item CHOCOLATE_PIECE = registerItem("chocolate_piece",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.CHOCOLATE_PIECE)));
    public static final Item DOUGH = registerItem("dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item CHOCOLATE_DOUGH = registerItem("chocolate_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item SWEET_BERRY_DOUGH = registerItem("sweet_berry_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item GLOW_BERRY_DOUGH = registerItem("glow_berry_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item GRAPE_DOUGH = registerItem("grape_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item CHOCOLATE_TOAST_DOUGH = registerItem("chocolate_toast_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item SWEET_BERRY_TOAST_DOUGH = registerItem("sweet_berry_toast_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item GLOW_BERRY_TOAST_DOUGH = registerItem("glow_berry_toast_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item GRAPE_TOAST_DOUGH = registerItem("grape_toast_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item CHOCOLATE_PIE_DOUGH = registerItem("chocolate_pie_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item SWEET_BERRY_PIE_DOUGH = registerItem("sweet_berry_pie_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item GLOW_BERRY_PIE_DOUGH = registerItem("glow_berry_pie_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item GRAPE_PIE_DOUGH = registerItem("grape_pie_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item PUMPKIN_PIE_DOUGH = registerItem("pumpkin_pie_dough",new Item(new FabricItemSettings().group(ModItemGroup.foodmod)));
    public static final Item CHOCOLATE_TOAST_SLICE = registerItem("chocolate_toast_slice",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.CHOCOLATE_TOAST)));
    public static final Item SWEET_BERRY_TOAST_SLICE = registerItem("sweet_berry_toast_slice",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.GRAPE_TOAST)));
    public static final Item GLOW_BERRY_TOAST_SLICE = registerItem("glow_berry_toast_slice",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.GRAPE_TOAST)));
    public static final Item GRAPE_TOAST_SLICE = registerItem("grape_toast_slice",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.GRAPE_TOAST)));
    public static final Item CHOCOLATE_PIE = registerItem("chocolate_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.PIE)));
    public static final Item SWEET_BERRY_PIE = registerItem("sweet_berry_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.PIE)));
    public static final Item GLOW_BERRY_PIE = registerItem("glow_berry_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.PIE)));
    public static final Item GRAPE_PIE = registerItem("grape_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.PIE)));
    public static final Item SWEET_BERRY_COOKIE = registerItem("sweet_berry_cookie",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.COOKIE)));
    public static final Item GLOW_BERRY_COOKIE = registerItem("glow_berry_cookie",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.COOKIE)));
    public static final Item GRAPE_COOKIE = registerItem("grape_cookie",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.COOKIE)));
    public static final Item CHICKEN_THIGH = registerItem("chicken_thigh",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.CHICKEN_MEAT)));
    public static final Item CHICKEN_BREAST = registerItem("chicken_breast",
            new Item(new FabricItemSettings().group(ModItemGroup.foodmod).food(ModfoodComponets.CHICKEN_MEAT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FoodMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        FoodMod.LOGGER.info("Registering Mod Item For"+FoodMod.MOD_ID);
    }
}

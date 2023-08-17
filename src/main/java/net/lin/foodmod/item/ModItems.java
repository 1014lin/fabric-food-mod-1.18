package net.lin.foodmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lin.foodmod.FoodMod;
import net.lin.foodmod.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item FLOUR = registerItem("flour",new Item(new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item COLD_NOODLE_SAUCE = registerItem("cold_noodle_sauce", new Item(new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item GINGER = registerItem("ginger",new Item(new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item DOUGH = registerItem("dough",new Item(new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item CHOCOLATE_DOUGH = registerItem("chocolate_dough",new Item(new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item SWEET_BERRY_DOUGH = registerItem("sweet_berry_dough",new Item(new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item GLOW_BERRY_DOUGH = registerItem("glow_berry_dough",new Item(new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item GRAPE_DOUGH = registerItem("grape_dough",new Item(new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item CHOPSTICKS = registerItem("chopsticks",new Item(new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item GRAPE = registerItem("grape",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.GRAPE)));
    public static final Item GINGER_BREAD_MAN = registerItem("ginger_bread_man",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.GINGER_BREAD_MAN)));
    public static final Item TOAST = registerItem("toast",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.TOAST)));
    public static final Item CHOCOLATE_TOAST = registerItem("chocolate_toast",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.CHOCOLATE_TOAST)));
    public static final Item GRAPE_TOAST = registerItem("grape_toast",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.GRAPE_TOAST)));
    public static final Item SWEET_BERRY_TOAST = registerItem("sweet_berry_toast",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.GRAPE_TOAST)));
    public static final Item GLOW_BERRY_TOAST = registerItem("glow_berry_toast",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.GRAPE_TOAST)));
    public static final Item GRAPE_PIE = registerItem("grape_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.PIE)));
    public static final Item SWEET_BERRY_PIE = registerItem("sweet_berry_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.PIE)));
    public static final Item GLOW_BERRY_PIE = registerItem("glow_berry_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.PIE)));
    public static final Item CHOCOLATE_PIE = registerItem("chocolate_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.PIE)));
    public static final Item CHOCOLATE_PIECE = registerItem("chocolate_piece",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.CHOCOLATE_PIECE)));
    public static final Item SANDWICH = registerItem("sandwich",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.SANDWICH)));
    public static final Item BURGER = registerItem("burger",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.BURGER)));
    public static final Item DOUBLE_BURGER = registerItem("double_burger",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.DOUBLE_BURGER)));
    public static final Item BURRITO = registerItem("burrito",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.BURRITO)));
    public static final Item PIZZA = registerItem("pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.PIZZA)));
    public static final Item HOT_DOG = registerItem("hot_dog",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.HOT_DOG)));
    public static final Item BACON = registerItem("bacon",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.BACON)));
    public static final Item BUN = registerItem("bun",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.BUN)));
    public static final Item FRIES = registerItem("fries",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.FRIES)));
    public static final Item SUBMARINE_SANDWICH = registerItem("submarine_sandwich",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.SUBMARINE_SANDWICH)));
    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.TOMATO)));
    public static final Item Corn = registerItem("corn",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.CORN)));
    public static final Item CHICKEN_THIGH = registerItem("chicken_thigh",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.CHICKEN_MEAT)));
    public static final Item CHICKEN_BREAST = registerItem("chicken_breast",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.CHICKEN_MEAT)));
    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().group(ModItemGroup.mod).food(ModfoodComponets.CHEESE)));
    public static final Item GRAPE_SEEDS = registerItem("grape_seeds",
            new AliasedBlockItem(ModBlocks.GRAPE_VINE,new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item GINGER_SEEDS = registerItem("ginger_seeds",
            new AliasedBlockItem(ModBlocks.GINGER_VINE,new FabricItemSettings().group(ModItemGroup.mod)));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_VINE,new FabricItemSettings().group(ModItemGroup.mod)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FoodMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        FoodMod.LOGGER.info("Registering Mod Item For"+FoodMod.MOD_ID);
    }
}

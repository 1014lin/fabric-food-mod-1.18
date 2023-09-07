package net.lin.foodmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModfoodComponets {

    public static final FoodComponent CHOCOLATE_TOAST = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.3F).build();
    public static final FoodComponent GRAPE_TOAST = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.3F).build();
    public static final FoodComponent CHOCOLATE_PIECE = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.3F).build();
    public static final FoodComponent GRAPE = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).build();
    public static final FoodComponent PIE = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.3F).build();
    public static final FoodComponent COOKIE = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).build();
    public static final FoodComponent CHICKEN_MEAT = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.3F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F).meat().build();



}

package net.lin.foodmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModfoodComponets {
    public static final FoodComponent TOMATO = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.3F).build();
    public static final FoodComponent BUN = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).build();
    public static final FoodComponent BURGER = (new FoodComponent.Builder()).hunger(7).saturationModifier(0.3F).build();
    public static final FoodComponent DOUBLE_BURGER = (new FoodComponent.Builder()).hunger(12).saturationModifier(0.3F).build();
    public static final FoodComponent CHOCOLATE_TOAST = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.3F).build();
    public static final FoodComponent TOAST = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).build();
    public static final FoodComponent GRAPE_TOAST = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.3F).build();
    public static final FoodComponent BACON = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).build();
    public static final FoodComponent PIZZA = (new FoodComponent.Builder()).hunger(9).saturationModifier(0.3F).build();
    public static final FoodComponent HOT_DOG = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.3F).build();
    public static final FoodComponent BURRITO = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.3F).build();
    public static final FoodComponent CHOCOLATE_PIECE = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.3F).build();
    public static final FoodComponent GINGER_BREAD_MAN = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent GRAPE = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).build();
    public static final FoodComponent SANDWICH = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.3F).build();
    public static final FoodComponent SUBMARINE_SANDWICH = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.3F).build();
    public static final FoodComponent FRIES = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).build();
    public static final FoodComponent CORN = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).build();
    public static final FoodComponent PIE = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.3F).build();
    public static final FoodComponent CHEESE = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent CHICKEN_MEAT = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.3F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F).meat().build();



}

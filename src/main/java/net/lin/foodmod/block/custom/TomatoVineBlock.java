package net.lin.foodmod.block.custom;

import net.lin.foodmod.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class TomatoVineBlock extends CropBlock {
    public TomatoVineBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.TOMATO_SEEDS;
    }
}

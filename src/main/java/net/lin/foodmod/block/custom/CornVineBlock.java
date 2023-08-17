package net.lin.foodmod.block.custom;

import net.lin.foodmod.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class CornVineBlock extends CropBlock {
    public CornVineBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return super.getMaxAge();
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.GINGER_SEEDS;
    }
}

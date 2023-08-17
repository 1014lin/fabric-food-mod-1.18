package net.lin.foodmod.block.custom;

import net.lin.foodmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class StinkyTofuBlock extends Block {
    public static final BooleanProperty CLICKED =BooleanProperty.of("clicked");
    public static final IntProperty BITES = IntProperty.of("bite",1,3);

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public StinkyTofuBlock(Settings settings) {
        super(settings);
    }



    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if(!world.isClient()&& itemStack.isOf(ModItems.CHOPSTICKS)){
            if (player.canConsume(false)) {
                player.getHungerManager().add(2, 0.1F);
                int i = (Integer) state.get(BITES);
                if (i < 3) {
                    world.setBlockState(pos, (BlockState) state.with(BITES, i + 1), 3);
                } else {
                    world.removeBlock(pos, false);
                    world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
                    dropStack(world, pos, new ItemStack(Items.BOWL, 1));
                }
            }
        }
        return ActionResult.CONSUME;
    }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {

        builder.add(FACING,BITES);
    }
}

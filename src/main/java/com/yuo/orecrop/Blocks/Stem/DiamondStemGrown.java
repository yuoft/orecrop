package com.yuo.orecrop.Blocks.Stem;

import com.yuo.orecrop.Blocks.BlockRegistry;
import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.StemBlock;
import net.minecraft.block.StemGrownBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;

//作物块
public class DiamondStemGrown extends StemGrownBlock {

    public DiamondStemGrown(Properties properties) {
        super(properties);
    }

    @Override
    public StemBlock getStem() {
        return (StemBlock) BlockRegistry.diamondStem.get();
    }

    @Override
    public AttachedStemBlock getAttachedStem() {
        return (AttachedStemBlock) BlockRegistry.attDiamondStem.get();
    }
    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return MathHelper.nextInt(RANDOM, 2, 4);
    }
}

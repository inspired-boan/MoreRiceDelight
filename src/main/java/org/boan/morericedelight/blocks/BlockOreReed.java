package org.boan.morericedelight.blocks;

import net.minecraft.client.resources.model.Material;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.boan.morericedelight.config.ReedConfig;

public class BlockOreReed extends Block {
    public BlockOreReed(String name, ReedConfig config, BlockBehaviour.Properties properties) {
        super(Block.Properties
                .of().setId()
                .doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f, 0f).sound(SoundType.PLANT));

    }
}

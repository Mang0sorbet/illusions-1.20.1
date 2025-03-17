package net.mango.illusions;

import net.fabricmc.api.ClientModInitializer;
import net.mango.illusions.blocks.ModBlocks;
import net.mango.illusions.blocks.entity.ModBlockEntities;
import net.mango.illusions.blocks.entity.client.AnimatedBlockRenderer;
import net.mango.illusions.item.ModItemModelPredicates;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class IllusionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItemModelPredicates.registerModelPredicateProviders();
        BlockEntityRendererFactories.register(ModBlockEntities.ANIMATED_BLOCK_ENTITY, AnimatedBlockRenderer::new);
    }

}

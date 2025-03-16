package net.mango.illusions.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;

public class AnimatedBlockEntity extends BlockItem implements GeoAnimatable {

    private AnimatableInstanceCache factory = new AnimatableInstanceCache(this) {
        @Override
        public <T extends GeoAnimatable> AnimatableManager<T> getManagerForId(long l) {
            return null;
        }
    };

    public AnimatedBlockEntity(BlockEntityType<?> type, Block block, Settings settings) {
        super(type, block, settings);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return factory;
    }

    @Override
    public double getTick(Object o) {
        return 0;
    }
}

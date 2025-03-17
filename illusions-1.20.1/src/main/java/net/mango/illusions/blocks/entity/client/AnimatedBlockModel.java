package net.mango.illusions.blocks.entity.client;

import net.mango.illusions.Illusions;
import net.mango.illusions.blocks.entity.AnimatedBlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedBlockModel extends GeoModel<AnimatedBlockEntity> {
    @Override
    public Identifier getModelResource(AnimatedBlockEntity animatedBlockEntity) {
        return new Identifier(Illusions.MOD_ID, "geo/aegis_core.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedBlockEntity animatedBlockEntity) {
        return new Identifier(Illusions.MOD_ID,"textures/block/aegis_core.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedBlockEntity animatedBlockEntity) {
        return new Identifier(Illusions.MOD_ID, "animations/aegis_core.animation.json");
    }
}

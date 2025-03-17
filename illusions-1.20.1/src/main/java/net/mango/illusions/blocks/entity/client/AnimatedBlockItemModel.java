package net.mango.illusions.blocks.entity.client;

import net.mango.illusions.Illusions;
import net.mango.illusions.item.custom.AnimatedBlockItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedBlockItemModel extends GeoModel<AnimatedBlockItem> {
    @Override
    public Identifier getModelResource(AnimatedBlockItem animatedBlockItem) {
        return new Identifier(Illusions.MOD_ID, "geo/aegis_core.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedBlockItem animatedBlockItem) {
        return new Identifier(Illusions.MOD_ID,"textures/block/aegis_core.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedBlockItem animatedBlockItem) {
        return new Identifier(Illusions.MOD_ID, "animations/aegis_core.animation.json");
    }
}

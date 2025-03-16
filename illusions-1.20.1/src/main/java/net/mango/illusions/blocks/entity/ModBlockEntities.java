package net.mango.illusions.blocks.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.mango.illusions.Illusions;
import net.mango.illusions.blocks.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<AegisCoreBlockEntity> AEGIS_CORE;

    public static void registerAllBlockEntities() {
        AEGIS_CORE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Illusions.MOD_ID, "aegis_core"),
                FabricBlockEntityTypeBuilder.create(AegisCoreBlockEntity::new, ModBlocks.AEGIS_CORE).build());
    }
}

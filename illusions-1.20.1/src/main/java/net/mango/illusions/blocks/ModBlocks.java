package net.mango.illusions.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mango.illusions.Illusions;
import net.mango.illusions.blocks.custom.AnimatedBlock;
import net.mango.illusions.item.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SignBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block AEGIS_CORE = registerBlockWithoutBlockItem(
            "aegis_core",
            new AnimatedBlock(FabricBlockSettings.create().strength(4.0f, 6.0f)), // Add block properties
            ModItemGroups.ILLUSION_GROUP);



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Illusions.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM , new Identifier(Illusions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static <T extends BlockEntityType<?>> T registerBlockEntityWithoutItem(String name, T blockEntityType) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Illusions.MOD_ID, name), blockEntityType);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registries.BLOCK, new Identifier(Illusions.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        Illusions.LOGGER.info("Registering Mod Blocks for "+Illusions.MOD_ID);
    }
}

package net.mango.illusions.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mango.illusions.Illusions;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block AEGIS_CORE = registerBlock("aegis_core",
            new Block(FabricBlockSettings.create()
                    .dropsNothing()
                    .strength(-1.0f, 3600000.0f)
                    .sounds(BlockSoundGroup.NETHERITE)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Illusions.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM , new Identifier(Illusions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Illusions.LOGGER.info("Registering Mod Blocks for "+Illusions.MOD_ID);
    }
}

package net.mango.illusions.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mango.illusions.Illusions;
import net.mango.illusions.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ILLUSION_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Illusions.MOD_ID, "illusions"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.illusions"))
                    .icon(() -> new ItemStack(ModItems.CRACKED_TOTEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FRAGMENTED_HORN);
                        entries.add(ModItems.CRACKED_TOTEM);
                        entries.add(ModItems.FORBIDDEN_KEY);
                        entries.add(ModItems.KEY_HEAD);
                        entries.add(ModBlocks.AEGIS_CORE);
                    }).build());

    public static void registerItemGroups() {
        Illusions.LOGGER.info("Registering Item Groups for "+Illusions.MOD_ID);
    }

}

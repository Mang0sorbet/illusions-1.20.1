package net.mango.illusions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mango.illusions.Illusions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


public class ModItems {

    public static final Item FORBIDDEN_KEY = registerItem("forbidden_key", new Item(new FabricItemSettings()));

    public static final Item CRACKED_TOTEM = registerItem("cracked_totem", new Item(new FabricItemSettings()));

    public static final Item FRAGMENTED_HORN = registerItem("fragmented_horn", new Item(new FabricItemSettings()));

    public static final Item HORN_OF_THE_RAIDERS = registerItem("horn_of_the_raiders", new HornItem(new Item.Settings().maxCount(1).rarity(Rarity.EPIC), Text.literal("Use this once and summon the wrath of the illagers").setStyle(Style.EMPTY.withColor(Formatting.DARK_PURPLE).withBold(false).withItalic(true)), ModSounds.RAID_SOUND_EVENT.Event, 600, 300, 240));

    public static final Item KEY_HEAD = registerItem("key_head", new Item(new FabricItemSettings()));

    public static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(FORBIDDEN_KEY);
        entries.add(CRACKED_TOTEM);
        entries.add(FRAGMENTED_HORN);
        entries.add(HORN_OF_THE_RAIDERS);
        entries.add(KEY_HEAD);


    }


    public static void registerModItems() {

        Illusions.LOGGER.info("Registering Mod Items For:" + Illusions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(Illusions.MOD_ID, name), item);

    }
}

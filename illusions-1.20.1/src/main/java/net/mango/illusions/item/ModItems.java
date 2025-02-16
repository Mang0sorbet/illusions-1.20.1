package net.mango.illusions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mango.illusions.Illusions;
import net.minecraft.item.GoatHornItem;
import net.minecraft.item.Instruments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.InstrumentTags;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item FORBIDDEN_KEY = registerItem("forbidden_key", new Item(new FabricItemSettings()));

    public static final Item CRACKED_TOTEM = registerItem("cracked_totem", new Item(new FabricItemSettings()));

    public static final Item FRAGMENTED_HORN = registerItem("fragmented_horn", new Item(new FabricItemSettings()));

    public static final Item HORN_OF_THE_RAIDERS = registerItem("horn_of_the_raiders", new HornItem(new Item.Settings().maxCount(1), Text.literal("A universe in a marble ball...").setStyle(Style.EMPTY.withColor(Formatting.DARK_GRAY).withBold(false).withItalic(true)), ModSounds.RAID_SOUND_EVENT.Event, 600, 256, 240));

    public static final Item KEY_HEAD = registerItem("key_head", new Item(new FabricItemSettings()));

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(FORBIDDEN_KEY);
        entries.add(CRACKED_TOTEM);
        entries.add(FRAGMENTED_HORN);
        entries.add(HORN_OF_THE_RAIDERS);
        entries.add(KEY_HEAD);


    }


    public static void registerModItems() {

        Illusions.LOGGER.info("Registering Mod Items For:" + Illusions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(Illusions.MOD_ID, name), item);

    }
}

package net.mango.illusions.instruments;

import net.mango.illusions.Illusions;
import net.mango.illusions.item.ModSounds;
import net.minecraft.item.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModInstruments {

    public static final Instrument CUSTOM_GOAT_HORN = new Instrument(ModSounds.RAID_SOUND_EVENT.Event, 300, 300F);
    private static RegistryKey<Instrument> of(String id) {
        return RegistryKey.of(RegistryKeys.INSTRUMENT, new Identifier(id));
    }
    public static void register() {
        Registry.register(Registries.INSTRUMENT, new Identifier(Illusions.MOD_ID, "raid_horn"), CUSTOM_GOAT_HORN);
    }

}

package net.mango.illusions.item;

import net.mango.illusions.Illusions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEventEntry RAID_SOUND_EVENT = new SoundEventEntry("raid_sound_event");

    public static final SoundEventEntry CRAFT_HORN = new SoundEventEntry("craft_horn");

    private static final SoundEventEntry[] SoundsToRegister = {
            RAID_SOUND_EVENT,CRAFT_HORN
    };

    // You shouldn't need to look any further below this section if you wish to just add a sound.

    public static void registerSounds(){
        for(int i = 0; i < SoundsToRegister.length; i++){
            Registry.register(Registries.SOUND_EVENT, SoundsToRegister[i].ID, SoundsToRegister[i].Event);
            //FunnierOriginsTweaks.LOGGER.info("Registered: "+SoundsToRegister[i].ID.toString());
        }
    }

    public static class SoundEventEntry{
        public Identifier ID;
        public SoundEvent Event;

        public SoundEventEntry(String ID){
            this.ID = new Identifier(Illusions.MOD_ID+":"+ID);
            this.Event = SoundEvent.of(this.ID);
        }
    }
}

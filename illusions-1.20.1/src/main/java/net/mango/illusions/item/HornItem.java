package net.mango.illusions.item;

import java.util.List;
import java.util.Optional;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class HornItem extends Item {

    private Text lore;
    private SoundEvent sound;
    private int cooldown;
    private float range;
    private int tootlength;

    public HornItem(Settings settings, Text lore, SoundEvent sound, int cooldown, float range, int tootlength) {
        super(settings);
        this.lore = lore; this.sound = sound; this.cooldown = cooldown; this.range = range; this.tootlength = tootlength;
    }
    
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(lore);
    }

    @Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.TOOT_HORN;
	}

    @Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setCurrentHand(hand);

		float f = range / 16.0F;
		world.playSoundFromEntity(user, user, sound, SoundCategory.RECORDS, f, 1.0F);
		world.emitGameEvent(GameEvent.INSTRUMENT_PLAY, user.getPos(), GameEvent.Emitter.of(user));

		user.getItemCooldownManager().set(this, cooldown);
		user.incrementStat(Stats.USED.getOrCreateStat(this));
		return TypedActionResult.consume(user.getStackInHand(hand));
	}

    @Override
	public int getMaxUseTime(ItemStack stack) {
        return tootlength;
	}

}

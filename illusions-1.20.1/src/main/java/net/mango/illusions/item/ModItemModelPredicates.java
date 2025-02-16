package net.mango.illusions.item;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class ModItemModelPredicates {
    public static void registerModelPredicateProviders() {

    ModelPredicateProviderRegistry.register(ModItems.HORN_OF_THE_RAIDERS, new Identifier("tootingraider"), (itemStack, clientWorld, livingEntity, seed) -> {
      if (livingEntity == null) {
        return 0.0F;
      }
      return livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack ? 1.0F : 0.0F;
    });
  }

}

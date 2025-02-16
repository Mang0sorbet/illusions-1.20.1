package net.mango.illusions;

import net.fabricmc.api.ClientModInitializer;
import net.mango.illusions.item.ModItemModelPredicates;

public class IllusionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItemModelPredicates.registerModelPredicateProviders();
    }
}

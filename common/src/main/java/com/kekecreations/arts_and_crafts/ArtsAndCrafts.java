package com.kekecreations.arts_and_crafts;

import com.kekecreations.arts_and_crafts.core.registry.*;
import net.minecraft.resources.ResourceLocation;

public class ArtsAndCrafts {
    public static final String MOD_ID = "arts_and_crafts";
    
    public static void init() {
        KekeParticles.register();
        KekeEntityTypes.register();
        KekeBlocks.register();
        KekeItems.register();
        KekeCustomSherdPatterns.register();
        KekeRecipeSerializer.register();
    }



    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}

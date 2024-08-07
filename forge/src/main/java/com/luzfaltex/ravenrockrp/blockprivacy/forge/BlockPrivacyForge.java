package com.luzfaltex.ravenrockrp.blockprivacy.forge;

import com.luzfaltex.ravenrockrp.blockprivacy.BlockPrivacy;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BlockPrivacy.MOD_ID)
public final class BlockPrivacyForge {
    public BlockPrivacyForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(BlockPrivacy.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        BlockPrivacy.init();
    }
}

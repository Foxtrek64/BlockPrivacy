package com.luzfaltex.ravenrockrp.blockprivacy.forge;

import com.luzfaltex.ravenrockrp.blockprivacy.Blockprivacy;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Blockprivacy.MOD_ID)
public final class BlockPrivacyForge {
    public BlockPrivacyForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(Blockprivacy.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        Blockprivacy.init();
    }
}

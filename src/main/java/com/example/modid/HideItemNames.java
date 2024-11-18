package com.example.modid;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = "hideitemnames", name = "Hide Item Names Mod", version = "1.0", clientSideOnly = true)
public class HideItemNames {

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        // Access the GameSettings instance after Minecraft is initialized
        GameSettings settings = Minecraft.getMinecraft().gameSettings;

        // Disable held item tooltips
        settings.heldItemTooltips = false;
    }
}

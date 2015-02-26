package com.ewyboy.nerf;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "nerf", name = "Nerf", version = "1.0")

public class Nerf {
    @Mod.Instance("nerf")
    public static Nerf instance;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event) {
        Config.init(event.getSuggestedConfigurationFile());
        Remove.init();
        Add.init();
        Tweaker.init();
    }
}


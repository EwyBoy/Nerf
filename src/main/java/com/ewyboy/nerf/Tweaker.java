package com.ewyboy.nerf;

import net.minecraft.init.Blocks;

public class Tweaker {

    public static void init() {
        tweakBlocks();
    }

    public static void tweakBlocks() {
        //Hardness
        Blocks.stone.setHardness(8f);
        Blocks.log.setHardness(8f);
        Blocks.log2.setHardness(8f);

        //Light
        Blocks.torch.setLightLevel(0.5f);
        Blocks.glowstone.setLightLevel(0.75f);
    }
}

package com.ewyboy.nerf;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Config {

    public static int stickReturnValue, plankReturnValue;

    public static boolean nerfSticks, nerfPlanks, nerfLight, nerfHardness;

    public static void init (File file) {

        Configuration config = new Configuration(file);

        config.load();

            //Recipes
            nerfSticks = config.getBoolean("nerfSticks","Recipe Nerfs",true,"Set to false for regular vanilla recipe");
            stickReturnValue = config.getInt("stickReturnValue", "Recipe Nerfs",2,0,64,"Sets output amount when crafting sticks");

            nerfPlanks = config.getBoolean("nerfPlanks","Recipe Nerfs",true,"Set to false for regular vanilla recipe");
            plankReturnValue = config.getInt("plankReturnValue", "Recipe Nerfs",2,0,64,"Sets output amount when crafting planks");

            //Tweaker
            nerfLight = config.getBoolean("nerfLight","World Nerfs",true,"Set to false for regular vanilla light system on all blocks listed below");

            nerfHardness = config.getBoolean("nerfHardness","World Nerfs",true,"Set to false for regular vanilla hardness on all blocks listed below");
        config.save();
    }
}

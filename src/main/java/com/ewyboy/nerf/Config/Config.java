package com.ewyboy.nerf.Config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Config {

    public static int stickReturnValue, plankReturnValue, torchReturnValue;

    public static float nerfTorch, nerfGlow, nerfObsidian, hardnessStone, hardnessWood, hardnessSoil, hardnessMetal, hardnessOre;

    public static boolean nerfSticksRecipe, nerfPlanksRecipe,nerfTorchRecipe, nerfLight, nerfHardness, nerfHardnessStone,nerfHardnessWood,nerfHardnessSoil,nerfHardnessMetal,nerfHardnessOre, removeStoneSmelting, removeGlassSmelting;

    public static void init (File file) {

        Configuration config = new Configuration(file);

        config.load();

            /**Recipes**/
        /**Crafting**/
            nerfSticksRecipe = config.getBoolean("nerfSticks","Recipe Nerfs",true,"Set to false for regular vanilla recipe");
                stickReturnValue = config.getInt("stickReturnValue", "Recipe Nerfs",2,1,64,"Sets output amount when crafting sticks");

            nerfPlanksRecipe = config.getBoolean("nerfPlanks","Recipe Nerfs",true,"Set to false for regular vanilla recipe");
                plankReturnValue = config.getInt("plankReturnValue", "Recipe Nerfs",2,1,64,"Sets output amount when crafting planks");

            nerfTorchRecipe = config.getBoolean("nerfTorch","Recipe Nerfs",true,"Set to false for regular vanilla recipe");
                plankReturnValue = config.getInt("plankReturnValue", "Recipe Nerfs",2,1,64,"Sets output amount when crafting torches");

        /**Smelting*/
            removeGlassSmelting = config.getBoolean("removeGlassSmelting","Smelting Nerfs",false,"While true removes glass smelting recipe(Only do this if you have a alternative way of getting glass)");
            removeStoneSmelting = config.getBoolean("removeStoneSmelting","Smelting Nerfs",false,"While true removes stone smelting recipe(Only do this if you have a alternative way of getting Stone)");

            /**Tweaker**/
        /**Light Tweaks**/
            nerfLight = config.getBoolean("nerfLight","Light Nerfs",true,"Set to false for regular vanilla light system on all blocks listed below");
                nerfTorch = config.getFloat("nerfTorch", "Light Nerfs", 0.5f, 0.0f, 1.0f, "Sets the amount of light a torch emits");
                nerfGlow = config.getFloat("nerfGlow","Light Nerfs",0.75f,0.0f,1.0f,"Sets the amount of light a glowstone block emits");

        /**Hardness Tweaks**/
            nerfHardness = config.getBoolean("nerfHardness","Block Hardness Nerfs",true,"Set to false for regular vanilla hardness on all block types listed below");
                nerfObsidian = config.getFloat("nerfObsidian","Block Hardness Nerfs",75.0f,0.1f,1000.0f,"Sets the hardness of obsidian(vanilla is 50.0f(9.375 seconds))");

                nerfHardnessStone = config.getBoolean("nerfHardnessStone","Block Hardness Nerfs",true,"Set to false for regular vanilla hardness on all stone like blocks");
                    hardnessStone = config.getFloat("hardnessStone","Block Hardness Nerfs",5.0f,1.5f,12f,"Sets the hardness of all stone like blocks");
                nerfHardnessSoil = config.getBoolean("nerfHardnessSoil","Block Hardness Nerfs",true,"Set to false for regular vanilla hardness on all soil like blocks");
                    hardnessSoil = config.getFloat("hardnessSoil","Block Hardness Nerfs",1.5f,0.5f,6f,"Sets the hardness of all soil like blocks");
                nerfHardnessWood = config.getBoolean("nerfHardnessWood","Block Hardness Nerfs",true,"Set to false for regular vanilla hardness on all wood like blocks");
                    hardnessWood = config.getFloat("hardnessWood","Block Hardness Nerfs",4.0f,2.0f,8f,"Sets the hardness of all wood like blocks");
                nerfHardnessMetal = config.getBoolean("nerfHardnessMetal","Block Hardness Nerfs",true,"Set to false for regular vanilla hardness on all metal like blocks");
                    hardnessWood = config.getFloat("hardnessWood","Block Hardness Nerfs",10.0f,5.0f,20f,"Sets the hardness of all wood like blocks");
                nerfHardnessOre = config.getBoolean("nerfHardnessOre","Block Hardness Nerfs",true,"Set to false for regular vanilla hardness on all ore like blocks");

        config.save();
    }
}

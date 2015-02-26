package com.ewyboy.nerf;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Add {

    public static void init() {
        addRecipe();
        addSmelting();
    }

    public static void addSmelting() {
        //GameRegistry.addSmelting(new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.coal_block), 0.1F);
    }

    public static void addRecipe() {
        if (Config.nerfSticks) {
            GameRegistry.addRecipe(new ItemStack(Items.stick, Config.stickReturnValue, OreDictionary.WILDCARD_VALUE), "I", "I", 'I', Blocks.planks);
            System.out.println("Stick recipe changed to output " + Config.stickReturnValue + " sticks");
        } else {
            System.out.println("Loading default stick recipe");
        }

        if (Config.nerfPlanks) {
            for (int i = 0; i < 4; i++) {
                System.out.println("I = " + i);
                GameRegistry.addRecipe(new ItemStack(Blocks.planks, Config.plankReturnValue, i + 4), "I", 'I', new ItemStack(Blocks.log, 1, i));
                GameRegistry.addRecipe(new ItemStack(Blocks.planks, Config.plankReturnValue, i + 4), "I", 'I', new ItemStack(Blocks.log2, 1, i));
                System.out.println("Planks recipe changed to output " + Config.plankReturnValue + " planks");
            }
        } else {
            System.out.println("Loading default plank recipe");
        }
    }
}

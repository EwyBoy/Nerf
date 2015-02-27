package com.ewyboy.nerf.Modify;

import com.ewyboy.nerf.Config.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.oredict.OreDictionary;

public class Add {

    public static void init() {
        addRecipe();
        addSmelting();
        addLoot();
    }

    public static void addLoot() {
        int min;
        int max;

        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(Blocks.glass),1,1,1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Blocks.glass),20,100,1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Blocks.glass),1,1,1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Blocks.glass),1,5,1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Blocks.glass),1,1,1));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Blocks.glass),1,1,1));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Blocks.glass),1,3,100));
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Blocks.glass),12,80,1));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Blocks.glass),20,100,1));
    }

    public static void addSmelting() {
        //GameRegistry.addSmelting(new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.coal_block), 0.1F);
    }

    public static void addRecipe() {
        if (Config.nerfSticksRecipe) {
            GameRegistry.addRecipe(new ItemStack(Items.stick, Config.stickReturnValue, OreDictionary.WILDCARD_VALUE), "I", "I", 'I', Blocks.planks);
        }
        if (Config.nerfTorchRecipe) {
            GameRegistry.addShapedRecipe(new ItemStack(Blocks.torch, Config.torchReturnValue),"O", 'O', Items.coal);
        }

        if (Config.nerfPlanksRecipe) {
            for (int i = 0; i < 4; i++) {
                GameRegistry.addRecipe(new ItemStack(Blocks.planks, Config.plankReturnValue, i), "I", 'I', new ItemStack(Blocks.log, 1, i));
                GameRegistry.addRecipe(new ItemStack(Blocks.planks, Config.plankReturnValue, i + 4), "I", 'I', new ItemStack(Blocks.log2, 1, i));
            }
        }
    }
}

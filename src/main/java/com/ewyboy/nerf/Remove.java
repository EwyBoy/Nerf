package com.ewyboy.nerf;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Remove {

    public static void init() {
        removeItems();
        removeBlocks();
        removeFurnace();
    }

    public static void removeBlocks() {
        Iterator<IRecipe> iterator = CraftingManager.getInstance().getRecipeList().iterator();

        while (iterator.hasNext()) {
            IRecipe recipe = iterator.next();
            if (recipe == null) {
                continue;
            }
            ItemStack output = recipe.getRecipeOutput();

            if (output != null && output.getItem() == Item.getItemFromBlock(Blocks.planks)) {
                iterator.remove();
            }
        }
    }

    public static void removeItems() {
        Collection<Item> removeSet = new HashSet();

        Collections.addAll(removeSet/*, Items.XxX here*/);

        Iterator<IRecipe> iterator1 = CraftingManager.getInstance().getRecipeList().iterator();

        while (iterator1.hasNext())
        {
            IRecipe recipe = iterator1.next();
            if (recipe == null)
                continue;
            ItemStack output = recipe.getRecipeOutput();
            if (output != null && output.getItem() != null && removeSet.contains(output.getItem()))
                iterator1.remove();
        }
    }

    public static void removeFurnace() {
        RecipeRemover.removeFurnaceRecipeVanilla(new ItemStack(Item.getItemFromBlock(Blocks.stone)));
    }
}

package com.ewyboy.nerf.Modify;

import com.ewyboy.nerf.Config.Config;
import net.minecraft.init.Blocks;

public class Tweaker {

    public static void init() {
        tweakBlocks();
    }

    public static void tweakBlocks() {
        /**Hardness**/
        if(Config.nerfHardness) {
            float stone = Config.hardnessStone, wood = Config.hardnessWood, metal = Config.hardnessMetal, ore = Config.hardnessOre, soil = Config.hardnessSoil;

            /**Obsidian**/
            Blocks.obsidian.setHardness(Config.nerfObsidian);

            /**Stone**/
            if(Config.nerfHardnessStone) {
                Blocks.stone.setHardness(stone);
                Blocks.stone_brick_stairs.setHardness(stone);
                Blocks.stone_button.setHardness(stone);
                Blocks.stone_pressure_plate.setHardness(stone);
                Blocks.stone_slab.setHardness(stone);
                Blocks.stone_stairs.setHardness(stone);
                Blocks.stonebrick.setHardness(stone);
                Blocks.end_stone.setHardness(stone);
                Blocks.double_stone_slab.setHardness(stone);
                Blocks.sandstone.setHardness(stone);
                Blocks.quartz_stairs.setHardness(stone);
                Blocks.sandstone_stairs.setHardness(stone);
                Blocks.cobblestone.setHardness(stone);
                Blocks.cobblestone_wall.setHardness(stone);
                Blocks.mossy_cobblestone.setHardness(stone);
                Blocks.nether_brick_stairs.setHardness(stone);
                Blocks.nether_brick.setHardness(stone);
                Blocks.nether_brick_fence.setHardness(stone);
                Blocks.dispenser.setHardness(stone);
                Blocks.dropper.setHardness(stone);
                Blocks.furnace.setHardness(stone);
                Blocks.lit_furnace.setHardness(stone);
                Blocks.piston.setHardness(stone);
                Blocks.piston_extension.setHardness(stone);
                Blocks.sticky_piston.setHardness(stone);
                Blocks.brick_block.setHardness(stone);
                Blocks.brick_stairs.setHardness(stone);
                Blocks.quartz_block.setHardness(stone);
                Blocks.lapis_block.setHardness(stone);
                Blocks.redstone_block.setHardness(stone);
                Blocks.stained_hardened_clay.setHardness(stone);
            }

            /**Ores**/
            if (Config.nerfHardnessOre) {
                Blocks.iron_ore.setHardness(ore);
                Blocks.coal_ore.setHardness(ore);
                Blocks.diamond_ore.setHardness(ore);
                Blocks.gold_ore.setHardness(ore);
                Blocks.emerald_ore.setHardness(ore);
                Blocks.lapis_ore.setHardness(ore);
                Blocks.redstone_ore.setHardness(ore);
                Blocks.lit_redstone_ore.setHardness(ore);
                Blocks.quartz_ore.setHardness(ore);
            }

            /**Metal**/
            if (Config.nerfHardnessMetal) {
                Blocks.coal_block.setHardness(metal);
                Blocks.iron_block.setHardness(metal);
                Blocks.iron_bars.setHardness(metal);
                Blocks.iron_door.setHardness(metal);
                Blocks.gold_block.setHardness(metal);
                Blocks.diamond_block.setHardness(metal);
                Blocks.emerald_block.setHardness(metal);
                Blocks.anvil.setHardness(metal);
                Blocks.cauldron.setHardness(metal);
                Blocks.hopper.setHardness(metal);
            }


            /**Soil**/
            if (Config.nerfHardnessSoil) {
                Blocks.dirt.setHardness(soil);
                Blocks.sand.setHardness(soil);
                Blocks.soul_sand.setHardness(soil);
                Blocks.gravel.setHardness(soil);
                Blocks.mycelium.setHardness(soil);
                Blocks.farmland.setHardness(soil);
                Blocks.grass.setHardness(soil);
            }

            /**Wood**/
            if (Config.nerfHardnessWood) {
                Blocks.log.setHardness(wood);
                Blocks.log2.setHardness(wood);
                Blocks.wooden_button.setHardness(wood);
                Blocks.wooden_door.setHardness(wood);
                Blocks.wooden_pressure_plate.setHardness(wood);
                Blocks.wooden_slab.setHardness(wood);
                Blocks.double_wooden_slab.setHardness(wood);
                Blocks.planks.setHardness(wood);
                Blocks.bookshelf.setHardness(wood);
                Blocks.chest.setHardness(wood);
                Blocks.fence.setHardness(wood);
                Blocks.fence_gate.setHardness(wood);
                Blocks.noteblock.setHardness(wood);
                Blocks.jukebox.setHardness(wood);
                Blocks.oak_stairs.setHardness(wood);
                Blocks.birch_stairs.setHardness(wood);
                Blocks.jungle_stairs.setHardness(wood);
                Blocks.spruce_stairs.setHardness(wood);
                Blocks.acacia_stairs.setHardness(wood);
                Blocks.dark_oak_stairs.setHardness(wood);
                Blocks.piston_head.setHardness(wood);
                Blocks.ladder.setHardness(wood);
                Blocks.crafting_table.setHardness(wood);
                Blocks.trapped_chest.setHardness(wood);
                Blocks.trapdoor.setHardness(wood);
                Blocks.standing_sign.setHardness(wood);
                Blocks.wall_sign.setHardness(wood);
            }
        }

        /**Light**/
        if (Config.nerfLight) {
            Blocks.torch.setLightLevel(Config.nerfTorch);
            Blocks.glowstone.setLightLevel(Config.nerfGlow);
        }
    }
}

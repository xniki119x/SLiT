package niki119.slit.registry;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import niki119.slit.SLiT;

public class CraftRegistry {
    public static void register()
    {
        registerRecipes("beacon_pickaxe");
        registerRecipes("bedrock_pickaxe");
        registerRecipes("bone_block_pickaxe");
        registerRecipes("brick_pickaxe");
        registerRecipes("cactus_pickaxe");
        registerRecipes("cake_pickaxe");
        registerRecipes("chorus_pickaxe");
        registerRecipes("clay_pickaxe");
        registerRecipes("coal_block_pickaxe");
        registerRecipes("cobblestone_mossy_pickaxe");
        registerRecipes("dirt_pickaxe");
        registerRecipes("emerald_block_pickaxe");
        registerRecipes("end_stone_pickaxe");
        registerRecipes("glass_pickaxe");
        registerRecipes("glowstone_pickaxe");
        registerRecipes("gravel_pickaxe");
        registerRecipes("hardened_clay_pickaxe");
        registerRecipes("hay_block_pickaxe");
        registerRecipes("ice_pickaxe");
        registerRecipes("lapis_block_pickaxe");
        registerRecipes("magma_pickaxe");
        registerRecipes("melon_pickaxe");
        registerRecipes("mushroom_block_brown_pickaxe");
        registerRecipes("mushroom_block_red_pickaxe");
        registerRecipes("netherrack_pickaxe");
        registerRecipes("nether_brick_pickaxe");
        registerRecipes("noteblock_pickaxe");
        registerRecipes("obsidian_pickaxe");
        registerRecipes("prismarine_dark_pickaxe");
        registerRecipes("prismarine_rough_pickaxe");
        registerRecipes("pumpkin_pickaxe");
        registerRecipes("purpur_block_pickaxe");
        registerRecipes("quartz_block_pickaxe");
        registerRecipes("redstone_block_pickaxe");
        registerRecipes("red_nether_brick_pickaxe");
        registerRecipes("red_sand_pickaxe");
        registerRecipes("sand_pickaxe");
        registerRecipes("sea_lantern_pickaxe");
        registerRecipes("slime_pickaxe");
        registerRecipes("snow_pickaxe");
        registerRecipes("soul_sand_pickaxe");
        registerRecipes("sponge_pickaxe");
        registerRecipes("stone_pickaxe");
        registerRecipes("stone_andesite_pickaxe");
        registerRecipes("stone_diorite_pickaxe");
        registerRecipes("stone_granite_pickaxe");
        registerRecipes("tnt_pickaxe");
        registerRecipes("wool_pickaxe");
    }

    private static void registerRecipes(String name)
    {
        CraftingHelper.register(new ResourceLocation(SLiT.MODID, name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
    }
}

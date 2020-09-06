package niki119.slit.registry;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import niki119.slit.NikiTools;

public class CraftRegistry {
    public static void register()
    {
        registerRecipes("dirt_pickaxe");
    }

    private static void registerRecipes(String name)
    {
        CraftingHelper.register(new ResourceLocation(NikiTools.MODID, name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
    }
}

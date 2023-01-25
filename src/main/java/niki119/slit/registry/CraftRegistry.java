package niki119.slit.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.common.crafting.CraftingHelper;
//import net.minecraftforge.common.crafting.IRecipeFactory;
import niki119.slit.SLiT;
import niki119.slit.items.ModItems;

public class CraftRegistry {
    public static void register()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.TNT_BOTTOMPICKAXE, 1), "###"," s "," s ",'#', Blocks.tnt, 's', Items.stick);
    }
}
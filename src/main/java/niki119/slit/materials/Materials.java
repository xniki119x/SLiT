package niki119.slit.materials;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import niki119.slit.NikiTools;
import niki119.slit.creativetab.CreativeTab;

public class Materials {
    public static Item.ToolMaterial DIRT = EnumHelper.addToolMaterial(
            "slit:dirt_material", 0, 2, 1.0F, -1.0F, 1)
            .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.DIRT)));
    public static Item.ToolMaterial STONE = EnumHelper.addToolMaterial(
            "slit:stone_material", 1, 40, 2.5F, 1.5F, 1)
            .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.STONE)));
    public static Item.ToolMaterial GRANITE = EnumHelper.addToolMaterial(
            "slit:granite_material", 1, 32, 2.0F, 1.0F, 1)
            .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.STONE)));
    public static Item.ToolMaterial DIORITE = EnumHelper.addToolMaterial(
            "slit:diorite_material", 1, 32, 2.0F, 1.0F, 1)
            .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.STONE)));
    public static Item.ToolMaterial ANDESITE = EnumHelper.addToolMaterial(
            "slit:andesite_material", 1, 32, 2.0F, 1.0F, 1)
            .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.STONE)));
    public static Item.ToolMaterial COBBLESTONE = EnumHelper.addToolMaterial(
            "slit:cobblestone_material", 1, 32, 2.0F, 1.0F, 1)
            .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.STONE)));
    public static Item.ToolMaterial OAK = EnumHelper.addToolMaterial(
            "slit:oak_material", 1, 16, 1.5F, 0.0F, 1)
            .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.LOG)));

}

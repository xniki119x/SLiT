package niki119.slit.materials;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
    public static ToolMaterial BEACON = EnumHelper.addToolMaterial("slit:beacon_material",                                  6,10240,14.0F,10.0F,4).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.beacon)));
    public static ToolMaterial BEDROCK = EnumHelper.addToolMaterial("slit:bedrock_material",                                6,20480,12.0F,9.0F,2).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.bedrock)));
    //public static ToolMaterial BONE_BLOCK_SIDE = EnumHelper.addToolMaterial("slit:bone_block_material",                     1,64,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.BONE_BLOCK))); // F
    public static ToolMaterial BRICK = EnumHelper.addToolMaterial("slit:brick_material",                                    1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.brick_block)));
    public static ToolMaterial CACTUS_TOP = EnumHelper.addToolMaterial("slit:cactus_material",                              0,16,2.0F,3.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.cactus)));
    public static ToolMaterial CAKE_TOP = EnumHelper.addToolMaterial("slit:cake_material",                                  1,16,4.0F,2.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.cake)));
    //public static ToolMaterial CHORUS_FLOWER = EnumHelper.addToolMaterial("slit:chorus_material",                           1,32,3.0F,2.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.CHORUS_FLOWER)));
    public static ToolMaterial CLAY = EnumHelper.addToolMaterial("slit:clay_material",                                      1,16,2.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.clay)));
    public static ToolMaterial COAL_BLOCK = EnumHelper.addToolMaterial("slit:coal_material",                                1,256,5.0F,2.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.coal_block)));
    public static ToolMaterial COBBLESTONE_MOSSY = EnumHelper.addToolMaterial("slit:cobble_mossy_material",                 1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.mossy_cobblestone)));
    public static ToolMaterial DIRT = EnumHelper.addToolMaterial("slit:dirt_material",                                      1,6,1.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.dirt)));
    public static ToolMaterial EMERALD_BLOCK = EnumHelper.addToolMaterial("slit:emerald_block_material",                    1,6144,8.0F,6.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.emerald_block)));
    public static ToolMaterial END_STONE = EnumHelper.addToolMaterial("slit:end_stone_material",                            1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.end_stone)));
    public static ToolMaterial GLASS = EnumHelper.addToolMaterial("slit:glass_material",                                    1,1,3.0F,6.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.glass)));
    public static ToolMaterial GLOWSTONE = EnumHelper.addToolMaterial("slit:glowstone_material",                            1,48,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.glowstone)));
    public static ToolMaterial GRAVEL = EnumHelper.addToolMaterial("slit:gravel_material",                                  1,4,1.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.gravel)));
    public static ToolMaterial HARDENED_CLAY = EnumHelper.addToolMaterial("slit:hardened_clay_material",                    1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.hardened_clay)));
    public static ToolMaterial HAY_BLOCK_TOP = EnumHelper.addToolMaterial("slit:hay_material",                              1,16,2.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.hay_block)));
    public static ToolMaterial ICE = EnumHelper.addToolMaterial("slit:ice_material",                                        1,32,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.ice)));
    public static ToolMaterial LAPIS_BLOCK = EnumHelper.addToolMaterial("slit:lapis_block_material",                        1,256,5.0F,2.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.lapis_block)));
    //public static ToolMaterial MAGMA = EnumHelper.addToolMaterial("slit:magma_material",                                    1,128,5.0F,2.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.MAGMA)));
    public static ToolMaterial MELON_SIDE = EnumHelper.addToolMaterial("slit:melon_material",                               1,32,2.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.melon_block)));
    public static ToolMaterial MUSHROOM_BLOCK_SKIN_BROWN = EnumHelper.addToolMaterial("slit:mushroom_block_brown_material", 1,32,2.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.brown_mushroom_block)));
    public static ToolMaterial MUSHROOM_BLOCK_SKIN_RED = EnumHelper.addToolMaterial("slit:mushroom_block_red_material",     1,32,2.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.red_mushroom_block)));
    public static ToolMaterial NETHER_BRICK = EnumHelper.addToolMaterial("slit:nether_brick_material",                      1,160,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.nether_brick)));
    public static ToolMaterial NETHERRACK = EnumHelper.addToolMaterial("slit:netherrack_material",                          1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.netherrack)));
    public static ToolMaterial NOTEBLOCK = EnumHelper.addToolMaterial("slit:note_material",                                 1,64,2.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.noteblock)));
    public static ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("slit:obsidian_material",                              1,3072,6.0F,4.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.obsidian)));
    //public static ToolMaterial PRISMARINE_DARK = EnumHelper.addToolMaterial("slit:prismarine_dark_material",                1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.PRISMARINE)));
    //public static ToolMaterial PRISMARINE_ROUGH = EnumHelper.addToolMaterial("slit:prismarine_rough_material",              1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.PRISMARINE)));
    public static ToolMaterial PUMPKIN_SIDE = EnumHelper.addToolMaterial("slit:pumpkin_material",                           1,32,2.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.pumpkin)));
    //public static ToolMaterial PURPUR_BLOCK = EnumHelper.addToolMaterial("slit:purpur_material",                            1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.PURPUR_BLOCK)));
    public static ToolMaterial QUARTZ_BLOCK_TOP = EnumHelper.addToolMaterial("slit:quartz_block_material",                  1,256,4.0F,3.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.quartz_block)));
    //public static ToolMaterial RED_NETHER_BRICK = EnumHelper.addToolMaterial("slit:red_nether_brick_material",              1,160,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.RED_NETHER_BRICK)));
    public static ToolMaterial RED_SAND = EnumHelper.addToolMaterial("slit:red_sand_material",                              1,3,1.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.sand)));
    public static ToolMaterial REDSTONE_BLOCK = EnumHelper.addToolMaterial("slit:redstone_material",                        1,256,5.0F,2.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.redstone_block)));
    public static ToolMaterial SAND = EnumHelper.addToolMaterial("slit:sand_material",                                      1,3,1.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.sand)));
    //public static ToolMaterial SEA_LANTERN = EnumHelper.addToolMaterial("slit:sea_lantern_material",                        1,160,3.0F,2.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.SEA_LANTERN)));
    //public static ToolMaterial SLIME = EnumHelper.addToolMaterial("slit:slime_material",                                    1,64,2.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.SLIME_BLOCK)));
    public static ToolMaterial SNOW = EnumHelper.addToolMaterial("slit:snow_material",                                      1,8,1.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.snow)));
    public static ToolMaterial SOUL_SAND = EnumHelper.addToolMaterial("slit:soul_sand_material",                            1,16,2.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.soul_sand)));
    public static ToolMaterial SPONGE = EnumHelper.addToolMaterial("slit:sponge_material",                                  1,32,2.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.sponge)));
    public static ToolMaterial STONE = EnumHelper.addToolMaterial("slit:stone_material",                                    1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.stone)));
    public static ToolMaterial STONE_ANDESITE = EnumHelper.addToolMaterial("slit:andesite_material",                        1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.stone)));
    public static ToolMaterial STONE_DIORITE = EnumHelper.addToolMaterial("slit:diorite_material",                          1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.stone)));
    public static ToolMaterial STONE_GRANITE = EnumHelper.addToolMaterial("slit:granite_material",                          1,128,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.stone)));
    public static ToolMaterial TNT_BOTTOM = EnumHelper.addToolMaterial("slit:tnt_material",                                 1,16,3.0F,1.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.tnt)));
    public static ToolMaterial WOOL_COLORED_WHITE = EnumHelper.addToolMaterial("slit:wool_material",                        1,32,2.0F,0.0F,1).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.wool)));
}
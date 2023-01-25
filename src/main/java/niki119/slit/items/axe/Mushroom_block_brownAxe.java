package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class Mushroom_block_brownAxe extends ItemAxe {
 public Mushroom_block_brownAxe(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:mushroom_block_brown_axe");
  setTextureName("slit:mushroom_block_brown_axe");
  setCreativeTab(SLiT.creativeTabAxe );}@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }}
package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class SnowAxe extends ItemAxe {
 public SnowAxe(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:snow_axe");
  setTextureName("slit:snow_axe");
  setCreativeTab(SLiT.creativeTabAxe );}@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }}
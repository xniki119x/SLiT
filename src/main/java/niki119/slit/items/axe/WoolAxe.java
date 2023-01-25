package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class WoolAxe extends ItemAxe {
 public WoolAxe(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:wool_axe");
  setTextureName("slit:wool_axe");
  setCreativeTab(SLiT.creativeTabAxe );}@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }}
package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class BrickHoe extends ItemHoe {
 public BrickHoe(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:brick_hoe");
  setTextureName("slit:brick_hoe");
  setCreativeTab(SLiT.creativeTabHoe );}@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }}
package niki119.slit.items.axe;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import niki119.slit.SLiT;

public class AndesiteAxe extends AxeItem {
 public AndesiteAxe(){
  super(ItemTier.STONE,2,2,new Properties().tab(SLiT.creativeTabAxe));
  setUnlocalizedName("slit:andesite_axe");
  setTextureName("slit:andesite_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }

 @Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }
}
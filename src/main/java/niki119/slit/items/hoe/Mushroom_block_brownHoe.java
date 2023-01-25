package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class Mushroom_block_brownHoe extends ItemHoe {
 public Mushroom_block_brownHoe(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:mushroom_block_brown_hoe");
  setTextureName("slit:mushroom_block_brown_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
}
@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }
}
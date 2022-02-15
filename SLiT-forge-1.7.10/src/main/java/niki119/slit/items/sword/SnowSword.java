package niki119.slit.items.sword;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class SnowSword extends ItemSword {
 public SnowSword(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:snow_sword");
  setTextureName("slit:snow_sword");
  setCreativeTab(SLiT.creativeTabSword);
}
@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }
}
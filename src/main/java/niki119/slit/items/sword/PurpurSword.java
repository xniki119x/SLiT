package niki119.slit.items.sword;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class PurpurSword extends ItemSword {
 public PurpurSword(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:purpur_sword");
  setTextureName("slit:purpur_sword");
  setCreativeTab(SLiT.creativeTabSword);
}
@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }
}
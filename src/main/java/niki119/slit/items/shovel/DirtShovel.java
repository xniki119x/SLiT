package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class DirtShovel extends ItemSpade {
 public DirtShovel(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:dirt_shovel");
  setTextureName("slit:dirt_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
}
@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }
}
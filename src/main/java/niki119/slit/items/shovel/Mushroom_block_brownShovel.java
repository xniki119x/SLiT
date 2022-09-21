package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class Mushroom_block_brownShovel extends ItemSpade {
 public Mushroom_block_brownShovel(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:mushroom_block_brown_shovel");
  setTextureName("slit:mushroom_block_brown_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
}
@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }
}
package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class Mushroom_block_brownPickaxe extends ItemPickaxe {
 public Mushroom_block_brownPickaxe(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:mushroom_block_brown_pickaxe");
  setTextureName("slit:mushroom_block_brown_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
}
@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }
}
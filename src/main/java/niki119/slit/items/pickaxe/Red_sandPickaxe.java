package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class Red_sandPickaxe extends ItemPickaxe {
 public Red_sandPickaxe(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:red_sand_pickaxe");
  setTextureName("slit:red_sand_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
}
@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }
}
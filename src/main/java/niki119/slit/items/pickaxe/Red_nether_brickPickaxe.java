package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class Red_nether_brickPickaxe extends ItemPickaxe {
 public Red_nether_brickPickaxe(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:red_nether_brick_pickaxe");
  setTextureName("slit:red_nether_brick_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
}
@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }
}
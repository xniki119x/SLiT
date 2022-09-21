package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import niki119.slit.SLiT;

public class NotePickaxe extends ItemPickaxe {
 public NotePickaxe(ToolMaterial material){
  super(material);
  setUnlocalizedName("slit:note_pickaxe");
  setTextureName("slit:note_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
}
@Override
 public String getItemStackDisplayName(ItemStack stack) {
  String s = this.getUnlocalizedName(stack);
  s = s == null ? "" : StatCollector.translateToLocal(s);
  return ("" + StatCollector.translateToLocal(s.replace("slit:","") + ".name")).trim();
 }
}
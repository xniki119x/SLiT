package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class SlimePickaxe extends ItemPickaxe {
 public SlimePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("slime_pickaxe");
  setTranslationKey("slime_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
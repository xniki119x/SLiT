package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class ClayPickaxe extends ItemPickaxe {
 public ClayPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("clay_pickaxe");
  setTranslationKey("clay_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
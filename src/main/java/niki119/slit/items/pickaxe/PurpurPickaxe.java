package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class PurpurPickaxe extends ItemPickaxe {
 public PurpurPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("purpur_pickaxe");
  setTranslationKey("purpur_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
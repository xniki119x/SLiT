package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Soul_sandPickaxe extends ItemPickaxe {
 public Soul_sandPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("soul_sand_pickaxe");
  setTranslationKey("soul_sand_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
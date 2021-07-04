package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class End_stonePickaxe extends ItemPickaxe {
 public End_stonePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("end_stone_pickaxe");
  setTranslationKey("end_stone_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
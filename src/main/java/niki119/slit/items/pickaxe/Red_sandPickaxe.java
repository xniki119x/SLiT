package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Red_sandPickaxe extends ItemPickaxe {
 public Red_sandPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("red_sand_pickaxe");
  setTranslationKey("red_sand_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
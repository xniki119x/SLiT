package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class DirtPickaxe extends ItemPickaxe {
 public DirtPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("dirt_pickaxe");
  setTranslationKey("dirt_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
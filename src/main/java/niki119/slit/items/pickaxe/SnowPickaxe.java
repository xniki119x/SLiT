package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class SnowPickaxe extends ItemPickaxe {
 public SnowPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("snow_pickaxe");
  setTranslationKey("snow_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
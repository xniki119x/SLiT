package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class PumpkinPickaxe extends ItemPickaxe {
 public PumpkinPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("pumpkin_pickaxe");
  setTranslationKey("pumpkin_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
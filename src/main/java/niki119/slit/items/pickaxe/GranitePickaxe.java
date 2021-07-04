package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class GranitePickaxe extends ItemPickaxe {
 public GranitePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("granite_pickaxe");
  setTranslationKey("granite_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
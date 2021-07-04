package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class IcePickaxe extends ItemPickaxe {
 public IcePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("ice_pickaxe");
  setTranslationKey("ice_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class GravelPickaxe extends ItemPickaxe {
 public GravelPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("gravel_pickaxe");
  setTranslationKey("gravel_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
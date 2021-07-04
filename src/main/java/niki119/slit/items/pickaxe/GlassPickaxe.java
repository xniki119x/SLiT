package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class GlassPickaxe extends ItemPickaxe {
 public GlassPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("glass_pickaxe");
  setTranslationKey("glass_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
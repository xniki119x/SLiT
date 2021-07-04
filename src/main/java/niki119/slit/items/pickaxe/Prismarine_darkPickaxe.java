package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Prismarine_darkPickaxe extends ItemPickaxe {
 public Prismarine_darkPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("prismarine_dark_pickaxe");
  setTranslationKey("prismarine_dark_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Prismarine_roughPickaxe extends ItemPickaxe {
 public Prismarine_roughPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("prismarine_rough_pickaxe");
  setTranslationKey("prismarine_rough_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
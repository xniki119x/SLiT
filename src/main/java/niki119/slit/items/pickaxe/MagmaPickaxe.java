package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class MagmaPickaxe extends ItemPickaxe {
 public MagmaPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("magma_pickaxe");
  setTranslationKey("magma_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
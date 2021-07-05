package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class CoalPickaxe extends ItemPickaxe {
 public CoalPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("coal_pickaxe");
  setTranslationKey("coal_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
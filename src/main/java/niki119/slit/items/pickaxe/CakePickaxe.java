package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class CakePickaxe extends ItemPickaxe {
 public CakePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("cake_pickaxe");
  setTranslationKey("cake_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
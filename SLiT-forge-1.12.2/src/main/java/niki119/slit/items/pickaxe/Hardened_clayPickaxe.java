package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Hardened_clayPickaxe extends ItemPickaxe {
 public Hardened_clayPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("hardened_clay_pickaxe");
  setTranslationKey("hardened_clay_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
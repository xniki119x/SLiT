package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class AndesitePickaxe extends ItemPickaxe {
 public AndesitePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("andesite_pickaxe");
  setTranslationKey("andesite_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
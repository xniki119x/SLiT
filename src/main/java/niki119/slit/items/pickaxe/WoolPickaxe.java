package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class WoolPickaxe extends ItemPickaxe {
 public WoolPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("wool_pickaxe");
  setTranslationKey("wool_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
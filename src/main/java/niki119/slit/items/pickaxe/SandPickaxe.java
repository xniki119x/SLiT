package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class SandPickaxe extends ItemPickaxe {
 public SandPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("sand_pickaxe");
  setTranslationKey("sand_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
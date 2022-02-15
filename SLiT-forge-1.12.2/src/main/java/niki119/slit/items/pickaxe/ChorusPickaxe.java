package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class ChorusPickaxe extends ItemPickaxe {
 public ChorusPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("chorus_pickaxe");
  setTranslationKey("chorus_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
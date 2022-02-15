package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class HayPickaxe extends ItemPickaxe {
 public HayPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("hay_pickaxe");
  setTranslationKey("hay_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
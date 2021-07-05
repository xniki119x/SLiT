package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class StonePickaxe extends ItemPickaxe {
 public StonePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("stone_pickaxe");
  setTranslationKey("stone_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
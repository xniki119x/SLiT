package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Sea_lanternPickaxe extends ItemPickaxe {
 public Sea_lanternPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("sea_lantern_pickaxe");
  setTranslationKey("sea_lantern_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
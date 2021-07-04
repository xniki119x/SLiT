package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class TntPickaxe extends ItemPickaxe {
 public TntPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("tnt_pickaxe");
  setTranslationKey("tnt_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
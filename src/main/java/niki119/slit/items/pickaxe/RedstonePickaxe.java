package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class RedstonePickaxe extends ItemPickaxe {
 public RedstonePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("redstone_pickaxe");
  setTranslationKey("redstone_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
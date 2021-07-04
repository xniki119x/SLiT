package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class BrickPickaxe extends ItemPickaxe {
 public BrickPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("brick_pickaxe");
  setTranslationKey("brick_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
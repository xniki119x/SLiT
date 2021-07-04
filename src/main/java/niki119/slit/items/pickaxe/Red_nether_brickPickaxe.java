package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Red_nether_brickPickaxe extends ItemPickaxe {
 public Red_nether_brickPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("red_nether_brick_pickaxe");
  setTranslationKey("red_nether_brick_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
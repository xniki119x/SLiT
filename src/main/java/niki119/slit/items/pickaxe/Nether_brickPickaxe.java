package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Nether_brickPickaxe extends ItemPickaxe {
 public Nether_brickPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("nether_brick_pickaxe");
  setTranslationKey("nether_brick_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
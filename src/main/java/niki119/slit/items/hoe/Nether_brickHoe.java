package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Nether_brickHoe extends ItemHoe {
 public Nether_brickHoe(ToolMaterial material){
  super(material);
  setRegistryName("nether_brick_hoe");
  setTranslationKey("nether_brick_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}
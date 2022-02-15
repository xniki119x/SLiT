package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Red_nether_brickHoe extends ItemHoe {
 public Red_nether_brickHoe(ToolMaterial material){
  super(material);
  setRegistryName("red_nether_brick_hoe");
  setTranslationKey("red_nether_brick_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}
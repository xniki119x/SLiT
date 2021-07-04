package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class BrickHoe extends ItemHoe {
 public BrickHoe(ToolMaterial material){
  super(material);
  setRegistryName("brick_hoe");
  setTranslationKey("brick_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}
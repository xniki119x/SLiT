package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class RedstoneHoe extends ItemHoe {
 public RedstoneHoe(ToolMaterial material){
  super(material);
  setRegistryName("redstone_hoe");
  setTranslationKey("redstone_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}
package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class BeaconHoe extends ItemHoe {
 public BeaconHoe(ToolMaterial material){
  super(material);
  setRegistryName("beacon_hoe");
  setTranslationKey("beacon_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}
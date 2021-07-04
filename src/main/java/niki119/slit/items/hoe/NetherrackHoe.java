package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class NetherrackHoe extends ItemHoe {
 public NetherrackHoe(ToolMaterial material){
  super(material);
  setRegistryName("netherrack_hoe");
  setTranslationKey("netherrack_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}
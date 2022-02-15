package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class IceHoe extends ItemHoe {
 public IceHoe(ToolMaterial material){
  super(material);
  setRegistryName("ice_hoe");
  setTranslationKey("ice_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}
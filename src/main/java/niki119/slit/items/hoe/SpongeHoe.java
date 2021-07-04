package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class SpongeHoe extends ItemHoe {
 public SpongeHoe(ToolMaterial material){
  super(material);
  setRegistryName("sponge_hoe");
  setTranslationKey("sponge_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}
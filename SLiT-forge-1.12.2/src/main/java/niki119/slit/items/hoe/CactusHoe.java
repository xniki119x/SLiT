package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class CactusHoe extends ItemHoe {
 public CactusHoe(ToolMaterial material){
  super(material);
  setRegistryName("cactus_hoe");
  setTranslationKey("cactus_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}
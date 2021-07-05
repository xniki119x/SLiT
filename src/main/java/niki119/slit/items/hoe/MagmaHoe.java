package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class MagmaHoe extends ItemHoe {
 public MagmaHoe(ToolMaterial material){
  super(material);
  setRegistryName("magma_hoe");
  setTranslationKey("magma_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}
package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Prismarine_darkHoe extends ItemHoe {
 public Prismarine_darkHoe(ToolMaterial material){
  super(material);
  setRegistryName("prismarine_dark_hoe");
  setTranslationKey("prismarine_dark_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}
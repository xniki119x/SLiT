package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class Prismarine_roughHoe extends ItemHoe {
 public Prismarine_roughHoe(ToolMaterial material){
  super(material);
  setRegistryName("prismarine_rough_hoe");
  setTranslationKey("prismarine_rough_hoe");
  setCreativeTab(SLiT.creativeTab);
 }
}
package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class MelonHoe extends ItemHoe {
 public MelonHoe(ToolMaterial material){
  super(material);
  setRegistryName("melon_hoe");
  setTranslationKey("melon_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}
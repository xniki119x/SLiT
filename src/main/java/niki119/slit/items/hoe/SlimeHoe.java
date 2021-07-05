package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class SlimeHoe extends ItemHoe {
 public SlimeHoe(ToolMaterial material){
  super(material);
  setRegistryName("slime_hoe");
  setTranslationKey("slime_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}
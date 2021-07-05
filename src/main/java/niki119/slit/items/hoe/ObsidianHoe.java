package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class ObsidianHoe extends ItemHoe {
 public ObsidianHoe(ToolMaterial material){
  super(material);
  setRegistryName("obsidian_hoe");
  setTranslationKey("obsidian_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}
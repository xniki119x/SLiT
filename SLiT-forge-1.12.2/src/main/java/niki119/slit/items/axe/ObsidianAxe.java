package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class ObsidianAxe extends ItemAxe {
 public ObsidianAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("obsidian_axe");
  setTranslationKey("obsidian_axe");
  setCreativeTab(SLiT.creativeTabAxe);
 }
}
package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class ObsidianSword extends ItemSword {
 public ObsidianSword(ToolMaterial material){
  super(material);
  setRegistryName("obsidian_sword");
  setTranslationKey("obsidian_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}
package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class ObsidianShovel extends ItemSpade {
 public ObsidianShovel(ToolMaterial material){
  super(material);
  setRegistryName("obsidian_shovel");
  setTranslationKey("obsidian_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Emerald_blockShovel extends ItemSpade {
 public Emerald_blockShovel(ToolMaterial material){
  super(material);
  setRegistryName("emerald_block_shovel");
  setTranslationKey("emerald_block_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
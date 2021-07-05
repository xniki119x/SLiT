package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Lapis_blockShovel extends ItemSpade {
 public Lapis_blockShovel(ToolMaterial material){
  super(material);
  setRegistryName("lapis_block_shovel");
  setTranslationKey("lapis_block_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
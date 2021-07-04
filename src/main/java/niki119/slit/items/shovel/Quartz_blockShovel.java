package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Quartz_blockShovel extends ItemSpade {
 public Quartz_blockShovel(ToolMaterial material){
  super(material);
  setRegistryName("quartz_block_shovel");
  setTranslationKey("quartz_block_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
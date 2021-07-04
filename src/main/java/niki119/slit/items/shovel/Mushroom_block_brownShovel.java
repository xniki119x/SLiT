package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Mushroom_block_brownShovel extends ItemSpade {
 public Mushroom_block_brownShovel(ToolMaterial material){
  super(material);
  setRegistryName("mushroom_block_brown_shovel");
  setTranslationKey("mushroom_block_brown_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
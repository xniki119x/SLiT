package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Mushroom_block_redShovel extends ItemSpade {
 public Mushroom_block_redShovel(ToolMaterial material){
  super(material);
  setRegistryName("mushroom_block_red_shovel");
  setTranslationKey("mushroom_block_red_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
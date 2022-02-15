package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Red_nether_brickShovel extends ItemSpade {
 public Red_nether_brickShovel(ToolMaterial material){
  super(material);
  setRegistryName("red_nether_brick_shovel");
  setTranslationKey("red_nether_brick_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
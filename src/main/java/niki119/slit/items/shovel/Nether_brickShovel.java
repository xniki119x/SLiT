package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Nether_brickShovel extends ItemSpade {
 public Nether_brickShovel(ToolMaterial material){
  super(material);
  setRegistryName("nether_brick_shovel");
  setTranslationKey("nether_brick_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class BrickShovel extends ItemSpade {
 public BrickShovel(ToolMaterial material){
  super(material);
  setRegistryName("brick_shovel");
  setTranslationKey("brick_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
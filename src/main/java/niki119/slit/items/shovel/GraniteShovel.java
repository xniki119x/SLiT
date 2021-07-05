package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class GraniteShovel extends ItemSpade {
 public GraniteShovel(ToolMaterial material){
  super(material);
  setRegistryName("granite_shovel");
  setTranslationKey("granite_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
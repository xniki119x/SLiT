package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class AndesiteShovel extends ItemSpade {
 public AndesiteShovel(ToolMaterial material){
  super(material);
  setRegistryName("andesite_shovel");
  setTranslationKey("andesite_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
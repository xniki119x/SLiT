package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class CoalShovel extends ItemSpade {
 public CoalShovel(ToolMaterial material){
  super(material);
  setRegistryName("coal_shovel");
  setTranslationKey("coal_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
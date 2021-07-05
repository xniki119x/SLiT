package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class GravelShovel extends ItemSpade {
 public GravelShovel(ToolMaterial material){
  super(material);
  setRegistryName("gravel_shovel");
  setTranslationKey("gravel_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
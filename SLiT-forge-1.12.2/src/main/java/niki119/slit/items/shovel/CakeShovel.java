package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class CakeShovel extends ItemSpade {
 public CakeShovel(ToolMaterial material){
  super(material);
  setRegistryName("cake_shovel");
  setTranslationKey("cake_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
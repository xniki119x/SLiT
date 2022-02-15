package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class GlowstoneShovel extends ItemSpade {
 public GlowstoneShovel(ToolMaterial material){
  super(material);
  setRegistryName("glowstone_shovel");
  setTranslationKey("glowstone_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
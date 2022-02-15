package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class GlassShovel extends ItemSpade {
 public GlassShovel(ToolMaterial material){
  super(material);
  setRegistryName("glass_shovel");
  setTranslationKey("glass_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
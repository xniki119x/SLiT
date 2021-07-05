package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class CactusShovel extends ItemSpade {
 public CactusShovel(ToolMaterial material){
  super(material);
  setRegistryName("cactus_shovel");
  setTranslationKey("cactus_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
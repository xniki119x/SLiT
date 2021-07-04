package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class SnowShovel extends ItemSpade {
 public SnowShovel(ToolMaterial material){
  super(material);
  setRegistryName("snow_shovel");
  setTranslationKey("snow_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
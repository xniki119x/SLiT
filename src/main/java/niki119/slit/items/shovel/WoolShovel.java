package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class WoolShovel extends ItemSpade {
 public WoolShovel(ToolMaterial material){
  super(material);
  setRegistryName("wool_shovel");
  setTranslationKey("wool_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
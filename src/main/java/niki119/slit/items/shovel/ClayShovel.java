package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class ClayShovel extends ItemSpade {
 public ClayShovel(ToolMaterial material){
  super(material);
  setRegistryName("clay_shovel");
  setTranslationKey("clay_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
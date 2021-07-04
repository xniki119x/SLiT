package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class MagmaShovel extends ItemSpade {
 public MagmaShovel(ToolMaterial material){
  super(material);
  setRegistryName("magma_shovel");
  setTranslationKey("magma_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
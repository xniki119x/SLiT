package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Cobble_mossyShovel extends ItemSpade {
 public Cobble_mossyShovel(ToolMaterial material){
  super(material);
  setRegistryName("cobble_mossy_shovel");
  setTranslationKey("cobble_mossy_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
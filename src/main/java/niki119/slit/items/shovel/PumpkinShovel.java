package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class PumpkinShovel extends ItemSpade {
 public PumpkinShovel(ToolMaterial material){
  super(material);
  setRegistryName("pumpkin_shovel");
  setTranslationKey("pumpkin_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
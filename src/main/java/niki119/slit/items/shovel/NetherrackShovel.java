package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class NetherrackShovel extends ItemSpade {
 public NetherrackShovel(ToolMaterial material){
  super(material);
  setRegistryName("netherrack_shovel");
  setTranslationKey("netherrack_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
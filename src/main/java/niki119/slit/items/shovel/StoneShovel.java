package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class StoneShovel extends ItemSpade {
 public StoneShovel(ToolMaterial material){
  super(material);
  setRegistryName("stone_shovel");
  setTranslationKey("stone_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
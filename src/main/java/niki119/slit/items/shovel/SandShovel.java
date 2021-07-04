package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class SandShovel extends ItemSpade {
 public SandShovel(ToolMaterial material){
  super(material);
  setRegistryName("sand_shovel");
  setTranslationKey("sand_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
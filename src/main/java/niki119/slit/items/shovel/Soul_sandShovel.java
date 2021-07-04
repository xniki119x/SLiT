package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Soul_sandShovel extends ItemSpade {
 public Soul_sandShovel(ToolMaterial material){
  super(material);
  setRegistryName("soul_sand_shovel");
  setTranslationKey("soul_sand_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
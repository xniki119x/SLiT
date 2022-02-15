package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Red_sandShovel extends ItemSpade {
 public Red_sandShovel(ToolMaterial material){
  super(material);
  setRegistryName("red_sand_shovel");
  setTranslationKey("red_sand_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
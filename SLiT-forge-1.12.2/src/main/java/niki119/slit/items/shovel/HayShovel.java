package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class HayShovel extends ItemSpade {
 public HayShovel(ToolMaterial material){
  super(material);
  setRegistryName("hay_shovel");
  setTranslationKey("hay_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
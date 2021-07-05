package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Sea_lanternShovel extends ItemSpade {
 public Sea_lanternShovel(ToolMaterial material){
  super(material);
  setRegistryName("sea_lantern_shovel");
  setTranslationKey("sea_lantern_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
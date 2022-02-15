package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class ChorusShovel extends ItemSpade {
 public ChorusShovel(ToolMaterial material){
  super(material);
  setRegistryName("chorus_shovel");
  setTranslationKey("chorus_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
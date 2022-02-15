package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class DioriteShovel extends ItemSpade {
 public DioriteShovel(ToolMaterial material){
  super(material);
  setRegistryName("diorite_shovel");
  setTranslationKey("diorite_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
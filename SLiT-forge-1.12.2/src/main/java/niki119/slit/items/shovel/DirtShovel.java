package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class DirtShovel extends ItemSpade {
 public DirtShovel(ToolMaterial material){
  super(material);
  setRegistryName("dirt_shovel");
  setTranslationKey("dirt_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
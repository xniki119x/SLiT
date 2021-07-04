package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Prismarine_darkShovel extends ItemSpade {
 public Prismarine_darkShovel(ToolMaterial material){
  super(material);
  setRegistryName("prismarine_dark_shovel");
  setTranslationKey("prismarine_dark_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
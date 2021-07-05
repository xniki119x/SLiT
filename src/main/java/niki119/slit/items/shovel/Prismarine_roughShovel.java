package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class Prismarine_roughShovel extends ItemSpade {
 public Prismarine_roughShovel(ToolMaterial material){
  super(material);
  setRegistryName("prismarine_rough_shovel");
  setTranslationKey("prismarine_rough_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class MelonShovel extends ItemSpade {
 public MelonShovel(ToolMaterial material){
  super(material);
  setRegistryName("melon_shovel");
  setTranslationKey("melon_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class End_stoneShovel extends ItemSpade {
 public End_stoneShovel(ToolMaterial material){
  super(material);
  setRegistryName("end_stone_shovel");
  setTranslationKey("end_stone_shovel");
  setCreativeTab(SLiT.creativeTabShovel);
 }
}
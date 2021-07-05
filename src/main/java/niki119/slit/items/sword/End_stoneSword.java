package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class End_stoneSword extends ItemSword {
 public End_stoneSword(ToolMaterial material){
  super(material);
  setRegistryName("end_stone_sword");
  setTranslationKey("end_stone_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}
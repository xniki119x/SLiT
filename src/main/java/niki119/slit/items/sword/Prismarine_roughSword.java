package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class Prismarine_roughSword extends ItemSword {
 public Prismarine_roughSword(ToolMaterial material){
  super(material);
  setRegistryName("prismarine_rough_sword");
  setTranslationKey("prismarine_rough_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}
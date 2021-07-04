package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class SpongeSword extends ItemSword {
 public SpongeSword(ToolMaterial material){
  super(material);
  setRegistryName("sponge_sword");
  setTranslationKey("sponge_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}
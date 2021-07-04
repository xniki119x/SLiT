package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class NetherrackSword extends ItemSword {
 public NetherrackSword(ToolMaterial material){
  super(material);
  setRegistryName("netherrack_sword");
  setTranslationKey("netherrack_sword");
  setCreativeTab(SLiT.creativeTab);
 }
}
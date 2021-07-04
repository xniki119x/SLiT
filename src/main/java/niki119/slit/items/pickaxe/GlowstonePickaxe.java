package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class GlowstonePickaxe extends ItemPickaxe {
 public GlowstonePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("glowstone_pickaxe");
  setTranslationKey("glowstone_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
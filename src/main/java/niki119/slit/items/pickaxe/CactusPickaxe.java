package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class CactusPickaxe extends ItemPickaxe {
 public CactusPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("cactus_pickaxe");
  setTranslationKey("cactus_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
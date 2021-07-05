package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Emerald_blockPickaxe extends ItemPickaxe {
 public Emerald_blockPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("emerald_block_pickaxe");
  setTranslationKey("emerald_block_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }
}
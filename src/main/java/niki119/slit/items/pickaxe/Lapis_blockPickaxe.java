package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class Lapis_blockPickaxe extends ItemPickaxe {
 public Lapis_blockPickaxe(ToolMaterial material){
  super(material);
  setRegistryName("lapis_block_pickaxe");
  setTranslationKey("lapis_block_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
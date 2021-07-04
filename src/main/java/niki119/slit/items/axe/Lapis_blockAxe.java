package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class Lapis_blockAxe extends ItemAxe {
 public Lapis_blockAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("lapis_block_axe");
  setTranslationKey("lapis_block_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}
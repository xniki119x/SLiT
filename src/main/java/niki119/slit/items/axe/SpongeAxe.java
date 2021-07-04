package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class SpongeAxe extends ItemAxe {
 public SpongeAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("sponge_axe");
  setTranslationKey("sponge_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}
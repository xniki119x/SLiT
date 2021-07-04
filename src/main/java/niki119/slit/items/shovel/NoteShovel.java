package niki119.slit.items.shovel;

import net.minecraft.item.ItemSpade;
import niki119.slit.SLiT;

public class NoteShovel extends ItemSpade {
 public NoteShovel(ToolMaterial material){
  super(material);
  setRegistryName("note_shovel");
  setTranslationKey("note_shovel");
  setCreativeTab(SLiT.creativeTab);
 }
}
package niki119.slit.items.hoe;

import net.minecraft.item.ItemHoe;
import niki119.slit.SLiT;

public class NoteHoe extends ItemHoe {
 public NoteHoe(ToolMaterial material){
  super(material);
  setRegistryName("note_hoe");
  setTranslationKey("note_hoe");
  setCreativeTab(SLiT.creativeTabHoe);
 }
}
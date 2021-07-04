package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class NoteAxe extends ItemAxe {
 public NoteAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("note_axe");
  setTranslationKey("note_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}
package niki119.slit.items.pickaxe;

import net.minecraft.item.ItemPickaxe;
import niki119.slit.SLiT;

public class NotePickaxe extends ItemPickaxe {
 public NotePickaxe(ToolMaterial material){
  super(material);
  setRegistryName("note_pickaxe");
  setTranslationKey("note_pickaxe");
  setCreativeTab(SLiT.creativeTab);
 }
}
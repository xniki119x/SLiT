package niki119.slit.items.sword;

import net.minecraft.item.ItemSword;
import niki119.slit.SLiT;

public class NoteSword extends ItemSword {
 public NoteSword(ToolMaterial material){
  super(material);
  setRegistryName("note_sword");
  setTranslationKey("note_sword");
  setCreativeTab(SLiT.creativeTabSword);
 }
}
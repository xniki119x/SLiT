package niki119.slit.items.axe;

import net.minecraft.item.ItemAxe;
import niki119.slit.SLiT;

public class BedrockAxe extends ItemAxe {
 public BedrockAxe(ToolMaterial material){
  super(material,1,1);
  setRegistryName("bedrock_axe");
  setTranslationKey("bedrock_axe");
  setCreativeTab(SLiT.creativeTab);
 }
}
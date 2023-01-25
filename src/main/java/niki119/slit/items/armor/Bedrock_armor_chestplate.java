package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Bedrock_armor_chestplate extends ItemArmor {
    public Bedrock_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:bedrock_armor_chestplate");
        setTextureName("slit:armor/bedrock_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Bedrock_armor_helmet extends ItemArmor {
    public Bedrock_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:bedrock_armor_helmet");
        setTextureName("slit:armor/bedrock_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

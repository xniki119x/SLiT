package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Glass_armor_helmet extends ItemArmor {
    public Glass_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:glass_armor_helmet");
        setTextureName("slit:armor/glass_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

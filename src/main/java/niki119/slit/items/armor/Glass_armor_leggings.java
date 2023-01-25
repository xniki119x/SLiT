package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Glass_armor_leggings extends ItemArmor {
    public Glass_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:glass_armor_leggings");
        setTextureName("slit:armor/glass_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

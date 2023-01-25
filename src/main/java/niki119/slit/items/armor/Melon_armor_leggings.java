package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Melon_armor_leggings extends ItemArmor {
    public Melon_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:melon_armor_leggings");
        setTextureName("slit:armor/melon_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

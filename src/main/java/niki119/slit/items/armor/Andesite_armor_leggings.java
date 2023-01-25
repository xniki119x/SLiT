package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Andesite_armor_leggings extends ItemArmor {
    public Andesite_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:andesite_armor_leggings");
        setTextureName("slit:armor/andesite_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

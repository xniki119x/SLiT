package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Granite_armor_leggings extends ItemArmor {
    public Granite_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:granite_armor_leggings");
        setTextureName("slit:armor/granite_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

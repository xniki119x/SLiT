package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Hay_armor_leggings extends ItemArmor {
    public Hay_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:hay_armor_leggings");
        setTextureName("slit:armor/hay_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

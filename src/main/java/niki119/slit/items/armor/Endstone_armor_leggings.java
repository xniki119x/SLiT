package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Endstone_armor_leggings extends ItemArmor {
    public Endstone_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:endstone_armor_leggings");
        setTextureName("slit:armor/endstone_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sand_armor_leggings extends ItemArmor {
    public Sand_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:sand_armor_leggings");
        setTextureName("slit:armor/sand_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Slime_armor_leggings extends ItemArmor {
    public Slime_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:slime_armor_leggings");
        setTextureName("slit:armor/slime_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

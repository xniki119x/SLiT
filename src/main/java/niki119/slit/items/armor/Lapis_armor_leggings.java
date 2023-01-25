package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Lapis_armor_leggings extends ItemArmor {
    public Lapis_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:lapis_armor_leggings");
        setTextureName("slit:armor/lapis_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

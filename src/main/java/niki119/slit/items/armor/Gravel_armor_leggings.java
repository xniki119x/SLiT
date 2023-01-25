package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Gravel_armor_leggings extends ItemArmor {
    public Gravel_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:gravel_armor_leggings");
        setTextureName("slit:armor/gravel_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

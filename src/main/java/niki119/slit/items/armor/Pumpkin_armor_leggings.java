package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Pumpkin_armor_leggings extends ItemArmor {
    public Pumpkin_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:pumpkin_armor_leggings");
        setTextureName("slit:armor/pumpkin_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

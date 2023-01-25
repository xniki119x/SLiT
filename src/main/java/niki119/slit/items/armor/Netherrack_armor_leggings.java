package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Netherrack_armor_leggings extends ItemArmor {
    public Netherrack_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:netherrack_armor_leggings");
        setTextureName("slit:armor/netherrack_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Wool_armor_leggings extends ItemArmor {
    public Wool_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:wool_armor_leggings");
        setTextureName("slit:armor/wool_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

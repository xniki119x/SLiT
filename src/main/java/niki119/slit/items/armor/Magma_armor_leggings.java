package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Magma_armor_leggings extends ItemArmor {
    public Magma_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:magma_armor_leggings");
        setTextureName("slit:armor/magma_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Magma_armor_helmet extends ItemArmor {
    public Magma_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:magma_armor_helmet");
        setTextureName("slit:armor/magma_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

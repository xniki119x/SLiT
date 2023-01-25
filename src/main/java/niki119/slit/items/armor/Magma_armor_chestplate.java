package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Magma_armor_chestplate extends ItemArmor {
    public Magma_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:magma_armor_chestplate");
        setTextureName("slit:armor/magma_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

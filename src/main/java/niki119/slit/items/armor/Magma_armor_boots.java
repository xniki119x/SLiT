package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Magma_armor_boots extends ItemArmor {
    public Magma_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:magma_armor_boots");
        setTextureName("slit:armor/magma_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

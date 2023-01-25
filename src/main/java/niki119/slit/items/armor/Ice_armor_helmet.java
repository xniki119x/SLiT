package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Ice_armor_helmet extends ItemArmor {
    public Ice_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:ice_armor_helmet");
        setTextureName("slit:armor/ice_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

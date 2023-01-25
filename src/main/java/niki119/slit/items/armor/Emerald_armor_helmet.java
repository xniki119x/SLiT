package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Emerald_armor_helmet extends ItemArmor {
    public Emerald_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:emerald_armor_helmet");
        setTextureName("slit:armor/emerald_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

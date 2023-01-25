package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Melon_armor_helmet extends ItemArmor {
    public Melon_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:melon_armor_helmet");
        setTextureName("slit:armor/melon_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

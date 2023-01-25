package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Tnt_armor_helmet extends ItemArmor {
    public Tnt_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:tnt_armor_helmet");
        setTextureName("slit:armor/tnt_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

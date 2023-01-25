package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Snow_armor_helmet extends ItemArmor {
    public Snow_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:snow_armor_helmet");
        setTextureName("slit:armor/snow_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

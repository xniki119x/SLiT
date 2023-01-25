package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Snow_armor_boots extends ItemArmor {
    public Snow_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:snow_armor_boots");
        setTextureName("slit:armor/snow_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Snow_armor_chestplate extends ItemArmor {
    public Snow_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:snow_armor_chestplate");
        setTextureName("slit:armor/snow_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

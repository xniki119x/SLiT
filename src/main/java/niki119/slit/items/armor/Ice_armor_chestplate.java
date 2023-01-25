package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Ice_armor_chestplate extends ItemArmor {
    public Ice_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:ice_armor_chestplate");
        setTextureName("slit:armor/ice_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

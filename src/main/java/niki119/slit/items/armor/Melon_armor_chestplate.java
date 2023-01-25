package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Melon_armor_chestplate extends ItemArmor {
    public Melon_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:melon_armor_chestplate");
        setTextureName("slit:armor/melon_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

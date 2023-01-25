package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Tnt_armor_chestplate extends ItemArmor {
    public Tnt_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:tnt_armor_chestplate");
        setTextureName("slit:armor/tnt_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

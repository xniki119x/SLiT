package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Granite_armor_chestplate extends ItemArmor {
    public Granite_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:granite_armor_chestplate");
        setTextureName("slit:armor/granite_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

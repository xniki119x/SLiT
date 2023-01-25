package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Andesite_armor_chestplate extends ItemArmor {
    public Andesite_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:andesite_armor_chestplate");
        setTextureName("slit:armor/andesite_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Hay_armor_chestplate extends ItemArmor {
    public Hay_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:hay_armor_chestplate");
        setTextureName("slit:armor/hay_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

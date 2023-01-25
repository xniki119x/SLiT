package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Diorite_armor_chestplate extends ItemArmor {
    public Diorite_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:diorite_armor_chestplate");
        setTextureName("slit:armor/diorite_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

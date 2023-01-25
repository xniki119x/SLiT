package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Diorite_armor_helmet extends ItemArmor {
    public Diorite_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:diorite_armor_helmet");
        setTextureName("slit:armor/diorite_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

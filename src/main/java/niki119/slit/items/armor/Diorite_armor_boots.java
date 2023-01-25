package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Diorite_armor_boots extends ItemArmor {
    public Diorite_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:diorite_armor_boots");
        setTextureName("slit:armor/diorite_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Endstone_armor_helmet extends ItemArmor {
    public Endstone_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:endstone_armor_helmet");
        setTextureName("slit:armor/endstone_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

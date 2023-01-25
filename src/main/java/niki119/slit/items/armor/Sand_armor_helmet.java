package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sand_armor_helmet extends ItemArmor {
    public Sand_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:sand_armor_helmet");
        setTextureName("slit:armor/sand_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Clay_armor_leggings extends ItemArmor {
    public Clay_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:clay_armor_leggings");
        setTextureName("slit:armor/clay_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

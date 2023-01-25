package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sealantern_armor_leggings extends ItemArmor {
    public Sealantern_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:sealantern_armor_leggings");
        setTextureName("slit:armor/sealantern_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

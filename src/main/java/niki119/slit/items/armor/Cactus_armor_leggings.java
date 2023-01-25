package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Cactus_armor_leggings extends ItemArmor {
    public Cactus_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:cactus_armor_leggings");
        setTextureName("slit:armor/cactus_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

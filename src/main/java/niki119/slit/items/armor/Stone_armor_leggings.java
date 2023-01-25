package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Stone_armor_leggings extends ItemArmor {
    public Stone_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:stone_armor_leggings");
        setTextureName("slit:armor/stone_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Redsand_armor_leggings extends ItemArmor {
    public Redsand_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:redsand_armor_leggings");
        setTextureName("slit:armor/redsand_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

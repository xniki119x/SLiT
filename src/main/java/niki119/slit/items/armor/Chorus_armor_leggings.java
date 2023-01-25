package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Chorus_armor_leggings extends ItemArmor {
    public Chorus_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:chorus_armor_leggings");
        setTextureName("slit:armor/chorus_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

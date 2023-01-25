package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Chorus_armor_helmet extends ItemArmor {
    public Chorus_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:chorus_armor_helmet");
        setTextureName("slit:armor/chorus_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

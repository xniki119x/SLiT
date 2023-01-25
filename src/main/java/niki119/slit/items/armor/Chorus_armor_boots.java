package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Chorus_armor_boots extends ItemArmor {
    public Chorus_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:chorus_armor_boots");
        setTextureName("slit:armor/chorus_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

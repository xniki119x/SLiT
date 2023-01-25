package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Chorus_armor_chestplate extends ItemArmor {
    public Chorus_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:chorus_armor_chestplate");
        setTextureName("slit:armor/chorus_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

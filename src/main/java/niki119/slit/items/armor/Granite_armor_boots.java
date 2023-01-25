package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Granite_armor_boots extends ItemArmor {
    public Granite_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:granite_armor_boots");
        setTextureName("slit:armor/granite_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

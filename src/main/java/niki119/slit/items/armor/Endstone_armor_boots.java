package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Endstone_armor_boots extends ItemArmor {
    public Endstone_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:endstone_armor_boots");
        setTextureName("slit:armor/endstone_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

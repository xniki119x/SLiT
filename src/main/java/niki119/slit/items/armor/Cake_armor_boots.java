package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Cake_armor_boots extends ItemArmor {
    public Cake_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:cake_armor_boots");
        setTextureName("slit:armor/cake_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

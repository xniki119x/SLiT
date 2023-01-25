package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Hay_armor_boots extends ItemArmor {
    public Hay_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:hay_armor_boots");
        setTextureName("slit:armor/hay_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

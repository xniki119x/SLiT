package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Pumpkin_armor_boots extends ItemArmor {
    public Pumpkin_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:pumpkin_armor_boots");
        setTextureName("slit:armor/pumpkin_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

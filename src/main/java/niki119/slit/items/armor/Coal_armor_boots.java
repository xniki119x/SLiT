package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Coal_armor_boots extends ItemArmor {
    public Coal_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:coal_armor_boots");
        setTextureName("slit:armor/coal_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

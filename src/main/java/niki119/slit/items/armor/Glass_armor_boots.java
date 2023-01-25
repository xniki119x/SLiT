package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Glass_armor_boots extends ItemArmor {
    public Glass_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:glass_armor_boots");
        setTextureName("slit:armor/glass_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

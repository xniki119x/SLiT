package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Glowstone_armor_boots extends ItemArmor {
    public Glowstone_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:glowstone_armor_boots");
        setTextureName("slit:armor/glowstone_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

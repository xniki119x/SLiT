package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sponge_armor_boots extends ItemArmor {
    public Sponge_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:sponge_armor_boots");
        setTextureName("slit:armor/sponge_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

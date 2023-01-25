package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Gravel_armor_boots extends ItemArmor {
    public Gravel_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:gravel_armor_boots");
        setTextureName("slit:armor/gravel_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

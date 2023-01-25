package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Lapis_armor_boots extends ItemArmor {
    public Lapis_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:lapis_armor_boots");
        setTextureName("slit:armor/lapis_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Slime_armor_boots extends ItemArmor {
    public Slime_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:slime_armor_boots");
        setTextureName("slit:armor/slime_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

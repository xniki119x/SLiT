package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Netherrack_armor_boots extends ItemArmor {
    public Netherrack_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:netherrack_armor_boots");
        setTextureName("slit:armor/netherrack_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

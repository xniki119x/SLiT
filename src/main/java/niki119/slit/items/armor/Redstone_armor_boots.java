package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Redstone_armor_boots extends ItemArmor {
    public Redstone_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:redstone_armor_boots");
        setTextureName("slit:armor/redstone_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

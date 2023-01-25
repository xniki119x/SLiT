package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Redstone_armor_helmet extends ItemArmor {
    public Redstone_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:redstone_armor_helmet");
        setTextureName("slit:armor/redstone_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

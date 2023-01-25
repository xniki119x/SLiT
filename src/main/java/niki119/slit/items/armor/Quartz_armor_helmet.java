package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Quartz_armor_helmet extends ItemArmor {
    public Quartz_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:quartz_armor_helmet");
        setTextureName("slit:armor/quartz_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

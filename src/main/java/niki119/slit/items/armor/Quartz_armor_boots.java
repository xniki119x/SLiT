package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Quartz_armor_boots extends ItemArmor {
    public Quartz_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:quartz_armor_boots");
        setTextureName("slit:armor/quartz_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

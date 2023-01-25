package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Cactus_armor_boots extends ItemArmor {
    public Cactus_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:cactus_armor_boots");
        setTextureName("slit:armor/cactus_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

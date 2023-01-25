package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Sealantern_armor_boots extends ItemArmor {
    public Sealantern_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:sealantern_armor_boots");
        setTextureName("slit:armor/sealantern_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

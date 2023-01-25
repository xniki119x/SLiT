package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Redsand_armor_boots extends ItemArmor {
    public Redsand_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:redsand_armor_boots");
        setTextureName("slit:armor/redsand_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

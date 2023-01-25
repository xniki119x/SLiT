package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Stone_armor_boots extends ItemArmor {
    public Stone_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:stone_armor_boots");
        setTextureName("slit:armor/stone_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

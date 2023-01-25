package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Netherbrick_armor_boots extends ItemArmor {
    public Netherbrick_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:netherbrick_armor_boots");
        setTextureName("slit:armor/netherbrick_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

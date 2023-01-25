package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Dirt_armor_boots extends ItemArmor {
    public Dirt_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:dirt_armor_boots");
        setTextureName("slit:armor/dirt_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

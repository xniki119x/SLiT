package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Cobblestonemossy_armor_boots extends ItemArmor {
    public Cobblestonemossy_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:cobblestonemossy_armor_boots");
        setTextureName("slit:armor/cobblestonemossy_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}
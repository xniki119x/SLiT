package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Bone_armor_boots extends ItemArmor {
    public Bone_armor_boots() {
        super(ArmorMaterial.DIAMOND, 20, 3);
        setUnlocalizedName("slit:bone_armor_boots");
        setTextureName("slit:armor/bone_armor_boots");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

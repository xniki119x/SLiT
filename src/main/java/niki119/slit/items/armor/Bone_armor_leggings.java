package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Bone_armor_leggings extends ItemArmor {
    public Bone_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:bone_armor_leggings");
        setTextureName("slit:armor/bone_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

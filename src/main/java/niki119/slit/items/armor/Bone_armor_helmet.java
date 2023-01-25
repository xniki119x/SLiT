package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Bone_armor_helmet extends ItemArmor {
    public Bone_armor_helmet() {
        super(ArmorMaterial.DIAMOND, 20, 0);
        setUnlocalizedName("slit:bone_armor_helmet");
        setTextureName("slit:armor/bone_armor_helmet");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

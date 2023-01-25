package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Bone_armor_chestplate extends ItemArmor {
    public Bone_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:bone_armor_chestplate");
        setTextureName("slit:armor/bone_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

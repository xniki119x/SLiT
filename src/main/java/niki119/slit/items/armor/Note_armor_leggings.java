package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Note_armor_leggings extends ItemArmor {
    public Note_armor_leggings() {
        super(ArmorMaterial.DIAMOND, 20, 2);
        setUnlocalizedName("slit:note_armor_leggings");
        setTextureName("slit:armor/note_armor_leggings");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

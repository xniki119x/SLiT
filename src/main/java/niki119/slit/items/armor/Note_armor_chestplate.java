package niki119.slit.items.armor;
import net.minecraft.item.ItemArmor;
import niki119.slit.SLiT;
public class Note_armor_chestplate extends ItemArmor {
    public Note_armor_chestplate() {
        super(ArmorMaterial.DIAMOND, 20, 1);
        setUnlocalizedName("slit:note_armor_chestplate");
        setTextureName("slit:armor/note_armor_chestplate");
        setCreativeTab(SLiT.creativeTabArmor);
    }
}

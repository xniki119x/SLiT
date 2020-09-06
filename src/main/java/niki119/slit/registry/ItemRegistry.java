package niki119.slit.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import niki119.slit.items.CobblestonePickaxe;
import niki119.slit.items.DirtPickaxe;
import niki119.slit.items.GranitePickaxe;
import niki119.slit.items.StonePickaxe;

public class ItemRegistry {

    public static Item dirtPICKAXE = new DirtPickaxe();
    public static Item cobblestonePICKAXE = new CobblestonePickaxe();
    public static Item stonePICKAXE = new StonePickaxe();
    public static Item granitePICKAXE = new GranitePickaxe();

    public static void register() {
        setRegister(dirtPICKAXE);
        setRegister(cobblestonePICKAXE);
        setRegister(stonePICKAXE);
        setRegister(granitePICKAXE);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(dirtPICKAXE);
        setRender(cobblestonePICKAXE);
        setRender(stonePICKAXE);
        setRender(granitePICKAXE);
    }

    private static void setRegister(Item item)
    {
        ForgeRegistries.ITEMS.register(item);
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}

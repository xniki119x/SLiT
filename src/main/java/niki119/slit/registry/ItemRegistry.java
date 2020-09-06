package niki119.slit.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import niki119.slit.items.pickaxe.Pickaxes;

import java.util.Objects;

public class ItemRegistry {

    public static void register() {
        setRegister(Pickaxes.DIRT);
        setRegister(Pickaxes.COBBLESTONE);
        setRegister(Pickaxes.STONE);
        setRegister(Pickaxes.GRANITE);
        setRegister(Pickaxes.DIORITE);
        setRegister(Pickaxes.ANDESITE);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(Pickaxes.DIRT);
        setRender(Pickaxes.COBBLESTONE);
        setRender(Pickaxes.STONE);
        setRender(Pickaxes.GRANITE);
        setRender(Pickaxes.DIORITE);
        setRender(Pickaxes.ANDESITE);
    }

    private static void setRegister(Item item)
    {
        ForgeRegistries.ITEMS.register(item);
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}
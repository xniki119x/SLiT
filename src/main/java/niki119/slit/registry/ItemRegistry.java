package niki119.slit.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

import static niki119.slit.items.pickaxe.Pickaxes.*;

public class ItemRegistry {

    public static void register() {
        setRegister(BEACON);
        setRegister(BEDROCK);
        setRegister(BONE_BLOCK_SIDE);
        setRegister(BRICK);
        setRegister(CACTUS_SIDE);
        setRegister(CAKE_TOP);
        setRegister(CHORUS_FLOWER);
        setRegister(CLAY);
        setRegister(COAL_BLOCK);
        setRegister(COBBLESTONE_MOSSY);
        setRegister(DIRT);
        setRegister(EMERALD_BLOCK);
        setRegister(END_STONE);
        setRegister(GLASS);
        setRegister(GLOWSTONE);
        setRegister(GRAVEL);
        setRegister(HARDENED_CLAY);
        setRegister(HAY_BLOCK_TOP);
        setRegister(ICE);
        setRegister(LAPIS_BLOCK);
        setRegister(MAGMA);
        setRegister(MELON_SIDE);
        setRegister(MUSHROOM_BLOCK_SKIN_BROWN);
        setRegister(MUSHROOM_BLOCK_SKIN_RED);
        setRegister(NETHERRACK);
        setRegister(NETHER_BRICK);
        setRegister(NOTEBLOCK);
        setRegister(OBSIDIAN);
        setRegister(PRISMARINE_DARK);
        setRegister(PRISMARINE_ROUGH);
        setRegister(PUMPKIN_SIDE);
        setRegister(PURPUR_BLOCK);
        setRegister(QUARTZ_BLOCK_SIDE);
        setRegister(REDSTONE_BLOCK);
        setRegister(RED_NETHER_BRICK);
        setRegister(RED_SAND);
        setRegister(SAND);
        setRegister(SEA_LANTERN);
        setRegister(SLIME);
        setRegister(SNOW);
        setRegister(SOUL_SAND);
        setRegister(SPONGE);
        setRegister(STONE);
        setRegister(STONE_ANDESITE);
        setRegister(STONE_DIORITE);
        setRegister(STONE_GRANITE);
        setRegister(TNT_BOTTOM);
        setRegister(WOOL_COLORED_WHITE);

    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(BEACON);
        setRender(BEDROCK);
        setRender(BONE_BLOCK_SIDE);
        setRender(BRICK);
        setRender(CACTUS_SIDE);
        setRender(CAKE_TOP);
        setRender(CHORUS_FLOWER);
        setRender(CLAY);
        setRender(COAL_BLOCK);
        setRender(COBBLESTONE_MOSSY);
        setRender(DIRT);
        setRender(EMERALD_BLOCK);
        setRender(END_STONE);
        setRender(GLASS);
        setRender(GLOWSTONE);
        setRender(GRAVEL);
        setRender(HARDENED_CLAY);
        setRender(HAY_BLOCK_TOP);
        setRender(ICE);
        setRender(LAPIS_BLOCK);
        setRender(MAGMA);
        setRender(MELON_SIDE);
        setRender(MUSHROOM_BLOCK_SKIN_BROWN);
        setRender(MUSHROOM_BLOCK_SKIN_RED);
        setRender(NETHERRACK);
        setRender(NETHER_BRICK);
        setRender(NOTEBLOCK);
        setRender(OBSIDIAN);
        setRender(PRISMARINE_DARK);
        setRender(PRISMARINE_ROUGH);
        setRender(PUMPKIN_SIDE);
        setRender(PURPUR_BLOCK);
        setRender(QUARTZ_BLOCK_SIDE);
        setRender(REDSTONE_BLOCK);
        setRender(RED_NETHER_BRICK);
        setRender(RED_SAND);
        setRender(SAND);
        setRender(SEA_LANTERN);
        setRender(SLIME);
        setRender(SNOW);
        setRender(SOUL_SAND);
        setRender(SPONGE);
        setRender(STONE);
        setRender(STONE_ANDESITE);
        setRender(STONE_DIORITE);
        setRender(STONE_GRANITE);
        setRender(TNT_BOTTOM);
        setRender(WOOL_COLORED_WHITE);
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
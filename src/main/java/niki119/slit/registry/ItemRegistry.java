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
        setRegister(BONE_BLOCK);
        setRegister(BRICK);
        setRegister(CACTUS);
        setRegister(CAKE);
        setRegister(CHORUS);
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
        setRegister(HAY_BLOCK);
        setRegister(ICE);
        setRegister(LAPIS_BLOCK);
        setRegister(MAGMA);
        setRegister(MELON);
        setRegister(MUSHROOM_BLOCK_BROWN);
        setRegister(MUSHROOM_BLOCK_RED);
        setRegister(NETHERRACK);
        setRegister(NETHER_BRICK);
        setRegister(NOTEBLOCK);
        setRegister(OBSIDIAN);
        setRegister(PRISMARINE_DARK);
        setRegister(PRISMARINE_ROUGH);
        setRegister(PUMPKIN);
        setRegister(PURPUR_BLOCK);
        setRegister(QUARTZ_BLOCK);
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
        setRegister(TNT);
        setRegister(WOOL);

    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(BEACON);
        setRender(BEDROCK);
        setRender(BONE_BLOCK);
        setRender(BRICK);
        setRender(CACTUS);
        setRender(CAKE);
        setRender(CHORUS);
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
        setRender(HAY_BLOCK);
        setRender(ICE);
        setRender(LAPIS_BLOCK);
        setRender(MAGMA);
        setRender(MELON);
        setRender(MUSHROOM_BLOCK_BROWN);
        setRender(MUSHROOM_BLOCK_RED);
        setRender(NETHERRACK);
        setRender(NETHER_BRICK);
        setRender(NOTEBLOCK);
        setRender(OBSIDIAN);
        setRender(PRISMARINE_DARK);
        setRender(PRISMARINE_ROUGH);
        setRender(PUMPKIN);
        setRender(PURPUR_BLOCK);
        setRender(QUARTZ_BLOCK);
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
        setRender(TNT);
        setRender(WOOL);
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
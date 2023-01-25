package niki119.slit.items.pickaxe;


import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import niki119.slit.SLiT;
import niki119.slit.utils.Config;

public class TntPickaxe extends ItemPickaxe {
 public TntPickaxe(ToolMaterial material) {
  super(material);
  setUnlocalizedName("slit:tnt_pickaxe");
  setTextureName("slit:tnt_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }

 @Override
 public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block state, int x, int y, int z, EntityLivingBase entityLiving) {
  if(!worldIn.isRemote) {
   if(Config.DEBUG) {
    SLiT.LOGGER.info("block destroy");
   }
   if(!entityLiving.isSneaking()) {
    EntityTNTPrimed e = new EntityTNTPrimed(worldIn, x, y, z, entityLiving);
    e.fuse=0;//setFuse(0);
    if((double) state.getBlockHardness(worldIn, x, y, z) != 0.0D) {
     worldIn.createExplosion(e, x, y, z, 4, true);
    } else {
     worldIn.createExplosion(e, x, y, z, 3, true);
    }
    stack.damageItem(1, entityLiving);
   } else {
    if((double) state.getBlockHardness(worldIn, x, y, z) != 0.0D) {
     stack.damageItem(1, entityLiving);
    }
   }
  }
  return true;
 }

 @Override
 public boolean onItemUse(ItemStack stack, EntityPlayer player, World worldIn, int x, int y, int z, int facing, float hitX, float hitY, float hitZ)
 {
  if(!worldIn.isRemote) {
   if(Config.DEBUG) {
    SLiT.LOGGER.info("spawn tnt");
   }
   if(!player.isSneaking()) {
    EntityTNTPrimed e = new EntityTNTPrimed(worldIn, x, y, z, player);
    e.fuse=30;
    worldIn.spawnEntityInWorld(e);
    stack.damageItem(1, player);
    return true;
   }
  }
  return false;
 }

 @Override
 public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
   EntityTNTPrimed e = new EntityTNTPrimed(attacker.worldObj, target.posX, target.posY, target.posZ, attacker);
   e.fuse=0;
  attacker.worldObj.createExplosion(e, target.posX, target.posY, target.posZ, 4, true);
   stack.damageItem(2, attacker);
  return true;
 }
}
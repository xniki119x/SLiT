package niki119.slit.items.pickaxe;


import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import niki119.slit.SLiT;
import niki119.slit.utils.Config;

public class TntPickaxe extends ItemPickaxe {
 public TntPickaxe(ToolMaterial material) {
  super(material);
  setRegistryName("tnt_pickaxe");
  setTranslationKey("tnt_pickaxe");
  setCreativeTab(SLiT.creativeTabPickaxe);
 }

 @Override
 public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
  if(!worldIn.isRemote) {
   if(Config.DEBUG) {
    SLiT.LOGGER.info("block destroy");
   }
   if(!entityLiving.isSneaking()) {
    EntityTNTPrimed e = new EntityTNTPrimed(worldIn, pos.getX(), pos.getY(), pos.getZ(), entityLiving);
    e.setFuse(0);
    if((double) state.getBlockHardness(worldIn, pos) != 0.0D) {
     worldIn.createExplosion(e, pos.getX(), pos.getY(), pos.getZ(), 4, true);
    } else {
     worldIn.createExplosion(e, pos.getX(), pos.getY(), pos.getZ(), 3, true);
    }
    stack.damageItem(1, entityLiving);
   } else {
    if((double) state.getBlockHardness(worldIn, pos) != 0.0D) {
     stack.damageItem(1, entityLiving);
    }
   }
  }
  return true;
 }
 @Override
 public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
 {
  if(!worldIn.isRemote) {
   if(Config.DEBUG) {
    SLiT.LOGGER.info("spawn tnt");
   }
   if(!player.isSneaking()) {
    ItemStack stack = player.getHeldItem(hand);
    EntityTNTPrimed e = new EntityTNTPrimed(worldIn, pos.getX(), pos.getY(), pos.getZ(), player);
    e.setFuse(30);
    worldIn.spawnEntity(e);
    stack.damageItem(1, player);
    return EnumActionResult.SUCCESS;
   }
  }
  return EnumActionResult.PASS;
 }

 @Override
 public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
   World w = attacker.getEntityWorld();
   BlockPos pos = target.getPosition();
   EntityTNTPrimed e = new EntityTNTPrimed(w, pos.getX(), pos.getY(), pos.getZ(), attacker);
   e.setFuse(0);
   w.createExplosion(e, pos.getX(), pos.getY(), pos.getZ(), 4, true);
   stack.damageItem(2, attacker);
  return true;
 }
}
package com.digital.magica.custom;

import com.digital.magica.item.ModItems;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Camera;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class TestBlock extends Block {
    public TestBlock(Properties properties){
        super(properties);
    }

    @Override
    public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        super.onPlace(blockstate, world, pos, oldState, moving);
        world.scheduleTick(pos, this, 1);
    }


    @Override
        public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
            super.tick(blockstate, world, pos, random);
            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();

            execute(world, x, y, z);
            world.scheduleTick(pos, this, 1);
        }

        public static void execute(LevelAccessor world, double x, double y, double z) {
            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.AMETHYST_CLUSTER));
                entityToSpawn.setPickUpDelay(1);
                _level.addFreshEntity(entityToSpawn);
        }
    }
}

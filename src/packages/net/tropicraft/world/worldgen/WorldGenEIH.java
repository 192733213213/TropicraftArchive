package net.tropicraft.world.worldgen;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.tropicraft.mods.TropicraftMod;

import java.util.Random;

public class WorldGenEIH extends WorldGenerator
{

    public WorldGenEIH()
    {
    }

    @Override
    public boolean generate(World world, Random random, int i, int j, int k)
    {
        byte byte0 = 5;
        int l = i;
        int i1 = j;
        int j1 = k;
        if(j < 1 || j + byte0 + 1 > 128)
        {
            return false;
        }
        if(j >= 128 - byte0 - 1)
        {
            return false;
        }
        if((!world.isAirBlock(l, i1 + 1, j1) || !world.isAirBlock(l, i1, j1)) && !world.isAirBlock(l, i1 - 1, j1) && (world.getBlockId(l, i1, j1) == Block.dirt.blockID || world.getBlockId(l, i1, j1) == Block.grass.blockID))
        {
            i1++;
            world.setBlock(l + 0, i1 + 0, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 0, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 0, j1 + 4, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 0, j1 + 4, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 0, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 0, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 1, j1 + 4, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 1, j1 + 4, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 1, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 1, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 1, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 1, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 1, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 2, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 2, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 2, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 2, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 3, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 3, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 3, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 3, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 4, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 3, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 3, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 2, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 4, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 4, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 4, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 5, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 5, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 5, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 5, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 3, j1 + 4, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 4, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 6, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 6, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 6, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 6, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 6, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 1, i1 + 5, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 1, i1 + 5, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 1, i1 + 4, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 1, i1 + 4, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 2, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 2, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 1, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 0, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 0, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 6, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 5, j1 + 0, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + 4, j1 + 0, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + 5, j1 + 0, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + 3, j1 + 0, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + 4, j1 + 1, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + 3, j1 + 1, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + 2, j1 + 1, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + 3, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + 2, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + 1, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + 3, j1 + 4, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 3, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 2, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 1, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 1, j1 + 4, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 0, j1 + 4, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 0, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 0, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 0, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 1, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 1, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 2, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 2, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 3, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 4, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 5, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 6, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 6, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 6, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 5, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 5, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 4, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 4, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 5, j1 + 0, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + 4, j1 + 0, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + 3, j1 + 0, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + 4, j1 + 1, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + 3, j1 + 1, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + 2, j1 + 1, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + 3, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + 2, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + 1, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -3, i1 + 0, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 0, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 0, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 0, j1 + 4, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 1, j1 + 4, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 1, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 2, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 1, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 1, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 2, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 2, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 2, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 3, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 4, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 3, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 3, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 3, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 4, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 5, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 6, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 6, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + 6, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -4, i1 + 5, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -4, i1 + 4, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -4, i1 + 4, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + 4, j1 + 0, Block.lavaMoving.blockID);
            world.setBlock(l + 0, i1 + 4, j1 + 1, Block.lavaMoving.blockID);
            world.setBlock(l + -3, i1 + 4, j1 + 0, Block.lavaMoving.blockID);
            world.setBlock(l + -3, i1 + 4, j1 + 1, Block.lavaMoving.blockID);
            world.setBlock(l + -3, i1 + 5, j1 + 0, Block.lavaMoving.blockID);
            world.setBlock(l + -4, i1 + 5, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 1, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 1, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + 0, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 0, j1 + -1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + -1, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + -1, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + -1, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + -1, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + -1, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + -1, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + -1, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + -1, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + -1, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + -1, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + -2, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + -2, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + -2, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + -2, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + -2, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + -2, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + -2, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + -2, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + -2, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + -2, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + -3, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + -3, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + 0, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + 0, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + -1, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + -1, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + -2, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -1, i1 + -2, j1 + 2, Block.lavaMoving.blockID);
            world.setBlock(l + -2, i1 + -3, j1 + 3, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + -3, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + -3, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + -3, j1 + 2, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + -3, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + -3, j1 + 1, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -3, i1 + -3, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -2, i1 + -3, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + -1, i1 + -3, j1 + 0, TropicraftMod.chunkBlock.blockID);
            world.setBlock(l + 0, i1 + -3, j1 + 0, TropicraftMod.chunkBlock.blockID);
            int k1 = random.nextInt(5);
            if(k1 == 0)
            {
                world.setBlock(l + 0, i1 + 5, j1 + 1, Block.glowStone.blockID);
                world.setBlock(l + -3, i1 + 5, j1 + 1, Block.glowStone.blockID);
            } else
            if(k1 == 1)
            {
                world.setBlock(l + 0, i1 + 5, j1 + 1, Block.obsidian.blockID);
                world.setBlock(l + -3, i1 + 5, j1 + 1, Block.obsidian.blockID);
            } else
            if(k1 == 2)
            {
                world.setBlock(l + 0, i1 + 5, j1 + 1, Block.blockDiamond.blockID);
                world.setBlock(l + -3, i1 + 5, j1 + 1, Block.blockDiamond.blockID);
            } else
            if(k1 == 3)
            {
                world.setBlock(l + 0, i1 + 5, j1 + 1, Block.blockSteel.blockID);
                world.setBlock(l + -3, i1 + 5, j1 + 1, Block.blockSteel.blockID);
            } else
            if(k1 == 4)
            {
                world.setBlock(l + 0, i1 + 5, j1 + 1, Block.blockGold.blockID);
                world.setBlock(l + -3, i1 + 5, j1 + 1, Block.blockGold.blockID);
            } else
            {
                world.setBlock(l, i1 + 5, j1 + 1, Block.glowStone.blockID);
                world.setBlock(l - 3, i1 + 5, j1 + 1, Block.glowStone.blockID);
            }
        }
        return true;
    }
}

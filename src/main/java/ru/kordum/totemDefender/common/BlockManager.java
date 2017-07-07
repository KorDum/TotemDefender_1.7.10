package ru.kordum.totemDefender.common;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import ru.kordum.totemDefender.common.blocks.BlockBasicLog;
import ru.kordum.totemDefender.common.blocks.BlockDiamondTotem;
import ru.kordum.totemDefender.common.blocks.BlockDoor;
import ru.kordum.totemDefender.common.blocks.BlockFence;
import ru.kordum.totemDefender.common.blocks.BlockFenceGate;
import ru.kordum.totemDefender.common.blocks.BlockGoldTotem;
import ru.kordum.totemDefender.common.blocks.BlockIronTotem;
import ru.kordum.totemDefender.common.blocks.BlockLeaves;
import ru.kordum.totemDefender.common.blocks.BlockLogFace1;
import ru.kordum.totemDefender.common.blocks.BlockLogFace2;
import ru.kordum.totemDefender.common.blocks.BlockLogFace3;
import ru.kordum.totemDefender.common.blocks.BlockPlanks;
import ru.kordum.totemDefender.common.blocks.BlockSapling;
import ru.kordum.totemDefender.common.blocks.BlockSlab;
import ru.kordum.totemDefender.common.blocks.BlockStairs;
import ru.kordum.totemDefender.common.blocks.BlockWoodenTotem;
import ru.kordum.totemDefender.common.config.Config;
import ru.kordum.totemDefender.common.entities.TileEntityDiamondTotem;
import ru.kordum.totemDefender.common.entities.TileEntityGoldTotem;
import ru.kordum.totemDefender.common.entities.TileEntityIronTotem;
import ru.kordum.totemDefender.common.entities.TileEntityWoodenTotem;
import ru.kordum.totemDefender.common.items.common.ItemSlab;
import ru.kordum.totemDefender.common.items.common.ItemTotem;

public class BlockManager {
    public static BlockSapling sapling;
    public static BlockLeaves leaves;
    public static BlockBasicLog log;
    public static BlockLogFace1 face1Log;
    public static BlockLogFace2 face2Log;
    public static BlockLogFace3 face3Log;
    public static BlockPlanks planks;
    public static BlockStairs stairs;
    public static BlockSlab slab;
    public static BlockSlab doubleSlab;
    public static BlockFence fence;
    public static BlockFenceGate fenceGate;
    public static BlockDoor door;

    public static BlockWoodenTotem woodenTotem;
    public static BlockIronTotem ironTotem;
    public static BlockGoldTotem goldTotem;
    public static BlockDiamondTotem diamondTotem;

    //---------------------------------------------------------------------------
    //
    // PUBLIC METHODS
    //
    //---------------------------------------------------------------------------

    public static void registerBlocks(Config config) {
        sapling = new BlockSapling();
        leaves = new BlockLeaves();
        log = new BlockBasicLog();
        face1Log = new BlockLogFace1();
        face2Log = new BlockLogFace2();
        face3Log = new BlockLogFace3();
        planks = new BlockPlanks();
        stairs = new BlockStairs();
        slab = new BlockSlab(false);
        doubleSlab = new BlockSlab(true);
        fence = new BlockFence();
        fenceGate = new BlockFenceGate();
        door = new BlockDoor();

        woodenTotem = new BlockWoodenTotem(config.woodenTotem);
        ironTotem = new BlockIronTotem(config.ironTotem);
        goldTotem = new BlockGoldTotem(config.goldTotem);
        diamondTotem = new BlockDiamondTotem(config.diamondTotem);

        GameRegistry.registerBlock(sapling, sapling.getName());
        GameRegistry.registerBlock(leaves, leaves.getName());
        GameRegistry.registerBlock(log, log.getName());
        GameRegistry.registerBlock(face1Log, face1Log.getName());
        GameRegistry.registerBlock(face2Log, face2Log.getName());
        GameRegistry.registerBlock(face3Log, face3Log.getName());
        GameRegistry.registerBlock(planks, planks.getName());
        GameRegistry.registerBlock(stairs, stairs.getName());
        GameRegistry.registerBlock(slab, ItemSlab.class, slab.getName());
        GameRegistry.registerBlock(doubleSlab, ItemSlab.class, doubleSlab.getName());
        GameRegistry.registerBlock(fence, fence.getName());
        GameRegistry.registerBlock(fenceGate, fenceGate.getName());
        GameRegistry.registerBlock(door, door.getName());

        GameRegistry.registerBlock(woodenTotem, ItemTotem.class, woodenTotem.getName());
        GameRegistry.registerTileEntity(TileEntityWoodenTotem.class, woodenTotem.getUnlocalizedName());

        GameRegistry.registerBlock(ironTotem, ItemTotem.class, ironTotem.getName());
        GameRegistry.registerTileEntity(TileEntityIronTotem.class, ironTotem.getUnlocalizedName());

        GameRegistry.registerBlock(goldTotem, ItemTotem.class, goldTotem.getName());
        GameRegistry.registerTileEntity(TileEntityGoldTotem.class, goldTotem.getUnlocalizedName());

        GameRegistry.registerBlock(diamondTotem, ItemTotem.class, diamondTotem.getName());
        GameRegistry.registerTileEntity(TileEntityDiamondTotem.class, diamondTotem.getUnlocalizedName());

        Blocks.fire.setFireInfo(leaves, 30, 60);
        Blocks.fire.setFireInfo(planks, 5, 20);
        Blocks.fire.setFireInfo(slab, 5, 20);
        Blocks.fire.setFireInfo(doubleSlab, 5, 20);
        Blocks.fire.setFireInfo(log, 5, 5);
        Blocks.fire.setFireInfo(face1Log, 5, 5);
        Blocks.fire.setFireInfo(face2Log, 5, 5);
        Blocks.fire.setFireInfo(face3Log, 5, 5);
        Blocks.fire.setFireInfo(fence, 5, 20);
        Blocks.fire.setFireInfo(fenceGate, 5, 20);
        Blocks.fire.setFireInfo(stairs, 5, 20);
        Blocks.fire.setFireInfo(sapling, 60, 100);
        Blocks.fire.setFireInfo(door, 5, 60);
        Blocks.fire.setFireInfo(woodenTotem, 5, 30);
        Blocks.fire.setFireInfo(ironTotem, 5, 100);
        Blocks.fire.setFireInfo(goldTotem, 5, 150);
        Blocks.fire.setFireInfo(diamondTotem, 5, 300);
    }
}
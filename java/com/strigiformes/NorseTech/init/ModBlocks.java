package com.strigiformes.NorseTech.init;

import com.strigiformes.NorseTech.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block PEAT = new BlockBase("peat", Material.CLAY);
}

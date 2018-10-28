package com.strigiformes.NorseTech.init;

import com.strigiformes.NorseTech.blocks.BlockBase;
import com.strigiformes.NorseTech.blocks.PeatBlock;
import com.strigiformes.NorseTech.blocks.ShingleBlock;
import com.strigiformes.NorseTech.blocks.TimberBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block PEAT = new PeatBlock("peat", Material.CLAY);

    public static final Block TIMBER = new TimberBlock("timber",Material.WOOD);

    public static final Block SHINGLE = new ShingleBlock("shingle",Material.ROCK);
}

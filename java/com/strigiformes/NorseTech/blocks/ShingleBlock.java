/*
 * Information on Timber blocks, meant to be a part of longhouses as a different wood texture.
 *
 */

package com.strigiformes.NorseTech.blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ShingleBlock extends BlockBase{

    public ShingleBlock(String name, Material material){
        super(name,material);

        //block sound (walking over)
        setSoundType(SoundType.WOOD);

        //block hardness, google for information on block hardness
        setHardness(2f);

        //explosion resistance similar to dirt (slightly greater)
        setResistance(15f);

        //Meant to be harvested by shovel
        setHarvestLevel("axe, pickaxe", 1);
    }

}

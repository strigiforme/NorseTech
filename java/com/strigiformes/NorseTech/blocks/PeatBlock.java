/*
 * Information on peat block, which is meant to be a mossy type block that can be used for roofing. Very similar to dirt.
 * or used for making scotch ;)
 *
 */

package com.strigiformes.NorseTech.blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PeatBlock extends BlockBase{

    public PeatBlock(String name, Material material){
        super(name,material);

        //block sound (walking over)
        setSoundType(SoundType.PLANT);

        //block hardness, google for information on block hardness
        setHardness(0.5f);

        //explosion resistance similar to dirt (slightly greater)
        setResistance(3f);

        //Meant to be harvested by shovel
        setHarvestLevel("shovel", 0);
    }

}

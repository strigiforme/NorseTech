package com.strigiformes.NorseTech.blocks;

import com.strigiformes.NorseTech.Main;
import com.strigiformes.NorseTech.init.ModBlocks;
import com.strigiformes.NorseTech.init.ModItems;
import com.strigiformes.NorseTech.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabNorseTech);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
    }


}

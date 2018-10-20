package com.strigiformes.NorseTech.items;

import com.strigiformes.NorseTech.Main;
import com.strigiformes.NorseTech.init.ModItems;
import com.strigiformes.NorseTech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        //adding item to mod items
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(this,0,"inventory");
    }

}

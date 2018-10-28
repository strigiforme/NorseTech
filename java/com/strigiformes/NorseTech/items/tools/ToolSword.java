package com.strigiformes.NorseTech.items.tools;

import com.strigiformes.NorseTech.Main;
import com.strigiformes.NorseTech.init.ModItems;
import com.strigiformes.NorseTech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

    public ToolSword(String name, ToolMaterial material) {
        super(material);
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
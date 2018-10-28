package com.strigiformes.NorseTech.init;

import com.strigiformes.NorseTech.items.ItemBase;
import com.strigiformes.NorseTech.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final ToolMaterial MATERIAL_COLDIRON = EnumHelper.addToolMaterial("material_coldiron",2, 300, 7.0F, 2.5F, 20);

    //Items
    public static final Item cold_iron_ingot = new ItemBase("cold_iron_ingot");

    //Tools
    public static final ItemSword wooden_battleaxe = new ToolSword("wooden_battleaxe",ToolMaterial.WOOD);
}

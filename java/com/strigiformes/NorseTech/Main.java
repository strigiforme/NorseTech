package com.strigiformes.NorseTech;

import com.strigiformes.NorseTech.init.ModItems;
import com.strigiformes.NorseTech.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Main {

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public static void init(FMLInitializationEvent event){

    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event){

    }

    public static CreativeTabs tabNorseTech = new CreativeTabs("tab_norse_tech") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.cold_iron_ingot);
        }
    };
}

package nl.Azhdev.taunt;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "tau", name = "Taunts!", version = "1.7.10-1.1a")
public class taunts {
	
	@Mod.Instance("tau")
	public static taunts instance;	
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		FMLCommonHandler.instance().bus().register(new keyInputEventHandler());
	}
}

package taunt.modforgery.Azhdev;

import taunt.modforgery.Azhdev.handlers.keyInputEventHandler;
import taunt.modforgery.Azhdev.proxies.IProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "tau", name = "Taunts!", version = "1.7.10-1.0")
public class taunts {
	
	@Mod.Instance("tau")
	public static taunts instance;
	
	@SidedProxy(clientSide = "taunt.modforgery.Azhdev.proxies.ClientProxy", serverSide = "taunt.modforgery.Azhdev.proxies.CommonProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void PreInit(FMLPreInitializationEvent event){

		proxy.registerKeyBindings();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		FMLCommonHandler.instance().bus().register(new keyInputEventHandler());
		
	}
}

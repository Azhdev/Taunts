package nl.Azhdev.taunt;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import nl.Azhdev.core.api.utilityclasses.Log;

@Mod(modid = "tau", name = "Taunts!", version = "1.8-1.1a")
public class taunts {
	
	@Mod.Instance("tau")
	public static taunts instance;	
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		if(Loader.isModLoaded("ACORE")){
			FMLCommonHandler.instance().bus().register(new keyInputEventHandler());
		}else{
			Log.addWarning("[ taunts!]: AzhdevCore not detected! keyhandler wont be loaded!, Taunts will be useless in this state");
			Log.addWarning("[ taunts!]: please install the specified version of AzhdevCore!");
		}
	}
}

package taunt.modforgery.Azhdev.proxies;

import taunt.modforgery.Azhdev.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy  implements IProxy{

	@Override
	public void registerKeyBindings() {
		ClientRegistry.registerKeyBinding(KeyBindings.activate);
	}

}

package nl.Azhdev.taunt;

import nl.Azhdev.core.api.keybindings.KeyBindings;
import nl.Azhdev.core.api.packet.MessageKeyPressed;
import nl.Azhdev.core.api.packet.NetworkHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;

public class keyInputEventHandler{
	@SubscribeEvent
	public void HandleKeyInputEvent(KeyInputEvent event){
		if(KeyBindings.activate.isPressed()){
			NetworkHandler.INSTANCE.sendToServer(new MessageKeyPressed(KeyBindings.activate));
		}	
	}	
}

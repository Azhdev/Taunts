package nl.Azhdev.taunt;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import nl.Azhdev.core.api.keybindings.KeyBindings;
import nl.Azhdev.core.api.packet.MessageKeyPressed;
import nl.Azhdev.core.api.packet.NetworkHandler;

public class keyInputEventHandler{
	@SubscribeEvent
	public void HandleKeyInputEvent(KeyInputEvent event){
		if(KeyBindings.activate.isPressed()){
			NetworkHandler.INSTANCE.sendToServer(new MessageKeyPressed(KeyBindings.activate));
		}	
	}	
}

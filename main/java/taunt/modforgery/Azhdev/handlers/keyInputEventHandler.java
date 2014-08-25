package taunt.modforgery.Azhdev.handlers;

import java.util.Random;

import net.minecraft.client.Minecraft;
import taunt.modforgery.Azhdev.client.settings.KeyBindings;
import taunt.modforgery.Azhdev.lib.Key;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class keyInputEventHandler{
	public static Key getPressedKeyBinding(){
		if(KeyBindings.activate.isPressed()){
			return Key.ACTIVATE;
		}
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void HandleKeyInputEvent(InputEvent.KeyInputEvent event){
		if(KeyBindings.activate.isPressed()){
			String n = "tau:taunt" + getRandomSound();
			Minecraft.getMinecraft().thePlayer.playSound(n, 1, 1);
			Minecraft.getMinecraft().theWorld.playSoundAtEntity(Minecraft.getMinecraft().thePlayer, n, 1, 1);
			System.out.println("works!");
		}	
	}	
	private int getRandomSound(){
		Random random = new Random();
		return random.nextInt(81);
	}
}

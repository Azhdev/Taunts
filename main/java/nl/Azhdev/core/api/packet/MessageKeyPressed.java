package nl.Azhdev.core.api.packet;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nl.Azhdev.core.api.keybindings.KeyBindings;
import nl.Azhdev.core.api.utilityclasses.Utilities;

public class MessageKeyPressed implements IMessage, IMessageHandler<MessageKeyPressed, IMessage>{

	private byte keyPressed;
	
	public MessageKeyPressed(){}
	
	@SideOnly(Side.CLIENT)
	public MessageKeyPressed(KeyBinding key){
		if(Loader.isModLoaded("Taunts!")){
			if(key == KeyBindings.activate){
				this.keyPressed = (byte)KeyBindings.activate.getKeyCode();
			}
		}
		
	}
	
	@Override
	public IMessage onMessage(MessageKeyPressed message, MessageContext ctx) {
		
		EntityPlayer player = ctx.getServerHandler().playerEntity;
		
		if(player != null){
			if(!player.worldObj.isRemote){
				String n = Utilities.getRandomSound();
				NetworkHandler.sendToAll(new PacketPlaySound(n, player, 0.1F, 1));
			}
		}
		
		return null;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.keyPressed = buf.readByte();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeByte(keyPressed);
	}

}

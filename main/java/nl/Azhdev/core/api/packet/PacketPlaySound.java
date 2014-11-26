package nl.Azhdev.core.api.packet;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;

public class PacketPlaySound extends LocationDoublePacket<PacketPlaySound>{

	private String sound;
	private Float volume, pitch;
	public PacketPlaySound(){}
	
	public PacketPlaySound(String sound, double x, double y, double z, float volume, float pitch){
		super();
		this.sound = sound;
		this.volume = volume;
		this.pitch = pitch;
	}
	
	public PacketPlaySound(String sound, EntityPlayer player, float volume, float pitch){
		this.sound = sound;
		this.volume = volume;
		this.pitch = pitch;
	}
	
	@Override
	public void toBytes(ByteBuf buf){
		ByteBufUtils.writeUTF8String(buf, sound);
		buf.writeFloat(volume);
		buf.writeFloat(pitch);
	}
	
	@Override
	public void fromBytes(ByteBuf buf){
		sound = ByteBufUtils.readUTF8String(buf);
		volume = buf.readFloat();
		pitch = buf.readFloat();
	}

	@Override
	public void handleClientSide(PacketPlaySound message, EntityPlayer player) {
		player.playSound(message.sound, message.volume, message.pitch);		
	}

	@Override
	public void handleServerSide(PacketPlaySound message, EntityPlayer player) {
		// TODO Auto-generated method stub
		//NOOP
	}

}

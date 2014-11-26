package nl.Azhdev.core.api.generic;

import net.minecraft.item.Item;

public class GenericAzhdevItem extends Item{
	public GenericAzhdevItem(String mod){
		super();
		setUnlocalizedName(mod + "_" + getClass().getSimpleName());
		//setTextureName("adtu:" + getClass().getSimpleName());
	}
}

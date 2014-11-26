package nl.Azhdev.core.api.generic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GenericAzhdevBlock extends Block{

	public GenericAzhdevBlock(Material mat, String mod) {
		super(mat);
		setUnlocalizedName(mod + "_" + getClass().getSimpleName() + "_AzhdevBlock");
		//setBlockTextureName("adtu:" + getClass().getSimpleName());
	}

}

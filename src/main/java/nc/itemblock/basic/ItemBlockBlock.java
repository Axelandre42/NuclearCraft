package nc.itemblock.basic;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockBlock extends ItemBlockWithMetadata {

	public ItemBlockBlock(Block block) {
		super(block, block);
	}

	public String getUnlocalizedName(ItemStack stack) {
		switch (stack.getItemDamage()) {
			case 0: return "copperBlock";
			case 1: return "tinBlock";
			case 2: return "leadBlock";
			case 3: return "silverBlock";
			case 4: return "uraniumBlock";
			case 5: return "thoriumBlock";
			case 6: return "bronzeBlock";
			case 7: return "toughBlock";
			case 8: return "lithiumBlock";
			case 9: return "boronBlock";
			case 10: return "magnesiumBlock";
			default: return this.getUnlocalizedName();
		}
	}
}
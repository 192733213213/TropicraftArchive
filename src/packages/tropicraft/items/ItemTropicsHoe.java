package tropicraft.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tropicraft.EnumToolMaterialTropics;
import tropicraft.creative.TropiCreativeTabs;

public class ItemTropicsHoe extends ItemTropicraft {

	public ItemTropicsHoe(int i, String imageName, EnumToolMaterialTropics enumtoolmaterial) {
		super(i);
		this.imageName = imageName;
		setMaxStackSize(1);
		setMaxDamage(enumtoolmaterial.getMaxUses());
        setCreativeTab(TropiCreativeTabs.tabTools);
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l, float par8, float par9, float par10) {
        if (!entityplayer.canPlayerEdit(i, j, k, l, itemstack)) {
            return false;
        }
		int i1 = world.getBlockId(i, j, k);
		int j1 = world.getBlockId(i, j + 1, k);
		if (l != 0 && j1 == 0 && i1 == Block.grass.blockID || i1 == Block.dirt.blockID) {
			Block block = Block.tilledField;
			world.playSoundEffect((float) i + 0.5F, (float) j + 0.5F, (float) k + 0.5F, block.stepSound.getStepSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
			if (world.isRemote) {
				return true;
			} else {
				world.setBlock(i, j, k, block.blockID);
				itemstack.damageItem(1, entityplayer);
				return true;
			}
		} else {
			return false;
		}
	}

	@Override
	public boolean isFull3D() {
		return true;
	}

	@Override
	public String getImageName() {
		return "hoe_" + imageName;
	}
}

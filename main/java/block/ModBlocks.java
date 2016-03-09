package block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block ModBlocks;

	private final String name = "ModBlocks";

	public static void preInit() {
		ModBlocks = new Block(Material.rock);
		ModBlocks.setUnlocalizedName("ModBlocks");
		ModBlocks.setCreativeTab(CreativeTabs.tabMisc);

		GameRegistry.registerBlock(ModBlocks, "ModBlocks");

	}

	public static void init() {

		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

		// ModBlocks = new Block(Material.rock);

		ModelResourceLocation i = new ModelResourceLocation("somelxmod:ModBlocks", "inventory");
		Item it = Item.getItemFromBlock(ModBlocks);
		renderItem.getItemModelMesher().register(it, 0, i);

		// renderItem.getItemModelMesher().getModelManager().getBlockModelShapes().registerBuiltInBlocks(ModBlocks);
		
		//ModBlocks.onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	}

	
	public String getName() {

		return name;
	}
}

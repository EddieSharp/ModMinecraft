package block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Bloque extends Block {

	public static Block bloque;

	private final static String name = "Bloque";

	public static void preInit() {
		bloque = new Block(Material.rock);
		bloque.setUnlocalizedName(name);
		bloque.setCreativeTab(CreativeTabs.tabMisc);

		GameRegistry.registerBlock(bloque, name);

	}
	
	public static void init() {

		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation i = new ModelResourceLocation("somelxmod:" + name, "inventory");
		Item it = Item.getItemFromBlock(bloque);
		renderItem.getItemModelMesher().register(it, 0, i);

		
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state){
		
		bloque.dropBlockAsItem(worldIn, pos, state, 2);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ){
		
		playerIn.addChatComponentMessage(new ChatComponentText("Ey"));
		pos.add(2, 2, 2);
		playerIn.setFire(3);
		return false;
	}
	
	public String getName(){
		
		return name;
	}
	
	public Bloque(Material materialIn) {
		super(materialIn);
		
	}
	

}

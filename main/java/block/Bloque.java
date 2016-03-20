package block;

import java.util.Random;

import item.food.Dough;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Bloque extends Block {

	public static Block bloque;

	private final static String name = "Bloque";
	
	public Bloque(){
		super(Material.rock);
		
	}

	public static void preInit() {
		bloque = new Bloque();
		bloque.setUnlocalizedName(name);
		bloque.setCreativeTab(CreativeTabs.tabMisc);
		bloque.setHardness(2.0f);

		GameRegistry.registerBlock(bloque, name);

	}
	
	public static void init() {

		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation i = new ModelResourceLocation("somelxmod:" + name, "inventory");
		Item it = Item.getItemFromBlock(bloque);
		renderItem.getItemModelMesher().register(it, 0, i);

		
	}
	
	public String getName(){
		
		return name;
	}
	
	public Bloque(Material materialIn) {
		super(materialIn);
		
	}
	
	@Override
	 public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
	    {
	        if (worldIn.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	        	ITextComponent t = new TextComponentString("hola");
	            playerIn.addChatComponentMessage(t);
	            //playerIn.openGui(SomelxMod.instance, modGuiId, worldIn, hitX, hitY, hitZ);
	            //IMerchant im = new IMerchant();
	            //playerIn.displayVillagerTradeGui();
	            return true;
	        }
	    }
	
	

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		// TODO Auto-generated method stub
		super.getItemDropped(state, rand, fortune);
		return Dough.getInstance();
	}
	
	
	

}

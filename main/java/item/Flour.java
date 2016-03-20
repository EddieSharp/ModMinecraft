package item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Flour extends ItemFood {

	private static Item flour;
	private static String name = "flour";
	
	static int amount = 1;
	static float saturation = 1.0f;
	static boolean isWolfFood = false;
	
	
	
	public static void preInit(){
		flour = new Flour();
		//flour.setUnlocalizedName(name);
		//flour = this;
		flour.setCreativeTab(CreativeTabs.tabFood);
		GameRegistry.registerItem(flour, name);
		
	}
	
	public static void init(){
		
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation mrl = new ModelResourceLocation("somelxmod:flour", "inventory");
		renderItem.getItemModelMesher().register(flour, 0, mrl);
		
		
	}
	
	private Flour() {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
    }
	
	public static Item getInstance(){
		
		return flour;
	}
	
	
}

package item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SweetDough extends ItemFood {

	private static Item sweetDough;
	private static String name = "sweetDough";
	
	static int amount = 1;
	static float saturation = 1.0f;
	static boolean isWolfFood = false;
	
	
	
	public static void preInit(){
		sweetDough = new SweetDough();
		//sweetDough.setUnlocalizedName(name);
		//sweetDough = this;
		sweetDough.setCreativeTab(CreativeTabs.tabFood);
		GameRegistry.registerItem(sweetDough, name);
		
		
	}
	
	public static void init(){
		
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation mrl = new ModelResourceLocation("somelxmod:" + name, "inventory");
		renderItem.getItemModelMesher().register(sweetDough, 0, mrl);
		
		
	}
	
	private SweetDough() {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
    }
	
	public static Item getInstance(){
		
		return sweetDough;
	}
	
	
}

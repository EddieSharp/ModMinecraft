package item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Dough extends ItemFood{

	private static Item dough;
	private static String name = "dough";
	
	static int amount = 1;
	static float saturation = 1.0f;
	static boolean isWolfFood = false;
	
	private Dough() {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
    }
	
	
	public static void preInit() {
		
		dough = new Dough();
		dough.setUnlocalizedName(name);
		dough.setCreativeTab(CreativeTabs.tabFood);
		GameRegistry.registerItem(dough, name);	
	}

	
	public static void init() {
		
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation mrl = new ModelResourceLocation("somelxmod:" + name, "inventory");
		renderItem.getItemModelMesher().register(dough, 0, mrl);
		
	}
	
	public static Item getInstance(){
		
		return dough;
	}

}

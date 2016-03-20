package item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Example extends ItemFood{

	private static Item itemObj;
	private static String name = "name";
	
	static int amount = 1;
	static float saturation = 1.0f;
	static boolean isWolfFood = false;
	
	private Example() {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
    }
	
	
	public static void preInit() {
		
		itemObj = new Example();
		itemObj.setUnlocalizedName(name);
		itemObj.setCreativeTab(CreativeTabs.tabFood);
		GameRegistry.registerItem(itemObj, name);	
	}

	
	public static void init() {
		
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation mrl = new ModelResourceLocation("somelxmod:" + name, "inventory");
		renderItem.getItemModelMesher().register(itemObj, 0, mrl);
		
	}
	
	public static Item getInstance(){
		
		return itemObj;
	}

}

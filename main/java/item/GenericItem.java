package item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GenericItem {

	protected Item genericItem;
	
	protected void preInit(String name){
		genericItem = new Item();
		genericItem.setUnlocalizedName(name);
		genericItem.setCreativeTab(CreativeTabs.tabAllSearch);
		GameRegistry.registerItem(genericItem, name);
		
	}
	
	protected void init(String name){
		
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation mrl = new ModelResourceLocation("somelxmod:" + name, "inventory");
		renderItem.getItemModelMesher().register(genericItem, 0, mrl);
		
		
	}
}

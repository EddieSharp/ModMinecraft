package item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Prueba {

	public static Item prueba;
	
	public static void preInit(){
		prueba = new Item();
		prueba.setUnlocalizedName("miobjeto");
		prueba.setCreativeTab(CreativeTabs.tabMisc);
		
		GameRegistry.registerItem(prueba, "miobjeto");
		
	}
	
	public static void init(){
		
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		//ModItems = new Item();
		
		//ModelBakery.addVariantName(ModItems, "moditems");
		
		ModelResourceLocation mrl = new ModelResourceLocation("somelxmod:miobjeto", "inventory");
		renderItem.getItemModelMesher().register(prueba, 0, mrl);
		
		
	}
}

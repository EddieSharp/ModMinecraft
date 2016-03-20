package item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Navaja extends ItemSword{

	private static Item itemObj;
	private static String name = "navaja";
	
	
	
	private Navaja() {
		super(ToolMaterial.IRON);
        this.setUnlocalizedName(name);
        super.setDamage(new ItemStack(itemObj), 100);
    }
	
	
	public static void preInit() {
		
		itemObj = new Navaja();
		itemObj.setUnlocalizedName(name);
		itemObj.setCreativeTab(CreativeTabs.tabCombat);
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

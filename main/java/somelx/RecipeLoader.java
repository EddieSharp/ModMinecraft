package somelx;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeLoader {

	public static void preInit(){
		
	}
	
	public static void init(){
		
		//GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), "AAA", "AAA", "AAA", 'A', Items.cookie);
		GameRegistry.addShapelessRecipe(new ItemStack(item.Dough.getInstance(), 2), new Object[] {item.Flour.getInstance(), new ItemStack(Items.potionitem, 1, 0)});
		GameRegistry.addSmelting(item.Dough.getInstance(), new ItemStack(Items.bread), 0.5f);
		
	}
	
	
}

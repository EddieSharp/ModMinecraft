package somelx;

import java.util.Iterator;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class Utils {

	public static void removeRecipe(Item i){
		
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
    	Iterator<IRecipe> Leash = recipes.iterator();
    			         
    	while (Leash.hasNext()) {
    		ItemStack is = Leash.next().getRecipeOutput();
   			if (is != null && is.getItem() == i)
   				Leash.remove();
   		};
	}
}

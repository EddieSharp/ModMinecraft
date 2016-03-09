package somelx;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {

		ItemLoader.preInit();
    }

    public void init(FMLInitializationEvent e) {

    	RecipeLoader.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}

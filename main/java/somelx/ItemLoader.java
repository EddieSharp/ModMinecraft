package somelx;

import block.Bloque;
import block.ModBlocks;
import item.Dough;
import item.Flour;
import item.Prueba;

public class ItemLoader {

	
    public static void preInit() {

    	ModBlocks.preInit();
		Prueba.preInit();
		Flour.preInit();
		Dough.preInit();
		Bloque.preInit();
    }


    public static void init() {

        ModBlocks.init();
        Prueba.init();
        Flour.init();
        Dough.init();
        Bloque.init();
    }


    public static void postInit() {

    }
}

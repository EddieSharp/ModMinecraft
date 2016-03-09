package somelx;

import block.Bloque;
import block.ModBlocks;
import item.Dough;
import item.Flour;
import item.Prueba;
import item.SweetDough;

public class ItemLoader {

	
    public static void preInit() {

    	ModBlocks.preInit();
		Prueba.preInit();
		Flour.preInit();
		Dough.preInit();
		Bloque.preInit();
		SweetDough.preInit();
    }


    public static void init() {

        ModBlocks.init();
        Prueba.init();
        Flour.init();
        Dough.init();
        Bloque.init();
        SweetDough.init();
    }


    public static void postInit() {

    }
}

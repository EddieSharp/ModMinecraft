package somelx;

import net.minecraft.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SomelxMod.MODID, version = SomelxMod.VERSION, name = SomelxMod.MODNAME)

public class SomelxMod {
	
	
    public static final String MODID = "somelxmod";
    public static final String VERSION = "1.0";
    public static final String MODNAME = "Somelx's mod";
    
    @SidedProxy(clientSide="somelx.ClientProxy", serverSide="somelx.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    
    	Utils.removeRecipe(Items.bread);
    	proxy.preInit(event);
    	
    	
    
    }

    
    @EventHandler
    public void init(FMLInitializationEvent event){
		
    	proxy.init(event);
    	
    	//new ItemStack(e);
    	//GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), "AAA", "AAA", "AAA", 'A', Items.cookie);
    	
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
                
    	proxy.postInit(event);
    }


}

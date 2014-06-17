package AR_Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;








//Creator
@Mod(modid = alchemicreactions.modid, version = alchemicreactions.version)
public class alchemicreactions {
	//Items
	public static Item Logo;
	
//Namers
public static final String modid = "alchemist";

public static final String version = "0.1 MC1.7.2";

public static CreativeTabs tabAR = new CreativeTabs("Alchemic Reactions Tab")
{
public Item getTabIconItem()
{
return alchemicreactions.Logo;
}
};



	//Event Handler Before Launch
	@EventHandler
	public void preInit (FMLPreInitializationEvent event)
	{
		//Item Registry
		Logo = new Item() .setUnlocalizedName("logo").setTextureName(modid + ":" + "Logo"); 
		GameRegistry.registerItem(Logo, "Logo");
		
		//Language Registry
		LanguageRegistry.instance().addStringLocalization("itemGroup.Alchemic Reactions Tab", "en_US", "Alchemic Reactions Tab");
		
		
		
		
		
	}
	
		//Event Handler During launch
		public void Init (FMLInitializationEvent event)
		{
		
			
			
			
		}
	
	
	
	
	
			//Event Handler After Launch
			public void postInit (FMLPostInitializationEvent event)
			{
				
				
				
				
				
		
			}
	
	
	
	
	

}

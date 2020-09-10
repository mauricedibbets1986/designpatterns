// Lazy instantiation Singleton Method
// alleen aanmaken wanneer instantie nodig is
// werkt prima bij 1 thread. bij 2 of meer threads die teglijk aankomen bij getInstance zullen beide null in if krijgen
// en een nieuwe Def aanmaken.


public class Def
{
	
	private static Def obj;
	
	private Def()
	{
		System.out.println("Def aangemaakt");
	}
	
	public static Def getInstance()
	{
		if(obj == null)
		{
			obj = new Def();
		}
		return obj;
	}
	
}

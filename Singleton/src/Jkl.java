// Double Checked Locking
//controleert 2 keer of het object aangemaakt is. De wachtrij (synchronized wordt verplaatst naar de 2e check)
//hierdoor wordt de wachtrij korter alles dat aankomt nadat de 1e thread klaar is zal bij de eerste check
//al zien dat er een instance is.

public class Jkl
{

	private static Jkl obj;
	
	private Jkl()
	{
		System.out.println("Jkl aangemaakt");
	}
	
	public static Jkl getInstance() { 
		if(obj == null)
		{
			synchronized(Abc.class)
			{
				if(obj == null)
				{
					obj = new Jkl();
				}
			}
		}
		return obj;
	}
	
}

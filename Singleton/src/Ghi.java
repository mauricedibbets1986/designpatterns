// synchronized betekent wanneer een thread aankomt en bezig is met de methode. een andere die aankomt moet wachten.
// probleem is dat alles hierdoor langer duurt. 1000 processen aankomen. is 1000x wachten op getInstance

public class Ghi
{
	
	private static Ghi obj;
	
	private Ghi()
	{
		System.out.println("Ghi aangemaakt");
	}
	
	public static synchronized Ghi getInstance()
	{ 
		if(obj == null)
		{
			obj = new Ghi();
		}
		return obj;
	}
	
}

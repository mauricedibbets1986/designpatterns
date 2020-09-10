
public class Singleton
{
	
	public static void main(String[] args)
	{
		//Eager		
		Abc obj1 = Abc.getInstance();
		Abc obj2 = Abc.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		// Lazy initialization
		Def obj3 = Def.getInstance();
		Def obj4 = Def.getInstance();
		
		System.out.println(obj3);
		System.out.println(obj4);
		
		
		// Lazy initialization synchronized
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				Ghi obj5 = Ghi.getInstance();
				System.out.println(obj5);
			}
		});
		
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				Ghi obj6 = Ghi.getInstance();
				System.out.println(obj6);
			}
		});
		
		t1.start();
		t2.start();
		
		
		// Double Checked Locking
		Thread t3 = new Thread(new Runnable()
		{
			public void run()
			{
				Jkl obj7 = Jkl.getInstance();
				System.out.println(obj7);
			}
		});
		
		Thread t4 = new Thread(new Runnable()
		{
			public void run()
			{
				Jkl obj8 = Jkl.getInstance();
				System.out.println(obj8);
			}
		});
		
		t3.start();
		t4.start();
		
		
		// Using Enum
		Mno obj9 = Mno.INSTANCE;
		obj9.i = 10;
		obj9.show();
		
		Mno obj10 = Mno.INSTANCE;
		obj10.i = 5;
		
		obj9.show();
		obj10.show();
	}
	
}


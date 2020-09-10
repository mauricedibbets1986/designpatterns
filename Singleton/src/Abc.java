// Eager method
// op het zelfde moment declaren en instantieren. 


class Abc {
	
	// Static field kenmerk 1
	private static Abc obj = new Abc();
	
	// private constructor kenmerk 2
	private Abc() {
		System.out.println("Abc aangemaakt");
	}
	
	// public static method return instance kenmerk 3
	public static Abc getInstance() {
		return obj;
	}
	
}

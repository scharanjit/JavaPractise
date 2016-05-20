
public class staticInstanceInitialization {
	{
		System.out.println("2");
	}
	
	staticInstanceInitialization()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("inside main");
		staticInstanceInitialization b = new staticInstanceInitialization();
		staticInstanceInitialization b1 = new staticInstanceInitialization();
		
		System.out.println("outside");
		
	}
	
	static
	{
		System.out.println("1");
	}
}

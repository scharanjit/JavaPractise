//final constructor
//staic variabke of class type
//one static method getInstance
public class Singleton {
	
	private static Singleton myObj;
	private Singleton()
	{
		
	}
	
	static
	{
	//	myObj=new Singleton();
	}
	
	public static Singleton getInstance()
	{
		 myObj = new Singleton();
		return myObj;
		
	}
	
	public void test()
	{
		System.out.println("classsy");
	}
	public static void main(String[] args) {
		
		
		Singleton S = getInstance();
		S.test();
	}

}

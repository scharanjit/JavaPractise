package pRACTISE;



public class Singleton {
	
	private Singleton()
	{
		
	}
	
	
	private static final Singleton instance = new Singleton();
	
	public static Singleton getInstance()
	{
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton.getInstance();
		
		
		Singleton s1= Singleton.getInstance();
		
		
		
	}

}

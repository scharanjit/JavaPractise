package OCJP;

public class constructorBasics {
        static {
            System.out.println("Bahhhhhh");
        }
	int size;
	String Name;
	public constructorBasics()
	{
		
		System.out.println("hi...");
	}

	public constructorBasics(int size,String Name)
	{
		//this();		//it gonna call this class constructor
		//super();		// it gonna call super class constructor
		this.size= size;
		this.Name= Name;
		System.out.println(size+" .......  "+Name );
		
	}
	
        static{
            System.out.println("gahhhhhhh");
        }
	
	public static void main(String[] args) {
		constructorBasics cB= new constructorBasics(50,"jhilslckds");
	} 

}

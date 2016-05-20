package pRACTISE;
/*

its because when we use static keyword for a component, that component becomes a class level 
component and its memory is taken by its class. Now, if we declare an outer class as static then 
there is no outer component that will allocate memory to it.*/


public class saticMethodstaticVariable {
	
	
	public static class Iner
	{}
	//private saticMethodstaticVariable() throws IllegalAccessException{}
	public static int m=100;
	
	public static void staticMeth()
	{
		System.out.println("Instatic method");
	}
	public static void main(String[] args) {
		
		
		System.out.println(m);//a static variable can be called directly in statoc method
		
		
		staticMeth(); //a static method can be called without creating instcne of class
		
		saticMethodstaticVariable c = new saticMethodstaticVariable();
		
		c.nonStatic();
		
		
	}
	
	
	public void nonStatic()
	{
		staticMeth();
	}

}

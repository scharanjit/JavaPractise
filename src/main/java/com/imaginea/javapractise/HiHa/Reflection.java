package HiHa;

//Java Reflection makes it possible to inspect classes, interfaces, fields and methods at runtime, 
//without knowing the names of the classes, methods etc. at compile time.
//It is also possible to instantiate new objects, invoke methods and get/set field values using reflection.

import java.lang.reflect.Method;

public class Reflection {

	
	public static void main(String[] args) {
		Method[] methods = MyObjects.class.getMethods();
		Method[] m1=MyObjects.class.getDeclaredMethods();

		for(Method method : methods){
		    System.out.println("method = " + method.getName());
		    
		}
		for (Method method:m1)
		{
			System.out.println("Methode Declared : "+method.getName());
		}
	}
	
	
	
}

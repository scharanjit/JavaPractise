package OCJPChap3;

public class Vararg {
	static void wide_vararg(long... x)			//only WIDENING is occuring ...let change it to Long
	{ 
		System.out.println("long...");
	}
	static void box_vararg(Integer... x)		// Only BOXING is occuring
	{ 
		System.out.println("Integer..."); 
	}

	//BOTH WIDENING & BOXING NOT POSSIBLE AT A TIME FOR var agrs, overload or autoboxing 

	public static void main(String [] args) {
		int i = 5;
		wide_vararg(i,i); // needs to widen and use var-args
		box_vararg(i,i); // needs to box and use var-args

		byte v= 1;
		boxWiden(v);


	}



	static void boxWiden(Byte b)			//Boxing byte into Byte Wrapper
	{
		System.out.println(b);
		Double l = new Double(b);		// Now Widening
		System.out.println(l);
	}



}

//You CANNOT widen and then box. (An int can't become a Long.)
//You can box and then widen. (An int can become an Object, via Integer.)
package OCJPChap3;

/*
 *  Init blocks execute in the order they appear.
	Static init blocks run once, when the class is first loaded.
 	Instance init blocks run every time a class instance is created.
 	Instance init blocks run after the constructor's call to super().
 * */

public class Control_Flow_Init {


	Control_Flow_Init(int x) 
	{
		System.out.println("------------1-arg constructor---------"); 
	}

	Control_Flow_Init() 
	{
		System.out.println("------------no-arg constructor-----------");

	}
	static
	{
		System.out.println("1st static init");
	}

	{ 
		System.out.println("1st instance init");
	}

	{ 
		System.out.println("2nd instance init");
	}

	static { 

		System.out.println("2nd static init"); 

	}

	public static void main(String [] args) {
		new Control_Flow_Init(); //instance running again
		new Control_Flow_Init(7); //instance running again
	}
}
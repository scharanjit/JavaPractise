package OCJPChap5;

public class ifElse {

	public static void main(String[] args) {

		int i=7;

		int j=5;
		int k=6;
		if(i>3)
		{
			System.out.println("HI");
		}
		j=j+1;
		k=k+1;
		System.out.println(j+" "+k);

		int i1=3;
		int j1=5;
		int k1=6;
		if(i1>3)													//Though it is a bad p[ractise						
			System.out.println("HI1");								// but we can have quest. in xam based upon this				
		System.out.println(j1+ " This is independent of if loop "+k1);
		j1=j1+1;
		k1=k1+1;
		System.out.println(j1+ " "+k1);

		System.out.println("-------------------------------------------------------------------------------");


		boolean boo = false;
		if (boo = true)
		{ 
			System.out.println("The code compiles and runs fi ne and the if test succeeds because boo is SET to true (rather than TESTED for true) in the if argument!");
		}

		//sysout
		System.out.println("------------------------------------------------------------------------------------");


		// IMPORTANT
		// SWITCH :- long, float, and double won't be able to compile in Switch statement
		// char, byte, short, int, or, as of Java 6, an enum  --> A switch's expression can evaluate


		final int a = 1;
		final int b;
		b = 2;
		int x = 0;
		switch (x) {
		case a: // ok
			//case b: // compiler error
		}




		String s = "xyz";
		switch (s.length()) {
		case 1:
			System.out.println("length is one");
			break;
		case 2:
			System.out.println("length is two");
			break;
		case 3:
			System.out.println("length is three");
			break;
		default:
			System.out.println("no match");
		}


		byte g = 2;
		switch(g) {
		case 23:
			//	case 128:    //the second case argument (128) is too large for a byte
		}



		int temp = 90;
		switch(temp) {
		case 80 : System.out.println("80");
		// case 80 : System.out.println("80"); // won't compile!
		case 90 : System.out.println("90");
		default : System.out.println("default");
		}


		switch(new Integer(4)) {
		case 4: System.out.println("boxing is OK");       //LEGAL EXPRESSION...	


		/*
			switch(x) {
			case 0 {
			y = 7;
			}
			}
			switch(x) {
			0: { }
			1: { }
			}
		 */
		}

		int xj = 3;
		switch (xj) {
		case 2:
		default: System.out.println("x is an odd number");		//fcked up :(
		case 4:
		case 6:
		case 8:
		case 10: {
			System.out.println("x is an even number"); break;
		}

		}

		System.out.println("-----------------------------------");


		int xl = 7;
		switch (xl) {
		case 2: System.out.println("2");
		default: System.out.println("default");		// OUE
		case 3: System.out.println("3");
		case 4: System.out.println("4");


		}


















	}
}

package OCJPChap3;
// Boxing means
// int --> Integer
// primitive into its Wrapper Class


// Widening
// shot s= 5;
//int i=s;
//widened
// order to be followed...high to low./...prefernce will be given in belwo order
// // Widening ---> Var arg ---> Boxing {Overloading}


public class AutoBoxingExample {


	public static void main(String[] args) {
		Integer y = new Integer(567); // make it
		y++;						 // unwrap it, increment it,
		// rewrap it
		System.out.println("y = " + y); // print it
		System.out.println("  ");

		Integer y1 = 801;		 // make a wrapper
		Integer x = y1; 		// assign a second ref
		// var to THE wrapper
		System.out.println("Comparing 801 via Wrapper : "+(y1==x)); // verify that they refer
		// to the same object

		y1 ++; 								 // unwrap, use, "rewrap"  //gic formation of NEW reference
		System.out.println(x + " " + y1);	 // print values
		System.out.println(y1==x); 			// verify that they refer
		System.out.println("Comparing 801 & 802 via Wrapper : "+(y1.equals(x)));
		// to different objects
		System.out.println("");
		
		
		System.out.println("---------primitive---------start");
		
		
		int yi2=801;
		int xi2=yi2;
		System.out.println(xi2==yi2);
		// System.out.println(x2.equals(y2));   //compilation error ???..bec they are primitive...class can access its method not primitives can
		yi2++;
		System.out.println(xi2==yi2);	
		
		
		System.out.println("---------primitive---------end");
		

		//Look at below examples ...a grt concept 
		//Wrapper holds the reference to the object i.e. address of the place where the object would be found
		Integer i1 = 1000;
		//here i1 contains(refers to ) the address of value 1000 in memory
		Integer i2 = 1000;

		if(i1 != i2) 								 // so both the address will nvr be same
		{											 // This process is called autoboxing. 
			System.out.println("different objects"); // That is automatically putting a primitive-instance in a "box" of Integer.
		}

		if(i1.equals(i2))
		{
			System.out.println("meaningfully equal");
		}


		int a=1000;				//Primitive here it refers to the same value...not address
		int b=1000;
		if(a!=b )
		{
			System.out.println("NOT EQUIVALENT");
		}
		else
		{
			System.out.println("EQUIVALENTS");
		}

		/*	if(a.equals(b))							//COMPILATION ERROR
		 											//On Primitive types equals function not possible	
			{										//byte,short,int,long,float,double,boolean,char --> 8 primitive data types
				System.out.println("Equivalent");
			}
		 */

		System.out.println(" ");

		// BUT == Sign creating exceptional behavior

		Integer i3 = 100;
		Integer i4 = 100;
		if(i3 == i4)					                 //When == is used to compare a primitive to a wrapper, the wrapper will be
		{											 //unwrapped and the comparison will be primitive to primitive.
			System.out.println("same object");
		}
		if(i3.equals(i4))
		{
			System.out.println("meaningfully equal");
		}

		//What happened to != & == :(

		System.out.println("");
		String a1= "Zo";
		String  b1="Zo";

		if(a1==b1)
		{
			System.out.println("OK STRINGS-----------1");
		}

		if(a1.equals(b1))
		{
			System.out.println("OK STRINGS-----------2");
		}


		//------Example
                System.out.println("x1  :"+x1);
		System.out.println("X2 :"+x2);
		
                
		doStuff(x2);
//		doStuff(x1);
	}

	static Integer x1;
	static int x2;		

	static void doStuff(int z) {
		int z2 = 5;
		System.out.println(z2 +""+ z);
	}

}

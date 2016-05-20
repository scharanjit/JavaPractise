package OCJPChap3;

/*
 * 
 * All of the wrapper classes except Character provide two constructors: one that takes
a primitive of the type being constructed, and one that takes a String representation
of the type being constructed

 *
 */
public class WrapperConstructor {


	Integer i1 = new Integer(42);
	Integer i2 = new Integer("42");

	Float f1 = new Float(3.14f);
	Float f2 = new Float("3.14f");
	//

	//The Character class provides only one constructor, which takes a char as an  argument

	Character c1 = new Character('c');

	Boolean b = new Boolean("false");

	Boolean b1 = new Boolean(false);
	
	public static void main(String[] args) {
		Integer bb= Integer.valueOf("1011",2);
		System.out.println("bb : "+bb); 

		Float f23 = Float.valueOf("3.14f");
		System.out.println(f23);


		Integer i2 = new Integer(42); // make a new wrapper object
		byte b = i2.byteValue(); // convert i2's value to a byte
		// primitive
		System.out.println(b);
		short s = i2.shortValue(); // another of Integer's xxxValue
		// methods
		System.out.println(s);
		double d = i2.doubleValue(); // yet another of Integer's
		// xxxValue methods
		System.out.println(d);

		Float f2 = new Float(3.14f); // make a new wrapper object
		short ss = f2.shortValue(); // convert f2's value to a short
		// primitive
		System.out.println(ss); // result is 3 (truncated, not
		// rounded)



		double d4 = Double.parseDouble("3.14"); // convert a String
		// to a primitive
		System.out.println("d4 = " + d4); // result is d4 = 3.14

		Double d5 = Double.valueOf("3.14"); // create a Double obj
		System.out.println(d5 instanceof Double); // result is "true"

		long L2 = Long.parseLong("101010", 2); // binary String to a
		// primitive
		System.out.println("L2 = " + L2); // result is: L2 = 42
		Long L3 = Long.valueOf("101010", 2); // binary String to
		// Long object
		System.out.println("L3 value = " + L3); // result is:
		// L3 value = 42



		String sa = "hex = "+ Long.toString(254,16);
		System.out.println(sa);


	}



}



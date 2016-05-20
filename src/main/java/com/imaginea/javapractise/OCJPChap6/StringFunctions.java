package OCJPChap6;

public class StringFunctions {
	public static void main(String[] args) {
		String x = "airplane";
		System.out.println( x.charAt(2) ); // output is 'r'

		String x1 = "taxi";
		System.out.println( x1.concat(" cab") ); // output is "taxi cab"

		String x2 = "Exit";
		System.out.println( x2.equalsIgnoreCase("EXIT")); // is "true"
		System.out.println( x2.equalsIgnoreCase("tixe")); // is "false"

		String x3 = "01234567";
		System.out.println( x3.length() ); // returns "8"


		String x4 = "oxoxoxox";
		System.out.println( x4.replace('x', 'X') ); // output is
		// "oXoXoXoX"



		/*Arrays have an attribute (not a method), called length. You may
			encounter questions in the exam that attempt to use the length() method on an array,
			or that attempt to use the length attribute on a String. Both cause compiler errors—*/
		System.out.println("------------------------------");
		String x5 = "test";
		//System.out.println( x5.length );// compiler error
		System.out.println( x5.length() ); 

		String[] x6 = new String[3];
		//System.out.println( x6.length() ); // compiler error
		System.out.println( x6.length ); 

		System.out.println("------------------------------");
		String x7 = "0123456789"; // as if by magic, the value
		// of each char
		// is the same as its index!
		System.out.println( x7.substring(5) ); // output is "56789"
		System.out.println( x7.substring(5, 8)); // output is "567"
		System.out.println("*********************************");

		String x8 = "big surprise";
		System.out.println( x8.toString() );


		String x9 = "           hi             ";
		System.out.println( x9 + "x" ); // result is
		// " hi x"
		System.out.println( x9.trim() + "x"); // result is "hix"
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		String x10 = "A New Moon";
		System.out.println( x10.toUpperCase() ); // output is
		// "A NEW MOON"


		String x11 = "A New Moon";
		System.out.println( x11.toLowerCase() ); // output is
		// "a new moon"


	}

}

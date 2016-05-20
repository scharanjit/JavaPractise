package OCJPChap6;

public class StringImut {
	public static void main(String[] args) {
		String s= "abc";
		String s2=s;
		s=s.concat("def");
		
		System.out.println("s2 = "+s2+ " s ="+s);
		String m = new String("gyom");
		System.out.println(m);
		String x = "Java";
		x.concat(" Rules!"); //use this x=x.concat(" Rules!");
		System.out.println("x = " + x); // the output is "x = Java"

		System.out.println("------------------------------------");

		/*The first line is straightforward: create a new String object, give it the value
		"Java", and refer x to it. Next the VM creates a second String object with the value
		"Java Rules!" but nothing refers to it. The second String object is instantly lost;
		you can't get to it. The reference variable x still refers to the original String with the
		value "Java".*/

		x.toUpperCase();
		System.out.println("x = " + x); // the output is still:
		// x = Java

		x.replace('a', 'X');
		System.out.println("x = " + x); // the output is still:
		// x = Java
		System.out.println("*************************************************");
		//	String x = "Java";
		x = x.concat(" Rules!"); // Now we're assigning the
		// new String to x
		System.out.println("x = " + x); // the output will be:
		// x = Java Rules!

		String s1 = "spring ";
		String s22 = s1 + "summer ";
		s1.concat("fall ");
		s22.concat(s1);
		s1 += "winter ";
		System.out.println(s1 + " " + s22);

		/*To make Java more memory efficient, the
JVM sets aside a special area of memory called the "String constant pool." When the
compiler encounters a String literal, it checks the pool to see if an identical String
already exists. If a match is found, the reference to the new literal is directed to the
existing String, and no new String literal object is created. (The existing String simply
has an additional reference.) Now we can start to see why making String objects
immutable is such a good idea. If several reference variables refer to the same String
without even knowing it, it would be very bad if any of them could change the
String's value.
You might say, "Well that's all well and good, but what if someone overrides the
String class functionality; couldn't that cause problems in the pool?" That's one of
the main reasons that the String class is marked final. Nobody can override the
behaviors of any of the String methods, so you can rest assured that the String
objects you are counting on to be immutable will, in fact, be immutable.*/ 


	}

}

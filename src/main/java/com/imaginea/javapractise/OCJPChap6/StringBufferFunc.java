package OCJPChap6;

public class StringBufferFunc
{
	public static void main(String[] args)
	{

		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println("sb = " + sb); 				// output is "sb = abcdef"

		StringBuilder sb1 = new StringBuilder("abc");
		sb1.append("def").reverse().insert(3, "<--->");
		System.out.println( "sb1 = "+sb1 ); 			// output is "fed---cba"

		StringBuffer sb2 = new StringBuffer("set ");
		sb2.append("point");
		System.out.println(sb2); // output is "set point"
		StringBuffer sb3 = new StringBuffer("pi = ");
		sb3.append(3.14159f);
		System.out.println(sb3); // output is "pi = 3.14159"

		System.out.println("=====================================");
		
		StringBuilder sb4 = new StringBuilder("0123456789");
		System.out.println(sb4.delete(4,6)); // output is "01236789"

		StringBuffer s = new StringBuffer("A man a plan a canal Panama");
		s.reverse();
		System.out.println(s); // output: "amanaP lanac a nalp a nam A"

		StringBuilder sb5 = new StringBuilder("01234567");
		sb5.insert(4, "---");
		System.out.println( sb5 ); // output is "0123---4567"


		/*Many of the exam questions covering this chapter’s topics use a tricky
(and not very readable) bit of Java syntax known as "chained methods." A statement
with chained methods has this general form:
result = method1().method2().method3();
In theory, any number of methods can be chained in this fashion,
although typically you won't see more than three. Here's how to decipher these
"handy Java shortcuts" when you encounter them:
1. Determine what the leftmost method call will return (let’s call it x).
2. Use x as the object invoking the second (from the left) method. If there
are only two chained methods, the result of the second method call is
the expression's result.
3. If there is a third method, the result of the second method call is used
to invoke the third method, whose result is the expression's result—
for example,
String x = "abc";
String y = x.concat("def").toUpperCase().replace('C','x');
//chained methods
System.out.println("y = " + y); // result is "y = ABxDEF"
Let's look at what happened. The literal def was concatenated to abc,
creating a temporary, intermediate String (soon to be lost), with the value abcdef.
The toUpperCase() method created a new (soon to be lost) temporary String with
the value ABCDEF. The replace() method created a fi nal String with the value ABxDEF,
and referred y to it.*/



		String x = "abc";
		String y = x.concat("def").toUpperCase().replace('C','x');

		System.out.println(y);
	}
}
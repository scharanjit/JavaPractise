package OCJPChap10;

import java.util.*;
public class _8Values {
	public static void main(String[] args)
	{
		Properties p = System.getProperties();
		p.setProperty("myProp", "myValue");
		System.out.println(p.getProperty("cmdProp") + " ");
		System.out.println(p.getProperty("myProp") + " ");
		System.out.println(p.getProperty("noProp") + " ");
		p.setProperty("cmdProp", "newValue");
		System.out.println(p.getProperty("cmdProp"));
	}
}


/*
And given the command line invocation:
java -DcmdProp=cmdValue Values
What is the result?
A. null myValue null null
B. cmdValue null null cmdValue
C. cmdValue null null newValue
D. cmdValue myValue null cmdValue
E. cmdValue myValue null newValue
F. An exception is thrown at runtime

Answer:

E is correct. System properties can be set at the command line, as indicated correctly in
the example. System properties can also be set and overridden programmatically.

*/
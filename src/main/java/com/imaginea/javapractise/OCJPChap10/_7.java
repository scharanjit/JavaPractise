package OCJPChap10;

public class _7 {

}

/*
Given:

import java.util.*;
public class Antique
 {
 	public static void main(String[] args) 
 	{
 		List<String> myList = new ArrayList<String>();
 		assert (args.length > 0);
 		System.out.println("still static");
 	}
 }

Which sets of commands (javac followed by java) will compile and run without exception or
error? (Choose all that apply.)
A. javac Antique.java
java Antique

B. javac Antique.java
java -ea Antique

C. javac -source 6 Antique.java
java Antique

D. javac -source 1.4 Antique.java
java Antique

E. javac -source 1.6 Antique.java
java -ea Antique

Answer:
A and C are correct. 
If assertions (which were first available in Java 1.4) are enabled, an
AssertionError will be thrown at line 7.

*/

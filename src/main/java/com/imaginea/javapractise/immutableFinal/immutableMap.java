package immutableFinal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class immutableMap extends m {
	
	public static void main(String[] args) {
		HashMap<String, Object> modifiableMap = new HashMap<String, Object>();
		modifiableMap.put("1", new Object());
		modifiableMap.put("2", new Object());
		modifiableMap.put("9",new Object());
		System.out.println(modifiableMap);
		Map<String, Object> unmodifiableMap = Collections.unmodifiableMap(modifiableMap);
		         
		//unmodifiableMap.put("3",new Object());
		System.out.println(unmodifiableMap);
		
		
		
		
	}
	public static void meth()
	{
		}

}


class m
{
	
public static void meth()
{
	}
	}


/* HOW TO ACHIEVE IMMUTABILITY

To create an immutable Java Bean, you need to type:

The list of private fields.

A constructor containing the fields and assigning this.myField = myField.

int hashCode() - ideally generating the hashCode as part of the constructor and
storing it for immediate recall.

Generating the hashCode in the constructor improves performance when looking up 
beans in HashMap collections. 
The hashCode is calculated once rather than every time a lookup is performed.

boolean equals(Object)  //to check null reference

String toString()

Normally a java.io.Serializable designation (by implementing the interface) and
a serialVersionUID declaration.





*/
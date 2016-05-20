package OCJPChap7;

import java.util.HashMap;

/*The problem is caused by the un-overridden method "hashCode()". 
 * The contract between equals() and hasCode() is that:
1. If two objects are equal, then they must have the same hash code.
2. If two objects have the same hashcode, they may or may not be equal.

The idea behind a Map is to be able to find an object faster than a linear search.
Using hashed keys to locate objects is a two-step process. 
Internally the Map stores objects as an array of arrays. 
The index for the first array is the hashcode() value of the key.
This locates the second array which is searched linearly by using equals() to determine 
if the object is found.

The default implementation of hashCode() in Object class returns distinct integers for
different objects. Therefore, in the example above, different objects(even with same type) 
have different hashCode.

Hash Code is like a sequence of garages for storage, different stuff can be stored
in different garages. It is more efficient if you organize stuff to different place
instead of the same garage. So it's a good practice to equally distribute the hashCode value.
(Not the main point here though)

So, whenevr we are putiing data into mat with a key, key stores with some hascode &
corresponding to that hashcode value, inside an array, we goona store our actual value.

So when ever data enter inside a map , it is calling hashCode() method

*/
public class Applee1 {
	private String color;
 
	public Applee1(String color) 
	{
		this.color = color;
	}
 
	public boolean equals(Object obj) 
	{
		if (!(obj instanceof Applee1))
			return false;	
		
		if (obj == this)
			return true;
		
		return this.color.equals(((Applee1) obj).color);
		
	
	}
	////////////////////////////////////////
	public int hashCode()
	{
		System.out.println("we are putting keys with data");
		return this.color.length();	
	}
	////////////////////////////////////////
	public static void main(String[] args) 
	{
		Applee1 a1 = new Applee1("green");
		Applee1 a2 = new Applee1("red");
 
		//hashMap stores apple type and its quantity
		HashMap<Applee1, Integer> m = new HashMap<Applee1, Integer>();
		m.put(a1, 12220);
		m.put(a1, 101);
		m.put(a2, 20);
		
		System.out.println(m.get(new Applee1("green")));
	}
}

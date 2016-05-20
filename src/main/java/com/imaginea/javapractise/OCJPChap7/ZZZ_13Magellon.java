package OCJPChap7;

import java.util.*;
public class ZZZ_13Magellon {

	public static void main(String[] args) 
	{
		TreeMap<String, String> myMap = new TreeMap<String, String>();
		myMap.put("a", "apple");
		myMap.put("d", "date");
		myMap.put("f", "fig");
		myMap.put("p", "pear");
		System.out.println("1st after mango: " + // sop 1 
				myMap.higherKey("f"));
		
		System.out.println("1st after mango: " + // sop 2
				myMap.ceilingKey("f"));
		
		System.out.println("1st after mango: " + // sop 3
				myMap.floorKey("f"));
		
		SortedMap<String, String> sub = new TreeMap<String, String>();
		sub = myMap.tailMap("f");
		
		System.out.println("1st after mango: " + // sop 4
				sub.firstKey());
		
	}
}

/*Which of the System.out.println statements will produce the output 1st after mango: p?

  A. sop 1
 * A is correct. The ceilingKey() method's argument is inclusive. The floorKey() method
would be used to find keys before the specified key. The firstKey() method's argument is
also inclusive
 * 
 * */

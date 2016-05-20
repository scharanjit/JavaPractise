package OCJPChap7;

import java.util.*;
public class Z_20Ferry 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205); // add some departure times
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(200);
		
		System.out.println(times);
		//Java 5 version
		TreeSet<Integer> subset = new TreeSet<Integer>();
		subset = (TreeSet)times.headSet(1600);
		System.out.println("J5 - last before 4pm is: " + subset.last());
		TreeSet<Integer> sub2 = new TreeSet<Integer>();
		sub2 = (TreeSet)times.tailSet(2000);
		System.out.println("J5 - first after 8pm is: " + sub2.first());
		
		//Java 6 version using the new lower() and higher() methods
		System.out.println("J6 - last before 4pm is: " + times.lower(1600));
		System.out.println("J6 - first after 8pm is: " + times.higher(2000));
		
		System.out.println("times.ceiling(1600) :- "+times.ceiling(1500));
		/*
		 * 
		 * The difference between lower() and floor() is that lower()
			returns the element less than the given element, and floor() returns the element
			less than or equal to the given element. Similarly, higher() returns the element
			greater than the given element, and ceiling() returns the element greater than or
			equal to the given element.

		Method 								Description
		TreeSet.ceiling(e) 					Returns the lowest element >= e
		TreeMap.ceilingKey(key) 			Returns the lowest key >= key
		TreeSet.higher(e) 					Returns the lowest element > e
		TreeMap.higherKey(key) 				Returns the lowest key > key
		TreeSet.floor(e) 					Returns the highest element <= e
		TreeMap.floorKey(key) 				Returns the highest key <= key
		TreeSet.lower(e) 					Returns the highest element < e
		TreeMap.lowerKey(key) 				Returns the highest key < key
		TreeSet.pollFirst() 				Returns and removes the first entry
		TreeMap.pollFirstEntry() 			Returns and removes the first key-value pair
		TreeSet.pollLast()				    Returns and removes the last entry
		TreeMap.pollLastEntry() 			Returns and removes the last key-value pair
		TreeSet.descendingSet() 			Returns a NavigableSet in reverse order
		TreeMap.descendingMap() 			Returns a NavigableMap in reverse order



*/
}
}
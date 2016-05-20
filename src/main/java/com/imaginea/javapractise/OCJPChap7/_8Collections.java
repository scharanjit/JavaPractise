package OCJPChap7;

import java.util.Set;
import java.util.TreeSet;

public class _8Collections {
	
	public static  void main(String[] args) {
		Set se = new TreeSet();
	}
/*
 *
 Three meanings for "collection":
collection --> Represents the data structure in which objects are stored
Collection --> java.util interface from which Set and List extend
Collections--> A class that holds static collection utility methods
 
Four basic flavors of collections include Lists, Sets, Maps, Queues:

Lists of things Ordered, duplicates allowed, with an index.

Sets of things May or may not be ordered and/or sorted; duplicates
not allowed.

List = 1/Set

Maps of things with keys May or may not be ordered and/or sorted;
duplicate keys are not allowed.

Queues of things to process Ordered by FIFO or by priority.

 * Map
 * 1.) HashMap   Unordered & Unsorted --> HashMap allows one null key and multiple null values in a collection.
 * 2.) HashTable Unordered & Unsorted --> HashTable doesn't let you have anything that's null
 * 3.) LinkedHashMap Ordered by insertion order or last access order but UNSORTED
 * 4.) TreeMap	Ordered & Sorted by natural order or custom comparison rules. 
 *
 */	
}

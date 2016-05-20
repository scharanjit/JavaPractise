package OCJPChap7;
//VIMPORTANT

//sorting an string array & searching data

/*
 * When solving searching and sorting questions, two big gotchas are
1. Searching an array or collection that hasn’t been sorted.
2. Using a Comparator in either the sort or the search,
but not both.
 * */
import java.util.*;

public class Z_14SearchObjArray {
	public static void main(String [] args) 
	{
		String [] sa = {"one", "two", "three", "four"};
		Arrays.sort(sa); // #1
		for(String s : sa)
		{
			System.out.print(s + " ");
		}
		System.out.println("\n one = "+ Arrays.binarySearch(sa,"one")); // #2  //index one after sorting

		System.out.println("now reverse sort");
		ReSortComparator rs = new ReSortComparator(); // #3

		Arrays.sort(sa,rs);
		for(String s : sa)
		{
			System.out.print(s + " ");
		}
		System.out.println("\n one = "+ Arrays.binarySearch(sa,"one")); // #4 //we got the incorrect ..bec sorting is hapening here
		System.out.println("one = "+ Arrays.binarySearch(sa,"one",rs)); // #5
	}

	static class ReSortComparator implements Comparator<String>  { // #6
		public int compare(String a, String b)
		{
			//System.out.println(b.compareTo(a));
			return b.compareTo(a); // #7
		}
	}
}
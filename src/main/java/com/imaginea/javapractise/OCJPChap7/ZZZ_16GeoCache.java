package OCJPChap7;

import java.util.*;
public  class ZZZ_16GeoCache{

	public static void main(String[] args)
	{
		String[] s = {"map", "pen", "marble", "key"};
		Arrays.sort(s);
		for(String s7: s) 
			System.out.print(s7 + " ");
				System.out.println("");
				System.out.println("dsdsa--> "+ Arrays.binarySearch(s, "key"));
				System.out.println("dsdsa--> "+ Arrays.binarySearch(s, "map"));
				System.out.println("dsdsa--> "+ Arrays.binarySearch(s, "marble"));
				System.out.println("dsdsa--> "+ Arrays.binarySearch(s, "pen"));
				




				System.out.println("==================================");
				Othello o = new Othello();
				Arrays.sort(s,o);
				for(String s2: s) 
					System.out.print(s2 + " ");
						System.out.println("");
						System.out.println(Arrays.binarySearch(s, "map"));
	}
	static class Othello implements Comparator<String>
	{
		public int compare(String a, String b)
		{
			return b.compareTo(a);  //reverse order
		}
	}

}



/*The output will contain a 2
  D. The output will contain a –1
  E. An exception is thrown at runtime
  F. The output will contain "key map marble pen"
  G. The output will contain "pen marble map key"
  Answer:
   D and G are correct. First, the compareTo() method will reverse the normal sort.
  Second, the sort() is valid. Third, the binarySearch() gives –1 because it needs to be
  invoked using the same Comparator (o), as was used to sort the array. Note that when the
  binarySearch() returns an "undefined result" it doesn’t officially have to be a -1, but it
  usually is, so if you selected only G, you get full credit!*/
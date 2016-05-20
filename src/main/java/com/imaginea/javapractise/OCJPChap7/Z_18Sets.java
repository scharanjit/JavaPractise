package OCJPChap7;

//Sets are used when you don't want any duplicates in your collection
//HashSets do not guarantee any ordering.
import java.util.*;
public class Z_18Sets {
	public static void main(String[] args)
	{
		boolean[] ba = new boolean[6];
		
		Set s = new HashSet();
		//Set s = new TreeSet();
		
		ba[0] = s.add("b");					
		ba[1] = s.add(new Integer(42));  //for tree set it will show error //whenever you want a collection to be sorted, its elements must be mutually comparable
		ba[2] = s.add("a");
		ba[3] = s.add("a");
		ba[4] = s.add(new Object());
		ba[5] = s.add("b");
		System.out.println(s);
		for(int x=0; x<ba.length; x++)
		{
			System.out.print(ba[x] + " ");   //false value showing that duplicate
		}

		System.out.println("\n");
		for(Object o : s)
		{
			System.out.print(o + " ");     //HashSets do not guarantee any ordering.
		}
			
			
			
	}
}
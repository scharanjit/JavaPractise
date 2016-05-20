package OCJPChap7;

import java.util.ArrayList;
import java.util.List;

public class ZZ_1Test {
	public static void main(String[] args) 
	{
		// INSERT DECLARATION HERE
		//List<List<Integer>> table1 = new List<List<Integer>>();
		 List<List<Integer>> table = new ArrayList<List<Integer>>();
		 
		 		 
		// List<List<Integer>> table2 = new ArrayList<ArrayList<Integer>>();
		 
		// List<List, Integer> table3 = new List<List, Integer>();
		// List<List, Integer> table4 = new ArrayList<List, Integer>();
		// List<List, Integer> table5 = new ArrayList<ArrayList, Integer>();
		
		
		for (int i = 0; i <= 10; i++) 
		{
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j <= 10; j++)
			{
				row.add(i * j);
			}
			table.add(row);
		}
		for (List<Integer> row : table)
		{
			System.out.println(row);
		}
	}
}

/*
 * A is incorrect because List is an interface, so you can't say new List() regardless of
any generic types. D, E, and F are incorrect because List only takes one type parameter
(a Map would take two, not a List). C is tempting, but incorrect. The type argument
<List<Integer>> must be the same for both sides of the assignment, even though the
constructor new ArrayList() on the right side is a subtype of the declared type List on
the left.*/

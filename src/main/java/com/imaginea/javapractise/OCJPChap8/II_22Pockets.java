package OCJPChap8;

import java.util.*;
public class II_22Pockets {
	public static void main(String[] args)
	{
		String[] sa = {"nickel", "button", "key", "lint"};
		Sorter s = new Sorter();
		for(String s2: sa) 
			System.out.print(s2 + " ");

	Arrays.sort(sa,s);

				System.out.println();

				for(String s2: sa) 
					System.out.print(s2 + " ");
	}
	static class Sorter implements Comparator<String> 
	{
		public int compare(String a, String b)
		{
			return b.compareTo(a);
		}
	}
}


/*
A. Compilation fails

A is correct, the inner class Sorter must be declared static to be called from the static
method main(). If Sorter had been static, answer E would be correct.*/
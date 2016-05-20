package OCJPChap7;

import java.util.*;
class Dogi <T> implements Comparable<T>
{ 
	int size;
	Dogi(int s) 
	{
		size = s; 
	}


	@Override
	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		return 1;
	}


}
public class ZZZ_15Comparable {
	public static void main(String[] args) {
		TreeSet<Integer> i = new TreeSet<Integer>();
		TreeSet<Dogi> d = new TreeSet<Dogi>();

		d.add(new Dogi(1)); d.add(new Dogi(2)); d.add(new Dogi(1));
		i.add(1); i.add(2); i.add(1);
		System.out.println(d.size() + " " + i.size());
	}
}

/* G is correct. Class Dog needs to implement Comparable in order for a TreeSet (which
		 keeps its elements sorted) to be able to contain Dog objects.*/
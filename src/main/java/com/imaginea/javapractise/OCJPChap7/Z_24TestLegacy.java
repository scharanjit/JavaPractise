package OCJPChap7;

//a Java 5 class using a generic collection
import java.util.*;
public class Z_24TestLegacy 
{
	public static void main(String[] args)
	{
		List<Integer> myList = new ArrayList<Integer>();
		//type safe collection
		//List<int> mylist2 = new ArrayList<int>();
		myList.add(4);
		myList.add(6);
		Adder adder = new Adder();
		System.out.println(myList);
		int total = adder.addAll(myList);
		//pass it to an untyped argument
		System.out.println(total);
	}
}


class Adder {
	int addAll(List list)
	{
		// method with a non-generic List argument,
		// but assumes (with no guarantee) that it will be Integers
		Iterator it = list.iterator();
		int total = 0;
		while (it.hasNext())
		{
			int i = ( (Integer) it.next()).intValue();
			total += i;
		}
		return total;
	}
}
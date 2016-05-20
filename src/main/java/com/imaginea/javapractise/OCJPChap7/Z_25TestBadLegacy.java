package OCJPChap7;
/*
 * IF WE MIX GENERIC & NON GENERIC CODE....the below things gonna happens
 * No runtime exception. Yet, someone just stuffed a String into a supposedly type safe ArrayList of
type <Integer>. How can that be? :(:(
 * */
import java.util.*;
public class Z_25TestBadLegacy 
{

	public static void main(String[] args) 
	{
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		System.out.print(myList);
		System.out.println();
		Inserter in = new Inserter();
		in.insert(myList); // pass List<Integer> to legacy code

		/*
		 * Remember, the older legacy code was allowed to put anything at all (except
primitives) into a collection. And in order to support legacy code, Java 5 and Java 6
allows your newer type safe code to make use of older code (the last thing Sun wanted
to do was ask several million Java developers to modify all their existing code).*/

		System.out.println(myList);


		List test = new ArrayList();
		test.add(43);
		int x = (Integer)test.get(0); // you must cast !!
		System.out.println();
		System.out.println(++x);
		List<Integer> test2 = new ArrayList<Integer>();
		test2.add(343);
		int x2 = test2.get(0); // cast not necessary
		//Watch out for missing casts associated with pre-Java 5,
		//non-generic collections.
		System.out.println(++x2);
	}
}

class Inserter
{
	// method with a non-generic List argument

	void insert(List list) 
	{
		list.add(new Integer(41)); // adds to the incoming list


		list.add(new String("42")); // put a String in the list
		// passed in

		list.add(5);
	}
}
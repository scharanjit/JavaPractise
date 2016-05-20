package OCJPChap7;

import java.util.*;
public class Z_29TestWildCards 
{
	public static void main(String[] args) 
	{
		List<Integer> myList = new ArrayList<Integer>();
		Bar bar = new Bar();
			bar.doInsert(myList);


		List<?> list = new ArrayList<Dog>();
		List<? extends Animall> aList = new ArrayList<Doggg>();
		//List<? super Animall> aLis11t = new ArrayList<Doggg>();
		//List<?> foo = new ArrayList<? extends Animall>();

		/* Statement: List<?> foo = new ArrayList<? extends Animal>();
			Problem: you cannot use wildcard notation in the object creation. So the
			new ArrayList<? extends Animal>() will not compile*/

		//List<? extends Doggg> cList = new ArrayList<Integer>();
		//List<? super Doggg> cList = new ArrayList<Character>();

		/*
		 * You cannot assign an Integer list to a reference that takes only a
			Dog (including any subtypes of Dog, of course).*/
		List<? super Doggg> bList = new ArrayList<Animall>();
		//List<? super Animall> dList = new ArrayList<Doggg>();
		/*You cannot assign a Dog to <? super Animal>. The Dog is too "low"
		in the class hierarchy. Only <Animal> or <Object> would have been legal.*/
	}
}
class Bar {
	void doInsert(List<? /* super Doggg*/> list) {
		
//list.add(new Doggg());
}
	/*
The <?>
wildcard allows a list of ANY type to be passed to the method, but the add()
method is not valid, for the reasons we explored earlier (that you could put the
wrong kind of thing into the collection). So this time, the TestWildcards class is
fine, but the Bar class won't compile because it does an add() in a method that uses
a wildcard (without super).
	 */

	/*
	void doInsert1(List<Object> list) {
		list.add(new Dog());
		}
		This time, class Bar, with the doInsert() method, compiles just fine. The
problem is that the TestWildcards code is trying to pass a List<Integer> into a
method that can take ONLY a List<Object>. And nothing else can be substituted for
<Object>.
	 */



}







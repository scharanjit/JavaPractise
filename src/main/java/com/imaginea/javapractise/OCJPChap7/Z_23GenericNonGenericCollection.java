package OCJPChap7;
//An ArrayList<Animal> can accept references of type Dog, Cat, or any other
//subtype of Animal (subclass, or if Animal is an interface, implementation).
//Advantage of generic
///When using generic collections, a cast is not needed to get (declared type) elements
//out of the collection. With non-generic collections, a cast is required:
//List<String> gList = new ArrayList<String>();
//List list = new ArrayList();
// more code
//String s = gList.get(0); // no cast needed
//String s = (String)list.get(0); // cast required


/*Polymorphic assignments applies only to the base type, not the generic type
parameter. You can say
List<Animal> aList = new ArrayList<Animal>(); // yes
You can't say
List<Animal> aList = new ArrayList<Dog>(); // no
--> important
Parent p = new Child();  --> possible




The wildcard keyword extends is used to mean either "extends" or "implements."
So in <? extends Dog>, Dog can be a class or an interface.

When using a wildcard, List<? extends Dog>, the collection can be
accessed but not modified.

When using a wildcard, List<?>, any generic type can be assigned to the
reference, but for access only, no modifications.

 *
 */


import java.util.ArrayList;
import java.util.List;



public class Z_23GenericNonGenericCollection {
	public static void main(String[] args) {

		
		
		List myList = new ArrayList(); // can't declare a type
		myList.add("Fred"); // OK, it will hold Strings
		myList.add(new Dogee()); // and it will hold Dogs too
		myList.add(new Integer(42)); // and Integers...
		/*A non-generic collection can hold any kind of object! A non-generic collection
		is quite happy to hold anything that is NOT a primitive.

		 *
		 *
		 *
		 *
		 *But Generics takes care of both ends (the putting in and getting out) by enforcing
the type of your collections.
		 *
		 */


		List<String> myList1 = new ArrayList<String>();
		myList1.add("Fred"); // OK, it will hold Strings

		//	myList1.add(new Dogee()); // compiler error!!



		/*which means putting the type in angle brackets <String>, we're telling the compiler that this
		collection can hold only String objects. The type in angle brackets is referred to as
		either the "parameterized type," "type parameter," or of course just old-fashioned
		"type."*/



	}

	public List<Dogee> getDogList() {
		List<Dogee> dogs = new ArrayList<Dogee>();
		// more code to insert dogs
		return dogs;
	}

}

class Dogee{}


package OCJPChap7;

import java.util.*;

import javax.swing.JButton;

public class Z_26PolymorphismGenerics {

	public static void main(String[] args) {
		//List<Parent> myList4 = new ArrayList<Child>(); 		//remove cmnts once
		//List<Child> myList4 = new ArrayList<Parent>();
		//	But in arrays...this is allowed
		Parent[] myArray = new Child[3]; // yes

		/*	No, it doesn't work. There's a very simple rule here—the type of the variable
		declaration must match the type you pass to the actual object type. If you declare
		List<Foo> foo then whatever you assign to the foo reference MUST be of the
		generic type <Foo>. Not a subtype of <Foo>. Not a supertype of <Foo>. Just <Foo>.
		These are wrong:*/
		//List<Object> myList5 = new ArrayList<JButton>(); // NO!
		//List<Number> numbers = new ArrayList<Integer>(); // NO!
		// remember that Integer is a subtype of Number
		//But these are fine:
		List<JButton> myList1 = new ArrayList<JButton>(); // yes
		List<Object> myList2 = new ArrayList<Object>(); // yes
		List<Integer> myList3 = new ArrayList<Integer>(); // yes
		Object[] myArray1 = new JButton[3]; // yes

		//	List<Object> list = new ArrayList<JButton>(); // NO!

	}

}

class Parent { }
class Child extends Parent { }

package OCJPChap8;

//this is method local inner class....
// this is NOT a simple inner class
class Boo 
{
	Boo(String s) { }
	Boo(){}
}
public class I_12Bar extends Boo 
{
	I_12Bar() 	{}
	I_12Bar(String s) 
	{
		super(s);
	}
	
	void zoo() 
	{
		// insert code here
		Boo f = new I_12Bar() { };
		//Boo f = new Boo() {String s; };
	}
}
/*

Which create an anonymous inner class from within class I_12Bar? (Choose all that apply.)
A. Boo f = new Boo(24) { };   --> int constructor string
B. Boo f = new I_12Bar() { };
C. Boo f = new Boo() {String s; };
D. Bar f = new Boo(String s) { };   //child refering aprent -->error
E. Boo f = new Boo.Bar(String s) { };

 *
B and C. B is correct because anonymous inner classes are no different from any other
class when it comes to polymorphism. That means you are always allowed to declare a
reference variable of the superclass type and have that reference variable refer to an
instance of a subclass type, which in this case is an anonymous subclass of Bar. Since Bar
is a subclass of Boo, it all works. C uses correct syntax for creating an instance of Boo.

 A is incorrect because it passes an int to the Boo constructor, and there is no matching
constructor in the Boo class. D is incorrect because it violates the rules of polymorphism;
you cannot refer to a superclass type using a reference variable declared as the subclass
type. The superclass doesn't have everything the subclass has. E uses incorrect syntax.
 */
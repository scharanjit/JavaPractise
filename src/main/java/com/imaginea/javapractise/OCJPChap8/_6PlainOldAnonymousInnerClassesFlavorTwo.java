package OCJPChap8;


/*The only difference between flavor one and flavor two is that flavor one creates
an anonymous subclass of the specified class type, whereas flavor two creates an
anonymous implementer of the specified interface type*/


public class _6PlainOldAnonymousInnerClassesFlavorTwo {

}


interface Cookable
{
	public void cook();
}
class Foodw
{
	Cookable c = new Cookable() 
	{
		public void cook() 
		{
			System.out.println("anonymous cookable implementer");
		}
	};  //<--  look the semi column
}


/*Don't be fooled by any attempts to instantiate an interface except in the
case of an anonymous inner class. The following is not legal,

Runnable r = new Runnable(); // can't instantiate interface

whereas the following is legal, because it's instantiating an implementer of the
Runnable interface (an anonymous implementation class):

Runnable r = new Runnable() 
{ // curly brace, not semicolon
	public void run()
	 { 
	 
	 }
};*/
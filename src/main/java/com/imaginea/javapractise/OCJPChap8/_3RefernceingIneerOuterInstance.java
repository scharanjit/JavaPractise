package OCJPChap8;
/*The keyword this can be used only from within instance code.
In other words, not within static code.

*So the rules for an inner class referencing itself or the outer instance are as follows:
--> To reference the inner class instance itself, from within the inner class code,
use this.
 --> To reference the "outer this" (the outer class instance) from within the inner
class code, use NameOfOuterClass.this (example, MyOuter.this).
*
*/

public class _3RefernceingIneerOuterInstance 
{
	private int x = 7;
	public void makeInner() 
	{
		MyInner in = new MyInner();
		in.seeOuter();
	}
	class MyInner 
	{
		public void seeOuter() 
		{
			System.out.println("Outer x is " + x);
			System.out.println("Inner class ref is " + this);
			System.out.println("Outer class ref is " + _3RefernceingIneerOuterInstance.this);
		}
	}
	public static void main (String[] args)
	{
		_3RefernceingIneerOuterInstance.MyInner inner = new _3RefernceingIneerOuterInstance().new MyInner();
		inner.seeOuter();
	}
}


/*

A regular inner class is a
member of the outer class just as instance variables and methods are, so the
following modifiers can be applied to an inner class:
 final
 abstract
 public
 private
 protected
 static—but static turns it into a static nested class not an inner class
 strictfp

*/
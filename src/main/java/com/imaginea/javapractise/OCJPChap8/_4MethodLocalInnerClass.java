package OCJPChap8;
// method stack life time variable life time
public class _4MethodLocalInnerClass {
	private String x = "Outer2";
	void doStuff() 
	{
		String z = "local variable";
		class MyInner 
		{
			public void seeOuter() 
			{
				System.out.println("Outer x is " + x);
				//	System.out.println("Local var"+z);		// Won't Compile!
				//why...below is the reason
				/*
				 * The local variables of the method live on the stack, and exist only for
					the lifetime of the method. You already know that the scope of a local variable is
					limited to the method the variable is declared in. When the method ends, the stack
					frame is blown away and the variable is history. But even after the method
					completes, the inner class object created within it might still be alive on the heap if,
					for example, a reference to it was passed into some other code and then stored in an
					instance variable. Because the local variables aren't guaranteed to be alive as long
					as the method-local inner class object, the inner class object can't use them. Unless
					the local variables are marked final!
				 * */

			} // close inner class method
		} // close inner class definition
		MyInner mi = new MyInner(); // This line must come
		// after the class
		mi.seeOuter();
	} // close outer class method doStuff()

	public static void main(String[] args) {

	}

}

/*Remember that a local class declared in a static method has access
to only static members of the enclosing class, since there is no associated instance of the
enclosing class. If you're in a static method there is no this, so an inner class in a static
method is subject to the same restrictions as the static method. In other words, no access
to instance variables.*/
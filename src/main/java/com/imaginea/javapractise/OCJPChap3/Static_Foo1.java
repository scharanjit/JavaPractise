package OCJPChap3;

public class Static_Foo1{
	Bar myBar = new Bar();
	static int apple=23;

	void changeIt(Bar myBar)
	{
		System.out.println(myBar.barNum);
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
		myBar = new Bar();
		//refernce  dies here only
		System.out.println(myBar.barNum);
		myBar.barNum = 420;
		System.out.println("myBar.barNum in changeIt is now " + myBar.barNum);
	}

	public static void main (String [] args) {
		System.out.println(+apple);

		Static_Foo1 f = new Static_Foo1();
		System.out.println("f.myBar.barNum is " + f.myBar.barNum);
		f.changeIt(f.myBar);
		
		System.out.println("f.myBar.barNum after changeIt is "+ f.myBar.barNum);  	//why 99..shadowing //
		//just try to cmnt myBar = new Bar(); in changeIt
		// if we cmnt it, it will take the latest value
		// if not it will take the last value
		
	}
}
/*
 * the shadowing variable (the local parameter myBar in changeIt()) can still
affect the myBar instance variable, because the myBar parameter receives a reference to the same
Bar object. But when the local myBar is reassigned a new Bar object, which we then modify by
changing its barNum value, Foo’s original myBar instance variable is untouched.

 */

class Bar {
 	int barNum = 28;
}
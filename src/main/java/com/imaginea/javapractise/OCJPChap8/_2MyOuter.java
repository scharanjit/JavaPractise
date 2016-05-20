package OCJPChap8;

import javax.swing.text.GapContent;

public class _2MyOuter
{
	private int x = 7;
	// inner class definition
	class MyInner
	{
		public void seeOuter()
		{
			System.out.println("Outer x is " + x);
		}
	} // close inner class definition


	/*
	 * 
	 * The preceding code is perfectly legal. Notice that the inner class is indeed
accessing a private member of the outer class. That's fine, because the inner
class is also a member of the outer class. So just as any member of the outer class
(say, an instance method) can access any other member of the outer class, private
or not, the inner class—also a member—can do the same.
	 */

	public void Gap()

	{
		MyInner nn = new MyInner();
		nn.seeOuter();
	}

	public static void main(String[] args) {
		
		//1st method
		_2MyOuter ww = new _2MyOuter();
		ww.Gap();
		
		//2nd method
		_2MyOuter mo = new _2MyOuter(); // gotta get an instance!
		_2MyOuter.MyInner inner = mo.new MyInner();
		inner.seeOuter();
		
		//3rd method
		_2MyOuter.MyInner inner1 = new _2MyOuter().new MyInner();
		inner1.seeOuter();
		
		
		
	}

}
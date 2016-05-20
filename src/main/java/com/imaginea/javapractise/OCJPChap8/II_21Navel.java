package OCJPChap8;

public class II_21Navel 
{
	private int size = 7;
	private static int length = 3;
	
	//these size & lenght gonaa die wen control moves out of classwill die when
	public static void main(String[] args) 
	{
		new II_21Navel().go();
	}
	void go()
	{
		int size = 5;
		
		//this size is in stack...it will die when control moves out of this method
		System.out.println(new Gazer().adder());
	}
	class Gazer
	{
		int adder()
		{ 
			return size * length; 
		}
	}
}

/*The inner class Gazer has access to Navel's private static and private
instance variables.

*inner class can access private variables of its outer class
*/
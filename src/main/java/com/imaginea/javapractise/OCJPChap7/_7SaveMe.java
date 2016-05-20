package OCJPChap7;
//Remember that transient variables are not saved when an object is serialized.
import java.io.Serializable;

public class _7SaveMe implements Serializable 
{
	transient int x;
	int y;
	_7SaveMe(int xVal, int yVal)
	{
		x = xVal;
		y = yVal;
	}
	public int hashCode()
	{
		return (x ^ y); // Legal, but not correct to
		// use a transient variable
	}
	public boolean equals(Object o) 
	{
		_7SaveMe test = (_7SaveMe)o;
		if (test.y == y && test.x == x)
		{ // Legal, not correct
			return true;
		} else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		_7SaveMe c = new _7SaveMe(8, 5);
		_7SaveMe c1 = new _7SaveMe(9, 5);
		
		System.out.println("hashcode test : "+c.hashCode());
		System.out.println("Equals Test : "+c.equals(c1));
	}
}
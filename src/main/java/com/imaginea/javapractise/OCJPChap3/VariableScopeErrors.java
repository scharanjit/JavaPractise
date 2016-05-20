package OCJPChap3;

public class VariableScopeErrors 
{
	static char c;
	public static void main(String [] args) 
	{
	   System.out.println(c);  //space
		VariableScopeErrors s = new VariableScopeErrors();
		s.go();
	}
	void go() 
	{
		int y = 5;
		go2();
		y++; // once go2() completes, y is back in scope
		System.out.println(y);
	}
	void go2() 
	{
		// y++; // won't compile, y is local to go()
	}
}



package OCJPChap8;

public class II_20City 
{
	class Manhattan 
	{
		void doStuff() throws Exception
		{
			System.out.print("x "); }
	}
	class TimesSquare extends Manhattan
	{
		void doStuff() throws Exception { 


			System.out.println("y");
		}
	}
	public static void main(String[] args) throws Exception 
	{
		new II_20City().go();
	}
	void go() throws Exception
	{ 
		new TimesSquare().doStuff();
	}
}


/*The inner classes are valid, and all the methods (including main()), correctly
throw an Exception, given that doStuff() throws an Exception. The doStuff() in class
TimesSquare overrides class Manhattan's doStuff() and produces no output.*/
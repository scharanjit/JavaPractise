package SCJP;
//error
class Top {
	public Top()
	{

	}
	public Top(String s)
	{ 
		System.out.print(s); }
}
public class Bottom2 extends Top
{
	public Bottom2(String s)
	{  
		super("F");
		//this();
		System.out.print("D"); 
	}
	public Bottom2()
	{
		System.out.println("Hi");
	}
	public static void main(String [] args)
	{
		new Bottom2("C");

		System.out.println(" ");

	} 
}
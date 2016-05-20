package OCJP;

class Top {
	public Top(){} //try to cmnt this
	public Top(String s)
	{ 
		System.out.print("B");
	}
}
public class Bottom2 extends Top
{
	public Bottom2(String s) {
		//super("5");
		System.out.print("D");
	}
	public static void main(String [] args)
	{
//		new Bottom2("C");
		System.out.println(" ");
	}
}
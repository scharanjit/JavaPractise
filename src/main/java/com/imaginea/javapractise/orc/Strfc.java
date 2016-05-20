package orc;

public class Strfc {
	public static void main(String[] args)
	{
		String a = new String("abc");
		String b= "abc";
		if (a.equals(b))
		{
			System.out.println("Y");
		}
		if(a==b)
		{
			System.out.println("Yes again");
		}
		
		else
		{
			System.out.println("No");
		}
	}
}

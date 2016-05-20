package j2ee1001;

public class Testjj 
{
	public static void main(String[] args)
	{
		Boolean b= true;
		b=!b;
		System.out.println(b);
		
		int x=5,y=3;
		if(x==y)
		{
			System.out.println("IF");
		}
		else
		{
			System.out.println("ELSE");
		}
	
		try
		{
			String zz= "10t";
			System.out.println("In first try");
			
			int i= parseInt(17);
			System.out.println("second try : "+i);
			
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("In catch");
		}
		
		finally
		{
			System.out.println("Finally");
		}
		
		System.out.println("---------------hi-------------------");
	}

	private static int parseInt(int i) {
		// TODO Auto-generated method stub
		return ++i;
	}

}

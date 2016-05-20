package j2ee1001;

public class Exception_throwdemo{
	static void demoproc(){ 
		try
		{

			// throw  ArithmeticException("demo");    //it shud be
			throw new ArithmeticException("demo");
		} 
		catch(ArithmeticException e)
		{
			System.out.println("inside demoproc");
			throw e;
		}
	}

	public static void main(String args[])
	{

		try{

			demoproc();

		} 

		catch(ArithmeticException e)
		{
			System.out.println("Recaught");
		}
	}
}

package HiHa;

public class ExcptionThrownFinally
{
	void method()throws MyException 
	{
		try {
				throw new MyException("UnExpected Conditions!");
				
		}

		catch(MyException e){
	

			System.out.println("In the method -caught- " + e);

			throw new MyException("Exception thrown from catch block");
		}
		finally
		{
				System.out.println("finally in the method...");
				throw new MyException("Exception thrown from finally block");
		}
	}
	
	public static void main(String args[]){
			ExcptionThrownFinally o = new ExcptionThrownFinally();
				try {
						o.method();
					}

				catch(MyException e)
				{
						System.out.println("caught- " + e);

				}

				System.out.println("exiting main...");
			}
}

class MyException extends Exception
{
public MyException(){}
public MyException(String msg){
super(msg);
}
}
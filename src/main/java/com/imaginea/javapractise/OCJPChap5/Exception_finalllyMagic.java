package OCJPChap5;

/*
 * The only exception to the finally-will-always-be-called rule is that a finally
will not be invoked if the JVM shuts down. That could happen if code
from the try or catch blocks calls System.exit().
 */
public class Exception_finalllyMagic 
{
	public static void main(String[] args)
	{
		try 
		{
			System.out.println("Here we go....");

			System.exit(0);

			System.out.println("wth");
		}
		catch(Exception E)
		{
			System.out.println("in catch");
		}
		finally
		{

			System.out.println("finally wnt execute");
		}
	}

}

package OCJPChap5;

import java.io.FileNotFoundException;
import java.io.IOException;
//						Object
//							|
//							|
//						Throwable
//							/\
//						   /  \
//						  /    \
//                       /      \
//                     Error   Exception
//						/        /\
//								/
//							Runtime_Excepton
//
//
//Every exception is an instance of a class that has class Exception in its
//inheritance hierarchy. In other words, exceptions are always some subclass of
//java.lang.Exception.
//Errors are technically not exceptions because they do not derive from class Exception.
//


// llok at the error message 
public class ExceptionHirerachy {

	public static void main(String[] args) {

		try 
		{

			int ar[] = new int[5];

			for (int i=0; i<=5; i++)
			{
				//	ar[i]=i;
				System.out.println(ar[i]);


			}
		} 
		catch (IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		try
		{
			String line= "PIKA chuuuu pika pika";
			System.out.println(line.substring(234));
		} catch (IndexOutOfBoundsException e)
		{
			// TODO: handle exception

			e.printStackTrace();
		}

	}


}

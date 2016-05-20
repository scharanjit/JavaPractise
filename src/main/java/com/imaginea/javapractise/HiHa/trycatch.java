package HiHa;

import java.io.IOException;

public class trycatch {
	
	public static void main(String[] args) {
		int i=5;
		
		try
		{
			int j=5/0;
			
			
		}
		catch(RuntimeException e)
		{
			System.out.println("1st catch");
		}
		catch( Exception e)
		{
			System.out.println("2nd Catch");
		}
		
		//System.out.println("");
		finally
		{
			
			System.out.println("final");
			
		}
		System.out.println("ds");
	}

}

package OCJPChap6;

import java.util.*;
public class ScanIn 
{
	public static void main(String[] args)
	{
		System.out.print("input: ");
		//System.out.flush();
		try
		{
			Scanner s = new Scanner(System.in);
			//System.out.println(s);
			String token;
			do 
			{
				token = s.findInLine("\\d");
				//token=s.next();
				System.out.println("found " + token);
			} while (token != null);
			
		} 
		catch (Exception e)
		{ 
			e.printStackTrace();
			System.out.println("scan exc");
			}
}
}
package HiHa;

import java.io.FileReader;

import javax.imageio.IIOException;

public class Myclass {
	public static void main(String[] args) {
	
		try 
		{
			FileReader file = new FileReader(Myfile.txt);
		}
		
		catch (Exception e)
		{
		System.out.println("Not Found");
		return;
		}
		
		
		finally
		{
		System.out.println("Inside Finally");
		}
		return;
			
	
	
	}
		
	}


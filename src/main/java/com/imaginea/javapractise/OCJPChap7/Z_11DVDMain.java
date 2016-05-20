package OCJPChap7;

//some problem in code

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import HiHa.nextHighestNumber;

public class Z_11DVDMain{

	public static void main(String[] args) throws FileNotFoundException  
	{
		ArrayList<Z_10DVDInfo>  dvdList= new ArrayList<Z_10DVDInfo>();
		try
		{
			populateList(dvdList);
		}
		catch(Exception e)
		{
			
			System.out.println("Exception caught"+e.getMessage());
		}
		 Collections.sort(dvdList);		//it will show compilation error

		System.out.println(dvdList);
		/*	        
		 * 
		 * If you read the description of the one-arg sort() method,
				you'll see that the sort() method takes a List argument, and that the objects in
				the List must implement an interface called Comparable. It turns out that String
				implements Comparable, and that's why we were able to sort a list of Strings using
				the Collections.sort() method.
		 * 
		 * 
		 * */
	}

	public static void populateList(List<Z_10DVDInfo> info) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("D:\\JavaTest\\dvdInfo.txt")));
		//read each line of dvdInfo.txt below
		String line = null;
		while ((line = br.readLine()) != null)
		{ //check line in loop
			String[] tokens = line.split("/");
			Z_10DVDInfo infoItem = new Z_10DVDInfo(tokens[0],tokens[1],tokens[2]);
			info.add(infoItem);      
		} 
	}

}

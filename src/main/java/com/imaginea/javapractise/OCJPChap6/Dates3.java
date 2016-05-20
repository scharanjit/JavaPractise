package OCJPChap6;

import java.text.*;
import java.util.*;
public class Dates3 {
	
	public static void main(String[] args) 
	{
		Date d1 = new Date(1000000000000L);
		DateFormat[] dfa = new DateFormat[6];
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
		for(DateFormat df : dfa)
			System.out.println(df.format(d1));
				
				System.out.println("---------------------------------------------------");	
				System.out.println("---------------------------------------------------");
				
				//Date d1 = new Date(1000000000000L);
				System.out.println("d1 = " + d1.toString());
				DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
				
				String s = df.format(d1);
				System.out.println(s);
				try {
					//The parse() method takes a String formatted in the style of the DateFormat instance
					//being used, and converts the String into a Date object.
					Date d2 = df.parse(s);
					System.out.println("parsed = " + d2.toString());
				} 
				catch (ParseException pe) 
				{
				System.out.println("parse exc");
				}
	}
}
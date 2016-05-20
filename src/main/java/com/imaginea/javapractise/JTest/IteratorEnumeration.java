package JTest;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
 * 
 * Iterator has remove() method...Enumeration does not have
 * Iterator fast & secure than Enumeration
 * 
 * */

public class IteratorEnumeration {

	
	public static void main(String[] args) {
		List<Integer> l= new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		System.out.println("Origiba list"+l);
		Iterator<Integer> it = l.iterator();
		
		while(it.hasNext())
		{
			
			Integer it1= it.next();
			
			
			if(it1==6)
			{
				System.out.println("Removed");
				it.remove();
			}
			
		}
	
		System.out.println("After removal"+l);
		
		System.out.println("---------------------------------------------------------------------------");
		Enumeration days;
	      Vector dayNames = new Vector();
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      days = dayNames.elements();
	      while (days.hasMoreElements()){
	         System.out.println(days.nextElement()); 
	      }
		
		
	}
}

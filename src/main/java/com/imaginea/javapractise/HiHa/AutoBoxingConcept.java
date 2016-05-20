package HiHa;
//example of auto boxing int saving into a list of Integer typoe array list..
//auto type casting..in java

//converting primitive object to wrapper class object
//p--> w -->auto
//w--> p--> unb

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingConcept {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		int i=0;
		for(i=0;i<50; i=i+2)
		{
			li.add(i);
		}
		
		for(int j=0;j<25;j++)
		{
			System.out.println(li.get(j));
		}
		
	}
	
}

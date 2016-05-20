package HiHa;

import java.util.ArrayList;
import java.util.Iterator;



public class Iteraotrrrrrrrrrrrr {
	
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("a");
		alist.add("b");
		alist.add("c");
		alist.add("d");
		alist.add("r");
		alist.add("ck uu");
		

		for (Iterator<String> it = alist.iterator(); it.hasNext(); ) {
		    String s = it.next();  // No downcasting required.
		    System.out.println(s);
		}
	}

}

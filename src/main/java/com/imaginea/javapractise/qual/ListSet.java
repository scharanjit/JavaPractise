package qual;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListSet {
	
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Name1");
		l.add("Name3");
		l.add("Name2");
		l.add("Name5");
		l.add("Name4");
		l.add("Name4");
		System.out.println(l);
		//
		Set s1 = new HashSet();
		s1.addAll(l);
		
		System.out.println(s1);
		
		Set s = new TreeSet();
		s.addAll(l);
		
		System.out.println(s);
		
	}

}

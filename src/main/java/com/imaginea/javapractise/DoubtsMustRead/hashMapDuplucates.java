package DoubtsMustRead;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hashMapDuplucates {

		public static void main(String[] args) {
			HashMap<String, Integer> m = new HashMap<String, Integer>();
			
			m.put("a", 1);
			m.put("b", 1);
			m.put("c", 2);
			m.put("d", 5);
			m.put("e", 6);
			m.put("a", 99999999);
			
			System.out.println(m); //unordered & duplicates values allowed
			
			//Set<String> m1 = new HashSet<String>();
			//System.out.println(m1);
			Map mg = new HashMap();
			mg.put("a", 1);
			System.out.println(mg);
			HashMap mg1= new HashMap();
			
			mg1.put("a", 1);
			System.out.println(mg1);
		}
}

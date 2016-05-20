package DoubtsMustRead;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
 
public class CountDuplicatedList {
 
  public static void main(String[] args) {
 
	  String num="abcdbbcdaaa";
	  char num1[]= num.toCharArray();
	  List<Character> list = new ArrayList<Character>();
	  for(int i=0;i<num1.length;i++)
	  {
		  list.add(num1[i]);
	  }
	  
	
	System.out.println(list);
 
	System.out.println("\nExample 1 - Count 'a' with frequency");
	System.out.println("a : " + Collections.frequency(list, 'a'));
	
 
	System.out.println("\nExample 2 - Count all with frequency");
	Set<Character> uniqueSet = new HashSet<Character>(list);
	for (Character temp : uniqueSet) {
		System.out.println(temp + ": " + Collections.frequency(list, temp));
	}
 
	System.out.println("\nExample 3 - Count all with Map");
	Map<Character, Integer> map = new HashMap<Character, Integer>();
 
	for (Character temp : list) {
		Integer count = map.get(temp);
		map.put(temp, (count == null) ? 1 : count + 1);
	}
	printMap(map);
 
	System.out.println("\nSorted Map");
	Map<Character, Integer> treeMap = new TreeMap<Character, Integer>(map);
	printMap(treeMap);
 
  }
 
  public static void printMap(Map<Character, Integer> map){
 
	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		System.out.println("Key : " + entry.getKey() + " Value : "
			+ entry.getValue());
	}
 
  }
 
}
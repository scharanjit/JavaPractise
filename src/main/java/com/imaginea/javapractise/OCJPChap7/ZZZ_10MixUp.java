package OCJPChap7;

 import java.util.*;
 public class ZZZ_10MixUp {
	 public static void main(String[] args) {
		 Object o = new Object();
		 	// insert code here
		 
		// Set s = new HashSet();
		 TreeSet s = new TreeSet();   //comparable
		//LinkedHashSet s = new LinkedHashSet();
		 	s.add("o");
		 	s.add(o);
		 	
		 	
		 	System.out.println(s);
 }
}
 
 
/*
 And these three fragments:
I. Set s = new HashSet();
II. TreeSet s = new TreeSet();
III. LinkedHashSet s = new LinkedHashSet();
When fragments I, II, or III are inserted, independently, at line 7, which are true?
(Choose all that apply.)
A. Fragment I compiles
B. Fragment II compiles
C. Fragment III compiles
D. Fragment I executes without exception
E. Fragment II executes without exception
F. Fragment III executes without exception
Answer:
 A, B, C, D, and F are all correct.
 Only E is incorrect. Elements of a TreeSet must in some way implement Comparable.
(Objective 6.1)* 
 * */
 
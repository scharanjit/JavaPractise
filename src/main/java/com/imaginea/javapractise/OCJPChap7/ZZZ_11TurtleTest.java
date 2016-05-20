package OCJPChap7;

import java.util.*;
 class Turtle {
 int size;
 public Turtle(int s) { size = s; }
 public boolean equals(Object o) 
 { 
	 return (this.size == ((Turtle)o).size);
 }
 // insert code here
 
 public int hashCode() { return size/5; }
 }
 
 public class ZZZ_11TurtleTest {
	 public static void main(String[] args) 
	 {
		 LinkedHashSet<Turtle> t = new LinkedHashSet<Turtle>();
		 t.add(new Turtle(1));
		 t.add(new Turtle(2));
		 t.add(new Turtle(1));
		 System.out.println(t.size());
	 }
 }
 
 
 /*
  * And these two fragments:
I. public int hashCode() { return size/5; }
II. // no hashCode method declared
  * While fragment II wouldn’t fulfill the hashCode() contract (as you
can see by the results), it is legal Java. For the purpose of the exam, if you don’t override
hashCode(), every object will have a unique hashcode.
  * 
  * */
 
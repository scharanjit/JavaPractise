package JTest;

public class ProgTheory {

}
/*
Abstraction:- Hiding all unnecessary details & showing only necessary details
Encapsulation:- Hiding data & methods/implementation both.

28. What is Comparable and Comparator interface ? List their differences. 
Java provides the Comparable interface, which contains only one method, called compareTo. 
This method compares two objects, in order to impose an order between them. 
Specifically, it returns a negative integer, zero, or a positive integer to indicate that the input object is less than,
 equal or greater than the existing object. Java provides the Comparator interface, which contains two methods, 
 called compare and equals. The first method compares its two input arguments and imposes an order between them.
  It returns a negative integer, zero, or a positive integer to indicate that the first argument is less than,
   equal to, or greater than the second. The second method requires an object as a parameter and aims to
    decide whether the input object is equal to the comparator. The method returns true, only if 
    the specified object is also a comparator and it imposes the same ordering as the comparator.
    
    


*/
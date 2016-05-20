package pRACTISE;

import java.util.Vector;

public class VecotArraylist {
	
	public static void main(String[] args) {
		
		
		Vector v= new Vector();
		
		v.add(1);
		v.add(1);
		
		v.add(2);
		
		v.add(4);
		
		v.add(3);
		
		System.out.println(v);
		
		
		
		
		/*21) Difference between Vector and ArrayList?

Lets note down the differences:

All the methods of Vector is synchronized. But, the methods of ArrayList is not synchronized.
Vector is a Legacy class added in first release of JDK. ArrayList was part of JDK 1.2, when collection framework was introduced in java.
By default, Vector doubles the size of its array when it is re-sized internally. But, ArrayList increases by half of its size when it is re-sized.*/
		
	}

}

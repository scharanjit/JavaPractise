package OCJPChap7;

public class ZZ_2equalsHashcode {
	
	public static void main(String[] args) {
		/*
		 * 
		A. If the equals() method returns true, the hashCode() comparison == might return false
		B. If the equals() method returns false, the hashCode() comparison == might return true
		C. If the hashCode() comparison == returns true, the equals() method must return true
		D. If the hashCode() comparison == returns true, the equals() method might return true
		E. If the hashCode() comparison != returns true, the equals() method might return true
		
		*
		*
		*B and D. B is true because often two dissimilar objects can return the same hashcode
		value. D is true because if the hashCode() comparison returns ==, the two objects might
		or might not be equal.
		
		
 		A, C, and E are incorrect. C is incorrect because the hashCode() method is very flexible
		in its return values, and often two dissimilar objects can return the same hash code value.
		A and E are a negation of the hashCode() and equals() contract.
		
		*
		*
		*/
	}

}

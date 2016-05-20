package HiHa;

import java.util.HashMap;


//If two objects are equal, then they must have the same hash code.
// If two objects have the same hashcode, they may or may not be equal.
//the reason for this is we can't over ride hashcode method
//solution is to add hashCode method to the class
public class HastEqualCode {

	private String color;
	 
	public HastEqualCode(String color) {
		this.color = color;
	}
	/*public int hashCode(){
		return this.color.length();	
	}*/
	
	public boolean equals(Object obj) {
		if (!(obj instanceof HastEqualCode))
			return false;	
		if (obj == this)
			return true;
		return this.color.equals(((HastEqualCode) obj).color);
	}
 
	public static void main(String[] args) {
		HastEqualCode a1 = new HastEqualCode("green");
		HastEqualCode a2 = new HastEqualCode("red");
 
		//hashMap stores apple type and its quantity
		HashMap<HastEqualCode, Integer> m = new HashMap<HastEqualCode, Integer>();
		m.put(a1, 10);
		m.put(a2, 20);
		
		System.out.println(m.get(new HastEqualCode("red")));
	}
}

package OCJPChap7;

import java.util.HashMap;

public class Applee {
	private String color;
 
	public Applee(String color) {
		this.color = color;
	}
 
	public boolean equals(Object obj) {
		if (!(obj instanceof Applee))
			return false;	
		if (obj == this)
			return true;
		return this.color.equals(((Applee) obj).color);
	}
 
	public static void main(String[] args) {
		Applee a1 = new Applee("green");
		Applee a2 = new Applee("red");
 
		//hashMap stores apple type and its quantity
		HashMap<Applee, Integer> m = new HashMap<Applee, Integer>();
		m.put(a1, 10);
		m.put(a2, 20);
		System.out.println(m.get(new Applee("green")));
	}
}

/*In this example, a green apple object is stored successfully in a hashMap,
 *  but when the map is asked to retrieve this object, the apple object is not found. 
 *  The program above prints null. However, we can be sure that the object is stored 
 *  in the hashMap by inspecting in the debugger:
 *  
 *  
 *  Go to Apple1.java
 *  
 *  */

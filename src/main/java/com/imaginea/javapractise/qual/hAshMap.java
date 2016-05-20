package qual;

import java.util.HashMap;

public class hAshMap {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(100, "Charanjit");
		h.put(100, "Singh");
		h.put(102, "Charanjit");
		h.put(103, "Ahuja");
		System.out.println(h);
	}
}


//only unique keys in hashmap
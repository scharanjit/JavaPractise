package OCJPChap7;
/*
 * subMap() method is making a copy of a portion
	of the TreeMap named map.
 * 
 * */
import java.util.SortedMap;
import java.util.TreeMap;

public class Z_21BackedCollections {
	
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("a", "ant");
		map.put("d", "dog");
		map.put("h", "horse");
		
		SortedMap<String, String> submap;
		
		submap = map.subMap("b", "g"); // #1 create a backed collection  //range of submap is from b to g
		
		System.out.println("map values :---> "+map + " "+"  submap values --> "+ submap); // #2 show contents  //range is from b to g..that covers only d
		
		map.put("b", "bat"); // #3 add to original
		submap.put("d","dd");
		submap.put("f", "fish"); // #4 add to copy			//we can put any key from c to f in submap
		
		map.put("r", "raccoon"); // #5 add to original - out of range 
		map.put("z", "zenha");
		// submap.put("p", "pig"); // #6 add to copy - out of range
		System.out.println(map + " " + submap); // #7 show final contents
		
	}

}

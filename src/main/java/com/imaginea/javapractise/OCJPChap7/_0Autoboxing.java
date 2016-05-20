package OCJPChap7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Autoboxing automatically converts primitive types to their appropriate wrapper object. 
//The reason behind it is that you can't put a primitive into a collection.
/*As any Java programmer knows, you can’t put an int (or other primitive value) into a collection. 
 * Collections can only hold object references, so you have to box primitive values into the appropriate
 *  wrapper class (which is Integer in the case of int). When you take the object out of the collection,
 *   you get the Integer that you put in; if you need an int, you must unbox the Integer using the intValue 
 *   method. All of this boxing and unboxing is a pain, and clutters up your code.
 *  The autoboxing and unboxing feature automates the process, eliminating the pain and the clutter.*/

public class _0Autoboxing {
	 public static void main(String[] args) {
		String[] argss ={"if","it","is","to","be","it","is","up","to","me","to","do","the","watusi"};
	      Map<String, Integer> m = new TreeMap<String, Integer>();
	      //TreeMap Autosort
	      for (String word : argss)
	      {
	          Integer freq = m.get(word);
	          m.put(word, (freq == null ? 1 : freq + 1));
	      }
	      System.out.println(m);
	   }

}

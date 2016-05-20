package CollectionsFunds;

import java.util.HashMap;
import java.util.Map;

public class Mapsss {
	
	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map1 = new HashMap<String, Object>();
	}

}


/*

There is no difference between the objects. There is a difference in the interface you have to the object.
 In the first case, the interface is HashMap<String, Object>, whereas in the second it's Map<String, Object>. 
 The underlying object, though, is the same.

The advantage to using Map<String, Object> is that you can change the underlying object to be a different
 kind of map without breaking your contract with any code that's using it. If you declare it as HashMap<String, Object>, 
you have to change your contract if you want to change the underlying implementation.



in general

Map is an interface that HashMap class implements.

public class HashMap<K,V> extends AbstractMap<K,V>
    implements Map<K,V>, Cloneable, Serializable 

The difference is that in the second implementation
 your reference to the HashMap will only allow the use of functions defined in the Map interface,
 while the first will allow the use of any public functions in HashMap (which includes the Map interface).
*/
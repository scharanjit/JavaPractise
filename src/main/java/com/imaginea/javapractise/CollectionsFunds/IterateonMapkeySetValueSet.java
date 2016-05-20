package CollectionsFunds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class IterateonMapkeySetValueSet {


	public static void main(String[] args) {
		Map<Integer,String> fooMap = new HashMap<Integer, String>();  

		fooMap.put(1,"Campbell");  
		fooMap.put(2,"John Meyers");  
		fooMap.put(3,"Zhixiong Pan");  
		//create one set
		Set<Entry<Integer,String>> s = fooMap.entrySet();
		System.out.println(s);
		//create one list
		
		//collection.sort new comparator
		List<Entry<Integer,String>> list = new ArrayList<Map.Entry<Integer,String>>(s);
		System.out.println(list);
		Collections.sort(list,new Comparator<Map.Entry<Integer, String>>(){
			@Override
			public int compare(Entry<Integer, String> o1,Entry<Integer, String> o2)
			{
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		for(Map.Entry<Integer, String> entry:list)
		{      
			System.out.println(entry.getKey()+" ==== "+entry.getValue());
		}
	}
}

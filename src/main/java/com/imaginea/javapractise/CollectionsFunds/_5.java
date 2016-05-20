package CollectionsFunds;
/*HashMap class:
 A HashMap contains values based on the key. It implements the Map interface and extends AbstractMap class.
 It contains only unique keys.
 It may have one null key and multiple null values.
 It maintains no order.
 *
 */

import java.util.*;  
import java.util.Map.Entry;
public class _5
{  
	public static void main(String args[])
	{  

		HashMap<Integer,String> hm=new HashMap<Integer,String>();  

		hm.put(100,"Amit");  
//		hm.put(100,"Vijay");  
		hm.put(102,"Rahul"); 
		hm.put(103,"Amit");
		hm.put(104, "hi");


		for(Map.Entry m:hm.entrySet())
		{  
			System.out.println(m.getKey()+" "+m.getValue());  
		} 
		
		System.out.println("sorting based on key");
		
		Set<Entry<Integer,String>> s = hm.entrySet();
		List<Entry<Integer,String>> list = new ArrayList<Map.Entry<Integer,String>>(s);
		Collections.sort(list,new Comparator<Map.Entry<Integer,String>>(){
			public int compare(Map.Entry<Integer, String>o1,Map.Entry<Integer,String>o2)
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
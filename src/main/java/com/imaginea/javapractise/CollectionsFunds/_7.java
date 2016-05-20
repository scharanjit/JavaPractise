package CollectionsFunds;
/*
 * TreeMap class
 �A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
 �It contains only unique elements.
 �It cannot have null key but can have multiple null values.
 �It is same as HashMap instead maintains ascending order. 

What is difference between HashMap and TreeMap?
 


1) HashMap is can contain one null key.

TreeMap can not contain any null key.

 

2) HashMap maintains no order.

TreeMap maintains ascending order.


 */
import java.util.*;  
public class _7{  
	public static void main(String args[]){  

		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
		hm.put(101,"Vijay"); 
		hm.put(100,"Amit");  
		hm.put(102,"Ravi");  

		hm.put(103,"Rahul");  
                hm.put(104,"Rahul");
		//hm.put(null, "Sham");

		for(Map.Entry m:hm.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
	}  
}  

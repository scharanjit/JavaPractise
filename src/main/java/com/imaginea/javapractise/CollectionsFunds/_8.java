package CollectionsFunds;

/*Hashtable
•A Hashtable is an array of list.Each list is known as a bucket.The position of bucket is identified by calling the
 hashcode() method.A Hashtable contains values based on the key. It implements the Map interface and extends Dictionary class.
•It contains only unique elements.
•It may have not have any null key or value.
•It is synchronized.
What is difference between HashMap and Hashtable?



1) HashMap is not synchronized.
Hashtable is synchronized.

2) HashMap can contain one null key and multiple null values.
Hashtable cannot contain any null key nor NULL value.
 */
import java.util.*;  
public class _8{  
	public static void main(String args[]){  

		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  

		hm.put(100,"Amit");  
		hm.put(102,"Ravi");  
		hm.put(101,"Vijay");  
		hm.put(103,"Rahul");  

		for(Map.Entry m:hm.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
	}  
}  


//Hash
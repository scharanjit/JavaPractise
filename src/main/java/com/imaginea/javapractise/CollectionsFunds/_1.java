package CollectionsFunds;

/* advantage of simple iterator over list iteratot */
//list has duplicates without any ordwer
/*traverse in both sides*/

import java.util.*;  
public class _1{  
	public static void main(String args[]){  

		ArrayList<String> al=new ArrayList<String>();  
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add(1,"Sachin");  
		al.add("Amit");

		System.out.println("element at 2nd position: "+al.get(2));  

		ListIterator<String> itr=al.listIterator();  

		System.out.println("traversing elements in forward direction...");  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  


		System.out.println("traversing elements in backward direction...");  
		while(itr.hasPrevious()){  
			System.out.println(itr.previous());  
		}  
	}  
}  


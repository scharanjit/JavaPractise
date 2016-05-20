package CollectionsFunds;

/*List can contain duplicate elements whereas Set contains unique elements only.
HashSet class:

uses hashtable to store the elements.It extends AbstractSet class and implements Set 
interface.
contains unique elements only.

 */
import java.util.*;  
public class _2{  
	public static void main(String args[]){  

		HashSet<String> al=new HashSet<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  

		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	
	
	List<String> a11 = new ArrayList<String>();
	a11.add("Ravi");  
	a11.add("Vijay");  
	a11.add("Ravi");  
	a11.add("Ajay"); 
	
	
	System.out.println("Elemenst inside list :                 "+a11);
	
	
	//To remove its duplicate
	
	
	Set<String> s= new HashSet<String>();
	
	s.addAll(a11);
	System.out.println("Non duplicated Elemenst inside Hash Set  : "+s);
	
	
	TreeSet<String> s1= new TreeSet<String>();
	
	s1.addAll(a11);
	
	System.out.println("Non Duplicate and sorted inside Tree Set : "+s1);
	}  
		
	
}
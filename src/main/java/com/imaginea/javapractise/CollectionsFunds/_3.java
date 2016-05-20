package CollectionsFunds;

/*TreeSet class:
contains unique elements & Ascending order . The TreeSet class implements NavigableSet 
interface that extends the SortedSet interface.
maintains ascending order.

 */
import java.util.*;  
public class _3{  
	public static void main(String args[]){  

		TreeSet<String> al=new TreeSet<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  

		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		
		
		System.out.println("--------------------------------------------------------------");
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("Ravi");
		hs.add("Ravi");
		hs.add("Ajay");
		hs.add("Vijay");
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}  
}  
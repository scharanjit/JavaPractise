import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;


public class removeduplicateArraylist {
	public static void main(String[] args) {
		String str="Helol";
		ArrayList a = new ArrayList();
		
		for (int i=0;i<str.length() ; i++)
		{
			a.add(str.charAt(i));
		}
		
		System.out.println(a);
		
		
		for(int j=str.length()-1; j>0;j--)
		{
			if(a.get(j)==a.get(j-1))
			{
				a.remove(j);
			}
		}
		
		System.out.println(a);
		
		
		
		
		
		HashSet<Character> bb = new HashSet<Character>();
		
		for (int i=0;i<str.length() ; i++)
		{
			bb.add(str.charAt(i));
		}
		
		System.out.println(bb);
		
		
	TreeSet<Character>  ll = new TreeSet<Character>();
	
	for (int i=0;i<str.length() ; i++)
	{
		ll.add(str.charAt(i));
	}
	
	
	System.out.println(ll);
	}
	
	
	
	
}

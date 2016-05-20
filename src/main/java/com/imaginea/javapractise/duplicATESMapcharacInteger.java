import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class duplicATESMapcharacInteger {
public static void main(String[] args) {
		String d="JavaaNvoice";
		findDup(d);
		//deleteDup(d);		
	}
	public static void findDup(String d) {
		 Map<Character,Integer> m = new HashMap<Character, Integer>();
		char [] chra = d.toCharArray();
		for(Character ch:chra)
		{
			if(m.containsKey(ch))
			{
				m.put(ch, m.get(ch)+1);
			}
			
			else
			{
				m.put(ch, 1);
			}
		}
		
		Set<Character> hh =m.keySet();
		System.out.println(m);
		for(Character ch:hh)
		{
			if(m.get(ch)>1)
			{
				System.out.println(ch+" --->  "+m.get(ch));
				m.remove(m.get(ch));
			}	
		}
		System.out.println(m);
	}
}

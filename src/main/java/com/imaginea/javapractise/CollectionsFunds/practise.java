package CollectionsFunds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class practise {
	public static void main(String[] args) {
		Map<Integer,String>  m = new HashMap<Integer, String>();
		m.put(5, "Charan");
		m.put(6, "Charan1");
		m.put(1, "Charan2");
		m.put(2, "Charan323");
		m.put(32, "CharanJ");

		Set<Entry<Integer,String>> s= m.entrySet();
		List<Entry<Integer,String>> l = new ArrayList<Map.Entry<Integer,String>>(s);

		Collections.sort(l,new Comparator<Map.Entry<Integer,String>>() 
				{
			public int compare(Entry<Integer,String> o1,Entry<Integer,String> o2)
			{
				return o1.getKey().compareTo(o2.getKey());
			}
				});

		for(Map.Entry<Integer,String> li :l)
		{
			System.out.println(li.getKey()+" "+li.getValue());
		}
	}

}

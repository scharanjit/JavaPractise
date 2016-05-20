package j2ee1001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listtt {
	public static void main(String[] args) {
		List li = new ArrayList<String>();
		Iterator it = li.iterator();
		while(it.hasNext()) //false
		{
			System.out.println(it.next());
		}
		//System.out.println(li.iterator().next());
		
		//Run time Exception
	}

}

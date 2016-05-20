package pRACTISE;

import java.util.ArrayList;
import java.util.List;

public class ArraylIstcomparison {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(1);
		l1.add("1");
		l1.add('1');
		
		
		
		
		List l2 = new ArrayList();
		l2.add(1);
		l2.add("2");
		l2.add('1');
		
		
		
		for(int i=0; i<l1.size();i++)
		{
			
			for(int j=0;j<l2.size();j++)
			if(l1.get(i).equals(l2.get(j)))
			{
				System.out.println(l1.get(i)+ " is common");
				break;
			}
			
			
		}
		
	}
}

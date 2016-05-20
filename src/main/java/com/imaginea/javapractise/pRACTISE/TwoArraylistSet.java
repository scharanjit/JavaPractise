package pRACTISE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoArraylistSet {
	
	public static void main(String[] args) {
		
		
		int arr[]={1,2,3,4,5,5,5,5,5,5,9};
		int arr1[]={4,5,6,7,8,9,10,11,11,12};
		
		List l = new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			l.add(arr[i]);
		//	l.add(arr1[i]);
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			l.add(arr1[i]);
			//l.add(arr1[i]);
		}
		
		
		
		
		System.out.println(l);
		Set s = new HashSet();
		
		s.addAll(l);
		
		//s.add(l1);
		
		
		System.out.println(s);
		
	}

}

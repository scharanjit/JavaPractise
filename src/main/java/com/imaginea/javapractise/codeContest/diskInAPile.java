package codeContest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class diskInAPile {
	public static int get_order(int[] input1)
	{
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<input1.length;i++)
		{
			list.add(input1[i]);
			
		}
		
		System.out.println("unsoreted"+list);
	//Collections.reverse(list);
		
		Collections.sort(list, new Comparator<Integer>() {		
		    public int compare(Integer o1, Integer o2) {
		        return o2.compareTo(o1);
		    }
		});
		int sorterArray [] = new int[list.size()] ;
		
		
		System.out.print("sorterArray -->");
		for  (int m=0;m<list.size();m++)
		{
			sorterArray [m]=list.get(m);
			System.out.print(sorterArray [m]);
		}
		
		System.out.println();
		int unsortedArray[] = input1;
		int temp1;
		int swap = 0;

		int arrayLength = sorterArray.length;
		for (int i = 0; i < arrayLength; i++)
		{
			if (sorterArray[i] != unsortedArray[i])
			{
				temp1 = unsortedArray[i];
				unsortedArray[i] = sorterArray[i];
				for (int j = i + 1; j < arrayLength; j++)
				{
					if (unsortedArray[j] == sorterArray[i])
					{
						unsortedArray[j] = temp1;
						swap++;
						break;
					}
				}
				
			}
				//System.out.println(unsortedArray[0]+" "+unsortedArray[1]+" "+unsortedArray[2]);
		}

		return swap;
	}
	
	
	public static void main(String[] args) {
		int []no={1,3,2};
		System.out.println(get_order(no));
		
	}
}

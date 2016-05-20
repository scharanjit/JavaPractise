package OCJPChap7;

import java.util.ArrayList;
import java.util.List;

public class Z_16ListToArray {
	public static void main(String[] args) 
	{
		List<Integer> iL = new ArrayList<Integer>();
		for(int x=0; x<3; x++)
		{
			iL.add(x);
		}
		System.out.println("The list is : "+iL);
		//Object[] oa = iL.toArray(); // create an Object array
		Integer[] ia2 = new Integer[3];
		ia2 = iL.toArray(ia2); // create an Integer array
		System.out.println(ia2[0]+"  "+ia2[1]+"  "+ia2[2]);
	}

}

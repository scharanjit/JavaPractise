package HiHa;

import java.util.StringTokenizer;

public class strinngtokenizerss {

	public static void main(String[] args) {
		String str="Hi How are you?? ";
		
		char arr[]= str.toCharArray();
		
		
		StringTokenizer st= new StringTokenizer(str,"$$");
		
		System.out.println(arr[0]);
		System.out.println(str.replace(" ", ","));
		
	}
}

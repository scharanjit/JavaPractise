package HiHa;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//sort operation uses a slightly optimized merge sort algorithm that is fast and stable:
//Fast: It is guaranteed to run in n log(n) time 
//Stable: It doesn't reorder equal elements

public class sortingInJAVA {

	
	 public static void main(String[] args) {
	
	        List<String> list = Arrays.asList(args);
	        Collections.sort(list);
	        System.out.println(list);
	    }
}

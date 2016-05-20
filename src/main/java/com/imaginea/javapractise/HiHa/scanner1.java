package HiHa;

import java.util.Scanner;

public class scanner1 {

public static void main(String[] args) {

    
    //int[] array2 = new int[3];
    Scanner scan = new Scanner(System.in);
   System.out.println("Enter the no. of elements of array : ");
   int val=scan.nextInt();
   int[] array = new int[val]  ;
  System.out.println("Now enter "+val+" digits of array :");
    int i = 0;
    while(scan.hasNextInt()){
        array[i] = scan.nextInt();
        i++;
        if(i == val){				
        	
            break;
        }
    }

   

    int sm=0;
    for(int j  = 0; j < array.length; j++){
    	sm=sm+array[j];
    }
    
    int mean= sm/array.length;
    System.out.println("he mean is : "+mean);

    //median
    
    int middle=array.length/2;
    if(array.length%2==1)
     {
  	  System.out.println("the median is : "+array[middle]);
     }
    
    else
     {
  	  System.out.println("The median is : "+((array[middle-1]+array[middle])/2.0));
     }
}

}
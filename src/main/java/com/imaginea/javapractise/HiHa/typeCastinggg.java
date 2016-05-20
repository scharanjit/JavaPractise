package HiHa;
//type casting implicit ,explicit


public class typeCastinggg {
	static String number="1111113";
	static int abc=54;
	
public static void main(String[] args) {
	int k=Integer.parseInt(number);
	System.out.println("IntgerValue:-"+k);
	
	String abcStr=String.valueOf(abc);
	System.out.println("String Value:-"+abcStr);
	
	
	//finding sum of string
	
	int a=0, sum=0;
	String b="1111113";
    int i = Integer.parseInt(b);           
    while(i!=0)
    {
        a=i%10;
        i=i/10;
        sum=sum+a;
    }
    System.out.println("Sum of String:-"+sum);
	  }

}

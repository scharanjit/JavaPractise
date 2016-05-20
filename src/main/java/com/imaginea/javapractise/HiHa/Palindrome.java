package HiHa;

public class Palindrome{ 
	public static void main(String args[])
	{
		int num = 1221; 
		//int nextnum=num;
		int n = num; 
		int reverse=0,remainder; 
	while(num > 0)
	{
		remainder = num % 10;
		reverse = reverse * 10 + remainder;
		num = num / 10;
	}
    if(reverse == n)
    	System.out.println(n+" is a Palindrome Number");
    else{
    	System.out.println(n+" is not a Palindrome Number"); 
    System.exit(0);	
    }
   
	int val=n+1;
	for(int nextnum=val;nextnum<99999999;nextnum++)
	{
		int num1 = nextnum; 
		//int nextnum=num;
		int n1 = num1; 
		int reverse1=0,remainder1; 
	while(num1 > 0)
	{
		remainder1 = num1 % 10;
		reverse1 = reverse1 * 10 + remainder1;
		num1 = num1 / 10;
	}
    
	 if(reverse1 == n1)
	 {
	    	System.out.println(n1+" is NEXT Palindrome Number");
	 break;
	 }  
	}
	
	
	}
} 
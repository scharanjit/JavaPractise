package DoubtsMustRead;

public class staticADvantage {
	static int count=0;//will get memory only once and retain its value  
	  
	staticADvantage(){  
	count++;  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	  
		staticADvantage c1=new staticADvantage();  
		staticADvantage c2=new staticADvantage();  
		staticADvantage c3=new staticADvantage();  
}
}

/*The static keyword is used in java mainly for memory management. We may apply static keyword with variables,
 *  methods, blocks and nested class. The static keyword belongs to the class than instance of the class.
 
 main Advantge :- if we decalre something static,  memory will be allocated to it...
 suppose 500 students
 we declare students static..all will get 500 memory locations

The static can be:

variable (also known as class variable)
method (also known as class method)
block
nested class

*/
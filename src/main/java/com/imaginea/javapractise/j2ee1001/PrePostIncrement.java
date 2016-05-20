package j2ee1001;

public class PrePostIncrement {
	public static void main(String args[]) { 
		int i=1, j=1;
		try {
			i++; 
			j--;
			System.out.println(i+"   "+j);
			if(i/j > 1)
				i++;
		}
		catch(ArithmeticException e) {
			System.out.println(0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(1);
		}
		catch(Exception e) {
			System.out.println(2);
		}
		finally {
			System.out.println(3);
		}
		System.out.println(4);
		
		
		float  f = 2.1f;
			   double d = 2.5;
			   i = (int) ((Math.ceil(f)) * ((int)Math.round(d)));
			 
			   System.out.println("i--->"+i);
			   
			   
			   System.out.println("----------------------");
			   
			   int gg;			   	
			   	        //do {
			   	 //           gg++;
			   	      //  }
			   	     //   while(gg < 0);
			  	       // System.out.println(gg);
			  	    
			   char c;
			   			int il;
			   			c = 'A';		// 1
			   			il = c;		//2
			   			c =  (char) (il + 1);	//3
			   			c++;		//4


	}
}

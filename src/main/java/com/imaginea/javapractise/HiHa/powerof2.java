package HiHa;

public class powerof2 {

	
	public static void main(String[] args) {
		int a=128;
		int b=0;
		int j=a;
		int i=0;
		while(j>1)
		{
			b=a%2;
			
			a=a/2;
			
			if(b>0)
			{
				System.out.println("Not the power of 2");
				System.exit(0);
				
			}
			j=a;
			i=i+1;
		}
		
		System.out.println("This is "+i+"th power of 2");
		
		
		
	}
}

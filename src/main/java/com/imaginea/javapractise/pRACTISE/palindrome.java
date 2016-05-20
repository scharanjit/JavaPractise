package pRACTISE;

public class palindrome {
	
	public static void main(String[] args) {
		
		int val=11;
		palin(val);
		
		
	}

	public static int count=0;
	private static void palin(int val) {
		
		// TODO Auto-generated method stub
		if(val==reverse(val))
		{
				
		
			
			System.out.println(val);
			count=count+1;
			//return false;
		}
		
		if(count>50)
		{
			
			System.exit(0);
		}
		else{
			val=val+1;
			palin(val);
		}
		//return true;
		
	}

	private static int reverse(int val) {
		int revNum=0;
		
		
		while(val!=0)
		{
			int lastdigit= val%10;
			
			revNum= revNum *10 +lastdigit;
			
			val=val/10;
			
			
			
		}
		return revNum;
	}

}

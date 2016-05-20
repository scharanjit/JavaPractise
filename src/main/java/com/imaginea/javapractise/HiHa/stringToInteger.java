package HiHa;
//converting string into integer
public class stringToInteger {
	
	public static void main(String[] args) {
		String val="123";
	strglent(val);
	
	}
	

	public static int strglent(String val) {
		int fact=1;
		int INTval=0;
		
		for(int i=val.length()-1; i >=0; i--)
		{
			INTval +=(val.charAt(i)-'0') * fact;
			fact=fact*10;
			
		}
		
	System.out.println(INTval);
	INTval=INTval+1;
	System.out.println(INTval);
	return INTval;
	}

}

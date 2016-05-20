//converting string into integer
public class stringToInteger {
	
	public static void main(String[] args) {
		String val="123";
	strglent(val);
	
	String rev="Java";
	
	System.out.println(reve(rev));
	
	}
	

	public static String reve(String rev) {
		
		
		if(rev.length()==1)
		{
			return rev;
		}
		else
		{
			rev=rev.charAt(rev.length()-1)+reve(rev.substring(0,rev.length()-1));
			return rev;
		}
		
		
		
	}


	public static int strglent(String val) {
		int fact=1;
		int INTval=0;
		
		for(int i=val.length()-1; i >=0; i--)
		{
			//System.out.println(val.charAt(i));
			INTval =INTval+(val.charAt(i)-'0') * fact;
			//System.out.println(fact);
			fact=fact*10;
			
		}
		
	System.out.println(INTval);
	INTval=INTval+1;
	System.out.println(INTval);
	return INTval;
	}

}

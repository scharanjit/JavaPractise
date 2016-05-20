package HiHa;

//compilation error it will show ...string sare imutable

public class stringmagic {
	public static void main(String[] args) {
		String s1="1";
		String s2="2";
		String s3= s1 + s2;
	
		int ival=5;
		String s= String.valueOf(ival);
		int ivalF=Integer.parseInt(s);
		char c= Character.valueOf((char) ivalF);
		System.out.println(c);
		
		//String s1 += s3;
		System.out.println(s3);
		
		
	}

}

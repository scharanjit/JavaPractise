package j2ee1001;

public class StrinBonanza {
	public static void main(String[] args) {
		String s1= new String("infy");
		String s2=s1.replace('y','i');
			s1.concat("technologies");	
			System.out.println(s1);
		//	System.out.println(s2);
			System.out.println((s1+s2).charAt(5));
		
	}

}

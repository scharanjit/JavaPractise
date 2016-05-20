package OCJP;

public class Access2 {
	public static void main(String[] args) {
		Access A = new Access();
		System.out.println(A.a);
		System.out.println(A.b);   
//		System.out.println(A.c);		// c is private
		System.out.println(A.d);
//		System.out.println(A.testIt());
	}

}

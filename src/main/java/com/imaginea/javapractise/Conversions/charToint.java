package Conversions;

public class charToint {
	public static void main(String[] args) {
	System.out.println(chartoIntloo('2')+1);
	}

	private static int chartoIntloo(char c) {
		
		int val=0;
		
		char m=c;
		
		val=Character.digit(m, 10);
		
		
	return val;
		
	}

}

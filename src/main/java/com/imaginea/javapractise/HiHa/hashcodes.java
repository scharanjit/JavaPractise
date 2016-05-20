package HiHa;

public class hashcodes {
	
	
	
	public static void main(String[] args) {
		hashcodes h = new hashcodes();
		hashcodes h2 = new hashcodes();
		System.out.println(h.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h.hashCode()==h2.hashCode());
		Object obj = h.hashCode();
		System.out.println(obj.equals(h.hashCode()));
		
	}
	

}

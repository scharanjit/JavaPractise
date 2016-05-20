
public class Test {
	public static void main(String[] args) {
		int[] b={1,2};
		String s1= "hello";
		String s2= s1;
		System.out.println("s1 :"+s1+" s2 :"+s2);
		
		s1.toUpperCase();
		System.out.println(s1.toUpperCase());
		
		s1.concat(" How are You !!");
		
		
		System.out.println("s1 :"+s1+" s2 :"+s2);
		
	}

}

package HiHa;

//string stored in heap in java
//when a new string declared with same value...it just pass the reference to the new string
//java wnt allocate new memory location for this new string

public class whyStringImmutable {
	public static void main(String[] args) {
		String s1= "abcd";
		String s2= "abcd";
		
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		
	}

}

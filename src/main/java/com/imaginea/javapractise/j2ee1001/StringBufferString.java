package j2ee1001;

public class StringBufferString {

	public static void main(String[] args) {
		Name1  n1= new Name1();
		StringBuffer s2= new StringBuffer("A");
		String s1 =n1.method1(s2);
		System.out.println(s1);
	}
}

class Name1	
{
	public String method1(StringBuffer s1)
	{
		s1.append('B');
		System.out.println("s1.append = "+s1);
		//return s1;
		return null;
	}
}
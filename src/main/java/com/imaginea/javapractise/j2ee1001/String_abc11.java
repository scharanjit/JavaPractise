package j2ee1001;

public class String_abc11 {
	public static void main(String []args){
		String  s1 = ("Mesmerized");
		String s2 =s1.substring(5,8);//different from vb
		System.out.println(s2);
		char c1 = s1.charAt(3);
		s1=s2.replace(s2.charAt(2), s1.charAt(3));   ///something
		s1 +=c1;
		System.out.print(s1);
	}}

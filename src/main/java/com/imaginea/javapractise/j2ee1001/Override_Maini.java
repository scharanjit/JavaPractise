package j2ee1001;

class base{
	void show(){
		System.out.println(" inside base");
	}
}
class child extends base{
//	int show(){
//		System.out.println(" inside child");
//	}
}
public class Override_Maini{
	public static void main(String args[])
	{ base b1 = new child();
	b1.show();} }

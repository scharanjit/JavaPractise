package j2ee1001;

public class OverloadObjectMyclass {
	public void f(Object obj) {
		System.out.println("f_Obj");
	}
	public void f(String str) {
		System.out.println("f_Str");
	}
	public static void main(String args[]) {
		OverloadObjectMyclass obj1 = new OverloadObjectMyclass();
		obj1.f("Hello");
	}
}

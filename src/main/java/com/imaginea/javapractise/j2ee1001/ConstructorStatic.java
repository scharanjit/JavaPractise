package j2ee1001;

public class ConstructorStatic {

	static int a;

	ConstructorStatic() {
		a = 12;
	}

	public void print() {
		a++;
		System.out.println("a "+a);
	}

	public static void main(String arags[]) {
		ConstructorStatic obj1 = new ConstructorStatic();
		obj1.print();
		ConstructorStatic obj2 = new ConstructorStatic();
		obj2.print();
	}
}
